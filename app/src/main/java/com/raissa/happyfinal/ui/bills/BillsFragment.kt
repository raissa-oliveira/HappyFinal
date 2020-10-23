package com.raissa.happyfinal.ui.bills

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import com.raissa.happyfinal.R
import kotlinx.android.synthetic.main.bills_fragment.*
import java.util.*

class BillsFragment : Fragment() {

    companion object {
        fun newInstance() = BillsFragment()
    }
    var cal = Calendar.getInstance()

    private lateinit var viewModel: BillsViewModel

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.bills_fragment, container, false)
        val filterDate: TextView = root.findViewById(R.id.filterData)
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }

        // when you click on the button, show DatePickerDialog that is set with OnDateSetListener
        filterDate!!.setOnClickListener {
            activity?.let {
                DatePickerDialog(
                    it,
                    dateSetListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BillsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun updateDateInView() {
        val myFormat = "MM/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        filterData!!.text = sdf.format(cal.getTime())
    }

}
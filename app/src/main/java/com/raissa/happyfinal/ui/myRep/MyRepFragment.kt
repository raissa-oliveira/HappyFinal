package com.raissa.happyfinal.ui.myRep

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.raissa.happyfinal.ui.bills.BillsFragment
import com.raissa.happyfinal.R
import kotlinx.android.synthetic.main.bills_fragment.*


class MyRepFragment : Fragment() {

    private lateinit var myRepViewModel: MyRepViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        myRepViewModel =
//                ViewModelProviders.of(this).get(MyRepViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_rep, container, false)
        val cvBills: CardView = root.findViewById(R.id.cv_bills)
        cvBills.setOnClickListener {
            val nextFrag = BillsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace((requireView().parent as ViewGroup).id, nextFrag, "billsFragment")
                .addToBackStack(null)
                .commit()}
//        val textView: TextView = root.findViewById(R.id.text_my_rep)
//        myRepViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    fun goToBills(view: View)
    {

    }

    fun goToCleaning(view: View)
    {

    }

    fun goToMeetings(view: View)
    {

    }

    fun goToMembers(view: View)
    {

    }

    fun goToShopping(view: View)
    {

    }
}
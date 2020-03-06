package com.mic.nike.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mic.findcrush.Adapter.PostRecyclerCustomAdapter

import com.mic.nike.R
import com.mic.nike.Shoe
import kotlinx.android.synthetic.main.fragment_nikefragment.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [nikefragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class nikefragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root=inflater.inflate(R.layout.fragment_nikefragment, container, false)
        var arr=ArrayList<Shoe>()
        arr.add(Shoe(R.drawable.nike1,"001","Nike Superfly 6","Elite FG","$799"))
        arr.add(Shoe(R.drawable.nike2,"002","Air Vapromax","FlyKnit","$799"))
        arr.add(Shoe(R.drawable.nike3,"003","Air Jordan 14","Retro Se","$799"))
        arr.add(Shoe(R.drawable.nike4,"004","LeBron XVI","Low EP","$799"))
        arr.add(Shoe(R.drawable.nike5,"005","Nike Air Force 1 Low","Supberb","$799"))
        arr.add(Shoe(R.drawable.nike14,"006","Nike Air Max 270","Elite FG","$799"))
        arr.add(Shoe(R.drawable.nike7,"007","Nike SB Nyjah Free","Elite FG","$799"))
        arr.add(Shoe(R.drawable.nike8,"008","Nike Air Force 1 07","Elite FG","$799"))
        arr.add(Shoe(R.drawable.nike9,"009","Nike Tanjun","Elite FG","$799"))
        arr.add(Shoe(R.drawable.nike10,"0010","Nike Lunar Force 1 ","Elite FG","$799"))
        var postAdapter= PostRecyclerCustomAdapter(arr)
        root.rv.layoutManager= GridLayoutManager(root.context,2)
        root.rv.adapter=postAdapter
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment nikefragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            nikefragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

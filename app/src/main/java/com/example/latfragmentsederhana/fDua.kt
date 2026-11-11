package com.example.latfragmentsederhana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fDua.newInstance] factory method to
 * create an instance of this fragment.
 */
class fDua : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val _tvHasil = view.findViewById<TextView>(R.id.tvHasil)
        val _btnOpenFDua = view.findViewById<Button>(R.id.btnOpenFDua)

        var namaDiterima = ""
        var alamatDiterima = ""

        arguments?.let {
            namaDiterima = it.getString("Nama") ?: ""
            alamatDiterima = it.getString("Alamat") ?: ""
        }

        if (namaDiterima != "") {
            _tvHasil.text = "Halo $namaDiterima! Alamat Anda $alamatDiterima"
        }

        _btnOpenFDua.setOnClickListener {
            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fSatu())
            fragmentTransaction.commit()
        }
    }
}
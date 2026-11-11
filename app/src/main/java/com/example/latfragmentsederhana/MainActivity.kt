package com.example.latfragmentsederhana

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFragmentSatu = findViewById<Button>(R.id.btnFragmentSatu)
        val btnFragmentDua = findViewById<Button>(R.id.btnFragmentDua)

        if (savedInstanceState == null) {
            replaceFragment(fSatu())
        }

        // Langkah 20-21: Click Listener untuk perpindahan fragment dari Activity
        btnFragmentSatu.setOnClickListener {
            replaceFragment(fSatu())
        }

        btnFragmentDua.setOnClickListener {
            replaceFragment(fDua())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
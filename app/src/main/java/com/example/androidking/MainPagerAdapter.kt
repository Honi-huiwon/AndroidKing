package com.example.androidking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * A simple [Fragment] subclass.
 */
class MainPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm){

    override fun getItem(p0: Int): Fragment? {
        return when(p0){
            0->FirstFragment()
            1->SecondFragment()
            2->ThirdFragment()
            else->null
        }
    }

    override fun getCount(): Int {
        return 3
    }
}

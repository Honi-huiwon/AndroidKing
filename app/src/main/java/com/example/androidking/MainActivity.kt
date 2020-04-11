package com.example.androidking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = MainPagerAdapter(supportFragmentManager)
        val mainpager = findViewById<ViewPager>(R.id.vp_main_product)
        mainpager.adapter = pagerAdapter

        val maintab = findViewById<TabLayout>(R.id.tl_main_category)
        maintab.setupWithViewPager(mainpager)
    }
}

package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vp = findViewById<ViewPager>(R.id.viewPager)
    val Adapter= Adapter(supportFragmentManager)
        Adapter.addFragment(fragment1(),"Chats")
        Adapter.addFragment(fragmentStatus(),"Status")
        Adapter.addFragment(fragmentCalls(),"Calls")
        vp.adapter= Adapter
        tabs.setupWithViewPager(vp)





    }
}

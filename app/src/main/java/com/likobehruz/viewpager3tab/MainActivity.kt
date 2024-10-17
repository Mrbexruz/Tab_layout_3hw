package com.likobehruz.viewpager3tab

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.likobehruz.viewpager3tab.adapter.MyPagerAdapter
import com.likobehruz.viewpager3tab.databinding.ActivityMainBinding
import com.likobehruz.viewpager3tab.utils.MyData

class MainActivity : AppCompatActivity() {
    lateinit var myPagerAdapter: MyPagerAdapter
     private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addUser()

        myPagerAdapter = MyPagerAdapter(MyData.list)
        binding.pg.adapter = myPagerAdapter
        binding.myTab.setupWithViewPager(binding.pg)
        loadTabLayout()
        binding.btnNext.setOnClickListener {
            val nextItem = binding.pg.currentItem + 1
            if (nextItem <myPagerAdapter.count) {
                binding.pg.currentItem = nextItem
            }
        }
        binding.btnQaytish.setOnClickListener {
            val nextItem = binding.pg.currentItem - 1
            if (nextItem <myPagerAdapter.count) {
                binding.pg.currentItem = nextItem
            }
        }
    }

    private fun loadTabLayout() {
        val tabCount = binding.myTab.tabCount
        for (i in 0 until tabCount) {
            val tabView = LayoutInflater.from(this).inflate(R.layout.item_tab_layout, null, false)
            val tab = binding.myTab.getTabAt(i)
            tab?.customView = tabView
            val imageView = tabView.findViewById<ImageView>(R.id.tab_img)
            if (i == 0) {
                imageView.setImageResource(R.drawable.ic_circle_2)
            } else {
                imageView.setImageResource(R.drawable.ic_circle)
            }
        }
        binding.myTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val costomView = tab?.customView
                val image = costomView?.findViewById<ImageView>(R.id.tab_img)
                image?.setImageResource(R.drawable.ic_circle_2)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                val costomView = tab?.customView
                val image = costomView?.findViewById<ImageView>(R.id.tab_img)
                image?.setImageResource(R.drawable.ic_circle)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}
package com.likobehruz.viewpager3tab.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.likobehruz.viewpager3tab.databinding.ItemAbBinding
import com.likobehruz.viewpager3tab.models.User

class MyPagerAdapter(var list: ArrayList<User>) : PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemAbBinding = ItemAbBinding.inflate(LayoutInflater.from(container.context), container, false)
        itemAbBinding.image.setImageResource(list[position].image)
        itemAbBinding.tv1.text = list[position].tv1
        itemAbBinding.tv2.text = list[position].tv2
        itemAbBinding.tv3.text = list[position].tv3
        itemAbBinding.tv4.text = list[position].tv4
        container.addView(itemAbBinding.root)
        return itemAbBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }
}

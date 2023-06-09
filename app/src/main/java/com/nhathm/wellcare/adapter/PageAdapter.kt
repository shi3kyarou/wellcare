package com.nhathm.wellcare.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.ArrayList

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val list: MutableList<Fragment> = ArrayList()
    private val titles: MutableList<String> = ArrayList()

    override fun getItem(position: Int): Fragment { return list[position] }

    override fun getCount(): Int { return list.size }

    override fun getPageTitle(position: Int): CharSequence { return titles[position] }

    fun addWithTitle(fragment: Fragment, title: String) {
        list.add(fragment)
        titles.add(title)
    }

    fun add(fragment: Fragment) { list.add(fragment) }

    fun adds(vararg fragments: Fragment) { for (i in listOf(*fragments).indices) list.add(listOf(*fragments)[i]) }
}
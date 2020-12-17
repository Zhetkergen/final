package com.example.mvvm_kotlin_example.ui

import android.os.Bundle
import androidx.fragment.app.Fragment


abstract class BaseFragment : Fragment() {

    abstract val title: String

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity!!.title = title
    }
}
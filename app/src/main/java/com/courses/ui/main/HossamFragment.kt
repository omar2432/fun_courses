package com.thicc.courses.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thicc.courses.R

class HossamFragment : Fragment() {

    companion object {
        fun newInstance() = HossamFragment()
    }

    private lateinit var viewModel: HossamViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hossam_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HossamViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
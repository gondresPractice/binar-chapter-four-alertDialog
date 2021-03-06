package com.binaracademy.dialogbuilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment


class FragmentDialog : DialogFragment() {


    private lateinit var btnOk : Button
    private lateinit var btnCancel : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnOk = view.findViewById(R.id.btnOk)
        btnCancel = view.findViewById(R.id.btnCancel)

        btnCancel.setOnClickListener {
            dialog?.dismiss()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }


}
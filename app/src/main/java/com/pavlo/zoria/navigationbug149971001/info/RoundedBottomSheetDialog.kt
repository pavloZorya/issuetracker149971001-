package com.pavlo.zoria.navigationbug149971001.info

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pavlo.zoria.navigationbug149971001.R
import kotlinx.android.synthetic.main.information_fragment.*

open class RoundedBottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.information_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            RoundedBottomSheetDialogArgs.fromBundle(it)
        }?.let {
            val type = it.hintId
            informationMessage.text = ""
        }
    }

    override fun getTheme(): Int {
        return R.style.BaseBottomSheetDialog
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(context!!, theme)
    }
}
package com.amnah.ali.implicitintent.ui

import android.view.LayoutInflater
import com.amnah.ali.implicitintent.util.Constants
import com.amnah.ali.implicitintent.databinding.ActivitySecondBinding


class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override val LOG_TAG: String = "SECOND_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivitySecondBinding =
        ActivitySecondBinding::inflate

    override fun setup() {
        val extraText: String = intent.getStringExtra(Constants.EXTRA_TEXT).toString()
        log(extraText)
        binding?.apply {
            tvContent.text = extraText
        }

    }
    override fun addCallbacks() {
    }

}

package com.amnah.ali.implicitintent.ui

import android.content.Intent
import android.view.LayoutInflater
import com.amnah.ali.implicitintent.databinding.ActivityMainBinding
import com.amnah.ali.implicitintent.util.Constants

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {

    }

    override fun addCallbacks() {
        binding?.move?.setOnClickListener {
           Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Constants.EXTRA_TITLE, "You send Text to SecondActivity")
                putExtra(Constants.EXTRA_TEXT, binding?.sendContent?.text.toString())
                type = "text/plain"
            }.let {  val title = Intent.createChooser(it, null)
                startActivity(title) }


        }

    }

}

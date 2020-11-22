package com.example.nightingale.ui.screens.settings

import com.example.nightingale.R
import com.example.nightingale.database.*
import com.example.nightingale.ui.screens.base.BaseChangeFragment
import kotlinx.android.synthetic.main.fragment_cnage_bio.*



class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_cnage_bio) {

    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDatabase(newBio)
    }
}

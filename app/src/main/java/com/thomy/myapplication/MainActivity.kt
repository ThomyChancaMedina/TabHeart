package com.thomy.myapplication



import android.app.Activity
import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {



    private var mActivity: Activity by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mActivity=this
        nextListenerOnButton()


    }

    fun nextListenerOnButton(): Unit{


        button.setOnClickListener {
            val intent=Intent(this,TabsScreen::class.java)
            startActivity(intent)

        }

    }


}


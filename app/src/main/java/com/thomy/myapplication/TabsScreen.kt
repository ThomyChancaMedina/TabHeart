package com.thomy.myapplication

import android.content.Context
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTabHost
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.thomy.myapplication.Fragment.SeconFragment
import com.thomy.myapplication.Fragment.newInstanceFirst
import kotlin.properties.Delegates

class TabsScreen : FragmentActivity(){

    val TAG_CLASS:String?= MainActivity::class.java.simpleName


    var mTabHost: FragmentTabHost by Delegates.notNull()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.v(TAG_CLASS,"onCreate")

        mTabHost = findViewById(android.R.id.tabhost)
        mTabHost.setup(this,supportFragmentManager,R.id.realtabcontent)
        createTabs()


    }


    private fun createTabs() {
        Log.v(TAG_CLASS,"createTabs")


        mTabHost.addTab(mTabHost.newTabSpec(LabelTabs.HAND_HEART.toString()).setIndicator(getTabIndicator(mTabHost.getContext(),R.string.title_hand,R.drawable.icon_heart)),
            newInstanceFirst(), null)


        mTabHost.addTab(mTabHost.newTabSpec(LabelTabs.MY_HEART.toString()).setIndicator(getTabIndicator(mTabHost.getContext(),R.string.title_heart,R.drawable.icon_hand)),SeconFragment::class.java, null);

    }

    fun getTabIndicator(context: Context,title: Int,icon:Int):View{

        val view:View=LayoutInflater.from(context).inflate(R.layout.tab_layout,null)

        val iv: ImageView= view.findViewById(R.id.imageView )
        iv.setImageResource(icon)

        val tv: TextView=view.findViewById(R.id.textView)

        tv.setText(title)

        return view;
    }

    enum class LabelTabs( val pos: Int, val label: String) {


        /**
         * The HAND_HEART.
         */
        HAND_HEART(0,"HAND_HEART"),
        /**
         * The MY_HEART.
         */
        MY_HEART(1,"MY_HEART"),




    }

}
package com.thomy.myapplication.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thomy.myapplication.R



class FirstFragment : Fragment() {
    val TAG_CLASS:String?= FirstFragment::class.java.simpleName
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.v(TAG_CLASS,"onCreateView")

        return inflater.inflate(R.layout.fragment_new_alert, container, false)
    }


}


fun newInstanceFirst(): Class<*> {
    return FirstFragment::class.java

}
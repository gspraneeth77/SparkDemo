package com.walmart.sparkdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.walmart.sdk.MySDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.startSdk).setOnClickListener {
            MySDK.getInstance().startReactApp(this@MainActivity)
        }
    }
}
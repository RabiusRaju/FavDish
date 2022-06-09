package com.tutorials.favdish

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.tutorials.favdish.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private var splashBinding : ActivitySplashBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding!!.root)
        init()
    }

    private fun init(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        //splashBinding!!.tvAppName.text = "Hello World"

        val  animationUtils = AnimationUtils.loadAnimation(this,R.anim.anim_splash)
    }
}
package com.dumdumbich.studygit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.dumdumbich.studygit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        ui.text1.text = "Feature 1"
    }
}
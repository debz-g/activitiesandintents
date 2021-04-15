package com.debz.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.debz.newactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener() {
            Intent(this, SecondActivity::class.java).also {
//                it refers to the Intent. also{} is a scope function of kotlin.
//                Check Manifest file for more changes
                startActivity(it)
            }
        }

    }
}
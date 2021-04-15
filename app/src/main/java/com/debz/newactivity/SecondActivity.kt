package com.debz.newactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.debz.newactivity.databinding.ActivityMainBinding
import com.debz.newactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener(){
            finish()
//            finish() will clear the second activity from the activity stack and hence the main activity will pop-up.
//            The back button also has the same work as finish().
        }

        binding.btnNextOne.setOnClickListener(){
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
//                This one leads to the third activity.
            }
        }
    }
}
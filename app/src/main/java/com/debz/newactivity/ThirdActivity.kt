package com.debz.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.debz.newactivity.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToSecond.setOnClickListener(){
            finish()
//            This clears the third activity from the stack.
        }
    }
}
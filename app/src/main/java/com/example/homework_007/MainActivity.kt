package com.example.homework_007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework_006.extension.isEmail
import com.example.homework_007.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.eTPassword.setOnClickListener {



           }

        binding.btnRed.setOnClickListener {
            if (!binding.eTEmail.text.toString().isEmail()){
                binding.eTEmail.error = getString(R.string.wrong_email)
            }
        }




        }





}


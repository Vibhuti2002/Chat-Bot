package com.example.chatbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatbot.databinding.ActivityMainBinding
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.EmailloginBtn.setOnClickListener {
            Sawo(
                this,
                "895ab612-1d55-4d6b-8fe3-23ee9d1ce2e0", // your api key
                "6145dd5e47fda1193285933254DIpsro785h8IvlbVP2yEEq"  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }
        binding.smsloginBtn.setOnClickListener {
            Sawo(
                this,
                "895ab612-1d55-4d6b-8fe3-23ee9d1ce2e0", // your api key
                "6145dd5e47fda1193285933254DIpsro785h8IvlbVP2yEEq"  // your api key secret
            ).login(
                "phone_number_sms", // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }
    }
}


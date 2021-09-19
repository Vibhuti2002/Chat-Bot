package com.example.chatbot
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sawolabs.androidsdk.LOGIN_SUCCESS_MESSAGE
class CallbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val message = intent.getStringExtra(LOGIN_SUCCESS_MESSAGE)

        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }
}
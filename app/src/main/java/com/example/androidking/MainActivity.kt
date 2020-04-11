package com.example.androidking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainLogin.setOnClickListener{
            val intent: Intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("id",127)
            startActivity(intent)
        }

        Toast.makeText(this, "로그인 화면으로 넘어갑니다.",Toast.LENGTH_SHORT).show()
    }

}

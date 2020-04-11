package com.example.androidking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        btnMainLogin.setOnClickListener{
            val intent: Intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("id",127)
            startActivity(intent)
        }

        Toast.makeText(this, "",Toast.LENGTH_SHORT).show()


    }

}

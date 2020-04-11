package com.example.androidking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.backgroundResource

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editLoginID.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus) v.setBackgroundResource(R.drawable.primaryellow_border)
            else v.setBackgroundResource(R.drawable.gray_border)
        }
        editLoginPW.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus) v.setBackgroundResource(R.drawable.primaryellow_border)
            else v.setBackgroundResource(R.drawable.gray_border)
        }

        btnLoginSubmit.setOnClickListener{
            val login_u_id = editLoginID.text.toString()
            val login_u_pw = editLoginPW.text.toString()

            if(login_u_id == "") editLoginID.requestFocus()
            else if(login_u_pw =="") editLoginPW.requestFocus()
            /*else postLoginResponse(login_u_id,login_u_pw)*/
        }

        txtLoginSignup.setOnClickListener {
            val intent: Intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        /*fun postLoginResponse(u_id:String, u_pw:String){
            finish()
        }*/
        val id = intent.getIntExtra("id",127)

        Toast.makeText(this, "로그인 화면으로 넘어갑니다.", Toast.LENGTH_SHORT).show()
    }
}

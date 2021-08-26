package com.example.walletapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvdesc:TextView
    lateinit var tvref:TextView
    lateinit var tvdate:TextView
    lateinit var tvamout:TextView
    lateinit var btnbuy:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvdesc=findViewById(R.id.tvdesc)
        tvref=findViewById(R.id.tvref)
        tvdate=findViewById(R.id.tvdate)
        tvamout=findViewById(R.id.tvamount)
        btnbuy=findViewById(R.id.btnbuy)

btnbuy.setOnClickListener {
    var intent=Intent(baseContext,Feedback::class.java)
    startActivity(intent)
}
    }
}



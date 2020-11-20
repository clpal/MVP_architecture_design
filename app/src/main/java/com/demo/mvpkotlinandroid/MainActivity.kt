package com.demo.mvpkotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),LoginViewListener {
    private lateinit var etUserName: EditText;
    private lateinit var btnLogin: Button;
    private lateinit var tvResult: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etUserName = findViewById(R.id.etUserName)
        btnLogin = findViewById(R.id.btnLogin)
        tvResult = findViewById(R.id.tvResult)
        btnLogin.setOnClickListener(View.OnClickListener {
            var presenter = PresenterImpl(this)
            presenter.doLogin(etUserName.text.toString())
        })
    }

    override fun success(result: String) {
      //  TODO("Not yet implemented")
        tvResult.setText(result)
    }

    override fun failure(message: String) {
        tvResult.setText(message)
       // TODO("Not yet implemented")
    }
}
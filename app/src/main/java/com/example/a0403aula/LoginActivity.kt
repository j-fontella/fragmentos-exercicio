package com.example.a0403aula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun direcionarMenu(view: View){
        val intent = Intent(this, MenuActivity::class.java)

        if(editText.text.toString().equals("joao.mbarreto") && editText2.text.toString().equals("infnet")){
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Conta não encontrada no banco de dados.", Toast.LENGTH_LONG).show()

        }


    }
}

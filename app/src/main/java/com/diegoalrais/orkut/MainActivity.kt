package com.diegoalrais.orkut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.diegoalrais.orkut.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val email = binding.edtEmail.text
        val senha = binding.edtSenha.text

        binding.btnEntrar.setOnClickListener {

           if(email.isEmpty() || senha.isEmpty()){
               Snackbar.make( binding.layout1,
                   "Falta dados. Favor verificar.",
                   Snackbar.LENGTH_LONG)
                   .show()
            } else {
                val intent = Intent(this,
                    MainActivity2::class.java)
               startActivity(intent)
               finish()
            }

        }

    }

}
package com.diegoalrais.orkut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.diegoalrais.orkut.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu_principal, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.conta->{
                chamaTelaLogin()

            }
            R.id.config -> {
                chamaTelaLogin()

            }
            R.id.sair-> {
                chamaTelaLogin()
            }
        }
        return super.onOptionsItemSelected(item)
    }

   fun chamaTelaLogin(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
   }
}
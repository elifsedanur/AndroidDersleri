package com.info.simpleloginscreen

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.info.simpleloginscreen.databinding.ActivitySignUpBinding

class ActivitySignUp : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.buttonSignUp.setOnClickListener {
            var kullaniciAdi:String?
            var sifre:String?
            if (TextUtils.isEmpty(binding.EditTextName.text)){
                Snackbar.make(binding.buttonSignUp,"İsim kısmı boş bırakılamaz!!",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                val ad = binding.EditTextName.text.toString()
            }
            if (binding.EditTextAccountName.text.toString().isNotEmpty()){
                 kullaniciAdi = binding.EditTextAccountName.text.toString()
            }else{
                Toast.makeText(this,"Kullanıcı adı boş bırakılamaz!!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(binding.EditTextPassword.text.toString().length >= 6 && binding.EditTextPassword.text.toString().isNotEmpty()){
                sifre = binding.EditTextPassword.text.toString()
            } else{
                Toast.makeText(this,"Geçersiz Şifre",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString(kullaniciAdi,sifre)
            editor.commit()
            val intent = Intent(this@ActivitySignUp,ActivitySuccessful::class.java)
            intent.putExtra("gecis",2)
            finish()
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent = Intent(this@ActivitySignUp,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_backstack,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.back -> {
                startActivity(Intent(this@ActivitySignUp,MainActivity::class.java))
                finish()
                return true
            }
            else -> return false
        }

    }
}
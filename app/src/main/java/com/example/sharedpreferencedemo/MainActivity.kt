package com.example.sharedpreferencedemo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putString
import com.example.sharedpreferencedemo.databinding.ActivityMainBinding
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var shp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, Outresult::class.java)
            startActivity(intent)

            shp = getSharedPreferences("my_sp", MODE_PRIVATE)
            val name = binding.nameEt.text.toString()
            val age = binding.ageEt.text.toString().toInt()
            val editor = shp.edit() // edit permission
            editor.apply {

                putString("sp_name",name).toString()
                putInt("sp_age",age).toString()
                commit() //finalize

            }

        }



    }


}
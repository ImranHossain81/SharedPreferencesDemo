package com.example.sharedpreferencedemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferencedemo.databinding.ActivityMainBinding
import com.example.sharedpreferencedemo.databinding.ActivityOutresultBinding

class Outresult : AppCompatActivity() {

    private lateinit var binding: ActivityOutresultBinding
    private lateinit var shp: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutresultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shp = getSharedPreferences("my_sp", MODE_PRIVATE)
        setContentView(binding.root)
        val name = shp.getString("sp_name",null)
        val age = shp.getInt("sp_age",0)
        binding.testname.setText(name)
        if (age!=0){
            binding.tesxtage.setText(age.toString())
        }
    }

}
package me.dio.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import me.dio.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
       // val tvHello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(LayoutInflater)


    }
}
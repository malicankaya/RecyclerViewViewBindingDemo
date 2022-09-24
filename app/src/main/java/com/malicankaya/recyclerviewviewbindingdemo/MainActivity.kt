package com.malicankaya.recyclerviewviewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malicankaya.recyclerviewviewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.recyclerView?.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
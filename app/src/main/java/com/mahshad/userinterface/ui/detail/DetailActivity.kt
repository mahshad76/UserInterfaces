package com.mahshad.userinterface.ui.detail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahshad.userinterface.data.list
import com.mahshad.userinterface.databinding.RecyclerViewBinding

class DetailActivity : ComponentActivity() {
    private lateinit var adapter: Adaptor
    private lateinit var binding: RecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = Adaptor(list)
        binding = RecyclerViewBinding.inflate(layoutInflater)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}
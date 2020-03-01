package com.werb.darkmode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.werb.darkmode.databinding.ActivityMainBinding
import com.werb.darkmode.model.EventStore

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = EventAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        makeUI()
    }

    private fun makeUI() {
        binding.toolbar.inflateMenu(R.menu.main_menu)
        binding.list.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.list.addItemDecoration(GridSpacingItemDecoration(2, 16))
        binding.list.adapter = adapter
        binding.list.setHasFixedSize(true)

        EventStore.events.observe(this) {
            adapter.submitList(it)
        }
    }

}

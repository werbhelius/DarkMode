package com.werb.darkmode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.werb.darkmode.databinding.ActivityMainBinding
import com.werb.darkmode.model.EventStore

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = EventAdapter(EventStore.events.value!!)
    private val manager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        makeUI()
    }

    private fun makeUI() {
        binding.toolbar.inflateMenu(R.menu.main_menu)
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.light -> {
                    delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
                }
                R.id.dark -> {
                    delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
                }
                R.id.system -> {
                    delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                }
                R.id.menu_battery_saver -> {
                    delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY
                }
            }
            return@setOnMenuItemClickListener true
        }
        manager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
        binding.list.layoutManager = manager
        binding.list.setHasFixedSize(true)
        binding.list.addItemDecoration(GridSpacingItemDecoration(2, 16))
        binding.list.adapter = adapter
    }

}

package com.vk.architechture.mvi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.vk.architechture.R
import com.vk.architechture.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MviActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var viewModel: MviViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        viewModel = ViewModelProvider(this).get(MviViewModel::class.java)

        lifecycleScope.launch {
            viewModel.state.collect { state ->
                when (state) {
                    is MainState.Loading -> activityMainBinding.tvMain.text = "Loading..."
                    is MainState.Success ->activityMainBinding.tvMain.text  = state.data
                }
            }
        }

        activityMainBinding.mainBtn.setOnClickListener {
            viewModel.processIntent(MainIntent.FetchData)
        }



    }
}
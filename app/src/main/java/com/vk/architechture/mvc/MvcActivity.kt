package com.vk.architechture.mvc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.vk.architechture.R
import com.vk.architechture.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MvcActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    private val model = ApiModel()
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


        activityMainBinding.mainBtn.setOnClickListener {
            lifecycleScope.launch {
               activityMainBinding.tvMain.text = model.fetchData()
            }
        }
    }
}
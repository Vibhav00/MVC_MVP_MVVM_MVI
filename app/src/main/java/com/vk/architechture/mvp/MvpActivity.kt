package com.vk.architechture.mvp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vk.architechture.R
import com.vk.architechture.databinding.ActivityMainBinding

class MvpActivity : AppCompatActivity() ,MainView{
    lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var presenter: MainPresenter
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

        presenter = MainPresenter(this, ApiModel())

        activityMainBinding.mainBtn.setOnClickListener{
            presenter.fetchData()
        }

    }

    override fun showLoading() {
      activityMainBinding.tvMain.text = "Loading...."
    }

    override fun showData(data: String) {
        activityMainBinding.tvMain.text = data
    }
}
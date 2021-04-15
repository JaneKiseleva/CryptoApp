package com.example.cryptoapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.*
import com.example.cryptoapp.pojo.CoinPriceInfo

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    //private var viewModel: CoinViewModel by viewModels()
    //private lateinit val viewModel by viewModels<CoinViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(
                this,
                ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        )[CoinViewModel::class.java]
        viewModel.loadData()
    }
}
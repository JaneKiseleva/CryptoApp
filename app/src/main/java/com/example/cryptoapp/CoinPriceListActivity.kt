package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class CoinPriceListActivity: AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    //private var viewModel: CoinViewModel by viewModels()
    //private lateinit val viewModel by viewModels<CoinViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[CoinViewModel::class.java]
        viewModel.getDetailInfo("BTC").observe(this, Observer { Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it") })

    }
}


//        var  database = Room.databaseBuilder(this.getApplicationContext(),
//            AppDatabase::class.java, "main.db")
//            .addMigrations($)
//            .build()
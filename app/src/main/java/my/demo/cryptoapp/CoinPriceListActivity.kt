package my.demo.cryptoapp

import adapters.CoinInfoAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptoapp.R
import my.demo.cryptoapp.pojo.CoinPriceInfo
import kotlinx.android.synthetic.main.activity_coin_price_list.*


class CoinPriceListActivity: AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    //private var viewModel: CoinViewModel by viewModels()
    //private lateinit val viewModel by viewModels<CoinViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        val adapter = CoinInfoAdapter(this)
        adapter.onCoinClickListener = object: CoinInfoAdapter.OnCoinClickListener {
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
                val intent = CoinDetailActivity.newIntent(this@CoinPriceListActivity, coinPriceInfo.fromsymbol)
                startActivity(intent)
            }
        }
        rvCoinPriceList.adapter = adapter
        viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            adapter.coinInfoList = it
        })

    }
}


//        var  database = Room.databaseBuilder(this.getApplicationContext(),
//            AppDatabase::class.java, "main.db")
//            .addMigrations($)
//            .build()
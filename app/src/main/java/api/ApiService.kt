package api

import my.demo.cryptoapp.pojo.CoinInfoListOfData
import my.demo.cryptoapp.pojo.CoinPriceInfoRawData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_APY_KEY) apiKey: String = "d3a08d2b3164b406e96da59d14b0b833da79d6afac7a53a137c665420e4b4238",
        @Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym: String = CURRENCY
    ): Single<CoinInfoListOfData>

    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_APY_KEY) apiKey: String = "d3a08d2b3164b406e96da59d14b0b833da79d6afac7a53a137c665420e4b4238",
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY,
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String = CURRENCY
    ): Single <CoinPriceInfoRawData>

    companion object {
        private const val QUERY_PARAM_APY_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"

        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"

        private const val CURRENCY = "USD"
    }
}
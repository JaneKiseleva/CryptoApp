package my.demo.cryptoapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import my.demo.cryptoapp.pojo.CoinPriceInfo


@Dao
interface CoinPriceInfoDao {
    @Query("SELECT * FROM full_price_list ORDER BY lastupdate DESC")
    fun getPriceList (): LiveData<List<CoinPriceInfo>>

    @Query ("SELECT * FROM full_price_list WHERE fromsymbol == :fSym LIMIT 1")
    fun getPriceInfoAboutCoin (fSym: String): LiveData<CoinPriceInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList (priceList: List<CoinPriceInfo>)

}
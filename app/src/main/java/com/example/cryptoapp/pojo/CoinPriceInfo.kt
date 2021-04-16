package com.example.cryptoapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo (

    @SerializedName("TYPE")
    @Expose
    val type: String?,

    @SerializedName("MARKET")
    @Expose
    val market: String?,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromsymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val tosymbol: String?,

    @SerializedName("FLAGS")
    @Expose
    val flags: String?,

    @SerializedName("PRICE")
    @Expose
    val price: String?,

    @SerializedName("LASTUPDATE")
    @Expose
    val lastupdate: Long?,

    @SerializedName("MEDIAN")
    @Expose
    val median: Int?,

    @SerializedName("LASTVOLUME")
    @Expose
    val lastvolume: String?,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastvolumeto: String?,

    @SerializedName("LASTTRADEID")
    @Expose
    val lasttradeid: String?,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeday: String?,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumedayto: String?,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24hour: String?,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24hourto: String?,

    @SerializedName("OPENDAY")
    @Expose
    val openday: String?,

    @SerializedName("HIGHDAY")
    @Expose
    val highday: String?,

    @SerializedName("LOWDAY")
    @Expose
    val lowday: String?,

    @SerializedName("OPEN24HOUR")
    @Expose
    val open24hour: String?,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24hour: String?,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24hour: String?,

    @SerializedName("LASTMARKET")
    @Expose
    val lastmarket: String?,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumehour: String?,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumehourto: String?,

    @SerializedName("OPENHOUR")
    @Expose
    val openhour: String?,

    @SerializedName("HIGHHOUR")
    @Expose
    val highhour: String?,

    @SerializedName("LOWHOUR")
    @Expose
    val lowhour: String?,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val toptiervolume24hour: String?,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val toptiervolume24hourto: String?,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24hour: String?,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changepct24hour: String?,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeday: String?,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changepctday: String?,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changehour: String?,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changepcthour: String?,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversiontype: String?,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionsymbol: String?,

    @SerializedName("SUPPLY")
    @Expose
    val supply: String?,

    @SerializedName("MKTCAP")
    @Expose
    val mktcap: String?,

    @SerializedName("MKTCAPPENALTY")
    @Expose
    val mktcappenalty: String?,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalvolume24h: String?,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalvolume24hto: String?,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totaltoptiervolume24h: String?,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totaltoptiervolume24hto: String?,

    @SerializedName("IMAGEURL")
    @Expose
    val imageurl: String?
   )
//{
//////    fun getFormattedTime(): String {
//////        return convertTimestampToTime(lastupdate)
//////    }
//////    fun getFullImageUrl(): String {
//////        return BASE_IMAGE_URL + imageurl
//////    }
////}
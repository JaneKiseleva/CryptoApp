package com.example.cryptoapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.cryptoapp.pojo.CoinPriceInfo
import kotlin.coroutines.coroutineContext


@Database(entities = [CoinPriceInfo::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {


    companion object {
        private var db: AppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context: Context): AppDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        DB_NAME
                    ).build()
                db = instance
                return instance
            }
        }
    }

    abstract fun coinPriceInfoDao(): CoinPriceInfoDao

//    val MIGRATION_1_2: Migration = object : Migration(1, 2) {
//        override fun migrate(database: SupportSQLiteDatabase) {
//        }
//    }
//    val db = Room.databaseBuilder(
//        context(), AppDatabase::class.java, DB_NAME
//    )
//        .addMigrations(MIGRATION_1_2).build()

//     val database = Room.databaseBuilder(context: Context,
//    AppDatabase::class.java, "main.db")
//    .fallbackToDestructiveMigration()
//    .build()

}

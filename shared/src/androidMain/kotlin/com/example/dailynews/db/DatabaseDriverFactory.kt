package com.example.dailynews.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import example.dailynews.db.DailyNewsDatabase

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver =
        AndroidSqliteDriver(
            schema = DailyNewsDatabase.Schema,
            context = context,
            name = "DailyPulse.Database.db"
        )
}
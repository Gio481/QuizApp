package com.example.quizapp.util

import android.content.Context
import java.io.IOException

object RetrieveDataFromAsset {
    fun getJsonFromAssets(context: Context, fileName: String?): String {
        val json = try {
            context.assets.open(fileName!!).bufferedReader().use { it.readText() }
        } catch (e: IOException) {
            EXCEPTION_MESSAGE
        }
        return json
    }
    private const val EXCEPTION_MESSAGE = "something went wrong"
}
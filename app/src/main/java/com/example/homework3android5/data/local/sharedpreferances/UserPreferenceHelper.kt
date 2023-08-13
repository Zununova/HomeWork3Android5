package com.example.homework3android5.data.local.sharedpreferances

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreferenceHelper @Inject constructor(@ApplicationContext context: Context) {

    private val sharedPreference: SharedPreferences =
        context.getSharedPreferences("user_preference", Context.MODE_PRIVATE)

    var userName: String?
        get() = sharedPreference.getString("userName", "")
        set(value) = sharedPreference.edit().putString("userName", value).apply()

    var userEmail: String?
        get() = sharedPreference.getString("userEmail", "")
        set(value) = sharedPreference.edit().putString("userEmail", value).apply()

    var userPassword: String?
        get() = sharedPreference.getString("userPassword", "")
        set(value) = sharedPreference.edit().putString("userPassword", value).apply()
}
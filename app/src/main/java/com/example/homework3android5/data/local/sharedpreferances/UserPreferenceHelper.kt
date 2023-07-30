package com.example.homework3android5.data.local.sharedpreferances

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreferenceHelper @Inject constructor(@ApplicationContext context: Context) {

    private val sharedePreference: SharedPreferences =
        context.getSharedPreferences("user_preference", Context.MODE_PRIVATE)

    var userName: String?
        get() = sharedePreference.getString("userName", "")
        set(value) = sharedePreference.edit().putString("userName", value).apply()

    var userEmail: String?
        get() = sharedePreference.getString("userEmail", "")
        set(value) = sharedePreference.edit().putString("userEmail", value).apply()

    var userPassword: String?
        get() = sharedePreference.getString("userPassword", "")
        set(value) = sharedePreference.edit().putString("userPassword", value).apply()
}
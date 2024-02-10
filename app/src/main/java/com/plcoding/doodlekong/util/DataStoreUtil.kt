package com.plcoding.doodlekong.util

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

// .dataStore is a property of Context
val Context.dataStore by preferencesDataStore("settings")
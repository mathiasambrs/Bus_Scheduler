package com.example.busschedule
//Mathias AMBROSI
import android.app.Application
import com.example.busschedule.database.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
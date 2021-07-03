package br.com.alexrogeriodj.businesscard

import android.app.Application
import br.com.alexrogeriodj.businesscard.data.AppDatabase
import br.com.alexrogeriodj.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}
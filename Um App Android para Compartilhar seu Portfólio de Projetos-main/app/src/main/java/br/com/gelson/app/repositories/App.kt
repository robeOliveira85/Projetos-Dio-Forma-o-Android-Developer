package br.com.gelson.app.repositories

import android.app.Application
import br.com.gelson.app.repositories.data.di.DataModule
import br.com.gelson.app.repositories.domain.di.DomainModule
import br.com.gelson.app.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
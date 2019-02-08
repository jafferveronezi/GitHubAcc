package br.com.veronezitecnologia.githubacc.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import br.com.veronezitecnologia.githubacc.data.dao.UserDAO
import br.com.veronezitecnologia.githubacc.data.entity.User
import br.com.veronezitecnologia.githubacc.data.local.converter.DateConverter

@Database(entities = [User::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class  MeuBancoDeDados : RoomDatabase() {

    abstract  fun userDao(): UserDAO

    companion object {
        val INSTANCE: MeuBancoDeDados? = null
    }
}
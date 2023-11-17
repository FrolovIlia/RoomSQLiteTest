package com.example.roomsqlitetest.data

import androidx.lifecycle.LiveData

//Обстракция доступа к множественным источникам данных

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }


}
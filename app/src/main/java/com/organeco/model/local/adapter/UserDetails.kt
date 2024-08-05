package com.organeco.adapter

interface UserDetails {
    fun getUserName(): String
    fun getEmail(): String
    fun getTokenKey(): String
    fun getUserId(): String
    fun getOnBoardStatus(): Boolean
}
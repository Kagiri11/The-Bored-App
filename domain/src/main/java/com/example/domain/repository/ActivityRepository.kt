package com.example.domain.repository

import com.example.domain.models.Activity

interface ActivityRepository {
    suspend fun getToActivity():Activity
}
package com.mutia.news2.models

data class LoginResponse (
    val success: Boolean,
    val message: String,
    val username: String?
)

package com.example.prakashauth.utils

import com.example.prakashauth.data.AuthResponse
import com.example.prakashauth.data.LoginBody
import com.example.prakashauth.data.RegisterBody
import retrofit2.http.Body
import retrofit2.http.POST

interface APIConsumer {
  // @POST("users/validate-unique-email")
   // suspend fun validateEmailAddress(@Body body: ValidateEmailBody): retrofit2.Response<UniqueEmailValidationResponse>

    @POST("users/register")
    suspend fun registerUser(@Body body: RegisterBody): retrofit2.Response<AuthResponse>

    @POST("users/login")
    suspend fun loginUser(@Body body: LoginBody): retrofit2.Response<AuthResponse>
}
package com.example.prakashauth.repository

import com.example.prakashauth.data.LoginBody
import com.example.prakashauth.data.RegisterBody
import com.example.prakashauth.utils.APIConsumer
import com.example.prakashauth.utils.RequestStatus
import com.example.prakashauth.utils.SimplifiedMessage
import kotlinx.coroutines.flow.flow

class AuthRepository(val consumer: APIConsumer) {
//    fun validateEmailAddress(body: ValidateEmailBody) = flow {
//        emit(RequestStatus.Waiting)
//        val response = consumer.validateEmailAddress(body)
//        if (response.isSuccessful) {
//            emit(RequestStatus.Success(response.body()!!))
//        } else {
//            emit(
//                RequestStatus.Error(
//                    SimplifiedMessage.get(
//                        response.errorBody()!!.byteStream().reader().readText()
//                    )
//                )
//            )
//        }
//    }

    fun registerUser(body: RegisterBody) = flow {
        emit(RequestStatus.Waiting)
        val response = consumer.registerUser(body)
        if (response.isSuccessful) {
            emit(RequestStatus.Success(response.body()!!))
        } else {
            emit(
                RequestStatus.Error(
                    SimplifiedMessage.get(
                        response.errorBody()!!.byteStream().reader().readText()
                    )
                )
            )
        }
    }

    fun loginUser(body: LoginBody) = flow {
        emit(RequestStatus.Waiting)
        val response = consumer.loginUser(body)
        if (response.isSuccessful) {
            emit(RequestStatus.Success(response.body()!!))
        } else {
            emit(
                RequestStatus.Error(
                    SimplifiedMessage.get(
                        response.errorBody()!!.byteStream().reader().readText()
                    )
                )
            )
        }
    }
}

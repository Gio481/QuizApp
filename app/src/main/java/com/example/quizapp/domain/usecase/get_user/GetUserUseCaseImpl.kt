package com.example.quizapp.domain.usecase.get_user

import com.example.quizapp.domain.repository.UserRepository
import kotlinx.coroutines.flow.first

class GetUserUseCaseImpl(private val userRepository: UserRepository) : GetUserUseCase {
    override suspend fun saveUser(key: String, value: String) = userRepository.saveUser(key, value)
    override suspend fun getUser(key: String): String? = userRepository.getUser(key).first()
    override suspend fun removeUser(key: String) = userRepository.removeUser(key)
}
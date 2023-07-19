package com.doljae.kopring.api.response

import com.doljae.kopring.domain.Gender
import com.doljae.kopring.service.dto.CustomerDto
import java.time.LocalDate

data class CustomerResponse(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val gender: Gender,
    val birthDate: LocalDate,
) {
    companion object {
        fun from(dto: CustomerDto): CustomerResponse = CustomerResponse(
            id = dto.id,
            firstName = dto.lastName,
            lastName = dto.lastName,
            gender = dto.gender,
            birthDate = dto.birthDate,
        )
    }
}
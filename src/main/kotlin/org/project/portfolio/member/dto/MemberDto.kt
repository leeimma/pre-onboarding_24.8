package org.project.portfolio.member.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import java.time.LocalDateTime

data class MemberDto(
    var id: Long?,

    @field:NotBlank
    @field:Pattern(
        regexp = "^[a-zA-Z]{3,}$",
        message = "아이디는 영어로만 작성해주세요"
    )
    var loginId: String?,

    @field:NotBlank
    @field:Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d.*\\d.*\\d.*\\d.*\\d)(?=.*[!@#$%^&*()_+].*[!@#$%^&*()_+]).{5,}$",
        message = "비밀번호는 대소문자, 숫자, 특수문자를 포함한 5자리 이상이어야 합니다."
    )
    var password: String?,

    @field:NotBlank
    @field:Pattern(
        regexp = "^[a-zA-Z가-힣]{3,20}$",
        message = "이름은 대소문자 및 한글만 포함이 가능합니다."
    )
    var name: String?,

    @field:NotBlank
    @field:Email(message = "이메일 형식이 올바르지 않습니다.")
    var email: String?,

    @field:NotBlank
    @field:Pattern(
        regexp = "^\\d{3}-\\d{3,4}-\\d{4}$",
        message = "휴대폰 번호 형식이 올바르지 않습니다."
    )
    var phone: String?
){
  var createDt: LocalDateTime? = null
}

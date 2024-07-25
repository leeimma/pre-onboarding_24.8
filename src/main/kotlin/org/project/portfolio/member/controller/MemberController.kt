package org.project.portfolio.member.controller

import jakarta.validation.Valid
import org.project.portfolio.member.dto.MemberDto
import org.project.portfolio.member.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.jvm.Throws

@RequestMapping("/api/member")
@RestController
class MemberController (
    private val memberService: MemberService
){
    @PostMapping("/signup")
    @Throws
    fun signUp(@Valid @RequestBody memberDto: MemberDto): String {
        return memberService.signUp(memberDto)
    }
}
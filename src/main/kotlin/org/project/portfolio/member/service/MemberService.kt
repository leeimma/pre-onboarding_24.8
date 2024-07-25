package org.project.portfolio.member.service

import jakarta.transaction.Transactional
import org.project.portfolio.member.dto.MemberDto
import org.project.portfolio.member.entity.Member
import org.project.portfolio.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    /**
     * 회원가입
     */
    fun signUp(memberDto: MemberDto): String {
        // ID
        var member: Member? = memberRepository
            .findByLoginId(memberDto.loginId!!)
        if (member != null) {
            return " 이미 등록된 ID 입니다."
        }
        member = Member(
            null,
            memberDto.loginId!!,
            memberDto.password!!,
            memberDto.name!!,
            memberDto.email!!,
            memberDto.phone!!
        )
        memberRepository.save(member)

        return " 회원가입이 완료 되었습니다."
    }
}
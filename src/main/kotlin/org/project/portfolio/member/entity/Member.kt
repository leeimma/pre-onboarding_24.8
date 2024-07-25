package org.project.portfolio.member.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime

@Entity
@Table(
    uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])]
)
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,

    @Column(nullable = false, length = 30, updatable = false)
    var loginId: String,

    @Column(nullable = false, length = 100)
    var password: String,

    @Column(nullable = false, length = 100)
    var name:String,

    @Column(nullable = false, length = 30)
    var email: String,

    @Column(nullable = false, length = 30)
    var phone: String,

    @CreationTimestamp
    var createDt: LocalDateTime = LocalDateTime.now()
){

}
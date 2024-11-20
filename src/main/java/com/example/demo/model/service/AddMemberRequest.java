package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;
import lombok.*; // 어노테이션 자동 생성

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.domain.Board;
import com.example.demo.model.domain.Member;
import com.example.demo.model.domain.Article;
import com.example.demo.model.repository.BoardRepository;
import com.example.demo.model.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성
public class AddMemberRequest {
    private String name;
    private String email;
    private String password;
    private String age;
    private String mobile;
    private String address;

    public Member toEntity(){ // Member 생성자를 통해 객체 생성
        return Member.builder()
        .name(name)
        .email(email)
        .password(password)
        .age(age)
        .mobile(mobile)
        .address(address)
        .build();
    }
}

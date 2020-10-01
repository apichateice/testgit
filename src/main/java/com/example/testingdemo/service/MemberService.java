package com.example.testingdemo.service;


import com.example.testingdemo.entity.Member;
import com.example.testingdemo.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public Member createMember(Member member) {
    	member = memberRepository.save(member);
    	System.out.println(member.getId());
        return member;
    }
}

package com.keyin.rest.member;

import com.keyin.rest.tournament.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member newMember) {
        return memberRepository.save(newMember);
    }

    public Member getMemberByName(String name) {
        return memberRepository.findByName(name);
    }

    public Member getMemberByMembershipType(String membershipType) {
        return memberRepository.findByMembershipType(membershipType);
    }

    public Member getMemberByPhoneNumber(String phoneNumber) {
        return memberRepository.findByPhoneNumber(phoneNumber);
    }

    public Member getMemberByMembershipStartDate(String membershipStartDate) {
        return memberRepository.findMemberByMembershipStartDate(membershipStartDate);
    }

    public Member getMemberById(long id) {
        Optional<Member> memberOptional = memberRepository.findById(id);

        return memberOptional.orElse(null);
    }

    public List<Member> getAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }
}

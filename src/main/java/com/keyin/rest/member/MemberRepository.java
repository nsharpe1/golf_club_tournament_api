package com.keyin.rest.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Calendar;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    public Member findByName(String name);

    public Member findByMembershipType(String membershipType);

    public Member findByPhoneNumber(String phoneNumber);

    public Member findMemberByMembershipStartDate(String membershipStartDate);
}

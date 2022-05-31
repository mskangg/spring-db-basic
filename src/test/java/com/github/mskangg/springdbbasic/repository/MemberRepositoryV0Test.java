package com.github.mskangg.springdbbasic.repository;

import com.github.mskangg.springdbbasic.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void curd() throws SQLException {
        Member member = new Member("memberV1", 10000);
        repository.save(member);
    }
}
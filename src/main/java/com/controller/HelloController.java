package com.controller;

import com.dao.Member;
import com.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2016-07-05.
 */
@RestController
public class HelloController {

    @Autowired
    private MemberDao memberDao;


    @RequestMapping("/")
    public String test(){
        return "HELLO WORLD";
    }


    @RequestMapping("/test/{id}")
    public Member index(@PathVariable Long id) {
        Member member = memberDao.findOne(id);
        return member;
    }
}

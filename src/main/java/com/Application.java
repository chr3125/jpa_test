package com;

import com.dao.Member;
import com.dao.MemberDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 2016-07-05.
 */

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
        MemberDao memberDao = context.getBean(MemberDao.class);


        Member member = new Member();
        member.setId(1);
        member.setUserName("최가람");

        memberDao.save(member);

    }
}

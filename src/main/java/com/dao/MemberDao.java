package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 2016-07-05.
 */
public interface MemberDao extends JpaRepository<Member, Long>{
}

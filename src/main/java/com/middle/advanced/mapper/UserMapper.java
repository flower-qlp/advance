package com.middle.advanced.mapper;


import com.middle.advanced.bean.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends JpaRepository<TUser, Long> {

    TUser findByUserName(String userName);

}

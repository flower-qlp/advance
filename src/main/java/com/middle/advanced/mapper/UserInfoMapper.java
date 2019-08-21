package com.middle.advanced.mapper;

import com.middle.advanced.bean.TUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper extends JpaRepository<TUserInfo, Long> {

    TUserInfo findByUserId(Long userId);

}

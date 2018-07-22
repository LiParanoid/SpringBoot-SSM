package com.paranoid.ssm01.dao;

import com.paranoid.ssm01.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Paranoid
 * @create 2018-07-${DAT} 21:49
 */
@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}

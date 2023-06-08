package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.User;

@Repository
@Mapper
public interface UserMapper {

	List<User> getUserList();

}

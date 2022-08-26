package com.gian.msloginexample.repository;

import com.gian.msloginexample.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface loginRepository extends JpaRepository<UserDto, Long> {
}

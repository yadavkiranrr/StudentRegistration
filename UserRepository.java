package com.RegistrationApp.Registrationpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RegistrationApp.Registrationpage.entity.UserDtls;
@Repository
public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}

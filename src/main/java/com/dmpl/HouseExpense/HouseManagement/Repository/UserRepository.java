package com.dmpl.HouseExpense.HouseManagement.Repository;

import com.dmpl.HouseExpense.HouseManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

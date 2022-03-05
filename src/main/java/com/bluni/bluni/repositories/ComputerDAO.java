package com.bluni.bluni.repositories;
import com.bluni.bluni.models.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerDAO extends JpaRepository<Computer, Integer> {
}

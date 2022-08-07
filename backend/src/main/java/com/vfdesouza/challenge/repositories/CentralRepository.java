package com.vfdesouza.challenge.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentralRepository <T> extends JpaRepository<T,Long> {
}

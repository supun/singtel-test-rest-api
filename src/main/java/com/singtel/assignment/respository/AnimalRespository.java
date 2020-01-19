package com.singtel.assignment.respository;

import com.singtel.assignment.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRespository<T extends Animal> extends JpaRepository< T, Long> {
}

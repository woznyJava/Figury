package com.example.figury.repository;

import com.example.figury.model.Square;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquareRepository extends JpaRepository<Square, Integer> {
}

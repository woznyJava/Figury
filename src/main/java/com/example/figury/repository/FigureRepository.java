package com.example.figury.repository;

import com.example.figury.model.Figura;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FigureRepository extends JpaRepository<Figura, Integer> {

}

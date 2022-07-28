package com.example.figury.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Figura{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "rectangle_id")
    private Rectangle rectangle;

    @OneToOne
    @JoinColumn(name = "square_id")
    private Square square;

    @OneToOne
    @JoinColumn(name = "wheel_id")
    private  Wheel wheel;

}

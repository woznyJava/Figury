package com.example.figury.controller;

import com.example.figury.model.Figura;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/figura")
public class ApiController {


    @PostMapping("/save")
    public Figura saveReservation(@RequestBody Figura figura) {
        hotelService.convertReservation(reservationRequest);
        return reservationRequest;
    }
}

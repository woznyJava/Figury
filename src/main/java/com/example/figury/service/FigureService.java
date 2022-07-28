package com.example.figury.service;

import com.example.figury.model.Figura;
import com.example.figury.model.Wheel;
import com.example.figury.model.Square;
import com.example.figury.model.Rectangle;
import com.example.figury.repository.FigureRepository;
import com.example.figury.repository.WheelRepository;
import com.example.figury.repository.SquareRepository;
import com.example.figury.repository.RectangleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class FigureService {
    private final SquareRepository squareRepository;
    private final RectangleRepository rectangleRepository;
    private final WheelRepository wheelRepository;
    private final FigureRepository figureRepository;


    public List<Square> returnAllSquares() {
        return squareRepository.findAll();
    }

    public List<Wheel> returnAllWheels() {
        return wheelRepository.findAll();
    }

    public List<Rectangle> returnAllRectangles(){
        return rectangleRepository.findAll();
    }

    public List<Object> returnAllFigures() {

        List<Object> newList = Stream.concat(rectangleRepository.findAll().stream(),
//                squareRepository.findAll().stream()).toList();
//        return new ArrayList<>().addAll(rectangleRepository.findAll(), squareRepository.findAll())
    }

    public List<Figura> returnFigures() {
        return figureRepository.findAll();
    }

    public void saveFigura(Rectangle rectangle, Wheel wheel, Square square){
        Figura figura = new Figura(0, rectangle, square, wheel);
        figureRepository.save(figura);
    }
}

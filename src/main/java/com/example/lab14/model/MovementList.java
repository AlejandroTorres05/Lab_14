package com.example.lab14.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovementList {
    ObservableList<Movement> movements = FXCollections.observableArrayList();

    private MovementList (){

    }

    private static MovementList instance = null;

    public static MovementList getInstance(){
        if (instance == null)
            instance = new MovementList();
        return instance;
    }

    public ObservableList<Movement> getMovements(){
        return movements;
    }

}

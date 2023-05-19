package com.example.lab14.model;

import com.example.lab14.dataBase.AllMovements;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovementList {
    ObservableList<Movement> movements;

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

    public void setMovements (int option){
        this.movements = FXCollections.observableArrayList(AllMovements.getInstance().getList(option));
    }



}

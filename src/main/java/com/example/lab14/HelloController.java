package com.example.lab14;
import com.example.lab14.dataBase.AllMovements;
import com.example.lab14.model.Movement;
import com.example.lab14.model.MovementList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    //HelloController
    @FXML
    private Button addBTN;

    @FXML
    private TableColumn<Movement, Double> amountTC;

    @FXML
    private TextField balanceTF;

    @FXML
    private Button combinadaBTN;

    @FXML
    private TableColumn<Movement, Date> dateTC;

    @FXML
    private TableColumn<Movement, String> descriptionTC;

    @FXML
    private Button gastosBTN;

    @FXML
    private Button ingresosBTN;

    @FXML
    private TableView<Movement> listTV;

    @FXML
    private TableColumn<Movement, String> typeTC;

    private int lastView = 1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        dateTC.setCellValueFactory(new  PropertyValueFactory<>("date"));

        balanceTF.setText(AllMovements.getInstance().totalBalance() + "");

        MovementList.getInstance().setMovements(lastView);

        listTV.setItems(
                MovementList.getInstance().getMovements()
        );

        addBTN.setOnAction(action -> {
            HelloApplication.openWindow("SaveMovement.fxml");
            Stage stage = (Stage) this.addBTN.getScene().getWindow();
            stage.close();
        });

        gastosBTN.setOnAction(actionEvent -> {
            this.lastView = 3;
            MovementList.getInstance().getInstance().setMovements(lastView);
            listTV.setItems(
                MovementList.getInstance().getMovements()
            );
        });

        ingresosBTN.setOnAction(actionEvent -> {
            this.lastView = 2;
            MovementList.getInstance().getInstance().setMovements(lastView);
            listTV.setItems(
                    MovementList.getInstance().getMovements()
            );
        });

        combinadaBTN.setOnAction(actionEvent -> {
            this.lastView = 1;
            MovementList.getInstance().getInstance().setMovements(lastView);
            listTV.setItems(
                    MovementList.getInstance().getMovements()
            );
        });
    }
}
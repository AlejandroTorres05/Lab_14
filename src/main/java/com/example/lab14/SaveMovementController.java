package com.example.lab14;

import com.example.lab14.dataBase.AllMovements;
import com.example.lab14.model.Movement;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class SaveMovementController implements Initializable {

    private String[] type = {"INGRESO", "GASTO"};
    @FXML
    private TextField amountTF;

    @FXML
    private DatePicker dateDP;

    @FXML
    private TextArea descriptionTA;

    @FXML
    private Button saveBTN;

    @FXML
    private ChoiceBox<String> typeCB;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        typeCB.getItems().addAll(type);

        saveBTN.setOnAction( actionEvent -> {

            double amount = Double.parseDouble(amountTF.getText());
            String type = typeCB.getValue();
            String description = descriptionTA.getText();
            Date date = java.sql.Date.valueOf(dateDP.getValue());

            Movement movement = new Movement(type, amount, description, date);

            AllMovements.getInstance().add(movement);
            HelloApplication.openWindow("hello-view.fxml");
            Stage stage = (Stage) this.saveBTN.getScene().getWindow();
            stage.close();
        });

    }
}

package com.example.lab14;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button addBTN;

    @FXML
    private TableColumn<?, ?> amountTC;

    @FXML
    private TextField balanceTF;

    @FXML
    private Button combinadaBTN;

    @FXML
    private TableColumn<?, ?> dateTC;

    @FXML
    private TableColumn<?, ?> descriptionTC;

    @FXML
    private Button gastosBTN;

    @FXML
    private Button ingresosBTN;

    @FXML
    private TableView<?> listTV;

    @FXML
    private TableColumn<?, ?> typeTC;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
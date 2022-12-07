package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

public class SecondController {
    @FXML
    private Button exitButton;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private TextFlow textFlow;

    @FXML
    public void initialize() {
        Triangle circle = Triangle.getInstance();
        System.out.println(circle);
        Text text = new Text("Radius of in circle: " + circle.getInRadius()  + "\nRadius of out circle: " + circle.getOutRadius() + "\nArea: " + circle.getArea());
        textFlow.getChildren().add(text);
        textFlow.setTextAlignment(TextAlignment.LEFT);
    }

    @FXML
    void back(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}

package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FirstController {

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Polygon triangle;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField radiusField;

    @FXML
    void calc() {
        calculate();
    }

    @FXML
    private Circle inCircle;

    @FXML
    private Circle outCrcle;



    @FXML
    void calculate() {
        try {
            Triangle.createNewTriangle(Double.parseDouble(aField.getText()), Double.parseDouble(bField.getText()), Double.parseDouble(cField.getText()));
        }
        catch (Exception ignored){
            error();
            return;
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RunApplication.class.getResource("second-form.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Results");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void circlepress(KeyEvent event) {
        System.out.println("circle pressed");
    }

    @FXML
    void colorchange(ActionEvent event) {
        triangle.setFill(colorPicker.getValue());
    }

    @FXML
    void radius(ActionEvent event) {

    }

    @FXML
    void check(ActionEvent event) {
        try {
            Triangle.createNewTriangle(Double.parseDouble(aField.getText()), Double.parseDouble(bField.getText()), Double.parseDouble(cField.getText()));
            right();
        }
        catch (Exception ignored){
            error();
        }
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void trianglePress(KeyEvent event) {

    }

    @FXML
    void initialize(){
        inCircle.setVisible(false); outCrcle.setVisible(false);
        ContextMenu cm  =new ContextMenu();
        MenuItem a = new MenuItem("Видалити");
        MenuItem b = new MenuItem("Вписане і описане коло");
        ColorPicker cp = new ColorPicker();
        MenuItem c = new MenuItem("Змінити колір", cp);

        cm.getItems().addAll(a,b,c);
        triangle.setOnMouseClicked(t -> {
            if(t.getButton().toString().equals("SECONDARY"))
                cm.show(triangle,t.getScreenX(),t.getSceneY());
            cm.setOnAction(e -> {
                if(e.getTarget() == a) {triangle.setVisible(false); inCircle.setVisible(false); outCrcle.setVisible(false);}
                if(e.getTarget() == b) {inCircle.setVisible(true); outCrcle.setVisible(true);}
                try {
                    if (e.getTarget() == c) triangle.setFill((cp.getValue()));
                }
                catch (Exception ignored){

                }
            });
        });
    }

    void error(){
        Stage stage;
        stage = new Stage();

        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Button button = new Button("Повернутись");
        VBox vbox = new VBox(new Text("Даний трикутник не є прямокутним"), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        dialogStage.setScene(new Scene(vbox));
        dialogStage.show();
        button.setOnAction(actionEvent -> dialogStage.close());
    }

    void right(){
        Stage stage = new Stage();
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Button button = new Button("Повернутись");
        VBox vbox = new VBox(new Text("Даний трикутник є прямокутним"), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        dialogStage.setScene(new Scene(vbox));
        dialogStage.show();
        button.setOnAction(actionEvent -> dialogStage.close());
    }

}
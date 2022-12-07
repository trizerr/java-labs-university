package com.example.lab5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField adressField;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField cityField;

    @FXML
    private TextField contactField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField numberField;

    @FXML
    private Button sendButton;

    @FXML
    private CheckBox spamCkeck;

    @FXML
    void cancel(ActionEvent event) {
        setDisable(true);
        Stage stage;
        stage = new Stage();

        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Button button = new Button("Закрити");
        VBox vbox = new VBox(new Text("Нам шкода, що ви не надали інформацію."), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        dialogStage.setScene(new Scene(vbox));
        dialogStage.show();
        button.setOnAction(actionEvent -> System.exit(0));
    }

    @FXML
    void send(ActionEvent event) {
        setDisable(true);
        Stage stage;
        stage = new Stage();

        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Button button = new Button("Закрити");
        VBox vbox = new VBox(new Text("Дякуємо, ми обробляємо Вашу інформацію."), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        dialogStage.setScene(new Scene(vbox));
        dialogStage.show();
        button.setOnAction(actionEvent -> System.exit(0));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sendButton.setDisable(true);
    }

    @FXML
    void inputAdres(KeyEvent event) {
        checkFields();
    }

    @FXML
    void check(ActionEvent event) {
        checkFields();
    }

    @FXML
    void contactPressed(KeyEvent event) {
        checkFields();
    }

    @FXML
    void emailPressed(KeyEvent event) {
        checkFields();
    }

    @FXML
    void nameKey(KeyEvent event) {
        checkFields();
    }

    @FXML
    void numberPressed(KeyEvent event) {
        checkFields();
    }

    private void checkFields(){
        sendButton.setDisable(nameField.getText().length() <= 0 || cityField.getText().length() <= 0 || adressField.getText().length() <= 0 || contactField.getText().length() <= 0
                || numberField.getText().length() <= 0 || emailField.getText().length() <= 0 || !spamCkeck.isSelected());
    }

    private void setDisable(boolean b){
        nameField.setDisable(b);
        cityField.setDisable(b);
        adressField.setDisable(b);
        contactField.setDisable(b);
        numberField.setDisable(b);
        emailField.setDisable(b);
        spamCkeck.setDisable(b);
        sendButton.setDisable(b);
        cancelButton.setDisable(b);
    }
}

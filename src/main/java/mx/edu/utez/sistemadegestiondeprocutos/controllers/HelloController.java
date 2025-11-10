package mx.edu.utez.sistemadegestiondeprocutos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Bienvenido al Sistema de Gestión de Productos!");
    }
}


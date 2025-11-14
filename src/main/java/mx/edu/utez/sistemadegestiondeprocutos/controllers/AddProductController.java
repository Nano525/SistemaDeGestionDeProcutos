package mx.edu.utez.sistemadegestiondeprocutos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import mx.edu.utez.sistemadegestiondeprocutos.utils.WindowUtils;

public class AddProductController {
    @FXML
    private Button OnCancelarButton;
    @FXML
    public void OnCancelarButton(){
        WindowUtils.switchWindow(OnCancelarButton, "mx/edu/utez/sistemadegestiondeprocutos/auth/Products.fxml", "Menu Principal");
    }
}

package mx.edu.utez.sistemadegestiondeprocutos.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import mx.edu.utez.sistemadegestiondeprocutos.utils.WindowUtils;

public class ProductoController {
    @FXML
    private Button btnAgregarProducto;
    @FXML
    public void btnAgregarProducto(ActionEvent event) {
        WindowUtils.switchWindow(btnAgregarProducto, "mx/edu/utez/sistemadegestiondeprocutos/auth/AddProduct.fxml", "Agregar Producto");
    }

}


module mx.edu.utez.sistemadegestiondeprocutos {
    requires javafx.controls;
    requires javafx.fxml;

    opens mx.edu.utez.sistemadegestiondeprocutos to javafx.fxml;
    opens mx.edu.utez.sistemadegestiondeprocutos.controllers to javafx.fxml;
    exports mx.edu.utez.sistemadegestiondeprocutos;
    exports mx.edu.utez.sistemadegestiondeprocutos.controllers;
}
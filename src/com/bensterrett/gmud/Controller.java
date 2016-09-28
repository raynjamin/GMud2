package com.bensterrett.gmud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    MenuItem connectButton;

    @FXML
    VBox root;

    @FXML
    TextField connectUrl;

    public void openConnectDialog(ActionEvent event) throws IOException {
        final Stage dialog = new Stage();
        Parent connectBox = FXMLLoader.load(getClass().getResource("/fxml/dialogs/connect.fxml"));
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(root.getScene().getWindow());
        dialog.setScene(new Scene(connectBox, 600, 400));
        dialog.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

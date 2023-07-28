package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class UngDungThiTracNghiemController {
    @FXML
    private RadioButton A;
    @FXML
    private ToggleGroup toggleGroup;
    @FXML
    public void action(){
        int point = 0;
        if (A.isSelected()){
            point = point + 1;
        }

    }

}

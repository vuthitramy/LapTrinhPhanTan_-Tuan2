package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MultipleChoiceController {
    @FXML
    private CheckBox luachonso1;

    @FXML
    private CheckBox luachonso2;

    @FXML
    private Label diemtracnghiem;

    @FXML
    public void xacNhanCauTraLoi() {
        int diem = 0;

        if (luachonso1.isSelected()) {
            diem = diem + 1;
        }

        diemtracnghiem.setText("Diem hien tai cua ban la: "+diem);
    }
}

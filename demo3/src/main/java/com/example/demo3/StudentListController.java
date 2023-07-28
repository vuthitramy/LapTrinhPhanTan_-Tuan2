package com.example.demo3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentListController implements Initializable {
    @FXML
    private ListView<Student> listView;

    public ListView<Student> getListView() {
        return listView;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setCellFactory(param -> new StudentListCell());
    }

    private class StudentListCell extends ListCell<Student> {
        private HBox content;
        private Label nameLabel;
        private Label ageLabel;

        public StudentListCell() {
            nameLabel = new Label();
            nameLabel.setFont(Font.font(14));

            ageLabel = new Label();
            ageLabel.setFont(Font.font(12));

            content = new HBox(10);
            content.getChildren().addAll(nameLabel, ageLabel);
        }

        @Override
        protected void updateItem(Student student, boolean empty) {
            super.updateItem(student, empty);

            if (empty || student == null) {
                setText(null);
                setGraphic(null);
            } else {
                nameLabel.setText(student.getName());
                ageLabel.setText("Age: " + student.getAge());

                setText(null);
                setGraphic(content);
            }
        }
    }


}


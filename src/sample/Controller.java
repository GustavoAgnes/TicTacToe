package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

import javax.xml.bind.annotation.XmlAnyAttribute;

public class Controller {
    @FXML
    Circle circleA1;
    @FXML
    Circle circleA2;
    @FXML
    Circle circleA3;
    @FXML
    Circle circleB1;
    @FXML
    Circle circleB2;
    @FXML
    Circle circleB3;
    @FXML
    Circle circleC1;
    @FXML
    Circle circleC2;
    @FXML
    Circle circleC3;

    @FXML
    VBox xA1;
    @FXML
    VBox xA2;
    @FXML
    VBox xA3;
    @FXML
    VBox xB1;
    @FXML
    VBox xB2;
    @FXML
    VBox xB3;
    @FXML
    VBox xC1;
    @FXML
    VBox xC2;
    @FXML
    VBox xC3;

    @FXML
    Button a1;
    @FXML
    Button a2;
    @FXML
    Button a3;
    @FXML
    Button b1;
    @FXML
    Button b2;
    @FXML
    Button b3;
    @FXML
    Button c1;
    @FXML
    Button c2;
    @FXML
    Button c3;


    static int turn = 1;
    int[] pos = new int[9];
    public static int whichTurn(){
        //0=x 1 = circle
        turn++;
        if(turn>1){
            turn = 0;
        }
        return turn;
    }

    @FXML
    public void mostrarElemento(ActionEvent e) {
        if (e.getSource().toString().substring(10, 12).equals("a1") && xA1.isVisible() == false && circleA1.isVisible() == false) {
            if (whichTurn() == 0) {
                xA1.setVisible(true);
                pos[0] = 3;
            } else {
                pos[0] = 1;
                circleA1.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("a2") && xA2.isVisible() == false && circleA2.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[1] = 3;
                xA2.setVisible(true);
            } else {
                pos[1] = 1;
                circleA2.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("a3") && xA3.isVisible() == false && circleA3.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[2] = 3;
                xA3.setVisible(true);
            } else {
                pos[2] = 1;
                circleA3.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("b1") && xB1.isVisible() == false && circleB1.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[3] = 3;
                xB1.setVisible(true);

            } else {
                pos[3] = 1;
                circleB1.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("b2") && xB2.isVisible() == false && circleB2.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[4] = 3;
                xB2.setVisible(true);
            } else {
                pos[4] = 1;
                circleB2.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("b3") && xB3.isVisible() == false && circleB3.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[5] = 3;
                xB3.setVisible(true);
            } else {
                pos[5] = 1;
                circleB3.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("c1") && xC1.isVisible() == false && circleC1.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[6] = 3;
                xC1.setVisible(true);
            } else {
                pos[6] = 1;
                circleC1.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("c2") && xC2.isVisible() == false && circleC2.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[7] = 3;
                xC2.setVisible(true);
            } else {
                pos[7] = 1;
                circleC2.setVisible(true);
            }
        }
        if (e.getSource().toString().substring(10, 12).equals("c3") && xC3.isVisible() == false && circleC3.isVisible() == false) {
            if (whichTurn() == 0) {
                pos[8] = 3;
                xC3.setVisible(true);
            } else {
                pos[8] = 1;
                circleC3.setVisible(true);
            }
        }
        //fim do jogo
        if((pos[0]==1 && pos[1]==1 && pos[2]==1) ||
                (pos[0]==1 && pos[4]==1 && pos[8]==1) ||
                (pos[3]==1 && pos[4]==1 && pos[5]==1) ||
                (pos[6]==1 && pos[7]==1 && pos[8]==1) ||
                (pos[2]==1 && pos[4]==1 && pos[6]==1) ||
                (pos[0]==1 && pos[3]==1 && pos[6]==1) ||
                (pos[1]==1 && pos[4]==1 && pos[7]==1) ||
                (pos[2]==1 && pos[5]==1 && pos[8]==1))
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Fim de jogo");
                    alert.setHeaderText(null);
                    alert.setContentText("O ganhou!");

                    alert.showAndWait();
                    a1.setDisable(true);
                    a2.setDisable(true);
                    a3.setDisable(true);
                    b1.setDisable(true);
                    b2.setDisable(true);
                    b3.setDisable(true);
                    c1.setDisable(true);
                    c2.setDisable(true);
                    c3.setDisable(true);
                }
                if((pos[0]==3 && pos[4]==3 && pos[8]==3) ||
                (pos[3]==3 && pos[4]==3 && pos[5]==3) ||
                (pos[6]==3 && pos[7]==3 && pos[8]==3) ||
                (pos[2]==3 && pos[4]==3 && pos[6]==3) ||
                (pos[0]==3 && pos[3]==3 && pos[6]==3) ||
                (pos[1]==3 && pos[4]==3 && pos[7]==3) ||
                (pos[2]==3 && pos[5]==3 && pos[8]==3) ||
                (pos[0]==3 && pos[1]==3 && pos[2]==3)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fim de jogo");
            alert.setHeaderText(null);
            alert.setContentText("X Ganhou!");

            alert.showAndWait();
                    a1.setDisable(true);
                    a2.setDisable(true);
                    a3.setDisable(true);
                    b1.setDisable(true);
                    b2.setDisable(true);
                    b3.setDisable(true);
                    c1.setDisable(true);
                    c2.setDisable(true);
                    c3.setDisable(true);
        }
    }
}

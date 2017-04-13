/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclockgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.csci360.alarmclock.Alarm;
import com.csci360.alarmclock.Clock;
import com.csci360.alarmclock.Radio;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label time;
    private Label alarm1Status;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        time.setText("1:00");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

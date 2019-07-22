package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;


public class BrainController {



    @FXML
    Label errorBrainName, errorBrainIq, errorBrainSmartLevel;

    @FXML
    TextField brainName, brainSmartLevel, brainIq ;

    @FXML

    public void onSubmit(ActionEvent event){

        //to clear error message
        errorBrainName.setText("");
        errorBrainIq.setText("");
        errorBrainSmartLevel.setText("");





        String valueBrainName, valueBrainSmartLevel, valueBrainIq;

        valueBrainName = brainName.getText();
        valueBrainSmartLevel = brainSmartLevel.getText();
        valueBrainIq = brainIq.getText();

        BrainModel brainModel = new BrainModel(valueBrainName,valueBrainSmartLevel,valueBrainIq);



        try{
            brainModel.validateBrainName();
        }
        catch (IllegalArgumentException e){

            errorBrainName.setText(e.getMessage());
        }



        System.out.println(brainModel);
    }

}

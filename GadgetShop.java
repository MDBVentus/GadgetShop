import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import java.util.List;


/*
Starts the JavaFX and opens the interactable GUI.
*/
public class GadgetShop extends Application
{
    /* Creates the fields, the gadgets list, count and logarea */
    private final TextField modelField = new TextField();
    private final TextField priceField = new TextField();
    private final TextField sizeField = new TextField();
    private final TextField weightField = new TextField();
    private final TextField currentCreditField = new TextField();
    private final TextField availableMemoryField = new TextField();
    private final TextField durationField = new TextField();
    private final TextField downloadSizeField = new TextField();
    private final TextField displayNumberField = new TextField();
    private final TextField phoneNumberField = new TextField();
    private final TextArea logArea = new TextArea();
    
    private List<Gadget> gadgets = new ArrayList<>();
    private int count = -1;
    
    @Override
    public void start(Stage stage)
    {
        Pane root = new Pane();
        
        /*------ Creates the Alerts ------*/
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText(null);
        
        /* ----- Creates and sets the location of Labels ----- */
        /* Model */
        Label modelLabel = new Label("Model:");
        modelLabel.setLayoutX(20);
        modelLabel.setLayoutY(20);
                
        /* Price */
        Label priceLabel = new Label("Price(\u00A3):");
        priceLabel.setLayoutX(20);
        priceLabel.setLayoutY(50);

        /* Weight */
        Label weightLabel = new Label("Weight(g):");
        weightLabel.setLayoutX(20);
        weightLabel.setLayoutY(80);

        /* Size */
        Label sizeLabel = new Label("Size(mmxmmxmm):");
        sizeLabel.setLayoutX(20);
        sizeLabel.setLayoutY(110);

        /* Intital Credit */
        Label intitialCredit = new Label("Current Credit:");
        intitialCredit.setLayoutX(20);
        intitialCredit.setLayoutY(140);
        
        /* Available Memory */
        Label availableMemory = new Label("Available Memory:");
        availableMemory.setLayoutX(20);
        availableMemory.setLayoutY(170);
        
        /* Phone Number */
        Label phoneNumber = new Label("Phone Number:");
        phoneNumber.setLayoutX(20);
        phoneNumber.setLayoutY(200);

        /* Call Duration */
        Label duration = new Label("Call Duration:");
        duration.setLayoutX(20);
        duration.setLayoutY(230);

        /* Download Size */
        Label downloadSize = new Label("Download Size:");
        downloadSize.setLayoutX(20);
        downloadSize.setLayoutY(260);

        /* Display Number */
        Label displayNumber = new Label("Display Number:");
        displayNumber.setLayoutX(20);
        displayNumber.setLayoutY(290);
        
        /* ----- Sets the location of the Log Area ----- */
        logArea.setLayoutX(20);
        logArea.setLayoutY(320);
        
        
        /* ----- Sets the location of the Fields ----- */       
        /* Model */
        modelField.setLayoutX(140);
        modelField.setLayoutY(20);

        /* Price */
        priceField.setLayoutX(140);
        priceField.setLayoutY(50);

        /* Weight */
        weightField.setLayoutX(140);
        weightField.setLayoutY(80);

        /* Size */
        sizeField.setLayoutX(140);
        sizeField.setLayoutY(110);

        /* Current Credit */
        currentCreditField.setLayoutX(140);
        currentCreditField.setLayoutY(140);
 
        /* Available Memory */
        availableMemoryField.setLayoutX(140);
        availableMemoryField.setLayoutY(170);

        /* Phone Number */
        phoneNumberField.setLayoutX(140);
        phoneNumberField.setLayoutY(200);

        /* Call Duration */
        durationField.setLayoutX(140);
        durationField.setLayoutY(230);

        /* Download Size */
        downloadSizeField.setLayoutX(140);
        downloadSizeField.setLayoutY(260);

        /* Display Number */
        displayNumberField.setLayoutX(140);
        displayNumberField.setLayoutY(290);
        displayNumberField.setText("-1");
        
        
    
        /* ----- Creates and Sets the location of the Buttons ----- */
        /* Button Add Mobile */
        Button addMobile = new Button("Add Mobile");
        addMobile.setLayoutX(300);
        addMobile.setLayoutY(100);

        /* Button Add MP3 */
        Button addMP3 = new Button("Add MP3");
        addMP3.setLayoutX(300);
        addMP3.setLayoutY(130);

        /* Button Clear */
        Button clear = new Button("Clear");
        clear.setLayoutX(390);
        clear.setLayoutY(100);

        /* Button Display All */
        Button displayAll = new Button("Display All");
        displayAll.setLayoutX(390);
        displayAll.setLayoutY(130);

        /* Button Make Call */
        Button makeCall = new Button("Make Call");
        makeCall.setLayoutX(300);
        makeCall.setLayoutY(230);

        /* Button Download Music */
        Button musicDownload = new Button("Download Music");
        musicDownload.setLayoutX(300);
        musicDownload.setLayoutY(260);

        /* Button based on Display Number */
        Button onDisplayNumber = new Button("Display Based on Number");
        onDisplayNumber.setLayoutX(300);
        onDisplayNumber.setLayoutY(290);
        
        /* Button Exit */
        Button exit = new Button("Exit");
        exit.setLayoutX(460);
        exit.setLayoutY(290);

        

        /* ----- Button Actions ----- */
        /* Add Mobile */
        addMobile.setOnAction(e -> {
        try 
        {
            Mobile newMobile = new Mobile(modelField.getText(),
                sizeField.getText(), Double.parseDouble(priceField.getText().trim()), 
                Integer.parseInt(weightField.getText().trim()), 
                Integer.parseInt(currentCreditField.getText().trim()));
             
            gadgets.add(newMobile);
            
            logArea.appendText(System.lineSeparator() + "Added: " + newMobile + 
            System.lineSeparator());
            System.out.println("----- Added Mobile -----");
            newMobile.display();
            
            count = count + 1;
            displayNumberField.setText(String.valueOf(count));
            
            alert.setContentText( newMobile + " Added.");
            alert.showAndWait();
        }
        catch (NumberFormatException ex)
        {
            showError("Input Error", "Check if the values are correct. " + 
            System.lineSeparator() + "Model: String, " + System.lineSeparator() + 
            "Size: String, " + System.lineSeparator() + 
            "Price: Number, " + System.lineSeparator() + 
            "Weight: Number, " + System.lineSeparator() + "Current Credit: Number ");
            displayNumberField.setText("-1");
        }
        });
        /*
        Adds the Mobile by taking in the fields, 
        creating a mobile with the values and adding that mobile to the gadgets list. 
        It makes count go up and then shows an alert. 
        If it is not correct, it shows an error.
        */
        
       
        /* Add MP3 */
        addMP3.setOnAction(e -> {
        try 
        {
            mp3 newMP3 = new mp3(modelField.getText(),
                sizeField.getText(), Double.parseDouble(priceField.getText().trim()), 
                Integer.parseInt(weightField.getText().trim()),  
                Integer.parseInt(availableMemoryField.getText().trim()));
            
            gadgets.add(newMP3);
            
            logArea.appendText(System.lineSeparator() + "Added: " + newMP3 + 
            System.lineSeparator());
            System.out.println("----- Added MP3 -----");
            newMP3.display();
            
            count = count + 1;
            displayNumberField.setText(String.valueOf(count));
            
            alert.setContentText(newMP3 + " Added.");
            alert.showAndWait();
        }
        catch (NumberFormatException ex)
        {
            showError("Input Error", "Check if the values are correct. " + 
            System.lineSeparator() + "Model: String, " + System.lineSeparator() + 
            "Size: String, " + System.lineSeparator() + "Price: Number, " + 
            System.lineSeparator() + 
            "Weight: Number, " + System.lineSeparator() + "Available Memory: Number ");
            displayNumberField.setText("-1");
        }
        });
        /*
        Adds the MpP3 by taking in the fields, 
        creating a mp3 with the values and adding that mp3 to the gadgets list. 
        It makes count go up and then shows an alert. 
        If it is not correct, it shows an error.
        */
       
       
        /* Clear */
        clear.setOnAction(e -> {
            modelField.setText("");
            sizeField.setText("");
            priceField.setText("");
            weightField.setText("");
            currentCreditField.setText("");
            availableMemoryField.setText("");
            phoneNumberField.setText("");
            durationField.setText("");
            downloadSizeField.setText("");
            displayNumberField.setText("");
            logArea.setText("");
            
            alert.setContentText("Everything has been cleared.");
            alert.showAndWait();
        });
        /*
        It clears all fields of information.
        */
       
            
        /* Display All */
        displayAll.setOnAction(e -> {
        logArea.appendText(System.lineSeparator() + "----- Display All Gadgets -----" 
        + System.lineSeparator());
        for (int i = 0; i < gadgets.size(); i++) {
            logArea.appendText(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" + System.lineSeparator());
            logArea.appendText("Display Number: " + i + System.lineSeparator());
            Gadget show = gadgets.get(i);
            logArea.appendText(show.toString() + System.lineSeparator());
            
            System.out.println(System.lineSeparator()+" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("Display Number: " + i + System.lineSeparator());
            show.display();
        }      
            
        alert.setContentText("All Gadgets Displayed.");
        alert.showAndWait();
        });  
        /*
        It goes through the list and prints all of the current gadgets. Then shows an alert. 
        */   
        
        exit.setOnAction(e -> {
            System.exit(0) ;
        });
        /*
        Exits the Program. 
        */   
        
        /* Display Based on Number */
        onDisplayNumber.setOnAction(e -> {
        try
        {
            downloadSizeField.setText("");
            phoneNumberField.setText("");
            durationField.setText("");
            
            Gadget show = gadgets.get(Integer.valueOf(displayNumberField.getText().trim()));
            modelField.setText(show.getModel());
            sizeField.setText(show.getSize());
            priceField.setText(String.valueOf(show.getPrice()));
            weightField.setText(String.valueOf(show.getWeight()));
            for (Gadget g : gadgets) {
                if (show instanceof Mobile) {
                    Mobile m = (Mobile) show;
                    currentCreditField.setText(String.valueOf(m.getCallingCredit()));
                    availableMemoryField.setText("");
                }
                else if (show instanceof mp3)
                {
                    mp3 m = (mp3) show;
                    availableMemoryField.setText(String.valueOf(m.getMemory()));
                    currentCreditField.setText("");
                }
            }
            
            logArea.appendText(System.lineSeparator() + System.lineSeparator() 
            + "----- Display Single Gadget -----" + System.lineSeparator());
            
            logArea.appendText("Display Number: " + 
            Integer.valueOf(displayNumberField.getText().trim()) + System.lineSeparator());
            
            System.out.println(System.lineSeparator()+" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("Display Number: " + 
            Integer.valueOf(displayNumberField.getText().trim()) + System.lineSeparator());
    
            logArea.appendText(show.toString() + System.lineSeparator());
            show.display();
            
            alert.setContentText("Information of " + show + " displayed.");
            alert.showAndWait();
        }
        catch (NumberFormatException ex)
        {
            showError("Input Error", "Check if the values are correct. " + 
            System.lineSeparator() + "Display Number: Number");
        }
        catch (Exception ex) 
        {
            showError("Input Error", 
            "Display number incorrect. Please choose from 0 - " + (gadgets.size() - 1));
            displayNumberField.setText("-1");
        } 
        });
        /*
        It will take the display number and based on that number insert 
        the values of the gadget in the index on gadget then checks if 
        its an instance of mobile or mp3 and takes the calling credit 
        or memory and puts it into all the fields.  
        */   
            
        
        /* Make a Call */
        makeCall.setOnAction(e -> {
        try
        {   
            Gadget show = gadgets.get(Integer.valueOf(displayNumberField.getText().trim()));
            modelField.setText(show.getModel());
            sizeField.setText(show.getSize());
            priceField.setText(String.valueOf(show.getPrice()));
            weightField.setText(String.valueOf(show.getWeight()));
            for (Gadget g : gadgets) {
                if (show instanceof Mobile) {
                    Mobile m = (Mobile) show;
                    currentCreditField.setText(String.valueOf(m.getCallingCredit()));
                    availableMemoryField.setText("");
                }
            }
            
            if (show instanceof Mobile) {
                Mobile m = (Mobile) show;
        
                String result = m.phonecall(Integer.parseInt(durationField.getText().trim()), 
                Integer.parseInt(phoneNumberField.getText().trim())).toString();
                logArea.appendText(System.lineSeparator() + result);
                alert.setContentText(result);
                alert.showAndWait();
            } 
            else
            {
                alert.setContentText("This gadget is not in Mobile.");
                alert.showAndWait();
                logArea.appendText(System.lineSeparator() + "This gadget is not in Mobile.");
                System.out.println("This gadget is not in Mobile.");
            }
            
            for (Gadget g : gadgets) {
                if (show instanceof Mobile) {
                    Mobile m = (Mobile) show;
                    currentCreditField.setText(String.valueOf(m.getCallingCredit()));
                }
            }
        }
        catch (NumberFormatException ex)
        {
            showError("Input Error", "Check if the values are correct. " + 
            System.lineSeparator() + "Phone Number: Number " 
            + System.lineSeparator() + "Call Duration: Number"  + System.lineSeparator() + 
            "Model: String, " + System.lineSeparator() + "Size: String, " 
            + System.lineSeparator() 
            + "Price: Number, " + System.lineSeparator() + "Weight: Number, " 
            + System.lineSeparator() 
            + "Current Credit: Number ");
        }
        catch (Exception ex) 
        {
            showError("Input Error", "Display number incorrect. Please choose from 0 - " + 
            (gadgets.size() - 1));
            displayNumberField.setText("-1");
        } 
        });  
        /*
        It will take the display number and based 
        on that number check if its mobile and then simulate 
        a phone call removing the amount of time from credit.
        */   
            
        
        /* Download Music */
        musicDownload.setOnAction(e -> {  
        try
        {   
            Gadget show = gadgets.get(Integer.valueOf(displayNumberField.getText().trim()));
            modelField.setText(show.getModel());
            sizeField.setText(show.getSize());
            priceField.setText(String.valueOf(show.getPrice()));
            weightField.setText(String.valueOf(show.getWeight()));
            for (Gadget g : gadgets) {
                if (show instanceof mp3) {
                    mp3 m = (mp3) show;
                    availableMemoryField.setText(String.valueOf(m.getMemory()));
                    currentCreditField.setText("");
                }
            }   

            if (show instanceof mp3) {
                mp3 m = (mp3) show;
        
                String result = m.download(Integer.parseInt(downloadSizeField.getText().trim()));
                logArea.appendText(System.lineSeparator() + result);
                alert.setContentText(result);
                alert.showAndWait();
            } 
            else
            {
                alert.setContentText("This gadget is not in mp3.");
                alert.showAndWait();
                logArea.appendText(System.lineSeparator() + "This gadget is not in mp3.");
                System.out.println("This gadget is not in mp3.");
            }
            
            for (Gadget g : gadgets) {
                if (show instanceof mp3) {
                    mp3 m = (mp3) show;
                    availableMemoryField.setText(String.valueOf(m.getMemory()));
                    currentCreditField.setText("");
                }
            }   
        }
        catch (NumberFormatException ex)
        {
            showError("Input Error", "Check if the values are correct. " + 
            System.lineSeparator() + "Download Size: Number "  
            + System.lineSeparator() + "Model: String, " + System.lineSeparator() + 
            "Size: String, " + System.lineSeparator() 
            + "Price: Number, " + System.lineSeparator() + "Weight: Number, " + 
            System.lineSeparator() + "Available Memory: Number ");
        }
        catch (Exception ex) 
        {
            showError("Input Error", "Display number incorrect. Please choose from 0 - " + 
            (gadgets.size() - 1));
            displayNumberField.setText("-1");
        } 
        });
        /*
        It will take the display number and based 
        on that number check if its mp3 and then simulate 
        the download removing the required space from availble memory.
        */   
            
            
        
        /* Makes all the labels, buttons, fields, etc, appear */
        root.getChildren().addAll(logArea, modelLabel, musicDownload, 
        makeCall, addMP3, clear, displayAll, 
        addMobile, priceLabel, weightLabel, sizeLabel, 
        intitialCredit, availableMemory, phoneNumberField, 
        phoneNumber, duration, downloadSize, modelField, 
        priceField, sizeField, weightField, 
        currentCreditField, availableMemoryField, 
        durationField, downloadSizeField, displayNumberField, 
        displayNumber, onDisplayNumber, exit);
        
        /* Creates the stage and sets it title */
        stage.setScene(new Scene(root, 510, 520));
        stage.setTitle("Gadget Shop");
        stage.show();
    }
    
    
    /*
     Creates an error message when there is a misinput on the GUI.
    */   
    private void showError(String title, String message)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}

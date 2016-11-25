package vista;

import java.io.IOException;

import clase.MainFX;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX extends Application {

	//not using yet
	@FXML
	private ImageView imageRaw;

    // Reference to the main application
    private MainFX mainApp;

    /**
     * Es llamado por la aplicación principal para dar una referencia a sí mismo.
     * 
     */
    public void setMainApp(MainFX mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * Abre una etapa para enviar el perfil, que se hará...
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Método para manejar la acción ImageView en la etapa principal
     */
    
    @FXML
    private void handleSend() {
    	showSendProfile();
    }

    /**
     * 
*Cierra la aplicación cuando se hace clic en Salir en la etapa secundaria
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

    }

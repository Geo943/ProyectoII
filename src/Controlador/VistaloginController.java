/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Windows;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author geoffrey
 */
public class VistaloginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContraseña;
    @FXML
    private Button btnEntrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    private void keyevent(KeyEvent event) {
        Object evt = event.getSource();
        
        if(evt.equals(txtUsuario)){
        
            if (event.getCharacter().equals(" ")){
            event.consume();
            }
            
        }else if(evt.equals(txtContraseña)){
            if (event.getCharacter().equals(" ")){
            event.consume();
            }
        
        }
        
    }

    @FXML
    private void entrar(ActionEvent event) {
        
        
        String user= this.txtUsuario.getText();
        String pass= this.txtContraseña.getText();
        if(user.isEmpty()||pass.isEmpty()){
            JOptionPane.showMessageDialog(null,"los campos no pueden estar vacios ");
    }else if (user.equals("geo") && pass.equals("123")){
        
        FXMLLoader loader = new  FXMLLoader(getClass().getResource("/Vista/VistaMenu.fxml"));
            try {
 //para cerrar la ventana que estamos                
                Object eventSource=event.getSource();
                Node sourseAsNode=(Node) eventSource;
                Scene oldScene=sourseAsNode.getScene();
               Window window = oldScene.getWindow();
               Stage stagel=(Stage) window;
               stagel.hide();
//abrimos la ventana de menu
                Parent root = loader.load();
                VistaMenuController conrolador= loader.getController();
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                
            } catch (IOException ex) {
                Logger.getLogger(VistaloginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else {
         Alert alerta=new Alert(Alert.AlertType.WARNING);
                    alerta.setHeaderText(":0(");
                    alerta.setTitle("ALTO");
                    alerta.setContentText("VERIFIQUE SUS CREDENCIALES");
                    alerta.showAndWait();
    
    }
        
    }

    

    
}

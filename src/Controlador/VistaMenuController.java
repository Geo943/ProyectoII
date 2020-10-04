/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author geoffrey
 */
public class VistaMenuController implements Initializable {
          

    @FXML
    private MenuItem clienteIndividual;
    @FXML
    private MenuItem produc;
    @FXML
    private MenuItem orden;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    private void clienteIndividual(ActionEvent event) {
                FXMLLoader loader = new  FXMLLoader(getClass().getResource("/Vista/VistaIndividual.fxml"));
            try {
 //para cerrar la ventana que estamos                
//                Object eventSource=event.getSource();
//                Node sourseAsNode=(Node) eventSource;
//                Scene oldScene=sourseAsNode.getScene();
//               Window window = oldScene.getWindow();
//               Stage stagel=(Stage) window;
//               stagel.close();
//abrimos la ventana de menu
                Parent root = loader.load();
                VistaIndividualController conrol= loader.getController(); //clase  controlador
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                
            } catch (IOException ex) {
                Logger.getLogger(VistaloginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
             
    }

    @FXML
    private void producto(ActionEvent event) {
         FXMLLoader loader1 = new  FXMLLoader(getClass().getResource("/Vista/Vistaproducto.fxml"));
            try {
 //para cerrar la ventana que estamos                
//                Object eventSource=event.getSource();
//                Node sourseAsNode=(Node) eventSource;
//                Scene oldScene=sourseAsNode.getScene();
//               Window window = oldScene.getWindow();
//               Stage stagel=(Stage) window;
//               stagel.close();
//abrimos la ventana de menu
                Parent root = loader1.load();
               VistaproductoController conro2= loader1.getController(); //clase  controlador
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                
            } catch (IOException ex) {
                Logger.getLogger(VistaloginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
     }

    @FXML
    private void orden(ActionEvent event) {
        FXMLLoader loader1 = new  FXMLLoader(getClass().getResource("/Vista/Orden.fxml"));
            try {
 //para cerrar la ventana que estamos                
//                Object eventSource=event.getSource();
//                Node sourseAsNode=(Node) eventSource;
//                Scene oldScene=sourseAsNode.getScene();
//               Window window = oldScene.getWindow();
//               Stage stagel=(Stage) window;
//               stagel.close();
//abrimos la ventana de menu
                Parent root = loader1.load();
               OrdenController conro3= loader1.getController(); //clase  controlador
                Scene scene=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                
            } catch (IOException ex) {
                Logger.getLogger(VistaloginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    }


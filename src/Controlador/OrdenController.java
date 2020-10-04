
package Controlador;

import Modelo.DataSistema;
import Modelo.Orden;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author geoffrey
 */
public class OrdenController implements Initializable {

    @FXML
    private TableView<Orden> tblorden;
    @FXML
    private TableColumn colid;
    @FXML
    private TableColumn colcliente;
    @FXML
    private TableColumn colitem1;
    @FXML
    private TableColumn colitem2;
    @FXML
    private TableColumn colfecha;
    @FXML
    private TableColumn colprecioenv;
    @FXML
    private TableColumn coltotal;
    @FXML
    private TableColumn coltipenvio;
    @FXML
    private TableColumn colestado;
    @FXML
    private TableColumn coldiasenvi;

    ObservableList<Orden>ordens;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Orden orden = new Orden();
        DataSistema pr = new DataSistema();
        ordens=FXCollections.observableArrayList();
        this.colid.setCellValueFactory(new PropertyValueFactory("id"));
        this.colcliente.setCellValueFactory(new PropertyValueFactory("pcliente"));
        this.colitem1.setCellValueFactory(new PropertyValueFactory("itemorden1"));
        this.colitem2.setCellValueFactory(new PropertyValueFactory("itemorden2"));
        this.colfecha.setCellValueFactory(new PropertyValueFactory("fechaOrden"));
        this.colprecioenv.setCellValueFactory(new PropertyValueFactory("precioEnvio"));
        this.coltotal.setCellValueFactory(new PropertyValueFactory("total"));
        this.coltipenvio.setCellValueFactory(new PropertyValueFactory("tipoEnvio"));
        this.colestado.setCellValueFactory(new PropertyValueFactory("estado"));
        this.coldiasenvi.setCellValueFactory(new PropertyValueFactory("diasEnvio"));
        pr.llenarorden();
        this.ordens.addAll(pr.lisorden);
        this.tblorden.setItems(ordens);
                
        
        
    }    
    
}

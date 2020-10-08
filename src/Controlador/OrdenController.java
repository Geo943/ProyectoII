package Controlador;

import Modelo.DataSistema;
import Modelo.ItemOrden;
import Modelo.Orden;
import Modelo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TableColumn colcliente;
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

    ObservableList<Orden> ordens;
    @FXML
    private TextField txtcliente;
    @FXML
    private TextField txtfecha;
    @FXML
    private TextField txtpreenvio;
    @FXML
    private TextField txttdeenvio;
    @FXML
    private TextField txtestado;
    @FXML
    private TextField txtdiasenvi;
    @FXML
    private TableView<ItemOrden> tblitemord;
    @FXML
    private TableColumn colnolinea;
    @FXML
    private TableColumn colcantidad;
    @FXML
    private TableColumn colprecio;
    @FXML
    private TableColumn descripcion;
    ObservableList<ItemOrden> itordens;
    @FXML
    private Button btncarga;
    @FXML
    private TextField txtcatidad;
    @FXML
    private ComboBox<Producto> tbncombopro;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        DataSistema pr = new DataSistema();
        ordens = FXCollections.observableArrayList();
        // this.colid.setCellValueFactory(new PropertyValueFactory("id"));
        this.colcliente.setCellValueFactory(new PropertyValueFactory("cliente"));
        this.colfecha.setCellValueFactory(new PropertyValueFactory("fechaOrden"));
        this.colprecioenv.setCellValueFactory(new PropertyValueFactory("precioEnvio"));
        this.coltipenvio.setCellValueFactory(new PropertyValueFactory("tipoEnvio"));
        this.colestado.setCellValueFactory(new PropertyValueFactory("estado"));
        this.coldiasenvi.setCellValueFactory(new PropertyValueFactory("diasEnvio"));
        pr.llenarorden();
        this.ordens.addAll(pr.lisorden);
        this.tblorden.setItems(ordens);

        itordens = FXCollections.observableArrayList();
        this.colnolinea.setCellValueFactory(new PropertyValueFactory("noLinea"));
        this.colcantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        this.colprecio.setCellFactory(new PropertyValueFactory("producto"));
//         this.descripcion.setCellValueFactory(new PropertyValueFactory("producto"));
//         this.coltotal.setCellValueFactory(new PropertyValueFactory("getTotal"));
        pr.llenarItorden();
        this.itordens.addAll(pr.lisItorden);
        this.tblitemord.setItems(itordens);
        
        
        
    }

    @FXML
    private void cargar(ActionEvent event) {
          
//        int cantidad=Integer.parseInt(this.txtcatidad.getText());
//       ItemOrden itt= new ItemOrden(cantidad, DataSistema.listpro);
//      
//        
    }

    @FXML
    private void cpmbopro(ActionEvent event) {
        ObservableList<Producto> items = FXCollections.observableArrayList();
        items.addAll(DataSistema.listpro);
        
    }

}


package Controlador;

import Modelo.Cliente;
import Modelo.DataSistema;
import Modelo.Empresa;
import Modelo.Individual;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author geoffrey
 */
public class VistaIndividualController implements Initializable {

    @FXML
    private TableView<Cliente> tblindividual;
    @FXML
    private TableColumn coldpi;
    @FXML
    private TableColumn colnombre;
    @FXML
    private TableColumn conlnit;
    @FXML
    private TableColumn coldireccion;
    @FXML
    private TableColumn coltelefono;

    private ObservableList<Cliente> individual;
    private ObservableList<Cliente> individualfiltrado;
    @FXML
    private TableColumn colid;
    @FXML
    private TableColumn colestado;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtdpi;
    @FXML
    private TextField txtnit;
    @FXML
    private TextField txtdireccion;
    @FXML
    private TextField txttel;
    @FXML
    private Button btncargar;
    @FXML
    private TextField txtestado;
    @FXML
    private Button btnmodificar;
    @FXML
    private Button btneliminar;
    @FXML
    private TableColumn colcontacto;
    @FXML
    private TableColumn coldesc;
    @FXML
    private TextField txtcontanto;
    @FXML
    private TextField txtdesc;
    @FXML
    private TextField txtfiltro;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DataSistema dats = new DataSistema();

        individual = FXCollections.observableArrayList();
        individualfiltrado = FXCollections.observableArrayList();
        this.colid.setCellValueFactory(new PropertyValueFactory("id"));
        this.coldpi.setCellValueFactory(new PropertyValueFactory("dpi"));
        this.colnombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.conlnit.setCellValueFactory(new PropertyValueFactory("nit"));
        this.coldireccion.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.coltelefono.setCellValueFactory(new PropertyValueFactory("telefono"));
        this.colcontacto.setCellValueFactory(new PropertyValueFactory("contacto"));
        this.coldesc.setCellValueFactory(new PropertyValueFactory("descuento"));
        this.colestado.setCellValueFactory(new PropertyValueFactory("estado"));
        dats.llenarCliente();
        this.individual.addAll(DataSistema.list);
        this.tblindividual.setItems(individual); //envia los valores a la tabla 
    }

    @FXML
    private void cargar(ActionEvent event) {
        try {
            String dpi = this.txtdpi.getText();
            String nombre = this.txtnombre.getText();
            String nit = this.txtnit.getText();
            String direccion = this.txtdireccion.getText();
            String telefono = this.txttel.getText();
            String contacto = this.txtcontanto.getText();
            int descuento = Integer.parseInt(this.txtdesc.getText());
            String estado = this.txtestado.getText();

            Cliente reg = new Individual(dpi, nombre, nit, direccion, telefono, estado);
            this.individual.add(reg);
            this.tblindividual.setItems(individual);

//            Cliente reg2=new Empresa(contacto, descuento, nombre, nit, direccion, telefono, estado);
//            this.individual.add(reg2);
//            this.tblindividual.setItems(individual);
        } catch (Exception e) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(":0(");
            alerta.setTitle("ALTO");
            alerta.setContentText("VERIFIQUE los datos");
            alerta.showAndWait();

        }

    }

    @FXML
    private void seleccion(MouseEvent event) {
        Cliente ind = this.tblindividual.getSelectionModel().getSelectedItem();
        if (ind != null) {
            //this.txtdpi.setText();
            this.txtnombre.setText(ind.getNombre());
            this.txtnit.setText(ind.getNit());
            this.txtdireccion.setText(ind.getDireccion());
            this.txttel.setText(ind.getTelefono());
            this.txtestado.setText(ind.getEstado());

        }
    }

    @FXML
    private void modificar(ActionEvent event) {

        Cliente ind = this.tblindividual.getSelectionModel().getSelectedItem();
        if (ind == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(":0(");
            alerta.setTitle("ALTO");
            alerta.setContentText("DEBE DE SELECCIONAR UN CLIENTE");
            alerta.showAndWait();
        } else {
            try {
                String dpi = this.txtdpi.getText();
                String nombre = this.txtnombre.getText();
                String nit = this.txtnit.getText();
                String direccion = this.txtdireccion.getText();
                String telefono = this.txttel.getText();
                String estado = this.txtestado.getText();

                Cliente mod = new Individual(dpi, nombre, nit, direccion, telefono, estado);
                this.individual.add(mod);
                this.individual.remove(ind);
                this.tblindividual.setItems(individual);
            } catch (Exception e) {

                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(":0(");
                alerta.setTitle("ALTO");
                alerta.setContentText("VERIFIQUE LOS DATOS");
                alerta.showAndWait();

            }

        }
    }

    @FXML
    private void eliminar(ActionEvent event) {
        Cliente ind = this.tblindividual.getSelectionModel().getSelectedItem();
        this.individual.remove(ind);
        this.tblindividual.refresh();
    }

    @FXML
    private void filtrar(KeyEvent event) {
        String filtro=this.txtfiltro.getText();
        if(filtro.isEmpty()){
            this.tblindividual.setItems(individual);
        }else {
        this.individualfiltrado.clear();
        for(Cliente c:this.individual){
            if(c.getEstado().toLowerCase().contains(filtro.toLowerCase())){
                this.individualfiltrado.add(c);
              }
            }
        this.tblindividual.setItems(individualfiltrado);
        }
        
    }

}

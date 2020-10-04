package Controlador;

import Modelo.DataSistema;
import Modelo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author geoffrey
 */
public class VistaproductoController implements Initializable {

    @FXML
    private TableView<Producto> tblproducto;
    @FXML
    private TableColumn colid;
    @FXML
    private TableColumn colnombre;
    @FXML
    private TableColumn colmarca;
    @FXML
    private TableColumn colmodelo;
    @FXML
    private TableColumn colcantidad;
    @FXML
    private TableColumn colprecio;

    private ObservableList<Producto> productos;
    @FXML
    private TableColumn colestado;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtmarca;
    @FXML
    private TextField txtmodelo;
    @FXML
    private TextField txtcantidad;
    @FXML
    private TextField txtprecio;
    @FXML
    private TextField txtestado;
    @FXML
    private Button btnagregar;
    @FXML
    private Button btnmod;
    @FXML
    private Button btnelim;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DataSistema pr = new DataSistema();
        productos = FXCollections.observableArrayList();
        this.colid.setCellValueFactory(new PropertyValueFactory("id"));
        this.colnombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colmarca.setCellValueFactory(new PropertyValueFactory("marcav"));
        this.colmodelo.setCellValueFactory(new PropertyValueFactory("modelov"));
        this.colcantidad.setCellValueFactory(new PropertyValueFactory("cantidad"));
        this.colprecio.setCellValueFactory(new PropertyValueFactory("precio"));
        this.colestado.setCellValueFactory(new PropertyValueFactory("estado"));
        pr.llenarProductos();
        this.productos.addAll(pr.listpro);
        this.tblproducto.setItems(productos);
    }

    @FXML
    private void agregar(ActionEvent event) {
        try {
            String nombre = this.txtnombre.getText();
            String marca = this.txtmarca.getText();
            String modelo = this.txtmodelo.getText();
            int cantidad = Integer.parseInt(this.txtcantidad.getText());
            double precio = Double.parseDouble(this.txtprecio.getText());
            String estado = this.txtestado.getText();
            Producto prod = new Producto(nombre, marca, modelo, cantidad, precio, estado);
            this.productos.add(prod);
            this.tblproducto.setItems(productos);

        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(":0(");
            alerta.setTitle("ALTO");
            alerta.setContentText("VERIFIQUE los datos");
            alerta.showAndWait();
        }
    }

    @FXML
    private void eliminar(ActionEvent event) {
        Producto prrd = this.tblproducto.getSelectionModel().getSelectedItem();
        this.productos.remove(prrd);

    }

    @FXML
    private void modificar(ActionEvent event) {
        Producto prrd1 = this.tblproducto.getSelectionModel().getSelectedItem();
        if (prrd1 == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(":0(");
            alerta.setTitle("ALTO");
            alerta.setContentText("DEBE DE SELECCIONAR UN PRODUCTO");
            alerta.showAndWait();
        } else {
            try {
                String nombre = this.txtnombre.getText();
                String marca = this.txtmarca.getText();
                String modelo = this.txtmodelo.getText();
                int cantidad = Integer.parseInt(this.txtcantidad.getText());
                double precio = Double.parseDouble(this.txtprecio.getText());
                String estado = this.txtestado.getText();
                Producto prod = new Producto(nombre, marca, modelo, cantidad, precio, estado);
                this.productos.add(prod);
                this.productos.remove(prrd1);
                this.tblproducto.setItems(productos);
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
    private void selecion(MouseEvent event) {
        Producto prrd = this.tblproducto.getSelectionModel().getSelectedItem();

        this.txtnombre.setText(prrd.getNombre());
        this.txtmarca.setText(prrd.getMarcav());
        this.txtmodelo.setText(prrd.getModelov());
        this.txtcantidad.setText(prrd.getCantidad() + "");
        this.txtprecio.setText(prrd.getPrecio() + "");
        this.txtestado.setText(prrd.getEstado());

    }

}

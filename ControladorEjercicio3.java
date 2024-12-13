import com.javafx.EjerciciosSceneBuilder.Empleado;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class ControladorEjercicio3 implements Initializable{

    @FXML
    private Button btnActualizar;

    @FXML
    private Menu btnArchivo;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnExportarJson;

    @FXML
    private Button btnExportarXML;

    @FXML
    private Button btnImportarJson;

    @FXML
    private Button btnImportarXML;

    @FXML
    private Button btnInsertar;
    
    @FXML
    private MenuItem btnExportar;
    
    @FXML
    private MenuItem btnImportar;

    @FXML
    private TableColumn<Empleado, String> colApellidos;

    @FXML
    private TableColumn<Empleado, String> colDepartamento;

    @FXML
    private TableColumn<Empleado, Integer> colId;

    @FXML
    private TableColumn<Empleado, String> colNombre;

    @FXML
    private TableColumn<Empleado, Double> colSueldo;

    @FXML
    private TableView<Empleado> tabEmpleados;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtDepartamento;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtSueldo;
    
    @FXML
    void exportarArchivo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Exportar");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("JSON y XML", "*.json", "*.xml"));
        fileChooser.showSaveDialog(null);
         
      
    }

    @FXML
    void importarArchivo() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Importar");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("JSON y XML", "*.json", "*.xml"));
        fileChooser.showOpenDialog(null);
    }
   
    @FXML
    void insertarEmpleado() {
      tabEmpleados.getItems().add(new Empleado(txtNombre.getText(), txtApellidos.getText(), txtDepartamento.getText(), Double.parseDouble(txtSueldo.getText())));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        colDepartamento.setCellValueFactory(new PropertyValueFactory("departamento"));
        colSueldo.setCellValueFactory(new PropertyValueFactory("sueldo"));

    }

}

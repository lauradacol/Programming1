
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.*;

public class Teste extends Application{
	private AnchorPane pane; 
	private AnchorPane pane2;
	
	
	private BorderPane border;
	private VBox vbox1;
	private VBox vbox2;
	
	private TextField txNome;
	private Button btCadastrar;
	private Button btBuscar;
	private static Stage stage;
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	public void start(Stage stage) throws Exception {
		initComponents();
				
		Scene scene = new Scene(border);
		stage.setScene(scene);
		stage.show();
		
		initLayout();
		Teste.stage = stage;	
		
		initListeners();
	}
	
	private void initComponents(){
		border = new BorderPane();
		vbox1 = new VBox();
		vbox2 = new VBox();
		
		border.setLeft(vbox1);
		border.setCenter(vbox2);
		
		
		pane2 = new AnchorPane();
		pane2.setPrefSize(400, 300);
		
		txNome = new TextField();
		txNome.setPromptText("Nome da Família");

		btCadastrar = new Button("Cadastrar");
		btBuscar = new Button("Buscar Famílias");
	
		pane.getChildren().add(txNome);
		pane.getChildren().add(btCadastrar);
		pane.getChildren().add(btBuscar);		
		
	}
	
	private void initLayout(){
		txNome.setLayoutX((vbox1.getWidth() - txNome.getWidth())/2);
		txNome.setLayoutY(50);
	
		btCadastrar.setLayoutX(230);
		btCadastrar.setLayoutY(140);
		
		btBuscar.setLayoutX(230);
		btBuscar.setLayoutX(170);		
	}
	
	private void initListeners(){
		btCadastrar.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent arg0){
				FamiliaFactory.getInstance().cadastrarFamilia(txNome.getText());
			}
		});		
		
		btBuscar.setOnAction(new EventHandler<ActionEvent>(){			
			public void handle(ActionEvent arg0){
				for(Familia f : FamiliaFactory.getInstance().findAll()){
					vbox2.getChildren().add(new Label(f.getNome()));
				}	
				
				Scene scene = new Scene(vbox2);
				stage.setScene(scene);
				stage.show();				
			}			
		});
	}
	
	public static Stage getStage(){
		return stage;
	}

	public static void setStage(Stage stage){
		Teste.stage = stage;
	}	
	
	public static void main(String[] args){
		launch(args);		
	}

}
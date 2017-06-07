import java.beans.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{
	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar;
	private Button btSair;
	private static Stage stage;

	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	public void start(Stage stage) throws Exception {
		initComponents();
				
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
		initLayout();
		LoginApp.stage = stage;						
	}
	
	private void initComponents(){
		pane = new AnchorPane();
		pane.setPrefSize(400,300);	
		
		txLogin = new TextField();
		txLogin.setPromptText("Login");
		
		txSenha = new PasswordField();
		txSenha.setPromptText("Senha");
		
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");		
		
		pane.getChildren().add(txLogin);
		pane.getChildren().add(txSenha);
		pane.getChildren().add(btSair);
		pane.getChildren().add(btEntrar);
	}
	
	private void initLayout(){
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth())/2);
		txLogin.setLayoutY(50);
		
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth())/2);
		txSenha.setLayoutY(100);
		
		btSair.setLayoutX(230);
		btSair.setLayoutY(140);
		
		btEntrar.setLayoutX(280);
		btEntrar.setLayoutY(140);				
	}
	
	private void initListeners(){
		btSair.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent arg0){
				System.exit(0);
			}
		});
		
	}
	
	public static Stage getStage(){
		return stage;
	}

	public static void setStage(Stage stage){
		LoginApp.stage = stage;
	}	
	
	public static void main(String[] args){
		launch(args);		
	}

}

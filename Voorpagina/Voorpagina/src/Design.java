import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Design extends Application{
	/*Declaren van enkele labels die gebruikt worden.
	 */
	Label lb_text;
	Label labels;
	Label labelss;
	
	/*
	 * De main. Vereist onderdeel
	 */
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * Placeholder voor logo. Hier wordt naam gegeven.
		 */
		Label labelLogo = new Label("S Buddy");
		
		lb_text = new Label();
		labels = new Label();
		labelss = new Label();

		
		/**
		 * Maken van email form. Zetten van voorgeplaatste text met setPromptText("Email")
		 */
		final TextField email = new TextField ();
		email.setPromptText("Email");
		HBox hb1 = new HBox();
		hb1.getChildren().addAll(email);
		hb1.setSpacing(10);
		
		/**
		 * Maken van password form. Zetten van voorgeplaatste text met setPromptText("Password")
		 */
		final TextField password = new TextField ();
		password.setPromptText("Password");
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(password);
		hb2.setSpacing(10);
		
		/**
		 * Maken van Login button met placeholderfunctie, laten zien dat we met .getText() de inhoud van de forms kunnen gebruiken.
		 */
		Button button1 = new Button("Log in");
		button1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent args){
				labels.setText("Hello " + email.getText() + ". Your password is " + password.getText() + ".");
			}
		});
		
		/**
		 * Zetten van style van de button op de .my_customLabel uit de css.
		 */
		button1.getStyleClass().add("my_customLabel");
		
		/**
		 * Zelfde doen voor TextFields met .topFields.
		 */
		password.getStyleClass().add("topFields");
		email.getStyleClass().add("topFields");
		
		/**
		 * De login form en button in een HBox zetten voor makkelijk verplaatsen.
		 */
		HBox LoginHolder = new HBox();
		LoginHolder.getChildren().addAll(hb1,hb2,button1);
		
		/**
		 * Placeholderfunctie voor de button die een passwoord naar de emailadres moet sturen als het geklikt wordt.
		 */
		Button button2 = new Button("Forgot your password?");
		button2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent args){
				lb_text.setText("Your password will be sent to your emailaddress shortly.");
			}
		});
		/**
		 * Geven van style .ForgotPassword uit css.
		 */
		button2.getStyleClass().add("ForgotPassword");
		
		/**
		 * Maken van text boven de form en geven van bijbehorende styles.
		 */
		Label find = new Label("Find a study buddy");
		find.getStyleClass().add("find");
		Label free = new Label("get started - ");
		Label free2 = new Label("it's free.");	
		free2.getStyleClass().add("free2bolding");
		HBox freeholder = new HBox();
		freeholder.getChildren().addAll(free,free2);
		freeholder.getStyleClass().add("freeholder");
		
		/**
		 * Maken van form voor registreren (voornaam).
		 */
		Label label1 = new Label("First name:");
		TextField firstname = new TextField ();
		HBox hb3 = new HBox();
		hb3.getChildren().addAll(label1, firstname);
		hb3.setSpacing(10);
		/**
		 * Maken van form voor achternaam.
		 */	
		Label label2 = new Label("Last name:");
		TextField lastname = new TextField ();
		HBox hb4 = new HBox();
		hb4.getChildren().addAll(label2, lastname);
		hb4.setSpacing(10);

		/**
		 * Maken van form voor email.
		 */
		Label label3 = new Label("Email:");
		TextField emailaddress = new TextField ();
		HBox hb5 = new HBox();
		hb5.getChildren().addAll(label3, emailaddress);
		hb5.setSpacing(10);
		
		/**
		 * Maken van form voor passwoord.
		 */
		Label label4 = new Label("Password:");
		TextField passwords = new TextField ();
		HBox hb6 = new HBox();
		hb6.getChildren().addAll(label4, passwords);
		hb6.setSpacing(10);
		
		/**
		 * Maken van button om te joinen met placeholderfunctie.
		 */
		Button button3 = new Button("Join now");
		button3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent args){
				labelss.setText("We can't process your application at this moment. Please wait.");
			}
		});

		/**
		* Plaatsen in HBox voor makkelijk verplaatsen en geven van style aan de relevante onderdelen.
		*/
		HBox logInfoHolder = new HBox();
		logInfoHolder.getChildren().addAll(hb3,hb4,hb5,hb6,button3,labelss);
		hb3.getStyleClass().add("RegInfoContents");
		hb4.getStyleClass().add("RegInfoContents");
		hb5.getStyleClass().add("RegInfoContents");
		hb6.getStyleClass().add("RegInfoContents");
		button3.getStyleClass().add("RegInfoContents");
		labelss.getStyleClass().add("RegInfoContents");
		logInfoHolder.getStyleClass().add("registerBox");
		
		/**
		 * Plaatsen van alles in een Vbox voor display.
		 */
		VBox root = new VBox();
		root.getChildren().addAll(labelLogo,LoginHolder,labels,button2,lb_text,find,freeholder,logInfoHolder);
		
		/**
		 * Scene maken en zetten als de scene voor primaryStage.
		 */
		Scene scenetest = new Scene(root, 1600, 900);
		primaryStage.setScene(scenetest);
		
		/**
		 * De css toevoegen aan onze scene.
		 */
		scenetest.getStylesheets().add("Voorpagina.css");
		
		/**
		 * De scene laten zien.
		 */
		primaryStage.show();
	}
}

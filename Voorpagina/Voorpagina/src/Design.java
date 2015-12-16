import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Design extends Application {
	/*
	 * Declaren van enkele labels die gebruikt worden.
	 */
	Label lb_text;
	Label labels;
	Label labelss;

	/*
	 * De main. Vereist onderdeel
	 */
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * Placeholder voor logo. Hier wordt naam gegeven.
		 */
		Label labelLogo = new Label("S Buddy");
		labelLogo.getStyleClass().add("logo");

		lb_text = new Label();
		labels = new Label();
		labelss = new Label();

		/**
		 * Maken van email form. Zetten van voorgeplaatste text met
		 * setPromptText("Email")
		 */
		final TextField email = new TextField();
		email.setPromptText("Email");
		HBox hb1 = new HBox();
		hb1.getChildren().addAll(email);
		hb1.setSpacing(10);

		/**
		 * Maken van password form. Zetten van voorgeplaatste text met
		 * setPromptText("Password")
		 */
		final TextField password = new TextField();
		password.setPromptText("Password");
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(password);
		hb2.setSpacing(13);

		/**
		 * Maken van Login button met placeholderfunctie, laten zien dat we met
		 * .getText() de inhoud van de forms kunnen gebruiken.
		 */
		Button button1 = new Button("Log in");
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent args) {
				labels.setText("Hello " + email.getText() + ". Your password is " + password.getText() + ".");
			}
		});
		
		button1.setLayoutX(500);
		button1.setLayoutY(1000);

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
		 * De login form en button in een HBox zetten voor makkelijk
		 * verplaatsen.
		 */
		HBox LoginHolder = new HBox();
		LoginHolder.getStyleClass().add("lgin");
		LoginHolder.getChildren().addAll(hb1, hb2, button1);

		/**
		 * Placeholderfunctie voor de button die een passwoord naar de
		 * emailadres moet sturen als het geklikt wordt.
		 */
		Button button2 = new Button("Forgot your password?");
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent args) {
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
		freeholder.getChildren().addAll(free, free2);
		freeholder.getStyleClass().add("freeholder");

		/**
		 * Maken van form voor registreren (voornaam).
		 */
		Label label1 = new Label("First name:");
		label1.getStyleClass().add("firstname");
		TextField firstname = new TextField();
		HBox hb3 = new HBox();
		hb3.getChildren().addAll(label1, firstname);
		hb3.getStyleClass().add("first");
		hb3.setSpacing(10);
		/**
		 * Maken van form voor achternaam.
		 */
		Label label2 = new Label("Last name:");
		label2.getStyleClass().add("lastname");
		TextField lastname = new TextField();
		HBox hb4 = new HBox();
		hb4.getChildren().addAll(label2, lastname);
		hb4.getStyleClass().add("second");
		hb4.setSpacing(14);

		/**
		 * Maken van form voor email.
		 */
		Label label3 = new Label("Email:");
		label3.getStyleClass().add("email");
		TextField emailaddress = new TextField();
		HBox hb5 = new HBox();
		hb5.getChildren().addAll(label3, emailaddress);
		hb5.getStyleClass().add("third");
		hb5.setSpacing(58);

		/**
		 * Maken van form voor passwoord.
		 */
		Label label4 = new Label("Password:");
		label4.getStyleClass().add("passwd");
		TextField passwords = new TextField();
		HBox hb6 = new HBox();
		hb6.getChildren().addAll(label4, passwords);
		hb6.getStyleClass().add("fourth");
		hb6.setSpacing(15);
		
		Pane rootVoorpagina = new Pane();
		rootVoorpagina.setId("pane");
		
		/**
		 * Maken van button om te joinen met placeholderfunctie.
		 */
		Button button3 = new Button("Join now");
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent args) {
				labelss.setText("We can't process your application at this moment. Please wait.");
				
				Scene sceneVoorpagina = new Scene(rootVoorpagina, 1600, 900);
				primaryStage.setScene(sceneVoorpagina);
				
				sceneVoorpagina.getStylesheets().add("ontwerp.css");
				
				primaryStage.show();
			}
		});

		/**
		 * Plaatsen in HBox voor makkelijk verplaatsen en geven van style aan de
		 * relevante onderdelen.
		 */
		VBox logInfoHolder = new VBox();
		logInfoHolder.getChildren().addAll(hb3, hb4, hb5, hb6, button3, labelss);
		hb3.getStyleClass().add("RegInfoContents");
		hb4.getStyleClass().add("RegInfoContents");
		hb5.getStyleClass().add("RegInfoContents");
		hb6.getStyleClass().add("RegInfoContents");
		button3.getStyleClass().add("RegInfoContents");
		labelss.getStyleClass().add("RegInfoContents");
		logInfoHolder.getStyleClass().add("registerBox");
		logInfoHolder.setSpacing(15);

		/**
		 * Plaatsen van alles in een Vbox voor display.
		 */
		Pane root = new Pane();
		root.setId("pane");

		root.getChildren().addAll(labelLogo, LoginHolder, labels, button2, lb_text, find, freeholder, logInfoHolder);

		find.setLayoutX(70);
		find.setLayoutY(150);

		freeholder.setLayoutX(90);
		freeholder.setLayoutY(220);

		button2.setLayoutX(1200);
		button2.setLayoutY(65);

		LoginHolder.setLayoutX(1000);
		LoginHolder.setLayoutY(20);

		labelLogo.setLayoutX(50);
		labelLogo.setLayoutY(30);

		logInfoHolder.setLayoutX(50);
		logInfoHolder.setLayoutY(300);

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
		
		
		
		/**
		 * placeholder voor de logo
		 */
		Label labellogo = new Label("S buddy");
		labellogo.getStyleClass().add("logo");
		
		/**
		 * een button help. De setaction moet gelinkt worden aan een nieuwe page, maar welke?
		 */
		Button help = new Button("Help");
		help.getStyleClass().add("help");
		
		/**
		 * Een button voor logout. De set action moet nog gemaakt worden om terug te gaan naar de hoofdpagina?
		 */
		Button logout = new Button("Log out");
		help.getStyleClass().add("logout");
		
		/**
		 * Een box voor de help en logout buttons
		 */
		HBox helpout = new HBox();
		helpout.getChildren().addAll(help, logout);
		helpout.getStyleClass().add("helpoutbox");
		
	
		Button profile = new Button("Profile");
		profile.getStyleClass().add("profile");
		
		Button courses = new Button("Courses");
		courses.getStyleClass().add("courses");
		
		Button match = new Button ("Match");
		match.getStyleClass().add("match");
		
		Button message = new Button("Message");
		message.getStyleClass().add("message");
		
		Button settings = new Button("Settings");
		settings.getStyleClass().add("settings");
		
		VBox overzicht = new VBox();
		overzicht.getChildren().addAll(profile, courses, match, message, settings);
		overzicht.getStyleClass().add("overzicht");
		
		
		Button expartners = new Button("Ex Partners");
		expartners.getStyleClass().add("expartners");
		
		Button whosnew = new Button("Who is new?");
		whosnew.getStyleClass().add("new");
		
		VBox extra = new VBox();
		extra.getChildren().addAll(expartners, whosnew);
		extra.getStyleClass().add("extra");
		
		final TextField name = new TextField();
		name.setPromptText("Your Name");
		HBox bovennaam = new HBox();
		bovennaam.getChildren().addAll(name);
		bovennaam.getStyleClass().add("bovennaam");
		bovennaam.setSpacing(17);
		
		final TextField desc = new TextField();
		desc.setPromptText("Short Description");
		HBox desci = new HBox();
		desci.getChildren().addAll(desc);
		desci.getStyleClass().add("desci");
		desci.setSpacing(13);
		
		Label summary = new Label("Summary");
		summary.getStyleClass().add("summary");
		
		final TextField sum = new TextField();
		sum.setPromptText("Write something about yourself.");
		HBox summy = new HBox();
		summy.getChildren().addAll(sum);
		summy.setSpacing(10);
		summy.getStyleClass().add("summy");
		
		Label career = new Label("Career information");
		career.getStyleClass().add("career");
		
		Label curyear = new Label("Current Year: ");
		curyear.getStyleClass().add("yearlabel");
		TextField jaar = new TextField();
		jaar.setPromptText("Add here your current year");
		HBox yeaar = new HBox();
		yeaar.getChildren().addAll(curyear, jaar);
		yeaar.getStyleClass().add("yearbox");
		yeaar.setSpacing(10);
		
		Label curs = new Label("Current Study: ");
		curs.getStyleClass().add("curslabel");
		TextField currentstud = new TextField();
		currentstud.setPromptText("Add here your current study");
		HBox curstud = new HBox();
		curstud.getChildren().addAll(curs, currentstud);
		curstud.getStyleClass().add("curstudybox");
		curstud.setSpacing(10);
		
		Label studyper = new Label("Study period: ");
		studyper.getStyleClass().add("studyperlabel");
		TextField studyperiode = new TextField();
		studyperiode.setPromptText("When did you begin your study and when will be your year of graduation?");
		HBox studyperiod = new HBox();
		studyperiod.getChildren().addAll(studyper, studyperiode);
		studyperiod.getStyleClass().add("studyperiodebox");
		studyperiod.setSpacing(10);
		
		
		Label university = new Label("Current University: ");
		university.getStyleClass().add("unilabel");
		TextField uni = new TextField();
		uni.setPromptText("Add here your current University");
		HBox unibox = new HBox();
		unibox.getChildren().addAll(university, uni);
		unibox.getStyleClass().add("universitybox");
		unibox.setSpacing(10);
		
		Label basicinfo = new Label("Basic information");
		basicinfo.getStyleClass().add("basicinfo");
		
		
		Label gender= new Label("Gender: ");
		gender.getStyleClass().add("genderlabel");
		TextField geslacht = new TextField();
		geslacht.setPromptText("Are you a male or a female?");
		HBox genbox = new HBox();
		genbox.getChildren().addAll(gender, geslacht);
		genbox.getStyleClass().add("genderbox");
		genbox.setSpacing(10);
			
		
		Label country = new Label("Country of residence: ");
		country.getStyleClass().add("countrylabel");
		TextField countryof = new TextField();
		countryof.setPromptText("Add here your country of residence");
		HBox countrybox = new HBox();
		countrybox.getChildren().addAll(country, countryof);
		countrybox.getStyleClass().add("countrybox");
		countrybox.setSpacing(10);
		
		Label city = new Label("City of residence: ");
		city.getStyleClass().add("citylabel");
		TextField cit = new TextField();
		cit.setPromptText("Add here your city of residence");
		HBox citybox = new HBox();
		citybox.getChildren().addAll(city, cit);
		citybox.getStyleClass().add("citybox");
		citybox.setSpacing(10);
		
		Label contact = new Label("Contact information");
		contact.getStyleClass().add("contact");
		
		Label email2 = new Label("Email: ");
		email2.getStyleClass().add("emaillabel");
		TextField mail = new TextField();
		mail.setPromptText("Add here your email");
		HBox mailbox = new HBox();
		mailbox.getChildren().addAll(email2, mail);
		mailbox.getStyleClass().add("mailbox");
		mailbox.setSpacing(10);
		
		Label phone = new Label("Phone number: ");
		phone.getStyleClass().add("phonelabel");
		TextField phonenumber = new TextField();
		phonenumber.setPromptText("Add here your phone number");
		HBox phonebox = new HBox();
		phonebox.getChildren().addAll(phone, phonenumber);
		phonebox.getStyleClass().add("phonebox");
		phonebox.setSpacing(10);
		
		VBox carinfo = new VBox();
		carinfo.getChildren().addAll(yeaar, curstud, studyperiod, unibox );
		carinfo.getStyleClass().add("carinfoVBox");
		
		VBox basinfo = new VBox();
		basinfo.getChildren().addAll(genbox, countrybox, citybox);
		basinfo.getStyleClass().add("basinfoVBox");
		
		VBox contactinfo = new VBox();
		contactinfo.getChildren().addAll(mailbox, phonebox);
		contactinfo.getStyleClass().add("contactinfoVBox");
		
		//PROFILE TAB CODEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
		
		//root.getChildren().add(summary);
		rootVoorpagina.getChildren().addAll(labellogo, helpout, overzicht, extra, name, desc, summary, summy, career, carinfo, basicinfo, basinfo, contact, contactinfo);
		
		labellogo.setLayoutX(50);
		labellogo.setLayoutY(30);
		
		helpout.setLayoutX(1300);
		helpout.setLayoutY(50);
		
		overzicht.setLayoutX(50);
		overzicht.setLayoutY(100);
		
		extra.setLayoutX(50);
		extra.setLayoutY(500);
		
		name.setLayoutX(700);
		name.setLayoutY(100);
		
		desc.setLayoutX(700);
		desc.setLayoutY(200);
		
		summary.setLayoutX(400);
		summary.setLayoutY(300);
		
		summy.setLayoutX(400);
		summy.setLayoutY(350);
		
		career.setLayoutX(400);
		career.setLayoutY(500);
		
		carinfo.setLayoutX(400);
		carinfo.setLayoutY(550);
		
		basicinfo.setLayoutX(700);
		basicinfo.setLayoutY(500);
		
		basinfo.setLayoutX(700);
		basinfo.setLayoutY(550);
		
		contact.setLayoutX(1000);
		contact.setLayoutY(500);
		
		contactinfo.setLayoutX(1000);
		contactinfo.setLayoutY(550);
		
		
		/*Scene sceneVoorpagina = new Scene(rootVoorpagina, 1600, 900);
		primaryStage.setScene(sceneVoorpagina);
		
		sceneVoorpagina.getStylesheets().add("ontwerp.css");
		
		*/primaryStage.show();
	}
}

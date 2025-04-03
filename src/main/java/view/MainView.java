package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.util.Constants;

/**
 * Vue principale pour la saisie du numéro de port.
 * Cette vue affiche un champ pour entrer le numéro de port, un bouton pour se connecter
 * et un label pour afficher les messages d'erreur.
 */
public class MainView extends ViewBase {

	/**
	 * Racine de la vue principale.
	 */
	private VBox root;

	/**
	 * Champ de texte pour saisir le numéro de port.
	 */
	private TextField portField;

	/**
	 * Bouton pour initier la connexion.
	 */
	private Button connectButton;

	/**
	 * Label pour afficher les messages d'erreur.
	 */
	private Label errorLabel;

	/**
	 * Constructeur par défaut pour la vue principale.
	 */
	public MainView() {
		super();
	}

	/**
	 * Retourne le nom de la vue principale.
	 *
	 * @return Le nom de la vue ("Main").
	 */
	@Override
	public String getName() {
		return "Main";
	}

	/**
	 * Renvoie la racine (root) de la vue principale.
	 *
	 * @return La racine de la vue.
	 */
	@Override
	public Parent getRoot() {
		return root;
	}

	/**
	 * Renvoie le champ de texte pour le numéro de port.
	 *
	 * @return Le champ de texte.
	 */
	public TextField getPortField() {
		return portField;
	}

	/**
	 * Renvoie le bouton de connexion.
	 *
	 * @return Le bouton de connexion.
	 */
	public Button getConnectButton() {
		return connectButton;
	}

	/**
	 * Renvoie le label destiné à afficher les messages d'erreur.
	 *
	 * @return Le label d'erreur.
	 */
	public Label getErrorLabel() {
		return errorLabel;
	}

	/**
	 * Crée l'interface utilisateur pour la vue principale.
	 * Initialise les éléments graphiques tels que le champ de texte, le bouton de connexion,
	 * et le label d'erreur.
	 */
	@Override
	protected void createUI() {


		root = new VBox(10);
		root.setPadding(new Insets(10));

		//TODO Tâche 4 : Créer l'interface utilisateur de la première vue.
		// Votre code doit utiliser la ligne ci-dessous:
		// Création d'un label pour indiquer à l'utilisateur de saisir un numéro de port
		Label portLabel = new Label("Entrez le numéro de port:");

		// Création du champ de texte pour saisir le port
		portField = new TextField();
		portField.setPromptText("Port (défaut: " + Constants.DEFAULT_PORT + ")");
		portField.setPrefWidth(200);

		// Création du bouton de connexion
		connectButton = new Button(Constants.BUTTON_CONNECT);

		// Création du label d'erreur (invisible par défaut)
		errorLabel = new Label();
		errorLabel.setTextFill(javafx.scene.paint.Color.RED);
		errorLabel.setVisible(false);

		// Ajout des éléments à la racine
		root.getChildren().addAll(portLabel, portField, connectButton, errorLabel);
		root.setAlignment(Pos.CENTER);

	}
}


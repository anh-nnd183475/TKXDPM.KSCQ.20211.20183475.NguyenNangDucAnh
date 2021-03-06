package utils;

import java.util.ArrayList;
import java.util.Set;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * @author nguyenlm Contains the configs for AIMS Project
 */
public class Configs {

	// api constants
	public static final String GET_BALANCE_URL = "https://ecopark-system-api.herokuapp.com/api/card/balance/118609_group1_2020";
	public static final String GET_VEHICLECODE_URL = "https://ecopark-system-api.herokuapp.com/api/get-vehicle-code/1rjdfasdfas";
	public static final String PROCESS_TRANSACTION_URL = "https://ecopark-system-api.herokuapp.com/api/card/processTransaction";
	public static final String RESET_URL = "https://ecopark-system-api.herokuapp.com/api/card/reset";

	// demo data
	public static final String POST_DATA = "{" + " \"secretKey\": \"BUXj/7/gHHI=\" ," + " \"transaction\": {"
			+ " \"command\": \"pay\" ," + " \"cardCode\": \"118609_group1_2020\" ," + " \"owner\": \"Group 1\" ,"
			+ " \"cvvCode\": \"185\" ," + " \"dateExpried\": \"1125\" ," + " \"transactionContent\": \"Pei debt\" ,"
			+ " \"amount\": 50000 " + "}" + "}";
	public static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiIxMTg2MDlfZ3JvdXAxXzIwMjAiLCJpYXQiOjE1OTkxMTk5NDl9.y81pBkM0pVn31YDPFwMGXXkQRKW5RaPIJ5WW5r9OW-Y";

	// database Configs
	public static final String DB_NAME = "aims";
	public static final String DB_USERNAME = System.getenv("DB_USERNAME");
	public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

	public static String CURRENCY = "VND";
	public static float PERCENT_VAT = 10;
	public static final String REGEX_VALIDATE_NAME = "^[\\p{L} .'-]+$";

	// static resource
	public static final String IMAGE_PATH = "assets/images";
	public static final String INVOICE_SCREEN_PATH = "/views/fxml/invoice.fxml";
	public static final String INVOICE_MEDIA_SCREEN_PATH = "/views/fxml/media_invoice.fxml";
	public static final String PAYMENT_SCREEN_PATH = "/views/fxml/payment.fxml";
	public static final String RESULT_SCREEN_PATH = "/views/fxml/result.fxml";
	public static final String SPLASH_SCREEN_PATH = "/views/fxml/splash.fxml";
	public static final String CART_SCREEN_PATH = "/views/fxml/cart.fxml";
	public static final String SHIPPING_SCREEN_PATH = "/views/fxml/shipping.fxml";
	public static final String CART_MEDIA_PATH = "/views/fxml/media_cart.fxml";
	public static final String HOME_PATH = "/views/fxml/home.fxml";
	public static final String HOME_MEDIA_PATH = "/views/fxml/media_home.fxml";
	public static final String POPUP_PATH = "/views/fxml/popup.fxml";

	public static Font REGULAR_FONT = Font.font("Segoe UI", FontWeight.NORMAL, FontPosture.REGULAR, 24);

	public static Set<String> PROVINCES = Set.of("An Giang", "B?? R???a ??? V??ng T??u", "B???c Giang", "B???c K???n", "B???c Li??u",
			"B???c Ninh", "B???n Tre", "B??nh ?????nh", "B??nh D????ng", "B??nh Ph?????c", "B??nh Thu???n", "C?? Mau", "C???n Th??",
			"Cao B???ng", "???? N???ng", "?????k L???k", "?????k N??ng", "??i???n Bi??n", "?????ng Nai", "?????ng Th??p", "Gia Lai", "H?? Giang",
			"H?? Nam", "H?? N???i", "H?? T??nh", "H???i D????ng", "H???i Ph??ng", "H???u Giang", "H??a B??nh", "H??ng Y??n", "Kh??nh H??a",
			"Ki??n Giang", "Kon Tum", "Lai Ch??u", "L??m ?????ng", "L???ng S??n", "L??o Cai", "Long An", "Nam ?????nh", "Ngh??? An",
			"Ninh B??nh", "Ninh Thu???n", "Ph?? Th???", "Ph?? Y??n", "Qu???ng B??nh", "Qu???ng Nam", "Qu???ng Ng??i", "Qu???ng Ninh",
			"Qu???ng Tr???", "S??c Tr??ng", "S??n La", "T??y Ninh", "Th??i B??nh", "Th??i Nguy??n", "Thanh H??a", "Th???a Thi??n Hu???",
			"Ti???n Giang", "TP H??? Ch?? Minh", "Tr?? Vinh", "Tuy??n Quang", "V??nh Long", "V??nh Ph??c", "Y??n B??i");

	public static String ADDRESS_KEY = "Address";
	public static String USERNAME_KEY = "Username";
	public static String PHONE_NUMBER_KEY = "Phone number";
	public static String PLACE_RUSH_ORDER_SHIPPING_TIME = "Place rush order shipping time";
	public static int EXTRA_FEE_PER_RUSH_PRODUCT = 10000;
}

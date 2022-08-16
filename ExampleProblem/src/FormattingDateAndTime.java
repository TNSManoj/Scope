import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateAndTime {

	public static void main(String[] args) {
		LocalDateTime myDateobj=LocalDateTime.now();
		System.out.println("Before formatting:"+ myDateobj);
		DateTimeFormatter myFormatobj=DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
		String formattedDateTime = myDateobj.format(myFormatobj);
		System.out.println("After formatting:" + formattedDateTime);

	}

}

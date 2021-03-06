import java.util.*;
import java.io.*;

public class PlainTextLog {

	public static void log1() throws IOException {
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fo = new FileOutputStream("plaintext.log");
		while (true) {
			System.out.print("> ");
			String command = scanner.nextLine();
			if (command.equals("exit"))
				break;
			Date d = new Date();
			String log = String.format("%d||%s\n", d.getTime(), command);
			fo.write(log.getBytes());
		}
		fo.close();
		scanner.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		log1();
	}

}

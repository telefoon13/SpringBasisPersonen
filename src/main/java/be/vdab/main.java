package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("viewers.xml","repositories.xml","services.xml")) {
			context.getBean(PersoonViewer.class).afbeelden();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

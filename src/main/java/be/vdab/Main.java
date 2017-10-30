package be.vdab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context =
					 new AnnotationConfigApplicationContext(
					 		RepositoriesConfig.class,ServicesConfig.class,PresentationConfig.class)) {
			context.getBean(PersoonViewer.class).afbeelden();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

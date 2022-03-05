package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationVersionAnotation {

    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");  //liste des package à scanner en paramètre

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultuat =>"+metier.calcul());
    }
}

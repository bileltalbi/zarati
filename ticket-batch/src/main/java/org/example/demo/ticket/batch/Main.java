package org.example.demo.ticket.batch;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.model.exception.TechnicalException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] pArgs) throws TechnicalException {
        ApplicationContext vApplicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ManagerFactory vManagerFactory = vApplicationContext.getBean("managerFactoryImpl", ManagerFactory.class);;

        // suite de l'implémentation des batches...
    }
}
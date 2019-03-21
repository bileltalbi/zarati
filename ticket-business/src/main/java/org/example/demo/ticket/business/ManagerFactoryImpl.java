package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//...
@Service
public final class ManagerFactoryImpl implements ManagerFactory {
    /**
     * Instance unique de la classe (design pattern Singleton)
     */
    @Autowired
    private ProjetManager projetManager;

    @Autowired
    private TicketManager ticketManager;


    // On renvoie désormais simplement l'attribut projetManager
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    // Ajout d'un setter pour l'attribut projetManager
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }
//...
}
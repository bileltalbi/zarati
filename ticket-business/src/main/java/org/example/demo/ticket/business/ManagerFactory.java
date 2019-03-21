package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

//...
public interface ManagerFactory {



    // On renvoie désormais simplement l'attribut projetManager
    public ProjetManager getProjetManager();

    // Ajout d'un setter pour l'attribut projetManager
    public void setProjetManager(ProjetManager pProjetManager);
    public TicketManager getTicketManager();
    public void setTicketManager(TicketManager ticketManager);
//...
}
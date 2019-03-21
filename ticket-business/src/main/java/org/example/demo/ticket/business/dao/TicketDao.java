package org.example.demo.ticket.business.dao;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public interface TicketDao {

    int getCountTicket(RechercheTicket pRechercheTicket);
    List<TicketStatut> getListStatut();
    List<String> getListTitre();
}

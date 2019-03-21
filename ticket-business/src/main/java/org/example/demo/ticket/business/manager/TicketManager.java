package org.example.demo.ticket.business.manager;


import java.util.ArrayList;
import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;


/**
 * Manager des beans du package Ticket.
 *
 * @author lgu
 */
public interface TicketManager {


    public Ticket getTicket(Long pNumero) throws NotFoundException ;

    List<String> getListTitre();

    public List<Ticket> getListTicket(RechercheTicket pRechercheTicket);


    public int getCountTicket(RechercheTicket pRechercheTicket) ;
}

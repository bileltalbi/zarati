package org.example.demo.ticket.business.manager;


import java.util.ArrayList;
import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;


/**
 * Manager des beans du package Projet.
 *
 * @author lgu
 */
public interface ProjetManager {

    /**
     * Renvoie le projet demandé
     *
     * @param pId l'identifiant du projet
     * @return Le {@link Projet}
     * @throws NotFoundException Si le projet n'est pas trouvé
     */
    public Projet getProjet(Integer pId) throws NotFoundException ;


    public List<Projet> getListProjet() ;
}

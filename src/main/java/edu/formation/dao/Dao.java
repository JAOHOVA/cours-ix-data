package edu.formation.dao;

import java.util.List;

/**
 * Contrat que tous les DAO vont devoir respecter. Il contient les opérations
 * CRUD de base
 * 
 * @author Romain Plantefève
 * @param <BO>
 *            L'objet métier générique
 * @param <PK>
 *            Le type de clé primaire générique
 */
public interface Dao<BO, PK>
{

    /**
     * Retourne tous les objets métiers d'un type donné de la source de données
     * 
     * @return La liste des objets métiers
     */
    List<BO> findAll();

    /**
     * Retourne un objet métier en fonction de sa clé primaire
     * 
     * @param id
     *            Clé primaire
     * @return L'objet métier trouvé
     */
    BO findById(PK id);

}

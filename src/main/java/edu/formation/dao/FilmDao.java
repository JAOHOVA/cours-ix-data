package edu.formation.dao;

import edu.formation.model.Film;

/**
 * Contrat que les DAOs de l'objet métier Film vont devoir respecter Contexte :
 * - BO = Film - PK = Integer
 * 
 * @author Seme
 */
public interface FilmDao extends Dao<Film, Integer>
{}

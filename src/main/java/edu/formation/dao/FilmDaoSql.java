package edu.formation.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de l'interface FilmDao Son rôle : de persister les objets
 * métiers Film à l'aide du SQL et au moyen d'une BDD
 * 
 * Cette classe ne fait pour l'instant que simuler la récupération des données
 * 
 * @author Seme
 */
public class FilmDaoSql implements FilmDao
{
    private List<Film> films;

    /**
     * @param films
     */
    public FilmDaoSql()
    {
        super();
        this.films = new ArrayList<>();
        Film vendetta = new Film(2006, 132, 1L, "V Pour Vendetta");
        Film matrix = new Film(1999, 130, 2L, "Matrix");
        Film jupiter = new Film(2015, 127, 3L, "Jupiter ascending");
        this.films.add(vendetta);
        this.films.add(matrix);
        this.films.add(jupiter);
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.dao.Dao#findAll()
     */
    @Override
    public List<Film> findAll()
    {
        return this.films;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.dao.Dao#findById(java.lang.Object)
     */
    @Override
    public Film findById(Integer id)
    {
        return this.films.get(id);
    }

}

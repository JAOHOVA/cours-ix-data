package edu.formation.dao;

/**
 *
 * @author Seme
 */
public class Film
{

    private Integer annee;
    private Integer duree;
    private Long    id;
    private String  nom;

    /**
     * @param annee
     * @param duree
     * @param id
     * @param nom
     */
    public Film(Integer annee, Integer duree, Long id, String nom)
    {
        super();
        this.annee = annee;
        this.duree = duree;
        this.id = id;
        this.nom = nom;
    }

    /**
     * @return the annee
     */
    public Integer getAnnee()
    {
        return this.annee;
    }

    /**
     * @return the duree
     */
    public Integer getDuree()
    {
        return this.duree;
    }

    /**
     * @return the id
     */
    public Long getId()
    {
        return this.id;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * @param annee
     *            the annee to set
     */
    public void setAnnee(Integer annee)
    {
        this.annee = annee;
    }

    /**
     * @param duree
     *            the duree to set
     */
    public void setDuree(Integer duree)
    {
        this.duree = duree;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

}

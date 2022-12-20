package fr.eni.tfProjetEnchere.bo;

import java.security.Timestamp;
import java.util.List;

public class ArticleVendu {
	private int noArticle;
	private String nomArticle;
	private String description;
	private Timestamp debutEnchere;
	private Timestamp finEnchere;
	private int misAPrix;
	private int prixVente;
	private String etatVente;
	private Utilisateur utilisateur;
	private List<Enchere> enchere;
	private Categorie categorie;
	private Retrait retrait;
	
	public ArticleVendu() {
		super();
	}

	public ArticleVendu(int noArticle, String nomArticle, String description, Timestamp debutEnchere,
			Timestamp finEnchere, int misAPrix, int prixVente, String etatVente, Utilisateur utilisateur,
			List<Enchere> enchere, Categorie categorie, Retrait retrait) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.debutEnchere = debutEnchere;
		this.finEnchere = finEnchere;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.utilisateur = utilisateur;
		this.enchere = enchere;
		this.categorie = categorie;
		this.retrait = retrait;
	}

	public ArticleVendu(int noArticle, String nomArticle, String description, Timestamp debutEnchere,
			Timestamp finEnchere, int misAPrix, int prixVente, String etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.debutEnchere = debutEnchere;
		this.finEnchere = finEnchere;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	public int getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDebutEnchere() {
		return debutEnchere;
	}

	public void setDebutEnchere(Timestamp debutEnchere) {
		this.debutEnchere = debutEnchere;
	}

	public Timestamp getFinEnchere() {
		return finEnchere;
	}

	public void setFinEnchere(Timestamp finEnchere) {
		this.finEnchere = finEnchere;
	}

	public int getMisAPrix() {
		return misAPrix;
	}

	public void setMisAPrix(int misAPrix) {
		this.misAPrix = misAPrix;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public String getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Enchere> getEnchere() {
		return enchere;
	}

	public void setEnchere(List<Enchere> enchere) {
		this.enchere = enchere;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Retrait getRetrait() {
		return retrait;
	}

	public void setRetrait(Retrait retrait) {
		this.retrait = retrait;
	}

	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", debutEnchere=" + debutEnchere + ", finEnchere=" + finEnchere + ", misAPrix=" + misAPrix
				+ ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", utilisateur=" + utilisateur
				+ ", enchere=" + enchere + ", categorie=" + categorie + ", retrait=" + retrait + "]";
	}
	
}
package com.medocs.batch.models;

/**
 * The Class Medicament.
 *
 * @author Ch.Mustapha
 */
public class Medicament {

	/** The nom. */
	private String nom;

	/** The dci. */
	private String dci;

	/** The dosage. */
	private String dosage;

	/** The unite dosage. */
	private String uniteDosage;

	/** The form. */
	private String form;

	/** The presentation. */
	private String presentation;

	/** The ppv. */
	private double ppv;

	/** The ph. */
	private double ph;

	/** The prix br. */
	private double prixBr;

	/** The prince generique. */
	private String princeGenerique;

	/** The taux rembourssement. */
	private String tauxRembourssement;

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom
	 *            the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the dci.
	 *
	 * @return the dci
	 */
	public String getDci() {
		return dci;
	}

	/**
	 * Sets the dci.
	 *
	 * @param dci
	 *            the new dci
	 */
	public void setDci(String dci) {
		this.dci = dci;
	}

	/**
	 * Gets the dosage.
	 *
	 * @return the dosage
	 */
	public String getDosage() {
		return dosage;
	}

	/**
	 * Sets the dosage.
	 *
	 * @param dosage
	 *            the new dosage
	 */
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	/**
	 * Gets the unite dosage.
	 *
	 * @return the unite dosage
	 */
	public String getUniteDosage() {
		return uniteDosage;
	}

	/**
	 * Sets the unite dosage.
	 *
	 * @param uniteDosage
	 *            the new unite dosage
	 */
	public void setUniteDosage(String uniteDosage) {
		this.uniteDosage = uniteDosage;
	}

	/**
	 * Gets the form.
	 *
	 * @return the form
	 */
	public String getForm() {
		return form;
	}

	/**
	 * Sets the form.
	 *
	 * @param form
	 *            the new form
	 */
	public void setForm(String form) {
		this.form = form;
	}

	/**
	 * Gets the presentation.
	 *
	 * @return the presentation
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * Sets the presentation.
	 *
	 * @param presentation
	 *            the new presentation
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	/**
	 * Gets the ppv.
	 *
	 * @return the ppv
	 */
	public double getPpv() {
		return ppv;
	}

	/**
	 * Sets the ppv.
	 *
	 * @param ppv
	 *            the new ppv
	 */
	public void setPpv(double ppv) {
		this.ppv = ppv;
	}

	/**
	 * Gets the ph.
	 *
	 * @return the ph
	 */
	public double getPh() {
		return ph;
	}

	/**
	 * Sets the ph.
	 *
	 * @param ph
	 *            the new ph
	 */
	public void setPh(double ph) {
		this.ph = ph;
	}

	/**
	 * Gets the prix br.
	 *
	 * @return the prix br
	 */
	public double getPrixBr() {
		return prixBr;
	}

	/**
	 * Sets the prix br.
	 *
	 * @param prixBr
	 *            the new prix br
	 */
	public void setPrixBr(double prixBr) {
		this.prixBr = prixBr;
	}

	/**
	 * Gets the prince generique.
	 *
	 * @return the prince generique
	 */
	public String getPrinceGenerique() {
		return princeGenerique;
	}

	/**
	 * Sets the prince generique.
	 *
	 * @param princeGenerique
	 *            the new prince generique
	 */
	public void setPrinceGenerique(String princeGenerique) {
		this.princeGenerique = princeGenerique;
	}

	/**
	 * Gets the taux rembourssement.
	 *
	 * @return the taux rembourssement
	 */
	public String getTauxRembourssement() {
		return tauxRembourssement;
	}

	/**
	 * Sets the taux rembourssement.
	 *
	 * @param tauxRembourssement
	 *            the new taux rembourssement
	 */
	public void setTauxRembourssement(String tauxRembourssement) {
		this.tauxRembourssement = tauxRembourssement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dci == null) ? 0 : dci.hashCode());
		result = prime * result + ((dosage == null) ? 0 : dosage.hashCode());
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ph);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ppv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((presentation == null) ? 0 : presentation.hashCode());
		result = prime * result + ((princeGenerique == null) ? 0 : princeGenerique.hashCode());
		temp = Double.doubleToLongBits(prixBr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tauxRembourssement == null) ? 0 : tauxRembourssement.hashCode());
		result = prime * result + ((uniteDosage == null) ? 0 : uniteDosage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicament other = (Medicament) obj;
		if (dci == null) {
			if (other.dci != null)
				return false;
		} else if (!dci.equals(other.dci))
			return false;
		if (dosage == null) {
			if (other.dosage != null)
				return false;
		} else if (!dosage.equals(other.dosage))
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (Double.doubleToLongBits(ph) != Double.doubleToLongBits(other.ph))
			return false;
		if (Double.doubleToLongBits(ppv) != Double.doubleToLongBits(other.ppv))
			return false;
		if (presentation == null) {
			if (other.presentation != null)
				return false;
		} else if (!presentation.equals(other.presentation))
			return false;
		if (princeGenerique == null) {
			if (other.princeGenerique != null)
				return false;
		} else if (!princeGenerique.equals(other.princeGenerique))
			return false;
		if (Double.doubleToLongBits(prixBr) != Double.doubleToLongBits(other.prixBr))
			return false;
		if (tauxRembourssement == null) {
			if (other.tauxRembourssement != null)
				return false;
		} else if (!tauxRembourssement.equals(other.tauxRembourssement))
			return false;
		if (uniteDosage == null) {
			if (other.uniteDosage != null)
				return false;
		} else if (!uniteDosage.equals(other.uniteDosage))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medicament [nom=" + nom + ", dci=" + dci + ", dosage=" + dosage + ", uniteDosage=" + uniteDosage
				+ ", form=" + form + ", presentation=" + presentation + ", ppv=" + ppv + ", ph=" + ph + ", prixBr="
				+ prixBr + ", princeGenerique=" + princeGenerique + ", tauxRembourssement=" + tauxRembourssement + "]";
	}

}

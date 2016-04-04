package com.medocs.batch;



public class Medicament {

	private String nom;
	private String presentation;
	private String fabriquant;
	private String composition;
	private String ppv;
	private String princeps;
	private String famille;
	private String remboursement;
	private String baseRemp;
	private String conservation;
	private String lienProduit;
	private String ageMinUtilisation;
	private String indication;
	private String notice;
	private String tiersPayant;
	private String particularite;

	public Medicament() {
		super();
		this.nom = "";
		this.presentation = "";
		this.fabriquant = "";
		this.composition = "";
		this.ppv = "";
		this.princeps = "";
		this.famille = "";
		this.remboursement = "";
		this.baseRemp = "";
		this.conservation = "";
		this.lienProduit = "";
		this.ageMinUtilisation = "";
		this.indication = "";
		this.notice = "";
		this.tiersPayant = "";
		this.particularite = "";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String getFabriquant() {
		return fabriquant;
	}

	public void setFabriquant(String fabriquant) {
		this.fabriquant = fabriquant;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getPpv() {
		return ppv;
	}

	public void setPpv(String ppv) {
		this.ppv = ppv;
	}

	public String getPrinceps() {
		return princeps;
	}

	public void setPrinceps(String princeps) {
		this.princeps = princeps;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public String getRemboursement() {
		return remboursement;
	}

	public void setRemboursement(String remboursement) {
		this.remboursement = remboursement;
	}

	public String getBaseRemp() {
		return baseRemp;
	}

	public void setBaseRemp(String baseRemp) {
		this.baseRemp = baseRemp;
	}

	public String getConservation() {
		return conservation;
	}

	public void setConservation(String conservation) {
		this.conservation = conservation;
	}

	public String getLienProduit() {
		return lienProduit;
	}

	public void setLienProduit(String lienProduit) {
		this.lienProduit = lienProduit;
	}

	public String getAgeMinUtilisation() {
		return ageMinUtilisation;
	}

	public void setAgeMinUtilisation(String ageMinUtilisation) {
		this.ageMinUtilisation = ageMinUtilisation;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getTiersPayant() {
		return tiersPayant;
	}

	public void setTiersPayant(String tiersPayant) {
		this.tiersPayant = tiersPayant;
	}

	public String getParticularite() {
		return particularite;
	}

	public void setParticularite(String particularite) {
		this.particularite = particularite;
	}

	public void setFieldValue(String field, String value) {

		switch (field) {
		case FIELDS.PRESETATION:
			this.presentation = value;
			break;
		case FIELDS.FABRIQUANT:
			this.fabriquant = value;
			break;
		case FIELDS.COMPOSITION:
			this.composition = value;
			break;
		case FIELDS.PPV:
			this.ppv = value;
			break;
		case FIELDS.PRINCEPS:
			this.princeps = value;
			break;
		case FIELDS.FAMILLE:
			this.famille = value;
			break;
		case FIELDS.REMBOURESEMENT:
			this.remboursement = value;
			break;
		case FIELDS.BASE:
			this.baseRemp = value;
			break;
		case FIELDS.CONSERVATION:
			this.conservation = value;
			break;
		case FIELDS.LIEN:
			this.lienProduit = value;
			break;
		case FIELDS.AGE_MIN:
			this.ageMinUtilisation = value;
			break;
		case FIELDS.INDICATION:
			this.indication = value;
			break;
		case FIELDS.NOTICE:
			this.notice = value;
			break;
		case FIELDS.TIERS:
			this.tiersPayant = value;
			break;
		case FIELDS.PARTICULARITE:
			this.particularite = value;
			break;
		}
	}

	@Override
	public String toString() {
		return "Medicament [nom=" + nom + ", presentation=" + presentation + ", fabriquant=" + fabriquant + ", composition=" + composition + ", ppv=" + ppv + ", princeps=" + princeps + ", famille="
				+ famille + ", remboursement=" + remboursement + ", baseRemp=" + baseRemp + ", conservation=" + conservation + ", lienProduit=" + lienProduit + ", ageMinUtilisation="
				+ ageMinUtilisation + ", indication=" + indication + ", notice=" + notice + ", tiersPayant=" + tiersPayant + ", particularite=" + particularite + "]";
	}

}

package br.com.generation.carrinhoSocial;

public class Estoque implements Trocas {

	private int totalProdutos;
	private String arroz = "arroz", feijao = "feijão", macarrao = "macarrao", oleo = "óleo", cafe = "café";
    private String pHigienico = "PapelHigiênico", sabonete = "sabonete", absorvente = "absorvente", alcoolGel = "Alcool em gél", mascara = "máscara";
	private int quantArroz,totalArroz, quantfeijao, totalFeijao, quantmacarrao, quantoleo, quantcafe;
	private int quantPhigienico, quantsabonete, quantabsorvente, quantalcoolGel, quantmascara;
	
			
	
	
	
	
	
	
	public String getArroz() {
		return arroz;
	}

	public int getTotalArroz() {
		return totalArroz;
	}

	public void setTotalArroz(int totalArroz) {
		this.totalArroz = totalArroz;
	}

	public int getTotalFeijao() {
		return totalFeijao;
	}

	public void setTotalFeijao(int totalFeijao) {
		this.totalFeijao = totalFeijao;
	}

	public void setArroz(String arroz) {
		this.arroz = arroz;
	}

	public String getFeijao() {
		return feijao;
	}

	public void setFeijao(String feijao) {
		this.feijao = feijao;
	}

	public String getMacarrao() {
		return macarrao;
	}

	public void setMacarrao(String macarrao) {
		this.macarrao = macarrao;
	}

	public String getOleo() {
		return oleo;
	}

	public void setOleo(String oleo) {
		this.oleo = oleo;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

	public String getpHigienico() {
		return pHigienico;
	}

	public void setpHigienico(String pHigienico) {
		this.pHigienico = pHigienico;
	}

	public String getSabonete() {
		return sabonete;
	}

	public void setSabonete(String sabonete) {
		this.sabonete = sabonete;
	}

	public String getAbsorvente() {
		return absorvente;
	}

	public void setAbsorvente(String absorvente) {
		this.absorvente = absorvente;
	}

	public String getAlcoolGel() {
		return alcoolGel;
	}

	public void setAlcoolGel(String alcoolGel) {
		this.alcoolGel = alcoolGel;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public int getQuantArroz() {
		return quantArroz;
	}

	public void setQuantArroz(int quantArroz) {
		this.quantArroz = quantArroz;
	}

	public int getQuantfeijao() {
		return quantfeijao;
	}

	public void setQuantfeijao(int quantfeijao) {
		this.quantfeijao = quantfeijao;
	}

	public int getQuantmacarrao() {
		return quantmacarrao;
	}

	public void setQuantmacarrao(int quantmacarrao) {
		this.quantmacarrao = quantmacarrao;
	}

	public int getQuantoleo() {
		return quantoleo;
	}

	public void setQuantoleo(int quantoleo) {
		this.quantoleo = quantoleo;
	}

	public int getQuantcafe() {
		return quantcafe;
	}

	public void setQuantcafe(int quantcafe) {
		this.quantcafe = quantcafe;
	}

	public int getQuantPhigienico() {
		return quantPhigienico;
	}

	public void setQuantPhigienico(int quantPhigienico) {
		this.quantPhigienico = quantPhigienico;
	}

	public int getQuantsabonete() {
		return quantsabonete;
	}

	public void setQuantsabonete(int quantsabonete) {
		this.quantsabonete = quantsabonete;
	}

	public int getQuantabsorvente() {
		return quantabsorvente;
	}

	public void setQuantabsorvente(int quantabsorvente) {
		this.quantabsorvente = quantabsorvente;
	}

	public int getQuantalcoolGel() {
		return quantalcoolGel;
	}

	public void setQuantalcoolGel(int quantalcoolGel) {
		this.quantalcoolGel = quantalcoolGel;
	}

	public int getQuantmascara() {
		return quantmascara;
	}

	public void setQuantmascara(int quantmascara) {
		this.quantmascara = quantmascara;
	}

	public int getTotalProdutos() {
		return totalProdutos;
	}

	public void setTotalProdutos(int totalProdutos) {
		this.totalProdutos = totalProdutos;
	}

	
	
	public void doar(int quant) {
	
		int novoTotal = totalProdutos + quant;
		totalProdutos = novoTotal;
		
	}

	
	public void receber(int quant) {
		int novoTotal = totalProdutos - quant;
		totalProdutos = novoTotal;
		
	}
}


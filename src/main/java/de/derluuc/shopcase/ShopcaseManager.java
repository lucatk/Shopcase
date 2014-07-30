package de.derluuc.shopcase;

import java.util.ArrayList;
import java.util.List;

public class ShopcaseManager {
	protected ShopcaseManager() {
		load();
	}

	private List<Shopcase> scList = new ArrayList<Shopcase>();
	
	private void load() {
		//TODO
	}
	
	public void addShopcase(Shopcase sc) {
		//TODO: check for existing ones
		scList.add(sc);
	}
	
	public List<Shopcase> getShopcaseList() {
		//create copy of original one to prevent unauthorized changes
		List<Shopcase> scs = new ArrayList<Shopcase>();
		scs.addAll(scList);
		return scs;
	}
	
}

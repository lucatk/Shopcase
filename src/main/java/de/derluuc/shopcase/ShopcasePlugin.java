package de.derluuc.shopcase;

public class ShopcasePlugin {
	private static ShopcaseManager scManager;
	
	public static void setShopcaseManager(ShopcaseManager scm) {
		if(scManager != null)
			throw new UnsupportedOperationException("ShopcaseManager static value cannot be set twice!");
		scManager = scm;
	}
	
	public static ShopcaseManager getShopcaseManager() {
		return scManager;
	}
	
}

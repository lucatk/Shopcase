package de.derluuc.shopcase;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		ShopcasePlugin.setShopcaseManager(new ShopcaseManager());
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
}

package de.derluuc.shopcase;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Shopcase {

	private ItemStack item;
	private Location loc;
	private double price;
	
	public Shopcase(ItemStack item, Location loc, double price) {
		this.item = item;
		this.loc = loc;
		this.price = price;
	}
	
	public Location getLocation() {
		return loc;
	}
	
	public void setLocation(Location loc) {
		this.loc = loc;
		//TODO: teleport shopcase
	}

	public ItemStack getItem() {
		return item;
	}

	public void setItem(ItemStack item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

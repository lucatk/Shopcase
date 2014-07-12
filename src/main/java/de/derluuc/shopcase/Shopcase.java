package de.derluuc.shopcase;

import org.bukkit.inventory.ItemStack;

public class Shopcase {

	private ItemStack item;
	private double price;
	
	public Shopcase(ItemStack item, double price) {
		this.item = item;
		this.price = price;
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

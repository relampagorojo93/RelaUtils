package relampagorojo93.LibsCollection.Utils.Bukkit.Inventories.Objects;

import org.bukkit.inventory.ItemStack;

public class Item extends Slot {
	
	private ItemStack item;
	
	public Item(ItemStack item) {
		if (item != null) this.item = item.clone();
	}
	
	@Override
	public ItemStack getItemStack() {
		return item;
	}
	
}

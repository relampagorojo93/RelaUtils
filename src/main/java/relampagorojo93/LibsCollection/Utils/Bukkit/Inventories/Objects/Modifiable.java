package relampagorojo93.LibsCollection.Utils.Bukkit.Inventories.Objects;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public abstract class Modifiable extends Item {
	public Modifiable(ItemStack item) {
		super(item);
	}
	public abstract void onModify(InventoryClickEvent e);
}

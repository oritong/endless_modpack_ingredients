
package net.mcreator.endlessmodpackingredients.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClumpObsidianItem extends Item {
	public ClumpObsidianItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

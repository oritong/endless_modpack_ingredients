
package net.mcreator.endlessmodpackingredients.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AndesiteDustItem extends Item {
	public AndesiteDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

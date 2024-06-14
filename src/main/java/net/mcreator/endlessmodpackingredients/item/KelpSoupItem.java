
package net.mcreator.endlessmodpackingredients.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluids;

public class KelpSoupItem extends BucketItem {
	public KelpSoupItem() {
		super(EndlessModpackIngredientsModFluids.KELP_SOUP, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

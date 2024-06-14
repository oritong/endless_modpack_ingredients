
package net.mcreator.endlessmodpackingredients.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluids;

public class MoltenAndesiteAlloyItem extends BucketItem {
	public MoltenAndesiteAlloyItem() {
		super(EndlessModpackIngredientsModFluids.MOLTEN_ANDESITE_ALLOY, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

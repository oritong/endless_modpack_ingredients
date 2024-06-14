
package net.mcreator.endlessmodpackingredients.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluids;

public class MoltenAndesiteAlloyBlock extends LiquidBlock {
	public MoltenAndesiteAlloyBlock() {
		super(() -> EndlessModpackIngredientsModFluids.MOLTEN_ANDESITE_ALLOY.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}

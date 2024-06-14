
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.endlessmodpackingredients.block.TooMuchSaltInTheKelpSoupBlock;
import net.mcreator.endlessmodpackingredients.block.MoltenAndesiteAlloyBlock;
import net.mcreator.endlessmodpackingredients.block.KelpSoupBlock;
import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

public class EndlessModpackIngredientsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<Block> KELP_SOUP = REGISTRY.register("kelp_soup", () -> new KelpSoupBlock());
	public static final RegistryObject<Block> TOO_MUCH_SALT_IN_THE_KELP_SOUP = REGISTRY.register("too_much_salt_in_the_kelp_soup", () -> new TooMuchSaltInTheKelpSoupBlock());
	public static final RegistryObject<Block> MOLTEN_ANDESITE_ALLOY = REGISTRY.register("molten_andesite_alloy", () -> new MoltenAndesiteAlloyBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

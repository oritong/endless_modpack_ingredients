
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.endlessmodpackingredients.fluid.types.TooMuchSaltInTheKelpSoupFluidType;
import net.mcreator.endlessmodpackingredients.fluid.types.MoltenAndesiteAlloyFluidType;
import net.mcreator.endlessmodpackingredients.fluid.types.KelpSoupFluidType;
import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

public class EndlessModpackIngredientsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<FluidType> KELP_SOUP_TYPE = REGISTRY.register("kelp_soup", () -> new KelpSoupFluidType());
	public static final RegistryObject<FluidType> TOO_MUCH_SALT_IN_THE_KELP_SOUP_TYPE = REGISTRY.register("too_much_salt_in_the_kelp_soup", () -> new TooMuchSaltInTheKelpSoupFluidType());
	public static final RegistryObject<FluidType> MOLTEN_ANDESITE_ALLOY_TYPE = REGISTRY.register("molten_andesite_alloy", () -> new MoltenAndesiteAlloyFluidType());
}

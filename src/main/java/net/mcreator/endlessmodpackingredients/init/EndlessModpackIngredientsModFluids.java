
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.endlessmodpackingredients.fluid.TooMuchSaltInTheKelpSoupFluid;
import net.mcreator.endlessmodpackingredients.fluid.MoltenAndesiteAlloyFluid;
import net.mcreator.endlessmodpackingredients.fluid.KelpSoupFluid;
import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

public class EndlessModpackIngredientsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<FlowingFluid> KELP_SOUP = REGISTRY.register("kelp_soup", () -> new KelpSoupFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_KELP_SOUP = REGISTRY.register("flowing_kelp_soup", () -> new KelpSoupFluid.Flowing());
	public static final RegistryObject<FlowingFluid> TOO_MUCH_SALT_IN_THE_KELP_SOUP = REGISTRY.register("too_much_salt_in_the_kelp_soup", () -> new TooMuchSaltInTheKelpSoupFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_TOO_MUCH_SALT_IN_THE_KELP_SOUP = REGISTRY.register("flowing_too_much_salt_in_the_kelp_soup", () -> new TooMuchSaltInTheKelpSoupFluid.Flowing());
	public static final RegistryObject<FlowingFluid> MOLTEN_ANDESITE_ALLOY = REGISTRY.register("molten_andesite_alloy", () -> new MoltenAndesiteAlloyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ANDESITE_ALLOY = REGISTRY.register("flowing_molten_andesite_alloy", () -> new MoltenAndesiteAlloyFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(KELP_SOUP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_KELP_SOUP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TOO_MUCH_SALT_IN_THE_KELP_SOUP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TOO_MUCH_SALT_IN_THE_KELP_SOUP.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_ANDESITE_ALLOY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_ANDESITE_ALLOY.get(), RenderType.translucent());
		}
	}
}

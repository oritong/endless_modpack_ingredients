
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EndlessModpackIngredientsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MMII = REGISTRY.register("mmii",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.endless_modpack_ingredients.mmii")).icon(() -> new ItemStack(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_PLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_PLATE.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_ROTOR.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_ROD.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_GEAR.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDSITE_ALLOY_RING.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_BLADE.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_BOLT.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_CURVED_PLATE.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_DOUBLE_INGOT.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_INGOT.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_DUST.get());
				tabData.accept(EndlessModpackIngredientsModItems.MOLTEN_ANDESITE_ALLOY_BUCKET.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_DRILL_HEAD.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_DRILL.get());
				tabData.accept(EndlessModpackIngredientsModItems.ANDESITE_ALLOY_HAMMER.get());
				tabData.accept(EndlessModpackIngredientsModItems.CLUMP_OBSIDIAN.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EndlessModpackIngredientsModItems.COPPER_ORE_I_SPAWN_EGG.get());
			tabData.accept(EndlessModpackIngredientsModItems.IRON_ORE_I_SPAWN_EGG.get());
			tabData.accept(EndlessModpackIngredientsModItems.COAL_ORE_I_SPAWN_EGG.get());
			tabData.accept(EndlessModpackIngredientsModItems.QUARTZ_ORE_I_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EndlessModpackIngredientsModItems.KELP_SOUP_BUCKET.get());
			tabData.accept(EndlessModpackIngredientsModItems.TOO_MUCH_SALT_IN_THE_KELP_SOUP_BUCKET.get());
		}
	}
}

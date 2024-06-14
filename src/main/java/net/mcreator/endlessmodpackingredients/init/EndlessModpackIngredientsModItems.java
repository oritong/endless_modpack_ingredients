
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlessmodpackingredients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.endlessmodpackingredients.item.TooMuchSaltInTheKelpSoupItem;
import net.mcreator.endlessmodpackingredients.item.MoltenAndesiteAlloyItem;
import net.mcreator.endlessmodpackingredients.item.KelpSoupItem;
import net.mcreator.endlessmodpackingredients.item.ClumpObsidianItem;
import net.mcreator.endlessmodpackingredients.item.AndsiteAlloyRingItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteIngotItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteDustItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyRotorItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyRodItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyPlateItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyHammerItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyGearItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyDrillItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyDrillHeadItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyDoubleIngotItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyCurvedPlateItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyBoltItem;
import net.mcreator.endlessmodpackingredients.item.AndesiteAlloyBladeItem;
import net.mcreator.endlessmodpackingredients.EndlessModpackIngredientsMod;

public class EndlessModpackIngredientsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessModpackIngredientsMod.MODID);
	public static final RegistryObject<Item> ANDESITE_ALLOY_PLATE = REGISTRY.register("andesite_alloy_plate", () -> new AndesiteAlloyPlateItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_ROTOR = REGISTRY.register("andesite_alloy_rotor", () -> new AndesiteAlloyRotorItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_ROD = REGISTRY.register("andesite_alloy_rod", () -> new AndesiteAlloyRodItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_GEAR = REGISTRY.register("andesite_alloy_gear", () -> new AndesiteAlloyGearItem());
	public static final RegistryObject<Item> ANDSITE_ALLOY_RING = REGISTRY.register("andsite_alloy_ring", () -> new AndsiteAlloyRingItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_BLADE = REGISTRY.register("andesite_alloy_blade", () -> new AndesiteAlloyBladeItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_BOLT = REGISTRY.register("andesite_alloy_bolt", () -> new AndesiteAlloyBoltItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_CURVED_PLATE = REGISTRY.register("andesite_alloy_curved_plate", () -> new AndesiteAlloyCurvedPlateItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_DOUBLE_INGOT = REGISTRY.register("andesite_alloy_double_ingot", () -> new AndesiteAlloyDoubleIngotItem());
	public static final RegistryObject<Item> COPPER_ORE_I_SPAWN_EGG = REGISTRY.register("copper_ore_i_spawn_egg", () -> new ForgeSpawnEggItem(EndlessModpackIngredientsModEntities.COPPER_ORE_I, -6710887, -39424, new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_INGOT = REGISTRY.register("andesite_ingot", () -> new AndesiteIngotItem());
	public static final RegistryObject<Item> ANDESITE_DUST = REGISTRY.register("andesite_dust", () -> new AndesiteDustItem());
	public static final RegistryObject<Item> KELP_SOUP_BUCKET = REGISTRY.register("kelp_soup_bucket", () -> new KelpSoupItem());
	public static final RegistryObject<Item> TOO_MUCH_SALT_IN_THE_KELP_SOUP_BUCKET = REGISTRY.register("too_much_salt_in_the_kelp_soup_bucket", () -> new TooMuchSaltInTheKelpSoupItem());
	public static final RegistryObject<Item> MOLTEN_ANDESITE_ALLOY_BUCKET = REGISTRY.register("molten_andesite_alloy_bucket", () -> new MoltenAndesiteAlloyItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_DRILL_HEAD = REGISTRY.register("andesite_alloy_drill_head", () -> new AndesiteAlloyDrillHeadItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_DRILL = REGISTRY.register("andesite_alloy_drill", () -> new AndesiteAlloyDrillItem());
	public static final RegistryObject<Item> ANDESITE_ALLOY_HAMMER = REGISTRY.register("andesite_alloy_hammer", () -> new AndesiteAlloyHammerItem());
	public static final RegistryObject<Item> CLUMP_OBSIDIAN = REGISTRY.register("clump_obsidian", () -> new ClumpObsidianItem());
	public static final RegistryObject<Item> IRON_ORE_I_SPAWN_EGG = REGISTRY.register("iron_ore_i_spawn_egg", () -> new ForgeSpawnEggItem(EndlessModpackIngredientsModEntities.IRON_ORE_I, -6710887, -1057308, new Item.Properties()));
	public static final RegistryObject<Item> COAL_ORE_I_SPAWN_EGG = REGISTRY.register("coal_ore_i_spawn_egg", () -> new ForgeSpawnEggItem(EndlessModpackIngredientsModEntities.COAL_ORE_I, -6710887, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> QUARTZ_ORE_I_SPAWN_EGG = REGISTRY.register("quartz_ore_i_spawn_egg", () -> new ForgeSpawnEggItem(EndlessModpackIngredientsModEntities.QUARTZ_ORE_I, -6710887, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}

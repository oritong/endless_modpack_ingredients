
package net.mcreator.endlessmodpackingredients.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModItems;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluids;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModFluidTypes;
import net.mcreator.endlessmodpackingredients.init.EndlessModpackIngredientsModBlocks;

public abstract class MoltenAndesiteAlloyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EndlessModpackIngredientsModFluidTypes.MOLTEN_ANDESITE_ALLOY_TYPE.get(), () -> EndlessModpackIngredientsModFluids.MOLTEN_ANDESITE_ALLOY.get(),
			() -> EndlessModpackIngredientsModFluids.FLOWING_MOLTEN_ANDESITE_ALLOY.get()).explosionResistance(100f).bucket(() -> EndlessModpackIngredientsModItems.MOLTEN_ANDESITE_ALLOY_BUCKET.get())
			.block(() -> (LiquidBlock) EndlessModpackIngredientsModBlocks.MOLTEN_ANDESITE_ALLOY.get());

	private MoltenAndesiteAlloyFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenAndesiteAlloyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenAndesiteAlloyFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

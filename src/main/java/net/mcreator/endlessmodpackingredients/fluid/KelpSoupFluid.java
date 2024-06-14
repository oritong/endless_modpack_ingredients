
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

public abstract class KelpSoupFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EndlessModpackIngredientsModFluidTypes.KELP_SOUP_TYPE.get(), () -> EndlessModpackIngredientsModFluids.KELP_SOUP.get(),
			() -> EndlessModpackIngredientsModFluids.FLOWING_KELP_SOUP.get()).explosionResistance(100f).bucket(() -> EndlessModpackIngredientsModItems.KELP_SOUP_BUCKET.get())
			.block(() -> (LiquidBlock) EndlessModpackIngredientsModBlocks.KELP_SOUP.get());

	private KelpSoupFluid() {
		super(PROPERTIES);
	}

	public static class Source extends KelpSoupFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends KelpSoupFluid {
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

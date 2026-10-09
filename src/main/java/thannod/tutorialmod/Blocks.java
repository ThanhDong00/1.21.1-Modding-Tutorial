package thannod.tutorialmod;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Blocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(FirstTutorial.MOD_ID);

  public static final Holder<Block> BLUE_STONE = BLOCKS.register("blue_stone", () -> new Block(BlockBehaviour.Properties.of()
      .destroyTime(2.0f)
      .lightLevel(state-> 14)
  ));
}

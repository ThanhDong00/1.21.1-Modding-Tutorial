package thannod.tutorialmod;

import net.minecraft.core.Holder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(FirstTutorial.MOD_ID);

  public static final Holder<Item> BLUE_STONE = ITEMS.register("blue_stone", () -> new BlockItem(Blocks.BLUE_STONE.value(), new Item.Properties()));
}

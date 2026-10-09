package thannod.tutorialmod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(FirstTutorial.MOD_ID)
public class FirstTutorial {
  public static final String MOD_ID = "firsttutorial";

  public FirstTutorial(IEventBus eventBus, ModContainer modContainer) {
    Blocks.BLOCKS.register((eventBus));
    Items.ITEMS.register(eventBus);
  }
}

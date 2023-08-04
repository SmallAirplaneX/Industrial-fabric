package top.wangxiaomei;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import top.wangxiaomei.machine.BoxScreen;

import static top.wangxiaomei.IndustrialMod.BOX_SCREEN_HANDLER;

public class IndustrialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        HandledScreens.register(BOX_SCREEN_HANDLER,BoxScreen::new);
    }
}
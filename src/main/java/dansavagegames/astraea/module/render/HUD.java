package dansavagegames.astraea.module.render;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

import static dansavagegames.astraea.utils.GuiUtils.ArrayList;

public class HUD extends Module {

    public static FontRenderer fr = mc.fontRendererObj;
    public static ScaledResolution sr = new ScaledResolution(mc);
    int x = 10;
    int y = 2;

    public HUD() {
        super("TabGUI", Category.Movement);
        description = "Allows you to navigate modules without opening ClickGUI";
        key = Keyboard.KEY_J;
        visible = false;
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent egoe) {
        super.onEnable();
        ArrayList(y);
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }
}

package dansavagegames.astraea.module.render;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import static dansavagegames.astraea.module.ModuleManager.*;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class HUD extends Module {

    public static FontRenderer fr = mc.fontRendererObj;
    public static ScaledResolution sr = new ScaledResolution(mc);
    int x = 10;
    int y = 2;
    int color = dyesHexList[30];

    public HUD() {
        super("TabGUI", Category.Movement);
        description = "Allows you to navigate modules without opening ClickGUI";
        key = Keyboard.KEY_J;
        visible = false;
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent Text, TickEvent.ClientTickEvent event) {
        super.onEnable();
        if (!isPlayerInWorld() && !toggled) return;
        for (Module m : modules) {
            if(m.canBeInHud()) {
                fr.drawStringWithShadow(m.getName(), x + sr.getScaledWidth() - fr.getStringWidth(m.getName()) - 1, y, color);
                y += fr.FONT_HEIGHT;
            }
        }
    }

    @Override
    public void onDisable(){
        super.onDisable();
    }

}
package dansavagegames.astraea.utils;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.io.IOException;

import static dansavagegames.astraea.module.ModuleManager.modules;
import static dansavagegames.astraea.module.render.HUD.fr;
import static dansavagegames.astraea.module.render.HUD.sr;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class GuiUtils extends GuiScreen {

    public static Minecraft mc = Minecraft.getMinecraft();

    public static final int MOUSE_LEFT = 0;
    public static final int MOUSE_RIGHT = 1;
    public static final int MOUSE_MIDDLE = 2;
    public static final int MOUSE_BACKWARD = 3;
    public static final int MOUSE_FORWARD = 4;
    public int lastClickedButton = 0;

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException { // nea89 Modding Wiki
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        lastClickedButton = button.id;
    }

    public static String TabHud (Category c){
        // TODO: Add Rendering for TabHud; Add Ability to use Arrow Keys to Navigate; Enter or Right is Togglet
        for(Module m : modules) {
            if(m.getCategory() == c)
                return m.getName();
        }
        return null;
    }

    public static class ClickHud extends GuiUtils {
        //
    }

    @SubscribeEvent
    public boolean isGuiOpen(GuiOpenEvent event) { // Coded by yes
        if (event.gui instanceof GuiInventory) {
            return true;
        }
        return false;
    }

    public void drawBehindModuleName(String text, int width, int height, int color){
        int stringWidth = fr.getStringWidth(text);
    }
}
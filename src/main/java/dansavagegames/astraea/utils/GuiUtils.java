package dansavagegames.astraea.utils;

import dansavagegames.astraea.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import java.io.IOException;

import static dansavagegames.astraea.module.ModuleManager.modules;
import static dansavagegames.astraea.module.render.HUD.fr;
import static dansavagegames.astraea.module.render.HUD.sr;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;
import static org.lwjgl.opengl.GL11.*;

public class GuiUtils extends GuiScreen {

    public static Minecraft mc = Minecraft.getMinecraft();

    public static final int MOUSE_LEFT = 0;
    public static final int MOUSE_RIGHT = 1;
    public static final int MOUSE_MIDDLE = 2;
    public static final int MOUSE_BACKWARD = 3;
    public static final int MOUSE_FORWARD = 4;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void keyTyped(char typedChar, int keyC) throws IOException {
        super.keyTyped(typedChar, keyC);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    public static void ArrayList(int y){
        if (!isPlayerInWorld()) return;
        for (Module m : modules) {
            if(m.canBeInHud()) {
                fr.drawString(m.getName(), sr.getScaledWidth() - fr.getStringWidth(m.getName()) - 1, y, 0x00FF00);
                y += fr.FONT_HEIGHT;
                // drawRect(sr.getScaledWidth() - 2, sr.getScaledHeight() + 2, sr.getScaledWidth() + 2, sr.getScaledHeight() - 2, 0x00FF00);
            }
        }
    }

    public static void TabHud (){
        //
    }

    public static class ClickHud extends GuiUtils {
        //
    }

}
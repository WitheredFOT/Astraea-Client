package dansavagegames.astraea.utils;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Utils {

    public static Minecraft mc = Minecraft.getMinecraft();

    public static boolean isPlayerInWorld(){
        return (mc.thePlayer != null && mc.theWorld != null);
    }

    public static boolean isPlayerMovingForward() {
        return (mc.thePlayer.movementInput.moveForward > 0);
    }

    // public static int rgbColor(){ }
}

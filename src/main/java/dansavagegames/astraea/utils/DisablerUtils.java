package dansavagegames.astraea.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;

public class DisablerUtils {

    static Minecraft mc = Minecraft.getMinecraft();

    public static void sendPacket(Packet packet){
        mc.thePlayer.sendQueue.addToSendQueue(packet);
    }
}

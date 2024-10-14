package dansavagegames.astraea.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;

import java.util.Iterator;

public class ClientUtils {

    public static Minecraft mc = Minecraft.getMinecraft();
    public static Iterator<Entity> entities = mc.theWorld.loadedEntityList.iterator();
    public static Object nextEntity = entities.next();

    public static float distanceToEntity(Entity entity) {
        return mc.thePlayer.getDistanceToEntity(entity);
    }

    public static void swingItem(){
        mc.thePlayer.swingItem();
    }

    public static boolean isPlayerInWorld(){
        return (mc.thePlayer != null && mc.theWorld != null);
    }

    public static boolean isPlayerMovingForward() {
        return (mc.thePlayer.movementInput.moveForward > 0);
    }

    public static boolean entityExistsBase() {
        return (nextEntity instanceof EntityLivingBase);
    }

    public static boolean entityExistsSP() {
        return (nextEntity instanceof EntityPlayerSP);
    }

    public static boolean willTakeFallDamage(){
        return (mc.thePlayer.fallDistance > 2);
    }

    public static void attackEntity(String en, float d) {
        EntityLivingBase entity = (EntityLivingBase) nextEntity;
        if(mc.thePlayer.getDistanceToEntity(entity) <= d && entity.isEntityAlive() && entity.getName().equals(en)) {
            mc.playerController.attackEntity(mc.thePlayer, entity);
            swingItem();
        }
    }

    public static boolean isValidEntity(Entity m){
        if(m == mc.thePlayer) return false;
        if(!m.isEntityAlive()) return false;
        else if(!(m instanceof EntityLiving)) return false;
        else return true;
    }

    // public static int rgbColor(){ }

}

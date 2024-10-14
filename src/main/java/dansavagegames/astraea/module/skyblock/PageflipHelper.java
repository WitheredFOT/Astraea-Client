package dansavagegames.astraea.module.skyblock;

import dansavagegames.astraea.module.Category;
import dansavagegames.astraea.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.LogManager;

public class PageflipHelper extends Module {

    public PageflipHelper(){
        super("PageflipHelper", Category.Skyblock);
        description = "Helps you page flip with Coflmod";
        toggled = true;
    }

    // Next Page: Med profit 1,000,000

    // Note: Don't forget, you can Ctrl+/ to comment/uncomment out selected code

//    public void onEnable(){
//        byte STRING_NBT_TAG = new NBTTagString().getId();
//        NBTTagCompound tagCompound = stack.getTagCompound();
//        if (tagCompound == null) {
//            String displayName = tagCompound.getCompoundTag("display").getString("Name");
//            NBTTagList loreList = tagCompound.getCompoundTag("display").getTagList("Lore", STRING_NBT_TAG);
//            for (int i1 = 0; i1 < loreList.tagCount(); i1++) {
//                String loreLine = loreList.getStringTagAt(i1);
//            }
//        }
//    }
//
//    public void onDisable(){
//
//    }
//
//    @SubscribeEvent
//    public void onTick(TickEvent.ClientTickEvent event) {
//        if (event.phase != TickEvent.Phase.END) return;
//        GuiScreen currentScreen = mc.currentScreen;
//        if (currentScreen == null) return;
//        GuiChest currentScreen1 = (GuiChest) currentScreen;
//        ContainerChest container = (ContainerChest) currentScreen1.inventorySlots;
//    }
}
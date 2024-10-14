package dansavagegames.astraea.module;

import dansavagegames.astraea.module.misc.InstaBan;
import dansavagegames.astraea.module.movement.*;
import dansavagegames.astraea.module.render.HUD;
import dansavagegames.astraea.module.world.Nuker;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class ModuleManager {

    public static List<Module> modules = new ArrayList<Module>();

    public static int[] rosedyes = {0xF06766, 0xf06766, 0xf06766, 0xee6364, 0xee6364, 0xeb5e61, 0xe8595e, 0xe45359, 0xe04d55, 0xdb4650, 0xd3404c, 0xcb3947, 0xc43043, 0xbd2b40,
            0xb8293e, 0xb3263d, 0xae243b, 0xae243b, 0xa32038, 0x9c1e36, 0x961c34, 0x901a32, 0x881731, 0x81162e, 0x881830, 0x81162e, 0x7b142d, 0x74122b, 0x6d1029,
            0x650e27, 0x5e0d24, 0x560b22, 0x500a20, 0x49081f, 0x44061d, 0x3e061b, 0x39041a, 0x39041a, 0x39041a, 0x39041a, 0x39041a}, luckydyes = {0x87ff37, 0x81F83C, 0x7DF43F,
            0x79EF42, 0x73E944, 0x6FE547, 0x64D848, 0x5DD24D, 0x57CC4E, 0x52C551, 0x4ABE52, 0x4AB752, 0x3DB158, 0x36AB53, 0x30A553, 0x299F54, 0x239954, 0x1D9553, 0x179153,
            0x0F8C53, 0x098852, 0x008350, 0x007D4F, 0x00774D, 0x007348, 0x006F49, 0x006C47, 0x006944}, wardendyes = {0x034150, 0x034150, 0x034150, 0x034150, 0x034150, 0x024554,
            0x004a59, 0x004f5e, 0x005463, 0x005a68, 0x005f6d, 0x006472, 0x006a76, 0x006a76, 0x00757f, 0x007a84, 0x008088, 0x00868c, 0x008b90, 0x009194, 0x009194, 0x009295,
            0x009295, 0x009295}, portaldyes = {0x5909c1, 0x560aba, 0x520cb1, 0x5909c1, 0x490f9c, 0x440f92, 0x3f0f8a, 0x3c1081, 0x38107b, 0x361076, 0x371078, 0x390f7c, 0x3a1080,
            0x3c0f85, 0x3e0e8c, 0x400d92, 0x430b9a, 0x450aa1, 0x4909a8, 0x4c08af, 0x5107b5, 0x5608bc, 0x5c0ac1, 0x620dc5, 0x680fc9, 0x6f12ce, 0x7814d1, 0x8117d5, 0x8a18d9,
            0x9419dc, 0x9e1adf, 0xa71ae3, 0xb01ae5, 0xb919e7, 0xc117ea, 0xc816ec, 0xcf14ef, 0xd412f0};

    public static int[][] animdyes = {rosedyes, luckydyes, wardendyes, portaldyes};

    public static final int carminedye = 0x960018, archfienddye = 0xB80036, sangriadye = 0xD40808, necrondye = 0xE7413C, brickreddye = 0xCB4154, chocolatedye = 0x7B3F00,
            flamedye = 0xE25822, copperdye = 0xB87333, fossildye = 0x866F12, mangodye = 0xFDBE02, pureyellowdye = 0xFFF700, nyanzadye = 0xE9FFDB, celadondye = 0xACE1AF,
            emeralddye = 0x50C878, jadedye = 0x00A86B, matchadye = 0x74A12E, hollydye = 0x3C6746, aquamarinedye = 0x7FFFD4, celestedye = 0xB2FFFF, frostbittendye = 0x09D8EB,
            icebergdye = 0x71A6D2, tentacledye = 0x324D6C, pearlescentdye = 0x115555, bingobluedye = 0x002FA7, purebluedye = 0x0013FF, midnightdye = 0x50216C,
            darkpurple = 0x301934, byzantiumdye = 0x702963, wildstrawberrydye = 0xFF43A4, cyclamendye = 0xF56FA1, nadeshikodye = 0xF6ADC6, peltdye = 0x50414C,
            secretdye = 0x7D7D7D, periwinkledye = 0xCCCCFF, purewhitedye = 0xFFFFFF, bonedye = 0xE3DAC9, lividdye = 0xCEB7AA, mochadye = 0x967969, dungdye = 0x4F2A2A,
            pureblackdye = 0x000000;

    public static final int[] dyesHexList = {0x960018, 0xB80036, 0xD40808, 0xE7413C, 0xCB4154, 0x7B3F00, 0xE25822, 0xB87333, 0x866F12, 0xFDBE02, 0xFFF700, 0xE9FFDB, 0xACE1AF,
            0x50C878, 0x00A86B, 0x74A12E, 0x3C6746, 0x7FFFD4, 0xB2FFFF, 0x09D8EB, 0x71A6D2, 0x324D6C, 0x115555, 0x002FA7, 0x0013FF, 0x50216C, 0x301934, 0x702963, 0xFF43A4,
            0xF56FA1, 0xF6ADC6, 0x50414C, 0x7D7D7D, 0xCCCCFF, 0xFFFFFF, 0xE3DAC9, 0xCEB7AA, 0x967969, 0x4F2A2A, 0x000000};
    public static final int[] dyesNamesList = {carminedye, archfienddye, sangriadye, necrondye, brickreddye, chocolatedye, flamedye, copperdye, fossildye, mangodye, pureyellowdye,
            nyanzadye, celadondye, emeralddye, jadedye, matchadye, hollydye, aquamarinedye, celestedye, frostbittendye, icebergdye, tentacledye, pearlescentdye, bingobluedye,
            purebluedye, midnightdye, darkpurple, byzantiumdye, wildstrawberrydye, cyclamendye, nadeshikodye, peltdye, secretdye, periwinkledye, purewhitedye, bonedye, lividdye,
            mochadye, dungdye, pureblackdye};

    // Change this.
    public static int rosedye = 0x9c1e36, luckydye = 0x87FF37, wardendye = 0x005f6d, portaldye = 0x450aa1;

    public static int[] skyblockDyes = {carminedye, archfienddye, sangriadye, necrondye, brickreddye, rosedye, chocolatedye, flamedye, copperdye, fossildye, mangodye,
            pureyellowdye, luckydye, nyanzadye, celadondye, emeralddye, jadedye, matchadye, hollydye, aquamarinedye, celestedye, frostbittendye, icebergdye, tentacledye,
            pearlescentdye, wardendye, bingobluedye, purebluedye, portaldye, midnightdye, darkpurple, byzantiumdye, wildstrawberrydye, cyclamendye, nadeshikodye, peltdye,
            secretdye, periwinkledye, purewhitedye, bonedye, lividdye, mochadye, dungdye, pureblackdye};

    private static int colorArrayNumber, i; public boolean isGoingUp = true;

    public ModuleManager() {

        // Movement
        modules.add(new AirJump());
        modules.add(new Flight());
        modules.add(new Jetpack());
        modules.add(new NoFall());
        modules.add(new Speed());
        modules.add(new Sprint());

        // Render
        modules.add(new HUD());

        // World
        modules.add(new Nuker());

        // Misc
        modules.add(new InstaBan());


    }

    public String getName() {
        for (Module m : modules) {
            return m.getName();
        }
        return null;
    }

    public String getArrayListModules() {
        for (Module m : modules) {
            if (m.isEnabled() && m.visible) {
                return m.getName();
            }
        }
        return null;
    }

    public String getModulesInCategory(Category c) {
        for (Module m : modules) {
            if (m.getCategory() == c) {
                return m.getName();
            }
        }
        return null;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END && isPlayerInWorld()) {
            for (Module m : modules) {
                if (Keyboard.isKeyDown(m.getKey()) && m.canBeToggled) {
                    m.toggle();
                    m.canBeToggled = false;
                }
                if (!Keyboard.isKeyDown(m.getKey()) && !m.canBeToggled) m.canBeToggled = true;
            }
        }
    }

    public int colorPicker(int num){
        return skyblockDyes[num];
    }

    public static void colorArrayNumber(int arrayNum) { // 0 = rosedye, 1 = luckydye, 2 = wardendye, 3 = portaldye
        int[] colorArray = animdyes[arrayNum];
        int listSize = colorArray.length;
        int i = 0;
        boolean numberGoingUp = true;
        while (isPlayerInWorld()) {
            if (i < listSize && numberGoingUp) {
                if (i == listSize - 1)
                    numberGoingUp = false;
                i++;
            }
            if (i >= 0 && !numberGoingUp) {
                if (i == 0)
                    numberGoingUp = true;
                i--;
            }
        }
    }
}
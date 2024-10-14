package dansavagegames.astraea.module;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

import java.util.Iterator;

import static dansavagegames.astraea.Astraea.evb;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class Module {

    public static Minecraft mc = Minecraft.getMinecraft();

    public boolean toggled;
    public String description;
    public String name;
    public Category category;
    public int key;
    public boolean canBeToggled;
    public boolean visible;
    public boolean blatant;
    public boolean cheat;

    public Module(String n, Category c) {
        this.key = 0;
        this.name = n;
        this.category = c;
        this.description = "";
        this.toggled = false;
        this.visible = true;
        this.blatant = false;
        this.cheat = false;
    }

    public boolean isCheat() {
        return cheat;
    }

    public void setCheat() {
        this.cheat = cheat;
    }

    public boolean isBlatant(){
        return blatant;
    }

    public void setBlatant() {
        this.blatant = blatant;
    }

    public int getKey() {
        return key;
    }

    public void setDescription() {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName() {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCategory() {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public boolean canBeInHud(){
        return (toggled && visible);
    }

    public boolean canBeToggled() {
        return (isPlayerInWorld() && !mc.ingameGUI.getChatGUI().getChatOpen());
    }

    public boolean isEnabled() {
        return toggled;
    }

    public void toggle() {
        this.toggled = !this.toggled;
        if (toggled && isPlayerInWorld()) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {
        if(toggled) {
            evb.register(this);
        }
    }

    public void onDisable() {
        evb.unregister(this);
    }

}
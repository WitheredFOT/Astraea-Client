package dansavagegames.astraea.module;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static dansavagegames.astraea.Astraea.evb;
import static dansavagegames.astraea.utils.Utils.isPlayerInWorld;

public class Module {

    public static Minecraft mc = Minecraft.getMinecraft();

    public boolean toggled;
    public String description;
    public String name;
    public Category category;
    public int key;
    public boolean canBeEnabled = true;
    public boolean visible;

    public Module(String n, Category c) {
        this.key = 0;
        this.name = n;
        this.category = c;
        this.description = "";
        this.toggled = false;
        this.visible = true;
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

    public boolean canBeInHud(){
        return (toggled && visible);
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
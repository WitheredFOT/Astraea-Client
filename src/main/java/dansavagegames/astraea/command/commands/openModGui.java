package dansavagegames.astraea.command.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.Arrays;
import java.util.List;

public class openModGui extends CommandBase {

    // This shouldn't be used for long, it should be moved to modules > toggle > clickgui

    @Override
    public String getCommandName(){
        return "astraea";
    }

    @Override
    public String getCommandUsage(ICommandSender sender){
        return "Allows you to open Mod GUI";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        System.out.print("Open GUI [Placeholder]");
    }

    @Override
    public List<String> getCommandAliases(){
        return Arrays.asList("aea", "ast", "astr");
    }
}
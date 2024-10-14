package dansavagegames.astraea.command.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.Arrays;
import java.util.List;

public class enableModule extends CommandBase {

    // This shouldn't be used for long, it should be moved to module > enable > #modulename

    @Override
    public String getCommandName(){
        return "enable";
    }

    @Override
    public String getCommandUsage(ICommandSender sender){
        return "Allows you to toggle modules";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        throw new RuntimeException("Not yet added :3");
    }

//    @Override
//    public List<String> getCommandAliases(){
//        return Arrays.asList();
//    }
}
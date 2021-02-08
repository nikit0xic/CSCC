package input_output;

import collection.CommandName;
import collection.MusicBand;

import java.io.Serializable;

public class Message implements Serializable {
    private CommandName commandName;
    private String commandArgs;
    private long commandArg;
    private MusicBand band;

    public Message(CommandName commandName){
        this.commandName=commandName;
    }

    public Message(CommandName commandName, String commandArgs){
        this.commandName = commandName;
        this.commandArgs = commandArgs;
    }

    public Message(CommandName commandName, MusicBand musicBand){
        this.commandName = commandName;
        band = musicBand;
    }

    public Message(CommandName commandName,String commandArgs,MusicBand musicBand){
        this.commandName = commandName;
        this.commandArgs = commandArgs;
        band = musicBand;
    }

    public Message(CommandName commandName, int commandArg) {
        this.commandName = commandName;
        this.commandArg = commandArg;
    }

    public Message(CommandName commandName, int commandArg, MusicBand musicBand) {
        this.commandName = commandName;
        this.commandArg = commandArg;
        band = musicBand;
    }

    public CommandName getCommandName(){
        return commandName;
    }

    public String getCommandArgs(){
        return commandArgs;
    }

    public long getCommandArg(){ return commandArg;}

    public MusicBand getMusicBand(){
        return band;
    }

    @Override
    public String toString(){
        return "RequestCommand{" +
                "commandName='"+ commandName + '\'' +
                ", commandArgs='" + commandArgs + '\'' +
                ", band=" + band +'}';
    }
















}

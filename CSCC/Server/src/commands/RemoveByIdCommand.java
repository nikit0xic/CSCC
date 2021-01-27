package commands;

import server_kernel.Invoker;
import server_kernel.Receiver;
import server_kernel.RepositoryOfMusicBand;
import collectionManager.MusicBand;

import java.util.EnumMap;

public class RemoveByIdCommand extends Command {

    Receiver receiver;

    public RemoveByIdCommand(Receiver receiver){
        setName(CommandName.REMOVE_BY_ID);
        setDescription("удалить элемент из коллекции по его id");
        this.receiver = receiver;
    }

    @Override
    public void execute(EnumMap<CommandName,Command> map, RepositoryOfMusicBand repositoryOfMusicBand, Invoker invoker, MusicBand musicBand, String... args){
        int key = Integer.parseInt(args[0]);
        receiver.removeByID(repositoryOfMusicBand,musicBand,key);
    }
}
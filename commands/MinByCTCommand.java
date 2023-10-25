package commands;

import abstractions.ICommand;
import data.CommandData;
import data.ResultData;

import java.io.Serializable;

public class MinByCTCommand implements ICommand, Serializable {

    @Override
    public ResultData execute(CommandData commandData) {
        return commandData.labCollection.minByCT(commandData);
    }

    @Override
    public boolean isClientCommand() {
        return false;
    }

    @Override
    public boolean hasElement() {
        return false;
    }

    @Override
    public boolean hasIntDigit() {
        return false;
    }

    @Override
    public boolean hasString() {
        return false;
    }

    @Override
    public String getName() {
        return "min_by_id";
    }

    @Override
    public String getDescription() {
        return "show any element with minimal id number";
    }
}

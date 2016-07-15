package by.pvt.pankova.enums;

import by.pvt.pankova.commands.Command;
import by.pvt.pankova.commands.impl.CreateCommand;
import by.pvt.pankova.commands.impl.DeleteCommand;
import by.pvt.pankova.commands.impl.LoginCommand;
import by.pvt.pankova.commands.impl.LogoutCommand;

public enum Commands {

    CREATE {
        {
            this.command = new CreateCommand();
        }
    },
    DELETE {
        {
            this.command = new DeleteCommand();
        }
    },
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };

    Command command;

    public Command getCommand() {
        return command;
    }
}
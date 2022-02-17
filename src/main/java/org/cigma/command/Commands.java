package org.cigma.command;

import java.util.Arrays;

public enum Commands {
    CREATE_STUDENT("create_student"),
    SHOW_STUDENTS("show_students"),
    GRANT_STUDENT_ACCESS("grant_student_access"),
    REVOKE_STUDENT_ACCESS("revoke_student_access"),
    DEFAULT("default");
    String command;

    Commands(String command) {
        this.command = command;
    }


    public static Commands getCommand(String input){
        return Arrays.stream(Commands.values()).filter((c)-> c.command.equals(input)).findFirst().orElse(DEFAULT);
    }

}

package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;



public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alexander", "Ovechkin", (byte) 38);
        userService.saveUser("Evgeni", "Malkin", (byte) 37);
        userService.saveUser("Seadney", "Crosby", (byte) 36);
        userService.saveUser("Connor", "McDavid", (byte) 27);

        userService.getAllUsers();
        for (User element : userService.getAllUsers()) {
            System.out.println(element);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}

package homework5;

import controller.UserController;
import model.repository.Repository;
import model.repository.impl.UserRepository;
import util.DBConnector;
import view.UserView;

public class Main {
    public static void main(String[] args) {
        DBConnector dbConnector = new DBConnector();
        dbConnector.createDB();
        Repository repository = new UserRepository(dbConnector);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

        DBConnector dbConnector1 = new DBConnector("db1.txt");
        dbConnector1.createDB();
        Repository repository1 = new UserRepository(dbConnector1, "; ");
        UserController controller1 = new UserController(repository1);
        UserView view1 = new UserView(controller1);
        view1.run();
    }
}
package Volatile;

public class Database {
    private static volatile Database instance = null;
    private Database() {
        System.out.println("Database Connected");
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}

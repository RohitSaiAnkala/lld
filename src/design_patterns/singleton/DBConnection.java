package design_patterns.singleton;

public class DBConnection {
    static volatile DBConnection dbConnection;

    private DBConnection() {
        System.out.println("DBConnection object created");
    }

    public static DBConnection getInstance() {
        /* double-checked locking--> t1 and t2 see that dbConnection is null and lets assume t1 executed first, and it acquired lock , it checks
        dbCOnnection to be null and creates a new object and releases lock, t2 is already inside the first if condition , it acquires lock and checks
        whether dbConnection is null , but since t1 already created a new object , dbConnection is not null and hence no new object will be created by t2.
        And in future if multiple threads come also, dbConnection is not null, so the first if itself is skipped and it returns the singleton object.
         */
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

}

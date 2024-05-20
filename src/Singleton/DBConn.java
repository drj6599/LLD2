package Singleton;

public class DBConn {
    private final int maxConnections = 10;
    private int noOfConnections;

    private static DBConn instance;

    private DBConn()
    {
        this.noOfConnections = 0;
    }

    public static DBConn getInstance()
    {
        if(instance == null)
        {
            synchronized (DBConn.class)
            {
                if(instance == null)
                {
                    instance = new DBConn();
                }
            }
        }
        return instance;
    }

    public void connect()
    {
        synchronized (DBConn.class)
        {
            if(noOfConnections < maxConnections)
            {
                noOfConnections++;
            }
            else
            {
                System.out.println("Maximum number of connections reached!");
            }
        }
    }
}

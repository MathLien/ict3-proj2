// contains static information + operations + specific implementations which the client can perform

public class FollowerServer implements Server {
    public boolean askMasterToLock(String lockName, int clientID) throws IOException{
        // connect with leader
        // detail of request...
        // returns: True if successful, False if not
    }

    public boolean askMasterToRelease(String lockName, int clientID) throws IOexception{
        // connect with leader
        // detail of request: ...
        // returns: True if successful, False if not
    }

    boolean connectLeader(String info) throws IOException{
        // get IP address of leader server
        // returns: True if successful, False if not
    }
}
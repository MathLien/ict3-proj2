// extension of Server

import java.util.*
public class LeaderServer extends Server{
    String[] followersConnected;

    public void initThread(String ip_addr){
        //Here you create the thread to listen to followers

    }

    private listener(String ip_addr){
        final request;

        final ownedBy = lockTable[request.lockName];

        switch (request.action){
            case RELEASE:
                if (ownedBy == request.clientId){
                    lockTable[request.lockName] = request.clientId;
                    inform(request.lockName, null);
                    throw "Answer to client to do...";
                } else {
                    throw "Answer client failure"
                };
                break;
            case PREEMPT:
                if (ownedBy == null || ownedBy == undefined){
                    inform(request.lockName, request.clientId);
                    lockTable[request.lockName] = request.clientId;
                    throw "Answer client success";
                } else {
                    throw "Answer client failure";
                }
        }
    }


}
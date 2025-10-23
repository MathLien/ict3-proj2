package com.example.distriblocks

import java.io.IOException;

public interface LockServer{
    /**
    * Responsible for opening a new thread to receive messages
    * @param newIP IP address of the new connection
    * @throws IOException if thread creation or socket fails
    * */
    void newThread(String newIP) throws IOException;

    /**
     * Notify or send information to the main server
     * Followers use this to forward client operations
     * @param info message or serialised command to send
     * @throws IOException if communication fails
     */
    /
    void connectLeader(String info) throws IOException;

    /**
     * Synchronise information from the leader server to a follower
     * @param tmpIP source IP for logging
     * @param info synchronisation message
     * @throws IOException if update or communication fails
     */
    /
    void inform(String tmpIP, String info) throws IOException;
}

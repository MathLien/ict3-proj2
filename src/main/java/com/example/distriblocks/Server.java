// implement base abstract server
package com.example.distriblocks

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Server implements LockServer{
    // add variables

    @Override
    public void newThread(String newIP) throws IOException{
        // do stuff
    }

    @Override
    void inform(String tmpIP, String info) throws IOException{
        // do stuff
    }
}
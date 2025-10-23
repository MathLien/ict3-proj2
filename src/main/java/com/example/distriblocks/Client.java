// implement client-side socket logic
package com.example.distriblocks

import java.io.*;
import java.net.*;
import java.util.UUID;

public class Client implements LockClient{

    @Override
    void tryLock(String lockName, String lockKey) throws IOException{
        // do stuff
    }

    @Override
    void tryUnLock(String lockName, String lockKey) throws IOException{
        // do stuff
    }

    @Override
    String ownTheLock(String lockName, String lockKey) throws IOException{
        // do stuff
    }
}
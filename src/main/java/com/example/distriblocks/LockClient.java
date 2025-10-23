package.com.distriblocks

import java.io.IOException;

public interface LockClient{

    /**
    * Performs the locking operation
    *
    * @param lockName name of the lock acquire
    * @param lockKey secondary key used for the lock
    * @throws IOException if communication fails
    * */
    void tryLock(String lockName, String lockKey) throws IOException;

    /**
     * Releases the lock operation
     *
     * @param lockName name of lock to release
     * @param lockKey secondary key for the lock
     * @throws IOException if communication fails
     * */
    void tryUnLock(String lockName, String lockKey) throws IOException;

    /**
     * @param lockName lock name
     * @param lockKey secondary key
     * @return textual response
     * @throws IOException if communication fails
     * */
    String ownTheLock(String lockName, String lockKey) throws IOException;
}
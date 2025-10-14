# ict3-proj2
A distributed lock system

The purpose is to build a lock system duplicated on multiple servers (to support a higher workload).
* A master will hold the truth, and will grant and release the locks
* Slaves will hold copies of the truth (maybe wrong). The clients will ask them for the locks. If the locks is thought to be own by someone else by the slave, it anwser according to his truth. If not, the slave sends a preempt request to the master. The master answer is forwarded to the requesting client. The local truth from the slaves are updated to match THE Truth. On lock release, the slave notifies the master which again updates the other slaves.

We do not have to support network partition (so we assume network always works)


# API
This system provides the following functions to the clients (which connects only to the slaves)

* int tryLock (String lockName), to perform the locking operation;
* int tryUnLock (String lockName), to release the lock operation;
* String ownTheLock (String lockName), returns the owner of the lock.

It must have some global parameters we need to choose how to specify, such as the ip adrress of the slaves (only one or all of them ?) and the client identifier. (And maybe timeout values, or something)

And as we have not decided yet which language we are going to use, I think I will stop here...



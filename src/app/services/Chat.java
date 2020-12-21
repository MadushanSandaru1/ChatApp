
package app.services;

import app.interfaces.Message;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Chat extends Remote{
    
    public void send_message(Message msg) throws RemoteException;

    public Message broadcast() throws RemoteException;
}

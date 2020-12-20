
package app.services;

import app.interfaces.Message;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ChatService extends UnicastRemoteObject implements Chat{

    Message newmsg = null;
    
    public ChatService() throws RemoteException {
        super();
    }
    
    @Override
    public void send_message(Message msg) {
        this.newmsg = msg;
        this.save_msg();
    }

    @Override
    public Message broadcast() {
         return this.newmsg;
    }
    
    
     public void save_msg() {
    
        try {
            FileOutputStream fileOut = new FileOutputStream("messagedb.ser", true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(this.newmsg);
            out.flush();
            out.close();
            fileOut.close();
            
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
         
    }
}

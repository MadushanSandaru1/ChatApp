
package app.dbmanager;

import app.controller.Connection;
import app.pojos.User;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class DBManager {
    
    private static DBManager dbm;
    
    private DBManager(){
    }
    
    static{
        dbm = new DBManager();
    }
    
    public static DBManager getDBM(){
        return dbm;
    }
    
    
    public boolean insert (byte[] avatar64based,String email,String username,String nickname,String password){
        Session s = Connection.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        User user = new User();
        
        if(avatar64based!=null) user.setAvatar(avatar64based);
        user.setEmail(email);
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setIsDeleted(0);
        
        s.save(user);
        t.commit();
        s.close();

    
         System.out.println("succes");
        return false;
        
    }
    
    public List login(String username,String password) {
        Session sess=Connection.getSessionFactory().openSession();
        String sql="FROM User WHERE username='"+username+"' AND password='"+password+"'";
        Query qu=sess.createQuery(sql);
        List User =  qu.list();
        return User;
    }
    
}

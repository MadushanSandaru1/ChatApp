
package app.dbmanager;

import app.controller.Connection;
import app.pojos.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBManager {
    
    public boolean insert (String avatar64based,String email,String username,String nickname,String password){
        Session s = Connection.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        User user = new User();
//        
//        user.setEmail(email);
//        user.getUsername(username);
//        user.set
//        
        return false;
        
    }
    
}

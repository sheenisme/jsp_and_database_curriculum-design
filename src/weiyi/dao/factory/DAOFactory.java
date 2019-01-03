package weiyi.dao.factory;

import weiyi.dao.IAdminDAO;
import weiyi.dao.ICustomDAO;
import weiyi.dao.IUserDAO;
import weiyi.dao.proxy.AdminDAOProxy;
import weiyi.dao.proxy.CustomDAOProxy;
import weiyi.dao.proxy.UserDAOProxy;  

public class DAOFactory{  
    public static IUserDAO getUser( ){  
        IUserDAO dao = null;  
        try{  
            dao = new UserDAOProxy();      
        }  
        catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao;  
    }  
    
    public static IAdminDAO getAdmin() {
    	 IAdminDAO dao = null;  
         try{  
             dao = new AdminDAOProxy();      
         }  
         catch(Exception e){  
             e.printStackTrace();  
         }  
         return dao; 
    }
    
    public static ICustomDAO getCustom() {
    	ICustomDAO dao = null;  
        try{  
            dao = new CustomDAOProxy();      
        }  
        catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao; 
    }
}  
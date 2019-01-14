package weiyi.dao.factory;

import weiyi.dao.IAdminDAO;
import weiyi.dao.ICustomDAO;
import weiyi.dao.IEvaluationRecordDAO;
import weiyi.dao.IFeedbackDAO;
import weiyi.dao.IPcPartsDAO;
import weiyi.dao.IRepairOrdersDAO;
import weiyi.dao.IRepairReceiptDAO;
import weiyi.dao.proxy.AdminDAOProxy;
import weiyi.dao.proxy.CustomDAOProxy;
import weiyi.dao.proxy.EvaluationRecordDAOProxy;
import weiyi.dao.proxy.FeedbackDAOProxy;
import weiyi.dao.proxy.PcPartsDAOProxy;
import weiyi.dao.proxy.RepairOrdersDAOProxy;
import weiyi.dao.proxy.RepairReceiptDAOProxy;

public class DAOFactory{  
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
    
    public static IRepairOrdersDAO getRepairOrders() {
    	IRepairOrdersDAO dao=null;
    	try {
    		dao=new RepairOrdersDAOProxy();
    	}catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao; 
    }
    
    public static IEvaluationRecordDAO getEvaluationRecord() {
    	IEvaluationRecordDAO dao=null;
    	try {
    		dao=new EvaluationRecordDAOProxy();
    	}catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao; 
    }
    
    public static IRepairReceiptDAO getRepairReceipt() {
    	IRepairReceiptDAO dao=null;
    	try {
    		dao=new RepairReceiptDAOProxy();
    	}catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao;
    }
    
    public static IFeedbackDAO getFeedback() {
    	IFeedbackDAO dao=null;
    	try {
    		dao=new FeedbackDAOProxy();
    	}catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao;
    }
    
    public static IPcPartsDAO getPcParts() {
    	IPcPartsDAO dao=null;
    	try {
    		dao=new PcPartsDAOProxy();
    	}catch(Exception e){  
            e.printStackTrace();  
        }  
        return dao;
    }
}  
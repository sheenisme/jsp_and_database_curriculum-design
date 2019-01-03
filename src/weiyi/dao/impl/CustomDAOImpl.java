package weiyi.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import weiyi.dao.ICustomDAO;
import weiyi.dao.vo.Custom;

public class CustomDAOImpl implements ICustomDAO{
	private Connection con;  
    private PreparedStatement stat = null;
	
	public CustomDAOImpl(Connection con) {
    	this.con=con;
	}
	
	@Override
	public int doCreate(Custom vo) throws Exception {
		String sql = "insert into custom values(?,?,?,?,?,?,?,?,?,?,?) ";  
        stat = con.prepareStatement(sql);   
        //这里是自增的，不用写该语句stat.setInt(1, vo.getId());  
        stat.setString(1, vo.getLoginName());  
        stat.setString(2, vo.getPassword());  
        stat.setString(3, vo.getName());
        stat.setString(4, vo.getEmail());
        stat.setString(5, vo.getPhone());
        stat.setString(6, vo.getAddress());
        stat.setDate(7, vo.getBirthday());
        stat.setDate(8, vo.getDate());
        stat.setString(9, vo.getPoint());
        stat.setString(10, vo.getUnit());
        stat.setString(11, vo.getRemark());
        int update = stat.executeUpdate();  
        if(update>0){  
            return update;  
        }  
        else{  
        	System.out.println("插入失败！-CustomDAOImp.doCreate()方法");
            return -1;  
        } 
	}

	@Override
	public List<Custom> findAll() throws Exception {
		String sql = "select * from custom";  
        stat = con.prepareStatement(sql);  
        ResultSet rs = stat.executeQuery();  
        Custom vo=null;
        List<Custom> list = new ArrayList<Custom>();  
        while(rs.next()){
            //获取属性并将属性写至vo对象中
            vo=new Custom();  
            vo.setId(rs.getInt(1));
            vo.setLoginName(rs.getString(2));
            vo.setPassword(rs.getString(3));
            vo.setName(rs.getString(4));
            vo.setEmail(rs.getString(5));
            vo.setPhone(rs.getString(6));
            vo.setAddress(rs.getString(7));
            vo.setBirthday(rs.getDate(8));
            vo.setDate(rs.getDate(9));
            vo.setPoint(rs.getString(10));
            vo.setUnit(rs.getString(11));
            vo.setRemark(rs.getString(12));
            list.add(vo);  
        }  
        return list;
	}

	@Override
	public Custom findById(Integer id) throws Exception {
		 String sql = "select * from custom where id= ? ";  
	     stat = con.prepareStatement(sql);  
	     stat.setInt(1,id);  
	     ResultSet rs = stat.executeQuery();  
	     Custom vo=null;
	     if(rs.next()){   
	       	vo=new Custom();  
	        vo.setId(id);
	        vo.setLoginName(rs.getString(1));
            vo.setPassword(rs.getString(2));
            vo.setName(rs.getString(3));
            vo.setEmail(rs.getString(4));
            vo.setPhone(rs.getString(5));
            vo.setAddress(rs.getString(6));
            vo.setBirthday(rs.getDate(7));
            vo.setDate(rs.getDate(8));
            vo.setPoint(rs.getString(9));
            vo.setUnit(rs.getString(10));
            vo.setRemark(rs.getString(11));
	    }    
		return vo;
	}

	@Override
	public int doRemove(Integer id) throws Exception {
		String sql = "delete from custom where id= ? ";
		stat = con.prepareStatement(sql); 
		stat.setInt(1,id);
		int delete=stat.executeUpdate();
		if (delete > 0) {
			return delete;
		}else {
			System.out.println("删除失败！-CustomDAOImpl.doRemove()方法");
			return -1;
		}
	}

	@Override
	public int doUpdate(Custom vo) throws Exception {
		String sql = "update custom set loginname=?,password=?,name=?，email=?,phone=?,address=?,birthday=?,date=?,point=?,unit=?,remark=? where id=?";  
        stat = con.prepareStatement(sql);     
        stat.setString(1, vo.getLoginName());  
        stat.setString(2, vo.getPassword());  
        stat.setString(3, vo.getName());
        stat.setString(4, vo.getEmail());
        stat.setString(5, vo.getPhone());
        stat.setString(6, vo.getAddress());
        stat.setDate(7, vo.getBirthday());
        stat.setDate(8, vo.getDate());
        stat.setString(9, vo.getPoint());
        stat.setString(10, vo.getUnit());
        stat.setString(11, vo.getRemark());
        int update=stat.executeUpdate();
        if(update>0) {
        	return update;
        }else{
        	System.out.println("更新失败！-CustomDAOImpl.doUpdate()方法");
        	return -1;
        }
	}

	@Override
	public List<Custom> findByName(String name) throws Exception {
		List<Custom> list = new ArrayList<Custom>();
		String sql = "select id from custom where loginname=? ";  
        stat = con.prepareStatement(sql);  
        stat.setString(1,name);  
        ResultSet rs = stat.executeQuery(); 
        Custom vo=null;
        if(rs.next()){      	
        	vo=new Custom();
        	vo=this.findById(rs.getInt(1));
           	list.add(vo);
        }  
        return list;
	}

	@Override
	public List<Custom> findByEmail(String email) throws Exception {
		List<Custom> list = new ArrayList<Custom>();
		String sql = "select id from custom where email=? ";  
        stat = con.prepareStatement(sql);  
        stat.setString(1,email);  
        ResultSet rs = stat.executeQuery(); 
        Custom vo=null;
        if(rs.next()){      	
        	vo=new Custom();
        	vo=this.findById(rs.getInt(1));
           	list.add(vo);
        }  
        return list;
	}
	
}

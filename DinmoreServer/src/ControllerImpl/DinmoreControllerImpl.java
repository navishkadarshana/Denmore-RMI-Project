/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerImpl;

import Controller.DenmoreController;
import Modul.CommonDetail;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author navis
 */
public class DinmoreControllerImpl extends UnicastRemoteObject implements DenmoreController{

    public DinmoreControllerImpl() throws RemoteException{
    }
    
    LinkedList<CommonDetail> oreders= new LinkedList<>();
    private static int inc=0;


    @Override
    public void setOrder(CommonDetail commonDetail) throws RemoteException {
       
       oreders.add(commonDetail);
       System.out.println(commonDetail);
       
    }

    @Override
    public CommonDetail getOrder() throws RemoteException {
     
        return oreders.getFirst();
        
       
        
    }

    @Override
    public void RemoveOrder() throws RemoteException {
        oreders.removeFirst();
         
    }

    

  

    @Override
    public Long generateOrderId() throws RemoteException{
    
   long id=Long.parseLong(String.valueOf(System.currentTimeMillis())
   .substring(1,10).concat(String.valueOf(inc)));
   inc=(inc+1)%10;
   return id;
       
        
    }

  /*  @Override
    public boolean addOrder(CommonDetail commonDetail) throws RemoteException,SQLException,ClassNotFoundException{
        
        Connection connection = DBConnection.getnstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Orders Values(?,?,?,?,?,?,?,?.?)");
        stm.setObject(1, commonDetail.getOid());
        stm.setObject(2, commonDetail.getChefId());
        stm.setObject(3, commonDetail.getTid());
        stm.setObject(4, commonDetail.getCustomerName());
        stm.setObject(5, commonDetail.getTelephone());
        stm.setObject(6, commonDetail.getQty());
        stm.setObject(7, commonDetail.getTimeDuration());
        stm.setObject(8, commonDetail.getDate());
        stm.setObject(9, commonDetail.getTime());
        
       
        return stm.executeUpdate()>0;
        
    }*/

  
  }

   

    
    
    
   
      
       
  

   


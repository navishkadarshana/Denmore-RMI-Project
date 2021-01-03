/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Modul.CommonDetail;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author navis
 */
public interface DenmoreController extends Remote{
    
    public void setOrder(CommonDetail commonDetail)throws RemoteException;
    public CommonDetail getOrder()throws RemoteException;
    public void RemoveOrder()throws RemoteException;
    public  Long generateOrderId()throws RemoteException;
   // public ArrayList<> getChefID()throws RemoteException,SQLException,ClassNotFoundException;
   // public  boolean addOrder(CommonDetail commonDetail)throws RemoteException,SQLException,ClassNotFoundException;
    
}

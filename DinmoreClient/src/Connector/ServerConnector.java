/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;


import Controller.DenmoreController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author navis
 */
public class ServerConnector {
    private static ServerConnector serverConnector;
    private DenmoreController denmoreController;
            
    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException{
        denmoreController=(DenmoreController) Naming.lookup("rmi://localhost:5050/DinmoreServer");
    }
    public static ServerConnector getInstance() throws NotBoundException, MalformedURLException, RemoteException{
        if(serverConnector==null){
            serverConnector=new ServerConnector();
        }
        return serverConnector;
    }
    public DenmoreController getConnection(){
        return denmoreController;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import ControllerImpl.DinmoreControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Niroth Samarawickram
 */
public class ServerStart {
    public static void main(String[] args) {
        try {
            Registry noteRegistry=LocateRegistry.createRegistry(5050);
            System.out.println("Starting server");
            noteRegistry.rebind("DinmoreServer", new DinmoreControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

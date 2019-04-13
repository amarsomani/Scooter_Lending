package forms;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SecurityLogin extends UnicastRemoteObject implements LoginInterface{
    SecurityLogin() throws RemoteException{
    }

    @Override
    public boolean checkLogin(String id, String password) throws RemoteException {
        if(id.equals("admin") && password.equals("admin"))
            return true;
        else
            return false;
    }
    
    
}

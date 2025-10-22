package DAO;

import java.util. List;

import Beans.Register;
import Beans.Tasks;

public interface tododao{

    public abstract int register(Register register);
    public abstract int login(String email, String pass); 
    public abstract boolean addTask(Tasks task, int regid); 
    public abstract List<Tasks> findAllTasksByRegId(int regid); 
    public abstract boolean markTaskCompleted(int taskid, int regid); 
    public String getFLNameByRegID(int regId);
}
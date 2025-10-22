package DAO;

import java.util.List;

import Beans.Register;
import Beans.Tasks;

public class tododaoimpl implements tododao {

  @Override
  public int register(Register register) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int login(String email, String pass) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean addTask(Tasks task, int regid) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<Tasks> findAllTasksByRegId(int regid) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean markTaskCompleted(int taskid, int regid) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String getFLNameByRegID(int regId) {
    // TODO Auto-generated method stub
    return null;
  }

}
package Beans;
import java.util.Objects;

public class Tasks {
  private int taskid;
  private String taskname;
  private String taskdate;
  private int taskstatus;
  private int rigid;
  public Tasks() {
    super();
    // TODO Auto-generated constructor stub
  }
  public Tasks(int taskid, String taskname, String taskdate, int taskstatus, int rigid) {
    super();
    this.taskid = taskid;
    this.taskname = taskname;
    this.taskdate = taskdate;
    this.taskstatus = taskstatus;
    this.rigid = rigid;
  }
  public int getTaskid() {
    return taskid;
  }
  public void setTaskid(int taskid) {
    this.taskid = taskid;
  }
  public String getTaskname() {
    return taskname;
  }
  public void setTaskname(String taskname) {
    this.taskname = taskname;
  }
  public String getTaskdate() {
    return taskdate;
  }
  public void setTaskdate(String taskdate) {
    this.taskdate = taskdate;
  }
  public int getTaskstatus() {
    return taskstatus;
  }
  public void setTaskstatus(int taskstatus) {
    this.taskstatus = taskstatus;
  }
  public int getRigid() {
    return rigid;
  }
  public void setRigid(int rigid) {
    this.rigid = rigid;
  }
}
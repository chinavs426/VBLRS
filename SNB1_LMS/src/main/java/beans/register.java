package beans;

public class register {

	private int regId;
	private String name;
	private String email;
	private String pass;
	private long mobile;
	private String address;
	private String roleName;
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public register(int regId, String name, String email, String pass, long mobile, String address, String roleName) {
		super();
		this.regId = regId;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
		this.address = address;
		this.roleName = roleName;
	}
	
}

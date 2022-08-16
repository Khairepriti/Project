package examsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class IdAndPassword{
	HashMap<String, String> logarr = new HashMap<String,String>();
	IdAndPassword(){
	logarr.put("Priti123", "p123");
	logarr.put("Khaire123", "k123");
	logarr.put("rakesh789", "r789");
	logarr.put("sharma456", "s456");
	System.out.println(logarr);
	}
 HashMap<String, String> getloginInfo(){
		return logarr;
}

public class Login implements ActionListener{

//	String username;
//	String password;
	HashMap<String, String> logarr = new HashMap<String,String>();
	public Login(HashMap<String, String> loging) {
		// TODO Auto-generated constructor stub
		logarr=loging;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	}
	
}

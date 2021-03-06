// Staff.java(model)
package model;

import java.io.Serializable;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Staff implements Serializable {
	
	private String mail; // メールアドレス
	private String pass; // パスワード
	private String name; // 名前
	
	public Staff() {}
	
	public Staff(String mail,String pass,String name) {
		this.mail = mail;
		this.pass = pass;
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[mail = "+this.mail+" / pass = "+this.pass+" / name = "+this.name+"]";
	}
	
	public boolean equals (Object a) {
		if (a == this) return true;
		if (a == null) return false;
		if (!(a instanceof Staff)) return false;
		return true;
	}
	
	public int hashCode() {
		int result = 37; // 適当な数字
		result = result * 31 + mail.hashCode();
		result = result * 31 + pass.hashCode();
		result = result * 31 + name.hashCode();
		return result;
	}
}

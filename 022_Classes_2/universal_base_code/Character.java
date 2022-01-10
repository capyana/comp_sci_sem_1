import pkg.*;
import java.util.Scanner;
import java.util.Random;

	public class Character{
	private String role;
	private int str;
	private int dex;
	private int intel;
	private int con;
	private int ch;
	
	public Character(){
		role= "Warrior";
		str=5;
		dex=5;
		intel=5;
		con=5;
		ch=5;
	}public String role(){
		return role;
	}
	public int str(){
		return str;
	}
	public int dex(){
		return dex;
	}
	public int intel(){
		return intel;#
	}
	public int con(){
		return con;
	}
	public int ch(){
		return ch;
	}
}

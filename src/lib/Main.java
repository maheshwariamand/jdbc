package lib;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection mycon=DriveManager.getConnection("jdbc.mysql://localhost:3306/mydatabase","root","root");
		}

	}

}

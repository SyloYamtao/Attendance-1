package model;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.TimeDAO;

public class PostLeavingLogic {

	// 退社
	public int execute(String mail,Date today) throws ClassNotFoundException,SQLException {
			
		SimpleDateFormat tdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
						
		String day = tdf.format(today);
		String admission = sdf.format(today);
		String leaving = sdf.format(today);
			
		Time time = new Time (mail,day,admission,leaving);
			
		TimeDAO dao = new TimeDAO();
		int error = dao.leaving(time);
		return error;
	}
}
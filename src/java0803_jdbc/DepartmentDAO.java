package java0803_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//DAO(Data Access Object) : 데이터 접근 객체

public class DepartmentDAO {
	Connection conn; //connection 값을 finally에서도 사용
	Statement stmt;
	ResultSet rs;
	
	public DepartmentDAO() {
		
	}
	
	public ArrayList<DepartmentDTO> listMethod(){
		ArrayList<DepartmentDTO> aList=new ArrayList<DepartmentDTO>();
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. 서버연결
			String url="jdbc:oracle:thin://@127.0.0.1:1521:xe"; //DB가 설치되어 있는 서버 주소
			String username="hr";
			String password="a1234";
			conn=DriverManager.getConnection(url, username, password);
			
			//3. 쿼리문을 실행하기 위해 Statement 타입의 객체를 리턴
			stmt=conn.createStatement();
			
			//4. 쿼리문을 실행한다
			String sql="select * from departments order by department_id";
			rs=stmt.executeQuery(sql);
			//resultset을 바로 넘겨주지 않는 이유는 .close때문이다
			//연결을 끊어버리기 때문에 rs는 null값이 됨
			//또한 rs만 따로빼는 것은 일의 분업화를 저해한다
			while(rs.next()){
				DepartmentDTO dto=new DepartmentDTO(); 
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
				
			}
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null){
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}//반드시 DB와 연결해놓은 것을 끊어준다
	
	
		}
		return aList;
	}
	
}//end class

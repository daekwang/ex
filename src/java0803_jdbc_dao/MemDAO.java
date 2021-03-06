package java0803_jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import java0803_jdbc_dto.MemDTO;

/*
 * java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 */

public class MemDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static MemDAO dao=new MemDAO();
	
	private MemDAO() {
		
	}
	
	public static MemDAO getInstance(){
		return dao;
	}//싱글톤 패턴 적용
	
	
	
	private Connection init() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username="hr";
		String password="a1234";
		conn=DriverManager.getConnection(url, username, password);
		
		return conn;
	}
	
	private void stop(){
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
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		}
	}
	public ArrayList<MemDTO> listMethod(){
		ArrayList<MemDTO> aList=new ArrayList<MemDTO>();
		
		try {
			conn=init();//Connection 리턴값을 메소드를 만들어서 처리
			stmt=conn.createStatement();
			String sql="select * from mem order by num";
			stmt.executeQuery(sql);
		
			rs=stmt.executeQuery(sql);
			
			
			while(rs.next()){
				MemDTO dto=new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
		
		
		return aList;
		
	}//end listMethod
	
	public ArrayList<MemDTO> listMethod(String data){
		ArrayList<MemDTO> aList=new ArrayList<MemDTO>();
		
		try {
			conn=init();//Connection 리턴값을 메소드를 만들어서 처리
			
			String sql="select * from mem where name like ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+data+"%");
		
			rs=pstmt.executeQuery();
			
			
			while(rs.next()){
				MemDTO dto=new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
		
		
		return aList;
		
	}//end listMethod
	

	public void insertMethod(MemDTO dto){
		try {
			conn=init();
/*			stmt=conn.createStatement();
			//insert 홑따옴표, 쌍따옴표 쓰는거 연습.
		    String sql="insert into mem(num, name, age, loc) values(mem_num_seq.nextval,'"+dto.getName()+"',"+dto.getAge()+",'"+dto.getLoc()+"')";//문자는홑따옴표
			//메소드,변수를 호출할때는 쌍따옴표가빠져야 되기 때문에 일일히 쌍따옴표로 묶어준다
			stmt.executeUpdate(sql);*/
			
			String sql="insert into mem(num, name, age, loc) values(mem_num_seq.nextval,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
		
	}//end insertMethod
	
	public int insertMethod(ArrayList<MemDTO> mdata){
		int cnt[] =null;
		try {
			conn=init();
/*			stmt=conn.createStatement();
			//insert 홑따옴표, 쌍따옴표 쓰는거 연습.
		    String sql="insert into mem(num, name, age, loc) values(mem_num_seq.nextval,'"+dto.getName()+"',"+dto.getAge()+",'"+dto.getLoc()+"')";//문자는홑따옴표
			//메소드,변수를 호출할때는 쌍따옴표가빠져야 되기 때문에 일일히 쌍따옴표로 묶어준다
			stmt.executeUpdate(sql);*/
			
			String sql="insert into mem(num, name, age, loc) values(mem_num_seq.nextval,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			
			for(int i=0; i<mdata.size(); i++){
				MemDTO dto=mdata.get(i);
				pstmt.setString(1, dto.getName());
				pstmt.setInt(2, dto.getAge());
				pstmt.setString(3, dto.getLoc());
				pstmt.addBatch();
			}
			cnt=pstmt.executeBatch();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
		return cnt.length;
	}//end insertMethod
	
	public void updateMethod(HashMap<String, Object> map){
		try {
			conn=init();
			String sql="update mem set name=? where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, (String)map.get("name"));
			pstmt.setInt(2, (Integer)map.get("num"));
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
		
	}
	
	public void deleteMethod(int num){
		try {
			conn=init();
			String sql="delete from mem where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stop();
		}
	}
	
	
	
}//end class

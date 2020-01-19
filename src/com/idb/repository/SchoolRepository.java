package com.idb.repository;

import com.idb.dbConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.idb.model.Student;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class SchoolRepository {

    private static SchoolRepository instance = new SchoolRepository();

    public static SchoolRepository getInstance() {
        return instance;
    }

    public void AddStudent(Student student) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //boolean successfullyInserted = false;

        try {
            conn = com.idb.dbConnection.DBConnection.getConnection();
            stmt = conn.prepareStatement("insert into Students values(?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, student.getClassNo());;
            stmt.setString(2, student.getRegNo());
            stmt.setString(3, student.getFirstName());
            stmt.setString(4, student.getLastName());
            stmt.setString(5, student.getGend());
            stmt.setString(6, student.getDateOfBirth());
            stmt.setString(7, student.getAddress());
            stmt.setInt(8, student.getAge());
            stmt.setInt(9, student.getPhone());
            stmt.setString(10, student.getEmail());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            com.idb.dbConnection.DBConnection.close(conn, stmt, rs);
        }
        //return successfullyInserted;
    }

    public List<Student> getStudents() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Student> stuList = null;
        try {
            con = DBConnection.getConnection();
            stmt = con.prepareStatement("select * from students");
            rs = stmt.executeQuery();
            stuList = getEmpListFromResultSet(rs);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(con, stmt, null);
        }
        return stuList;
    }

    private List<Student> getEmpListFromResultSet(ResultSet rs) throws SQLException, Exception {
        List<Student> stuList = new ArrayList<>();
        while (rs.next()) {
            Student stu = getEmployeeFromResultSet(rs);
            stuList.add(stu);
        }
        return stuList;
    }

    private Student getEmployeeFromResultSet(ResultSet rs) throws SQLException, Exception {
        Student stu = new Student();
        stu.setClassNo(rs.getString("ClassNo"));
        stu.setRegNo(rs.getString("RegNo"));
        stu.setFirstName(rs.getString("FirstName"));
        stu.setLastName(rs.getString("LastName"));
        stu.setGend(rs.getString("Gender"));
        stu.setDateOfBirth(rs.getString("DateOfBirth"));
        stu.setAddress(rs.getString("Address"));
        stu.setAge(rs.getInt("Age"));
        stu.setPhone(rs.getInt("Phone"));
        stu.setEmail(rs.getString("Email"));
        return stu;
    }

}

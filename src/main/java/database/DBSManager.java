package database;

import constants.Constants;
import entity.Discipline;
import entity.Semestr;
import entity.Semestr_Disc;
import entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class DBSManager {
    private static Connection conn;
    private static PreparedStatement createNewDisc;
    private static PreparedStatement deleteDisc;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            createNewDisc = conn.prepareStatement("INSERT INTO `discipline` (`discipline`) VALUES (?);");
            deleteDisc = conn.prepareStatement("UPDATE `discipline` SET `status` = '0' WHERE (`id` = ?);");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void createNewDisc(String disc) {
        try {
            createNewDisc.setString(1, disc);
            createNewDisc.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Discipline> getAllActiveDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM discipline where status = '1';");

            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
                disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;

    }

    public static void deleteDisc(String id) {
        id = id.replaceAll("'", "");
        try {

            deleteDisc.setString(1, id);
            deleteDisc.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modifyDisc(String id, String disc) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` = '" + disc + "' WHERE (`id` = '" + id + "');\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Discipline getDisciplineById(String id) {
        Discipline discipline = new Discipline();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM discipline where status = '1' AND id = " + id + ";");

            while (rs.next()) {
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discipline;

    }

    public static boolean isExistser(String login, String password, String role) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_role as ur\n" +
                    "left join user as u on ur.id_user = u.id\n" +
                    "where u.login = '" + login + "' and u.password = '" + password + "' and ur.id_role =" + role);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public static ArrayList<Student> getAllActiveStudents() {
        ArrayList<Student> students = new ArrayList<Student>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student where status = '1';");

            while (rs.next()) {

                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSername(rs.getString("sername"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void addNewStudent(String sSername , String sName , String sGroup , String sDate) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `student` (`sername`, `name`, `group`, `date`) VALUES ('"+sSername+"', '"+sName+"', '"+sGroup+"', '"+sDate+"');");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void deleteStudent (String id){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `student` SET `status` = '0' WHERE (`id` = "+id+");");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Student getStudentById(String id) {
        Student student = new Student();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student where status = '1' AND id = "+id+";");

            while (rs.next()) {

                student.setId(rs.getInt("id"));
                student.setSername(rs.getString("sername"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
    public static void ModifyStudent(String sSername , String sName , String sGroup , String sDate,String id) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `student` SET `sername` = '"+sSername+"', `name` = '"+sName+"', `group` = '"+sGroup+"', `date` = '"+sDate+"' WHERE (`id` = '"+id+"');");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Semestr> getAllActiveSemestr() {
        ArrayList<Semestr> semestr = new ArrayList<Semestr>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM semestr where status = '1'");

            while (rs.next()) {
                Semestr semestrs = new Semestr();
                semestrs.setId(rs.getInt("id"));
                semestrs.setName(rs.getString("name"));
                semestrs.setDuration(rs.getString("duration"));

                semestr.add(semestrs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return semestr;

    }

    public static ArrayList<Discipline> getDisciplinesBySemestrs(int idSemestr) {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM semestr_discipline\n" +
                    "left join discipline on semestr_discipline.id_discipline = discipline.id\n" +
                    " where semestr_discipline.id_semestr = "+idSemestr);

            while (rs.next()) {
               Discipline discipline = new Discipline();
               discipline.setId(rs.getInt("id_discipline"));
               discipline.setDiscipline(rs.getString("discipline"));
               disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;

    }

}

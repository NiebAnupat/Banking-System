package Main;

import java.sql.*;
import javax.swing.JOptionPane;
public class DB_Connection {

    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost:3306/banking system";
    private String username = "root";
    private String password = "";

    public void connectDB() throws SQLException {

        try {
            conn = DriverManager.getConnection(url,username,password);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error connecting to database");
        }

    }

    public void disconnect() throws SQLException {
        try {
            conn.close();

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error disconnecting");
        }

    }

    public ResultSet getResultSet (String query) throws SQLException {

        try{
            connectDB();
            st = conn.createStatement();
            rs = st.executeQuery(query);

        }catch (Exception ex){
            rs = null;
        }

        return rs;

    }

    public boolean execute (String query) throws SQLException {

        boolean rs;

        try{
            connectDB();
            st = conn.createStatement();
            st.execute(query);
            rs = true;

        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error : "+ex);
            rs = false;

        }
        disconnect();
        return rs;

    }

}

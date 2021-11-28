import java.sql.*;
import javax.swing.JOptionPane;
public class DB_Connection {

    protected Connection conn = null;
    protected Statement st = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;
    private String url = "jdbc:sqlite:C:\\Users\\niebz\\Desktop\\Project\\Banking-System\\DB\\Banking System.db";

    public void connectDB() throws SQLException {

        try {
            conn = DriverManager.getConnection(url);
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
        }finally {
            disconnect();
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

            rs = false;

        }finally{
            disconnect();
        }

        return rs;

    }

}

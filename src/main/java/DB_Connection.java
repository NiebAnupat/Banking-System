import java.sql.*;
public class DB_Connection {

    private Connection conn = null;
    private Statement st = null;
    private String url = "jdbc:sqlite:Banking System.db";

    public void connectDB() throws SQLException {

        try {
            conn = DriverManager.getConnection(url);
        }catch (SQLException ex){
            System.out.println("Cannot connected database");
        }

    }

    public void disconnect() throws SQLException {

        try {
            conn.close();
        }catch (SQLException ex){
            System.out.println("Cannot closed database");
        }

    }

    public ResultSet getResultSet (String query) throws SQLException {

        ResultSet rs;
        connectDB();

        try{

            st = conn.createStatement();
            rs = st.executeQuery(query);
            disconnect();

        }catch (Exception ex){
            rs = null;
        }

        return rs;

    }

    public boolean executeQuery (String query) throws SQLException {

        boolean rs;
        connectDB();

        try{

            st = conn.createStatement();
            st.execute(query);
            rs = true;

        }catch (Exception ex){

            rs = false;

        }

        return rs;

    }

}

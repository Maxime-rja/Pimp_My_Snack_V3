import java.sql.*;

public class Database {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/database_name";

    private static final String USER = "username";
    private static final String PASS = "password";


    /// Dans cet exemple, remplacer "database_name", "username" et "password" par les informations appropriées pour votre base de données.
    /// Il importe également de noter que vous devez ajouter la dépendance de votre driver JDBC
    /// (exemple : mysql-connector-java) dans votre projet pour que cela fonctionne.

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /// La fonction executeQuery(String sql) prend une requête SQL en tant que paramètre,
    ///  obtient une connexion à la base de données à l'aide de la méthode getConnection(), 
    /// crée un objet Statement à partir de la connexion, exécute la requête SQL en utilisant la méthode executeQuery(sql)
    /// de l'objet Statement, et retourne un objet ResultSet contenant le résultat de la requête.

    /// Vous pourriez également ajouter une fonction executeUpdate(String sql) pour exécuter les commandes SQL de mise à jour 
    /// telles que INSERT, UPDATE ou DELETE qui retourne un entier qui represente le nombre de lignes affectées par la requête.


    public static ResultSet executeQuery(String sql) {
        Connection conn = getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static int executeUpdate(String sql) {
        Connection conn = getConnection();
        Statement stmt = null;
        int result =0;
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

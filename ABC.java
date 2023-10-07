
package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ABC {


void conectar() {
    try {
        Class.forName("org.mariadb.jdbc.Driver");
        try {
            Connection conexion =DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/dani?user=abc&password=daniuwu11");
            //insert en tabla producto
        try(PreparedStatement statement =conexion.prepareStatement("""INSERT INTO producto(id_producto,nombre_producto)VALUES (?,?)""")){
            statement.setInt(1,1);
            statement.setString(2,"carne de cerdo");
            int rowsInserted = statement.executeUpdate();
}
        catch(SQLException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
}
        //update en tabla producto
        try(PreparedStatement statement =conexion.prepareStatement("""UPDATE producto set nombre_producto = ?where id = ?""")){
                statement.setString(1,"carne de res");
                statement.setInt(2,1);
                int rowsInserted = statement.executeUpdate();
}
        catch(SQLException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
}
        //delete en tabla producto
        try(PreparedStatement statement =conexion.prepareStatement("""DELETE from producto where id_producto = ?""")){
        statement.setInt(1,1);
        int rowsInserted = statement.executeUpdate();
}
        catch(SQLException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}       catch (SQLException e) {

        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}       catch (ClassNotFoundException e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
        }
  
    }
}
       

    

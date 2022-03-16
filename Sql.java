package aui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*Power shell script should run to get needed data 
 * 
 * https://docs.microsoft.com/en-us/sql/powershell/query-expressions-and-uniform-resource-names?view=sql-server-ver15
 * 
 * https://docs.microsoft.com/en-us/sql/powershell/sql-server-powershell?view=sql-server-ver15
 * 
 * https://docs.microsoft.com/en-us/analysis-services/multidimensional-models/mdx/mdx-query-the-basic-query?view=asallproducts-allversions
 * 
 * https://docs.microsoft.com/en-us/powershell/module/sqlserver/invoke-sqlcmd?view=sqlserver-ps
 * 
 * https://docs.microsoft.com/en-us/sql/powershell/run-windows-powershell-steps-in-sql-server-agent?view=sql-server-ver15
 */
public class Sql {

Request Current_Request= new Request();

Sql(){
	String connectionUrl =
            "jdbc:sqlserver://yourserver.database.windows.net:1433;"
            + "database=AdventureWorks;"
            + "user=yourusername@yourserver;"
            + "password=yourpassword;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "loginTimeout=30;";

    ResultSet resultSet = null;

    try (Connection connection = DriverManager.getConnection(connectionUrl);
            Statement statement = connection.createStatement();) {

        // Create and execute a SELECT SQL statement.
        String selectSql = "SELECT TOP 10 Title, FirstName, LastName from SalesLT.Customer";
        resultSet = statement.executeQuery(selectSql);

        // Print results from select statement
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
}
Request get_Latest_Submission()
{

	
return this.Current_Request;
}





}

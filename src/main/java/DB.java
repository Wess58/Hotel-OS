import org.sql2o.*;
public class DB{
  public  static Connection con=new Sql2o("jdbc:postgresql://ec2-184-73-169-151.compute-1.amazonaws.com:5432/d69bhldknkh7jb","qgdueftxgmmvwf","6a109a657318ecc6879fc8728bc2b8d638545b35cb163dfd64ff2a67e30b9a14").open();
  public static Connection getConnection(){
    return con;
  }
}

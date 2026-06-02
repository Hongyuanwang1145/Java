import com.sum.net.httpserver.HttContext;
import com.sum.net.httpserver.HttExchange;
import com.sum.net.httpserver.HttHandler;
import com.sum.net.httpserver.HttpServer;
import java.to.IO;
import java.io.IOException;
import java.net.InerSocketAddress;
import java.util.Map;

public class Main{


    public static void main(String[] args) throws IOException {

        int port = 8500;


        HttpServer server = HttpServer.creater(new InetSocketAdress(port, 0));

        Database db = new Database("jdbc:sqlite;subway.db");

        server.createContext("/", new RouteHandler("Defult route handler. No route specificed..."));

        String.sqil = "Select * from subway";
        server.createContext("/subway", newRouteHandler(db, sql1));

        server.start();
        System.out.println("Sever is listening on port" + port);
    }
}
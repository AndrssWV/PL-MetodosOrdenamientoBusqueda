import controllers.Controller;
import controllers.SearchMethods;
import controllers.SortingMethods;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        SortingMethods sorting = new SortingMethods();
        SearchMethods search = new SearchMethods();
        Controller controller = new Controller(view, sorting, search);
        controller.start();
    
    }
}

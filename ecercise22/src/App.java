
/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03C : Assignment - MVC
 * Due Date : 2019-6-16-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : this method has the method to run the application
 */

import  Controller.Controller;
import Model.Model;
import View.View;

class App
{

    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.showData();
    }
}

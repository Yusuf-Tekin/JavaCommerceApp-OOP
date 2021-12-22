package mainPackage;

import app.business.AddMoney;
import app.business.UserAccountConfirm;
import app.business.UserAccountIsConfirmed;
import app.business.UserLoggedInControl;
import app.entities.Product;
import app.entities.User;
import app.fakeApi.FakeApi;
import app.service.Login;
import app.service.ProductService;
import app.service.Register;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class  App {
    
    Register register;
    Login login;
    FakeApi api;
    ProductService productService;
    public App(){
        synchronized (this) {
            api = new FakeApi();
            register = new Register(api);
            login = new Login(api);
            productService = new ProductService(api);
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        
        App app = new App();
        ArrayList<User> users = app.register.getAllUsers();
        User user = new User("yusuf.tekinx", "deneme@gmail.com", "123456", "Yusuf", "Tekin");
        UserAccountConfirm.AccountConfirm(user);
        
        AddMoney.AddMoney(user, 55);
        System.err.println(user.getMoney());
        if(app.register.RegisterService(user).getIsResult()){
            System.out.println("Hesabınız Oluşturuldu");
        }
        if(!UserLoggedInControl.LoggedInControl(user)){
            if(app.login.LoginService(user.getUsername(), user.getPassword()).getIsResult()){
                System.out.println("Oturum Açıldı...");
            }
            else{
                System.err.println("Kullanıcı adı ya da parola hatalı...");
            }
        }
        
        
        if(!UserAccountIsConfirmed.isConfirmedControl(user)){
            JOptionPane.showMessageDialog(null, "Hesabınız onaylanmadı.Lütfen onaylayın!!","Uyarı",1);
        }
        
        
        Product bilgisayar = new Product("Dizüstü Bilgisayar", 1, 50, "");
        
        app.productService.addProduct(bilgisayar);
        
        bilgisayar.setProductName("Masaüstü Bilgisayar");
        app.productService.updateProduct(bilgisayar, bilgisayar.getId());

        System.err.println(app.productService.buyProduct(bilgisayar, user).getMessage());
    }
}

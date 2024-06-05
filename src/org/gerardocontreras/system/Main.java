package org.gerardocontreras.system;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.gerardocontreras.controller.FormCargoController;
import org.gerardocontreras.controller.FormCategoriaProductoController;
import org.gerardocontreras.controller.FormClienteController;
import org.gerardocontreras.controller.FormCompraController;
import org.gerardocontreras.controller.FormDetalleFacturaController;
import org.gerardocontreras.controller.FormDistribuidorController;
import org.gerardocontreras.controller.FormFacturaController;
import org.gerardocontreras.controller.FormUsuarioController;
import org.gerardocontreras.controller.LoginController;
import org.gerardocontreras.controller.MenuCargoController;
import org.gerardocontreras.controller.MenuCategoriaProductoController;
import org.gerardocontreras.controller.MenuClienteController;
import org.gerardocontreras.controller.MenuCompraController;
import org.gerardocontreras.controller.MenuDetalleCompraController;
import org.gerardocontreras.controller.MenuDetalleFacturaController;
import org.gerardocontreras.controller.MenuDistribuidorController;
import org.gerardocontreras.controller.MenuEmpleadoController;
import org.gerardocontreras.controller.MenuFacturaController;
import org.gerardocontreras.controller.MenuPrincipalController;
import org.gerardocontreras.controller.MenuProductoController;
import org.gerardocontreras.controller.MenuPromocionController;
import org.gerardocontreras.controller.MenuTicketSoporteController;

public class Main extends Application {
    private final String URLVIEW;
    private Stage stage;
    private Scene scene;

    public Main() {
        this.URLVIEW = "/org/gerardocontreras/view/";
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("Super Kinal S.A");
        loginView();
        stage.show();
    }
    
    public Initializable switchScene(String fxmlName, int width, int height) throws Exception{
        Initializable resultado = null;
        FXMLLoader loader = new FXMLLoader();
        
        InputStream file = Main.class.getResourceAsStream(URLVIEW + fxmlName);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(URLVIEW + fxmlName));
        
        scene = new Scene((AnchorPane)loader.load(file), width, height);
        stage.setScene(scene);
        stage.sizeToScene();
        
        resultado = (Initializable)loader.getController();
        
        return resultado;
    }
    
    public void menuPrincipalView(){
        try{
            MenuPrincipalController menuPrincipalView = (MenuPrincipalController)switchScene("MenuPrincipalView.fxml", 950, 700);
            menuPrincipalView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuClienteView(){
        try{
            MenuClienteController menuClienteView = (MenuClienteController)switchScene("MenuClienteView.fxml", 1200, 750);
            menuClienteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formClienteView(int op){
        try{
            FormClienteController formClienteView = (FormClienteController)switchScene("FormClienteView.fxml", 500, 750);
            formClienteView.setOp(op);
            formClienteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formFacturaView(int op){
        try{
            FormFacturaController formFacturaView = (FormFacturaController)switchScene("FormFacturaView.fxml", 500, 750);
            formFacturaView.setOp(op);
            formFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuTicketSoporteView(){
        try{
            MenuTicketSoporteController menuTicketSoporteView = (MenuTicketSoporteController)switchScene("MenuTicketSoporteView.fxml", 1200, 750);
            menuTicketSoporteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCargoView(){
        try{
            MenuCargoController menuCargoView = (MenuCargoController)switchScene("MenuCargoView.fxml", 1200, 750);
            menuCargoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCargoView(int op){
        try{
            FormCargoController formCargoView = (FormCargoController)switchScene("FormCargoView.fxml", 500, 750);
            formCargoView.setOp(op);
            formCargoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void menuCompraView(){
        try{
            MenuCompraController menuCompraView = (MenuCompraController)switchScene("MenuCompraView.fxml", 1200, 750);
            menuCompraView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCompraView(int op){
        try{
            FormCompraController formCompraView = (FormCompraController)switchScene("FormCompraView.fxml", 500, 750);
            formCompraView.setOp(op);
            formCompraView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuDistribuidorView(){
        try{
            MenuDistribuidorController menuDistribuidorView = (MenuDistribuidorController)switchScene("MenuDistribuidorView.fxml", 1200, 750);
            menuDistribuidorView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formDistribuidorView(int op){
        try{
            FormDistribuidorController formDistribuidorView = (FormDistribuidorController)switchScene("FormDistribuidorView.fxml", 500, 750);
            formDistribuidorView.setOp(op);
            formDistribuidorView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCategoriaProductoView(){
        try{
            MenuCategoriaProductoController menuCategoriaProductoView = (MenuCategoriaProductoController)switchScene("MenuCategoriaProductoView.fxml", 1200, 750);
            menuCategoriaProductoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCategoriaProductoView(int op){
        try{
            FormCategoriaProductoController formCategoriaProductoView = (FormCategoriaProductoController)switchScene("FormCategoriaProductoView.fxml", 500, 750);
            formCategoriaProductoView.setOp(op);
            formCategoriaProductoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuEmpleadoView(int op){
        try{
            MenuEmpleadoController menuEmpleadoView = (MenuEmpleadoController)switchScene("MenuEmpleadoView.fxml", 1200, 750);
            menuEmpleadoView.setOp(op);
            menuEmpleadoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuFacturaView(){
        try{
            MenuFacturaController menuFacturaView = (MenuFacturaController)switchScene("MenuFacturaView.fxml", 1200, 750);
            menuFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     public void formDetalleFacturaView(int op){
        try{
            FormDetalleFacturaController formDetalleFacturaView = (FormDetalleFacturaController)switchScene("FormDetalleFacturaView.fxml", 500, 750);
            formDetalleFacturaView.setOp(op);
            formDetalleFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuProductoView(){
        try{
            MenuProductoController menuProductoView = (MenuProductoController)switchScene("MenuProductoView.fxml", 1200, 750);
            menuProductoView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuPromocionView(){
        try{
            MenuPromocionController menuPromocionView = (MenuPromocionController)switchScene("MenuPromocionView.fxml", 1200, 750);
            menuPromocionView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuDetalleFacturaView(){
        try{
            MenuDetalleFacturaController menuDetalleFacturaView = (MenuDetalleFacturaController)switchScene("MenuDetalleFacturaView.fxml", 1200, 750);
            menuDetalleFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuDetalleCompraView(){
        try{
            MenuDetalleCompraController menuDetalleCompraView = (MenuDetalleCompraController)switchScene("MenuDetalleCompraView.fxml", 1200, 750);
            menuDetalleCompraView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formUsuarioView(){
        try{
            FormUsuarioController formUsuarioView = (FormUsuarioController)switchScene("FormUsuarioView.fxml", 500, 750);
            formUsuarioView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void loginView(){
        try{
            LoginController loginView = (LoginController)switchScene("LoginView.fxml", 500, 750);
            loginView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
  
}

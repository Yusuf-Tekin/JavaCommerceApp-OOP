package app.service;

import app.core.Result;
import app.fakeApi.FakeApi;

public class Login implements ILogin{
    
    private String username;
    private String password;
    private FakeApi api;

    public Login(FakeApi api) {
        this.api = api;
    }
    
    @Override
    public Result LoginService(String username, String password) {
        return api.LoginRequest(username, password);
    }

    @Override
    public Result isLoggedInAUser(String username) {
        return api.UserLoggedInControl(username);
    }
    



}

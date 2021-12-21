/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.core;

/**
 *
 * @author Administrator
 */
public class Result {
    private String message;
    private boolean isResult;
    
    public Result(String message,boolean isResult) {
        this.message = message;
        this.isResult = isResult;
    }
    
    public Result(boolean isResult){
        this.message = "";
        this.isResult = isResult;
    }

    public String getMessage() {
        return message;
    }

    public boolean getIsResult() {
        return isResult;
    }
    
    
}

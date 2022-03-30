package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String mailInput) {
        System.out.println(mailInput);
        while (mailInput.contains("@")){
            if(mailInput.contains(".dk") || mailInput.contains(".com")){
                return true;
            }else{
                System.out.println();
                return false;
            }
        }

        return false;
    }
}

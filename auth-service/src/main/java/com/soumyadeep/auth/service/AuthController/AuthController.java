package com.soumyadeep.auth.service.AuthController;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumyadeep.auth.service.AuthModels.OtpRequestBody;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @PostMapping("/sendOTP")
    public ResponseEntity<String> sendOTP(@Valid @RequestBody OtpRequestBody requestBody){
        
        return ResponseEntity.ok("OTP SENT");
    }

    @GetMapping("/getOTP")
    public String getOTP(){
        return "ss";
    }
    
}

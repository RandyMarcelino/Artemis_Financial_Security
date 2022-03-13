package com.snhu.sslserver;

import java.security.MessageDigest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class SslServerController{     
	@RequestMapping("/hash")
    public String myHash() throws Exception{
        //Creating the MessageDigest object
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	
        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();
    	
    	String data = "Randy Marcelino";

        //Passing data to the created MessageDigest Object
        md.update(data.getBytes());
        
        //Compute the message digest
        byte[] digest = md.digest();
        
        for (int i = 0;i<digest.length;i++) {
           hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        
        return "<p>data: "+data+"</p><p>Name of Cipher Algorithm Used: AES CheckSum Value: "+hexString;
    }
}
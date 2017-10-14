/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Sumanth
 */
public class PasswordEncryption {
    private PasswordEncryption instance;


  public String encrypt(String plaintext)
  {
    MessageDigest md = null;
    try
    {
      md = MessageDigest.getInstance("SHA"); 
    }
    catch(Exception e)
    {
        System.out.println("Error in Password");
    }
    try
    {
      md.update(plaintext.getBytes("UTF-8")); 
    }
    catch(Exception e)
    {
        System.out.println("Error in Password");
    }

    byte raw[] = md.digest(); 
    String hash = (new BASE64Encoder()).encode(raw); 
    return hash; 
  }
  
  public  synchronized PasswordEncryption getInstance() 
  {
    if(instance == null)
    {
       instance = new PasswordEncryption(); 
    } 
    return instance;
  }
}

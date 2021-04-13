/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypt;
import static com.sun.xml.internal.messaging.saaj.util.Base64.base64Decode;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair; 
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Scanner;
 
import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author anton
 */
public class RSAImplement {
    private static final String RSA
        = "RSA";
    private static Scanner sc;
    // Generating public & private keys
    // using RSA algorithm.
    public static KeyPair generateRSAKkeyPair()
        throws Exception
    {
        SecureRandom secureRandom
            = new SecureRandom();
        KeyPairGenerator keyPairGenerator
            = KeyPairGenerator.getInstance(RSA);
 
        keyPairGenerator.initialize(
            2048, secureRandom);
        return keyPairGenerator
            .generateKeyPair();
    }
 
    // Encryption function which converts
    // the plainText into a cipherText
    // using private Key.
    public static byte[] do_RSAEncryption(
        String plainText,
        PrivateKey privateKey)
        throws Exception
    {
        Cipher cipher
            = Cipher.getInstance(RSA);
 
        cipher.init(
            Cipher.ENCRYPT_MODE, privateKey);
 
        return cipher.doFinal(
            plainText.getBytes());
    }
 
    // Decryption function which converts
    // the ciphertext back to the
    // orginal plaintext.
    public static String do_RSADecryption(
        byte[] cipherText,
        PublicKey publicKey)
        throws Exception
    {
        Cipher cipher
            = Cipher.getInstance(RSA);
 
        cipher.init(Cipher.DECRYPT_MODE,
                    publicKey);
        byte[] result
            = cipher.doFinal(cipherText);
 
        return new String(result);
    }
 




}

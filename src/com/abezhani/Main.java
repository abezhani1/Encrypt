package com.abezhani;

import java.util.ArrayList;

public class Main
{
    //private final static FileOutput outFile = new FileOutput("CipherOutput.txt");
    //private final static FileInput inFile = new FileInput("CipherSample.txt");

    public static void main(String[] args)
    {
        //char alphabet;
        //char cipher;
        FileInput indata = new FileInput("EncryptInput.txt");
        FileOutput outFile = new FileOutput("EncryptOutput.txt");
        String line;
        String newLine;
        char key = 'A';
        while ((line = indata.fileReadLine()) != null)
        {
            char letters[] = line.toCharArray();

            for(int i = 0; i < letters.length; i++)
            {
                //Cypher
                //letters[i] = (char)((int)letters[i] + 6);
                //Encryption
                letters[i] = (char)((int)letters[i] ^ (int)key);
            }
            outFile.fileWrite(new String(letters));
        }
        indata.fileClose();
        outFile.fileClose();

        indata = new FileInput("EncryptOutput.txt");
        while ((line = indata.fileReadLine()) != null)
        {
            char letters[] = line.toCharArray();

            for(int i = 0; i < letters.length; i++)
            {
                //Cypher
                //letters[i] = (char)((int)letters[i] - 6);
                //Encryption
                letters[i] = (char)((int)letters[i] ^ (int)key);
            }
            System.out.println(new String(letters));
        }
        indata.fileClose();

    }
}

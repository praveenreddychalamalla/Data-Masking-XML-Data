package com.datamasking.services;

import org.springframework.web.multipart.MultipartFile;

public class MultipartFileToStringService {
    String convert(MultipartFile file)
    {
        try {
            byte[] bytes = file.getBytes();
            String xmlString = new String(bytes);
            return xmlString;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return "ERROR";
    }
}

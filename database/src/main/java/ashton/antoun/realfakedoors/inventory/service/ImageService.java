package ashton.antoun.realfakedoors.inventory.service;


import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ImageService {

    private Map<String, String> imageRepo;

    @Autowired
    public ImageService(){
        this.imageRepo = new HashMap<String, String>();
        this.imageRepo.put("1", "/assets/1.jpg");
        this.imageRepo.put("2", "/assets/2.jpg");
        this.imageRepo.put("3", "/assets/3.jpg");
        this.imageRepo.put("4", "/assets/4.jpg");
        this.imageRepo.put("5", "/assets/5.jpg");
        this.imageRepo.put("6", "/assets/6.jpg");
        this.imageRepo.put("7", "/assets/7.jpg");
        this.imageRepo.put("8", "/assets/8.jpg");
        this.imageRepo.put("9", "/assets/9.jpg");
        this.imageRepo.put("10", "/assets/10.jpg");
        this.imageRepo.put("11", "/assets/11.jpg");
        this.imageRepo.put("12", "/assets/12.jpg");
        this.imageRepo.put("13", "/assets/13.jpg");
        this.imageRepo.put("14", "/assets/14.jpg");
        this.imageRepo.put("15", "/assets/15.jpg");
    }


    public byte[] getImageAsStream(String id)throws IOException {
        String filename = imageRepo.get(id);
        InputStream in = getClass().getResourceAsStream(filename);
        return IOUtils.toByteArray(in);
    }
}

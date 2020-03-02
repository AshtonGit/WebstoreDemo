package ashton.antoun.realfakedoors.inventory.api;

import ashton.antoun.realfakedoors.inventory.service.ImageService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("api/v1/image")
@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping(value="/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImage(@PathVariable("id") String id) throws IOException {
        return this.imageService.getImageAsStream(id);
    }






}

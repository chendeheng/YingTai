package com.cdh.api;

import com.cdh.service.UploadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author chendeheng   下午4:09 2018/2/6
 */
@RestController
@RequestMapping("upload")
public class UploadImageApi {

    @Autowired
    private UploadImageService uploadImageService;


    @PostMapping("image")
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        return uploadImageService.doUploadImage(file);
    }

}

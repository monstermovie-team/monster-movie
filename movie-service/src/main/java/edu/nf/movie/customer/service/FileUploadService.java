package edu.nf.movie.customer.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-11
 */
public interface FileUploadService {

    String fileUpload(MultipartFile file);
}

package edu.nf.movie.customer.service.impl;

import edu.nf.movie.customer.service.FileUploadService;
import edu.nf.movie.customer.service.exception.FileUploadException;
import edu.nf.movie.util.FtpUtil;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-11
 */
@Service("fileUploadService")
@Transactional(rollbackFor = RuntimeException.class)
public class FileUploadServiceImpl implements FileUploadService{
    @Override
    public String fileUpload(MultipartFile file){
        String fileName = file.getOriginalFilename();//获取文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));//获取文件的后缀名
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            throw new FileUploadException("服务器出错，请稍后重试");
        }
        String filePath = null;
        Boolean flag = FtpUtil.uploadFile(fileName, inputStream);//主要就是这里实现了ftp的文件上传
        if (flag == true) {
            //log.info("上传文件成功!");
            filePath = "http://101.37.28.124:8080"+FtpUtil.FTP_BASEPATH + fileName + "." +suffixName;
        }else{
            throw new FileUploadException("上传失败，请稍后重试");
        }
        return filePath;
    }
}

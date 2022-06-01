package com.middle.advanced.common.model.template.upload;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public abstract class AbstractWordUpload {

    public String wordExchangePdf(MultipartFile file) {
        String ex = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
        InputStream in = writeWord(file);
        InputStream pdfIn = toPDF(in);
        MultipartFile filePdf = exchange(ex, pdfIn);
        return upload(filePdf);
    }


    public abstract InputStream writeWord(MultipartFile file);

    public abstract InputStream toPDF(InputStream in);

    public abstract String upload(MultipartFile file);

    public MultipartFile exchange(String ex, InputStream in) {
        StringBuffer fileName = new StringBuffer(UUID.randomUUID().toString().replace("-", "")).append(ex);
        try {
            return new MockMultipartFile(fileName.toString(), fileName.toString(), "", in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

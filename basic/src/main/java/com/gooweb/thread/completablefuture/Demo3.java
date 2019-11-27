package com.gooweb.thread.completablefuture;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

/**
 * @author sunteng
 * @create 2019-09-08 下午 4:32
 **/
@Slf4j
public class Demo3 {

//    public static void main(String[] args) {
//        CompletableFuture<String> futrue = CompletableFuture.supplyAsync(()->{
//            try(InputStream is = new URL("http://www.baidu.com").openStream()){
//                log.info("Downloading");
//                return IOUtils.toString(is, StandardCharsets.UTF_8.toString());
//            } catch (IOException e){
//                throw new RuntimeException(e);
//            }
//
//        });
//    }
}

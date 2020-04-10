package edu.nf.movie.store.pcweb.config;

import org.springframework.context.annotation.Configuration;


import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yx
 * @date 2020/4/9 22:36
 */
@Configuration
public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102300747254";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCu0McRogVwXI+K1DgdqPpdwWM3OoyvUCJA3FHuTXpdgHXJ+HLcIJVDSWHh7jssL1HgwRdtYNciJ4VE93f7dxEwPZCqQVsfI7/1RZyQRNZ64ZR6KacdXvTd4LDaP2d3anOn6ih6mwKHyFOKEqd5ZYtxSwPDjWrXwClxhcMDs9uxbzipkKP5vrykiN50cidDqU3wvbPwAef7zGi116RmJc47tjE1QpzAHtZ9YIb5xON0u/raTBLXWlcRZ00b5OjjAEWA7q63a6zrWRMW9j6Ta6c0EFM42N+L7jAIrCtJraVqZa15MeFzuILluDAGRbZsRmCADrYiks3znXyzTwd6iLu3AgMBAAECggEAIA9T4sz2+GNRQ+GlpPLfb6BOxMstD92/WmvNbsmwvkMX1wGEdxBWr29ezyN0oKbQ+koPNNUEv1PGIh7MV0a/1TwFMuQnhO92fdHVY7PsLb7/DuRirIVEnQhfBreIDyNrsIjGAa456ZL4lyLSqfXQe+eI+i0OQiEQuKwSVrR+fuybExIZul9I5pKT07XOU5S8IfLioSTTPE1z24CAu6ojtjhKRz4lqEAuuzfQRTgnI7bFfesrgQAVLw3toRlC4PIpjpZgFvy2/6RH0Yx6ylt8LxJh1yNT+m8X/hIu2FbyyS4NmlD/6l2U1M3dIFhKxFrKV7ZTYExEg9WACDAjwwBNGQKBgQD7d3kD5h0EJiA/LljHMNzYxIiYv+eC8j5pE6fUJ2Hjh/NOgUA+ADQGpyUFVmLdW4NENdywyGb11vsgKu1y71xrruCFnfDJs2OTCSGsGl6G+IbfPqEqA6hZANBOApNUtMOLQpHTi2YkNdaRIGkxHsfhJ3pnx5754g7SOJjt+QBzWwKBgQCx946m3Hcogu9wr3niDoQhXY7qEgS0HruuzXBISUTK79N9F7mXa2Hrbr9RvBTZApT6nbC4oz9UjVF4+vVfteRACu08/FM06pJRxgtY96Z4uHfnbnegc2XNNUQQV9PPlqrJMccBoZM+iaev7uIvHFgUU3l3eLcxQJCxN3b9bhsT1QKBgHNXPV6Ycb6xbiEMtRPIScPzgWPuwdXCHvY7WcNpvPCMLwFXL4xAs5xJliV4lihKDU+AFRXRFci1LsJ2bitFtvJ9Z+Zhp0wcyBNtINC715e47sP/ChUnUFRilyjw7Xrw3rBFfHW3fsYlG6G9aAJrx+pyHSb03Opo0buC0kJ078v5AoGAFTxA3VA5N7BH+d42YO7yfTi4sN1tikCQjI8e8sErYDu1tJt8HcFGcd1JHuueYTaZqD3gtGdmSySBsDnhxYXisnGbVUeWdh33T6KeAAOs7YK1a/wWciLS5uWQNZMFRyPnRRKXeG5bL38lbyzF+HEdYW+EcukIkuvtV/gSTrMwr/ECgYAoZZPpm5VqcIRGXkSX/wERtONjx6Q+4ZJQW5JfWsd2LTmfuq/ypeXugkke+9YPninmBn1RHT1Ihzs5SUGVuzEVSEQxcwFD4MCtQJKT9wrB7bY/r5QlWE8RMu3WOTtdrn3/4POYOEX3EYyMPGFDQZyBB0DcbJEtBqz6n4owF9X2Kw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi5K3j3K+45qDxveh3RlytyemPkptOGocrGpBpVFDwXqbgfqbS7WkZfhMgSYopPVQzj/ATaLcUKygBenG+9U0MIqVEEx2eBNnd+PPmtwvs80aLnnR1p6pFaxuUm5YygL+vsUSVG2StGBkFgEueBq7SLidvTyetfZfzUAhSYaAShE3TLhFP98h4wiK4q9DfR9FAOEsD98ev6dzePObmo8898kgElpHa7+pJS1AhdZph5f7Df2x//KK7p7WjKsTGxWk4DpamZmrQL/Nxf4Zrd/sEX/K69TJjBsBq3Y+3BOkQJG1djBmXnAaN5HBOecuDzxfA0ZFmYlck9JrwcBjDs4sXQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String notify_url = "http://openapi.alipay.com/gateway.do";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String return_url = "http://localhost:8080/monster-movie/index.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    public static String format="json";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";



//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
//    public static void logResult(String sWord) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
//            writer.write(sWord);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}

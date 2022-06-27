package com.example.demo.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ：楼兰
 * @date ：Created in 2021/1/19
 * @description:
 **/

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116694736";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCUgBRuhkPirVtwSbX/LZjQis0y6aqlHQ1Y9Q6kdtpTQ3HQGV46tKOf2Qk0ingEztpYPlIMCHgYYDMD6Vf3FhP/BunE+CEqKefhLRjO1+xZiEnKojGfnv2Ikbx/RVpjxGCqtpNDyA2CfM6h4TFspeWUCxAoMLnKJPFdpXDKTmAjdC0UHhhWOygXlK6nveenvx5YEWoAx/lYsfFYy9vg9HjKl/8KhystTridSAxeWXu2ZzvY2y8nBP96FHeWoszsAFxCH5lS0C5PzyQuvbL7W1rTGCPEl4ENFSJn+VP5eX83H+dyFjTD0YPXhnWNP/R8RV+QZlqImFbKfk3AgySQa2CJAgMBAAECggEAEzlRa81t1FZk0/B24wXgFn8heUnOkXllVPLEZn4MXWMJxMrD7A2ecP8Dtg2G4/hzQ6EttekSwvURJZx7ir0M8aLPeHQ2tuKd5gSUhZJmQmDmTJkam3NVluxm3oL35JpzeSYRgmDPfujxRvuEDnCbe8LC4LEOHCEULe9Q3p+uymf5NTfSVk8G1wdS0QPIoqjg/KHUW67JJH4v/fDQdcthVqIcIvLP2s5+38wJnyIGrexVDA2CK1ctN2UP2KizJhN6ulq4LGxDiW8YuQZ2KaPOaByYXbogGhM+IrrecUAiJoEs/77iZRXybiFExLG5sO15e8Y/V0aJFp7PSLvcLqF4AQKBgQDMELCL2QpxQ7Cm7kqBkVg9FgA1ZWaH1XeOwsY2wdjgjpKQEe+WjelEjlhgcVXd2UxKX00fXWfSlVDtL4kbvx12TAD8KsgTPBD/Lq1fV+UHjOGUdNgHUMj8W6ToNBYtnk2yj2G5x9ADfn17KIdQPgFUWnKtNIyUx2OlepwnIr0LwQKBgQC6SzZIWefHLjpk5JUGDx1D0pQDE0JmMFQzJd6WUVKotZSeQK4v6W8O9xIl+fB94VwHytP/1G+nzpt96z957sSzF6FA2TPrl3cb8bmwsYZBiL9qq4YWwd6Mdgfc+2ICVvDCEvzVoRwwr1fTtf8Onl3M5JwTwTiGmAxbheXgQ96myQKBgDpl8FAlLaLaTzyGZxYLRSg+GpMtUJlA0rUtMlJLSUiCJJlMOLdqJz5ySgJXjM4vOHD0Mvrt3R9bkcw+1Ur2d3T6LTH9AELY5rhQYFcvrSBrBcdZZNU7Hjlx9JBrD4nAitW1yK7E6teFJF3RbF/fTrwYIkdFCZIuOWsK2pMsktNBAoGAeCiQ76PFoqxHj9H76PeQubE2NLGUb1MWzBLN+gikFxtfq58uesrHDlEATKxkmNzlvkTt7qH4DrVth49X1u7Rwm4oXSp7maaNdeG5EqW+YcCxLj1J9J3BTLnIopkmAzpOee9DUwtiomhGbtCBnc051TFTFk7XhcDGn7XCqp88GjkCgYEAhqm9wQwsfWWQ2arP9yWL7pH3D//9QjeLycBtS6YHIccaTW8j7cgbvpGJcne8JW2hqdzc5NPORmFW0GGgj7hkRMckbxrElwzJabPeaEp7VUIu0h30itl/wgf3ptJa7R8LpV/TcYdR4KeQ4mpgi0w8lauUuLxvDzN6jcNYaOEReYA=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmZtTJ6+1lzuj4fedov6egPZ2fZOlKvASgybRulXKWJGdwDVbQu6Z8m0Ef7JwWcEjQivnWCAyHOxohobQpcOxGpWH/2SEsylghWAhUG57uy7XKuPHH4fNPZc4XRJMSJ0c0Y+e8w7NJRdZR/n+oDkg7wk1vh6+NgRnvP6wR7IeX6dYip4mXAS3nfAprPDMyAwnoDagl0xmhB6iEPBBqsAyDMWFyvTQQW+NfC2Ras0twS2+epm5iUcW8fgIru2cO3pYkWunC7kDUQm2ojHvY4GHJWclo/rj4eBwMun5yg562f9owpndeZGlJsjvMU47pFqaZDJkbGj5rv5+S6VN6FQdKwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://roykingw.free.idcfengye.com/ali/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://roykingw.free.idcfengye.com/ali/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

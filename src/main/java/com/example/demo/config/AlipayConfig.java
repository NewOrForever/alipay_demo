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
    public static String app_id = "9021000132603892";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCZaGkuJ13EN9Xrev15W/V4u2E0WyXPyeKHoJUHnIfixvLKBN18sMfo8cN1EywUr50jD43/+tLJNUVfpIP+OyycvbGkDBdg5wxa2+0DddBieyVnP0TJP5mlAUGcrBTebmgIOzVo/Z07eZvc3+IB/X1l1Hm9cZ0GzQATO+Ikyv2n7uDLkqRD2cgSv/moTHdIhrEuPgeYJ1GIMB4xf2hQQMV+YXsKnFeF3lf5BxdefpaRczfSS9TilOupWLsH157QB3vZjgc+gacQ9P4pMjnYgjY9N8IQFWRJ7pWuxjFBUfw/eM7E5CdDnGCo0nK64FkQ3H9a9zVyofKJERkiNdwgwEvdAgMBAAECggEAHuTF+cN3wKI19FwqW5xHTO7/XlnUvYm8ku+l04iUXPkPv9tG92tqduDpKdSYlfnfvUXOpPRQKrENrXsmEba8/zu8YHsG4j7lYA7WJlI9ivedyrMVGSozuOUN341QDpNRZAb4dJJObcHJv6teimQQMsedVKdiphH2p+jxW9N9TaoeiKYvEnxW2pVcPf9KQxN5Ka8syTh9apyKVpWmQsps82rYHdJ31rUGrJLeXN1BFFks9/hXu6G6XqsXb1CoaL3VeUN5SztntOxbUvbgF+0MBS+0gxHdOaIxcudxc7vJ4/WpQD4wcg6g3O84uRmHuApF4nOufS39VvY0/ozIaxK8yQKBgQDsz6h9otpjH2Uqtdhsle5qbkJDoO4XRgTg32dnWTjpawcGoZgMe8JqXP6o6ZiMDYrymDiN7ft+Rrn8W3dfM0hVXKlXRx82ILyqeYPMX95lGaQOJ/KLpx+pUvg4PiRW2xlCabGiK0tHFaJAUUW5q4uyKB26lYZg+BIMY3PbXBhAUwKBgQCl1qiiNns8oEEcZFJw/VsEMjl6LB0NCtmPbNyYGM6HCvBm0cmQ4l4VYYCEzpjhomTtkc0k0UTHftVnOW2jPw4XaiM2S6GKV4bNR3BMXViE8YnQ8sIgr4s+99DWJx21iQDUSB8mAbfO0+7z1PrugStx00UnNSkFHVJ1DAAhvuR9DwKBgQCBkqH7lGbwA5akRvmTeHoKbCf/vwdnXp1+uV5n0w7r0O74NuTuN61J63Y/0Ajy4NodISMYrZWFI4fSR+3J/lJeuqPBqJ2wTTtN/80Yv3/9S4lTYZI5zYjqagZ9J6tUhu+MQi66r/uxemnbzVxcWjvGkGKr2/K6DiI5+xTCeuKeFwKBgFG9x6sE7aOJXe6PqG8XAjjERL5qZftawLfIMccqWwoHI02a1B585WDmiUFsz8BPmi3bMuGV4K/wXWGe1eKkHt79qtOFXd9hmwkt0DVjwVDt+T8rmPIhdKIZ5i7YYvVqzSTVU70ZFa91mQ9IiFLtCiv1td1If6qMtGsK+jmn7NmTAoGBALVrlTcv+4AvqR9KZuX77jB0TTx0szRFHreFdoWshujaAQ5ay2/W8F9Pqj6TERoX1ytipnhnwZfvAeEkb/kkPUhWbnP1eXmNndC9QLczkZbtBzKIcc9T+WEjqb2qNcNuvpxoAYuqgh+xN6sB65v6hPYki+TzdSu83+4xro8fHWt1";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmHKPOtfz2xlyFzrUPTc4hN4TZZ+knveF6LlTY7cHuewUI5DTFQaemxH1zayUy8pcRPRKJRabakdwXyW8DyupyO71uRXQRAjBvWIqOOU3KRqxzJ4q42T1IH2LUPFwT3yAard+kva/5pD1Vt8kg5wQQ7iQma3ubxMeg3SOxgiNr5WEKfKPM2Hmu8IyjZzu+HdvtV4cJbTDx0HK7Yz7hbIiq1oyBTtCyDqMj2JBzDc8FOeUDLaaXLr9beNOilfwygQUl2MnwGDYh2Iqe7uK4cxaPN/p7g/avG5WnR4qUpiqKQ5ZvTk0FrtIarwQUXatvbhYo5gG1Q3/uDx4/XGTLvFsOQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://roykingw.free.idcfengye.com/ali/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://roykingw.free.idcfengye.com/ali/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    // 支付宝日志地址
    public static String log_path = "d:\\";


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

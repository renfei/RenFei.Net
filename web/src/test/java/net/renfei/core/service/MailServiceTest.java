package net.renfei.core.service;

import lombok.extern.slf4j.Slf4j;
import net.renfei.TestApplication;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
public class MailServiceTest extends TestApplication {
    @Autowired
    private MailService mailService;

    @Test
    public void testSend() {
//        log.info("测试邮件发送功能");
//        String to = "16076276@qq.com";
//        Map<String, File> map = new HashMap<>();
//        map.put("WX20190624-232346@2x.png", new File("/Users/neil/Downloads/WX20190624-232346@2x.png"));
//        mailService.send(to, "模板邮件", UUID.randomUUID().toString().toUpperCase(), map);
//        log.info("测试邮件发送功能完成");
    }
}

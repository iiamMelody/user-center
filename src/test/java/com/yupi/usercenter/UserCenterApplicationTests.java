package com.yupi.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPasswords = DigestUtils.md5DigestAsHex(("yupi" + "12345678").getBytes(StandardCharsets.UTF_8));

        System.out.println(newPasswords);
    }


    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
    }

}

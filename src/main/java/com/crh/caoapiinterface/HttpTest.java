package com.crh.caoapiinterface;

import com.crh.caoapiinterface.client.CaoClient;
import com.crh.caoapiinterface.model.User;

public class HttpTest {
    public static void main(String[] args) {
        CaoClient client = new CaoClient();
        String result1 = client.getNameByGet("曹操");
        String result2 = client.getNameByPost("曹丕");
        User user = new User();
        user.setName("曹植");
        String result3 = client.getUserByPost(user);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        System.out.println("result3:" + result3);
    }
}

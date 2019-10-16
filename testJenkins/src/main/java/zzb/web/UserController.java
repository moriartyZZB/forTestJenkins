package zzb.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUsers")
    public Object getUsers() {
        return "我是第三次修改成功!";
    }

}

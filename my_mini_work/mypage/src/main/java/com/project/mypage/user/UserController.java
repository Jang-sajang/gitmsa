package com.project.mypage.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @GetMapping("selectall")
    public List<User> selectall(){
        List<User> list = userService.findAll();
        return list;
    }
    @GetMapping("select/{id}")
    public User select(@PathVariable Long id){
        User user = userService.findById(id);
        return user;
    }
    @PostMapping("insert")
    public User insert(@RequestBody UserReq userReq){
        userService.saveUser(userReq);
        return null;
    }
    @PutMapping("update")
    public String update(@RequestBody UserReq userReq){
        userService.saveUser(userReq);
        return null;
    }
    @DeleteMapping("delete/{id}")
    public String delete(@RequestBody Long id){
        userService.deleteUser(id);
        return null;
    }
}

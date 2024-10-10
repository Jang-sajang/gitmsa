package com.pmh.text_A.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select(){
        return ResponseEntity.status(200).body(userRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto){

//        userService.insert(userReqDto);
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

//        userService.insert(userReqDto);
//        select * from where idx=?
//        userRepository.findAll();

//        select * from where email=?
//        userRepository.findAll();


        userRepository.save(user);
        return ResponseEntity.status(200).body("successful");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto){
        System.out.println("실행"+ userReqDto);
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        System.out.println("user = "+ user);
        userRepository.save(user);
        return ResponseEntity.status(200).body("success update");
    }

    // delete * from user where idx = ?
    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable long idx){
        userRepository.deleteById(idx);
        return "deleted";
    }
}

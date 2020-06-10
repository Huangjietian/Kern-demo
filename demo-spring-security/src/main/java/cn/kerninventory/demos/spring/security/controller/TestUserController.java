package cn.kerninventory.demos.spring.security.controller;

import cn.kerninventory.demos.spring.security.model.TestUser;
import cn.kerninventory.demos.spring.security.service.TestUserService;
import cn.kerninventory.demos.spring.security.web.config.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Kern
 * @date 2020/6/4 10:18
 * @description
 */
@RestController
@RequestMapping("/user")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @PostMapping("/insert")
    public ResultVO insert(@RequestBody @Valid TestUser testUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder builder = new StringBuilder();
            bindingResult.getAllErrors().forEach(e -> {
                builder.append(e.getDefaultMessage()).append(System.lineSeparator());
            });
            return ResultVO.error(500, builder.toString());
        }
        testUserService.insert(testUser);
        return ResultVO.success();
    }
}

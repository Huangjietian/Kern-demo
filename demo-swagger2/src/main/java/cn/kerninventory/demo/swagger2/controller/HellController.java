package cn.kerninventory.demo.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@RestController
@RequestMapping("/hello")
@Api(value = "/hello", tags = "Hello控制器")
public class HellController {

    @GetMapping
    @ApiOperation(value = "Hello接口")
    public String hello() {
        return "Hello World~";
    }
}

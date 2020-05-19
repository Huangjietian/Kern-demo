package cn.kerninventory.demos.simple.simpleproject;

import com.onesport.common.spring.beans.validator.BeanValidate;
import org.springframework.web.bind.annotation.*;


/**
 * @author Kern
 * @date 2020/5/11 19:57
 * @description
 */
@RestController
@RequestMapping("/humen")
public class HumenController {

    @BeanValidate
    @PostMapping("")
    public String addHumen(@RequestBody Humen humen) {
        return "success";
    }

}

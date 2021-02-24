/*
 * 详细描述：
 * 作者：wujiulong
 * 时间：2021-02-23 18:27
 * 修改人：
 * 修改时间：
 * 修改内容：
 * 建议：
 */
package com.web.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wujiulong
 * @Classname DemoController
 * @Date 2021/2/23 18:27
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoRestController {
    @GetMapping(value = {"/wjl", "ws"})
    public String demo(@RequestParam(value = "name", defaultValue = "world") String name) {
        log.info("demo param:{}", name);
        return String.format("Hello %s!", name);
    }
}

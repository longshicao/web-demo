/*
 * 详细描述：
 * 作者：wujiulong
 * 时间：2021-02-23 18:42
 * 修改人：
 * 修改时间：
 * 修改内容：
 * 建议：
 */
package com.web.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wujiulong
 * @Classname DemoViewController
 * @Date 2021/2/23 18:42
 */
@Slf4j
@Controller
@RequestMapping(value = "/demoView")
public class DemoViewController {
    @RequestMapping("/testView")
    public String testView() {
        return "demo/testView";
    }
}

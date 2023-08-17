package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.processing.Generated;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "spring!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string") // 문자만 내려보냄
    @ResponseBody // http body 부문에 보내라
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    // 데이터만 내려보내려면 ?
    @GetMapping("hello-api")
    @ResponseBody // 객체를 반환하고 ResponseBody 선언하면 기본으로 json 으로 반환한다. -> xml 로도 할 수 있지만 defaul 로 설정되어 있음.
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{ // static 쓰면 클래스 안에 클래스 정의 가능
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

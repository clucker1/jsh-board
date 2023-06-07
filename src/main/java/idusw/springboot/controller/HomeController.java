package idusw.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    /* Field DI
    @Autowired
    MemoService memoService;  // MemoService 인터페이스의 구현체를 필드 주입
    */
    @GetMapping
    public String goHome() {
        return "redirect:/boards";
    }
    @GetMapping("/buttons")
    public String goButtons() {
        return "/misc/buttons";
    }
    @GetMapping("/cards")
    public String goCards() {
        return "/misc/cards";
    }
    @GetMapping("/charts")
    public String goCharts() {
        return "/misc/charts";
    }
    @GetMapping("/colors")
    public String goColors() {
        return "/misc/utilities-color";
    }
}

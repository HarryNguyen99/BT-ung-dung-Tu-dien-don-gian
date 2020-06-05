package controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/tudien")
public class dictionary {

    public static Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
    }

    @GetMapping()
    public ModelAndView showInput(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("input", dictionary);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView showresult(@RequestParam("TA") String TA){
        ModelAndView modelAndView = new ModelAndView("index");
        String result = dictionary.get(TA);
        if (result == null){
            result = "không có từ này";
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}

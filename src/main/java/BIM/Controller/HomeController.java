package BIM.Controller;
import Model.BIMProject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin(origins="*",maxAge=3600)
public class HomeController {
    @Controller
    @RequestMapping("/")
    public class HelloMvcController {

        @RequestMapping("/home")
        public String homeHandler(){
            return "home";
        }

        @RequestMapping("/test")
        public String testHandler(){
            return "test";
        }

        /**
         * 使用JSON作为响应内容
         */

        @CrossOrigin(origins="*",maxAge=3600)
        @RequestMapping(value="/getProject/{projectId}",method=RequestMethod.GET)
        public @ResponseBody BIMProject getProject(@PathVariable String projectId) {
            BIMProject p = new BIMProject();
            p.setName("Eric");
            p.setIntro("male");
            p.setId(projectId);
            return p;
        }
    }

}

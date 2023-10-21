package hr.kingict.springbootakademija2023.controller;

import hr.kingict.springbootakademija2023.service.DashboardService;
import hr.kingict.springbootakademija2023.service.PageSuffixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {


    @Autowired
    private DashboardService dashboardService;

    @Autowired
    @Qualifier(value = "html")
    private PageSuffixService pageSuffixService;

 //   @RequestMapping(method = RequestMethod.GET, value = "/dashboard")
    @GetMapping(value = "/dashboard")
    public String getDashboard(){
        return dashboardService.getDashboard() + "." + pageSuffixService.getSuffix();
    }


}

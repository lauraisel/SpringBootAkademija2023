package hr.kingict.springbootakademija2023.service.impl;

import hr.kingict.springbootakademija2023.service.DashboardService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value="Test")
public class DashboardServiceTest implements DashboardService {
    public String getDashboard(){
        return "dashboardTest.html";
    }
}

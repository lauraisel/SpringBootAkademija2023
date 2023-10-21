package hr.kingict.springbootakademija2023.service.impl;

import hr.kingict.springbootakademija2023.service.PageSuffixService;
import org.springframework.stereotype.Service;

@Service(value = "html")
public class PageSuffixHtmlService implements PageSuffixService {
    @Override
    public String getSuffix() {
        return "html";
    }
}

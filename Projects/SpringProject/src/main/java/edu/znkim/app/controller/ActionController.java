package edu.znkim.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.znkim.app.domain.Action;
import edu.znkim.app.persistent.ActionMapper;
import edu.znkim.app.service.ActionService;

@Controller
@RequestMapping("/")
public class ActionController {

    @Autowired
    ActionService service;

    /**
     * 인덱스 페이지 불러오기
     * @param locale
     * @param model
     * @return String
     */
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getIndexPage(Locale locale, Model model) {
        /* 날짜 매개변수 설정 */
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        model.addAttribute("serverTime", dateFormat.format(date) );

        return "index";
    }

    /**
     * GET 요청 테스트
     * @return String
     */
    @RequestMapping(value="/getSample", method = RequestMethod.GET)
    public String post() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        return text;
    }

    /**
     * 인덱스 페이지 불러오기
     * @param locale
     * @param model
     * @return String
     */
    @RequestMapping(value="/postSample", method = RequestMethod.POST)
    @ResponseBody
    public Object get(Action param) {
        return service.selectQuery();
    }
}

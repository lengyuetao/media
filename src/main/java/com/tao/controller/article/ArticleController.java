package com.tao.controller.article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DELL on 2017/9/25.
 */
@Controller
public class ArticleController {

    @RequestMapping(value="/article/list")
    public String list(){

        return "/back/article/article-list";
    }

    @RequestMapping(value="/article/insert")
    public String insert(){

        return  null;
    }

    @RequestMapping(value="/article/add")
    public String toAdd(){
        return "/back/article/article-add";
    }
}

package com.y.controller;


import com.y.ResponseResult;
import com.y.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章表(Article)表控制层
 *
 * @author makejava
 * @since 2023-02-25 23:23:26
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    //    @GetMapping("/list")
//    public List<Article> test() {
//        return articleService.list();
//    }
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {

        ResponseResult result = articleService.hotArticleList();
        return result;
    }
}


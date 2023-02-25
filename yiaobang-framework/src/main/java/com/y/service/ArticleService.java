package com.y.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.y.ResponseResult;
import com.y.entity.Article;

/**
 * 文章表(Article)表服务接口
 *
 * @author makejava
 * @since 2023-02-25 23:23:33
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();
}


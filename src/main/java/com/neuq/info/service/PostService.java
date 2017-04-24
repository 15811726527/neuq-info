package com.neuq.info.service;

import com.neuq.info.dto.Page;
import com.neuq.info.dto.ResultModel;
import com.neuq.info.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lihang on 2017/4/4.
 */
public interface PostService {
    ResultModel insertPost(Post post);
    ResultModel queryPostByCount(int offset , int limit,Long userId);
    ResultModel queryPostByPage(int currentPage);
    ResultModel queryPostByUserId(long userId);
    ResultModel queryPostByPostId(long postId,long userId);
    int queryAllPostCount();
    ResultModel deletePost(long postId);
    ResultModel updateLike(long postId, int flag,long userId);
    ResultModel updateCommentCount(long postId);


}

package com.max.community.dao;

import com.max.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 后面两个数据做分页用
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询帖子的行数
    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(int userId);

    // 新增帖子
    int insertDiscussPost(DiscussPost discussPost);

    // 查询帖子详情
    DiscussPost selectDiscussPostById(int id);

    // 更新评论数量
    int updateCommentCount(int id, int commentCount);

    // 修改帖子类型
    int updateType(int id, int type);

    // 修改帖子状态
    int updateStatus(int id, int status);
}

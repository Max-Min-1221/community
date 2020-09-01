package com.max.community.service;

public interface LikeService {

    void like(int userId, int entityType, int entityId, int entityUserId);

    long findEntityLikeCount(int entityType, int entityId);

    int fineEntityLikeStatus(int userId, int entityType, int entityId);

    int findUserLikeCount(int userId);
}

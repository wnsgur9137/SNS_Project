package com.inhatc.sns_project.listener;

import com.inhatc.sns_project.PostInfo;

public interface OnPostListener {
    void onDelete(PostInfo postInfo);
    void onModify();
}

package com.feicuiedu.videonews.ui.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.feicuiedu.videonews.R;
import com.feicuiedu.videonews.bombapi.entity.NewsEntity;
import com.feicuiedu.videonews.commons.CommonUtils;
import com.feicuiedu.videonews.ui.base.BaseItemView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 新闻列表的单项视图, 将使用 MediaPlayer播放视频,TextureView来显示视频
 *
 * 作者：yuanchao on 2016/8/17 0017 14:51
 * 邮箱：yuanchao@feicuiedu.com
 */
public class NewsItemView extends BaseItemView<NewsEntity> {
    @BindView(R.id.textureView) TextureView textureView;
    @BindView(R.id.ivPreview) ImageView ivPreview;
    @BindView(R.id.tvNewsTitle) TextView tvNewsTitle;
    @BindView(R.id.tvCreatedAt) TextView tvCreatedAt;
    @BindView(R.id.progressBar) ProgressBar progressBar;
    @BindView(R.id.ivPlay) ImageView ivPlay;

    public NewsItemView(Context context) {
        super(context);
    }

    @Override protected void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_news, this, true);
        ButterKnife.bind(this);
    }

    @Override protected void bindModel(NewsEntity newsEntity) {
        // 初始视图状态
        tvNewsTitle.setVisibility(View.VISIBLE);
        ivPreview.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.VISIBLE);
        ivPlay.setVisibility(View.VISIBLE);
        // 设置标题,创建时间和预览图
        tvNewsTitle.setText(newsEntity.getNewsTitle());
        tvNewsTitle.setText(newsEntity.getNewsTitle());
        tvCreatedAt.setText(CommonUtils.format(newsEntity.getCreatedAt()));
    }
}

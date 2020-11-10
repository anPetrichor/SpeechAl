/*
 * Copyright (C) 2020 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.SpeechAl.fragment.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.xuexiang.SpeechAl.R;
import com.xuexiang.SpeechAl.activity.IatDemo;
import com.xuexiang.SpeechAl.core.BaseFragment;
import com.xuexiang.SpeechAl.fragment.trending.TrendingFragment;
import com.xuexiang.xui.widget.actionbar.TitleBar;

public class index extends BaseFragment {
    /**
     * @return 返回为 null意为不需要导航栏
     */
    @Override
    protected TitleBar initTitle() {
        return null;
    }

    /**
     * 布局的资源id
     *
     * @return
     */
    @Override
    public int getLayoutId() {
        return R.layout.fragment_index;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initViews() {

    }
    private Button mBtnRecord, mBtnTransfer;


    private ViewFlipper vflp_help;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View homeLayout = inflater.inflate(R.layout.fragment_index, container, false);
        mBtnRecord = homeLayout.findViewById(R.id.document);
        mBtnTransfer = homeLayout.findViewById(R.id.speech);
//       vflp_help =homeLayout.findViewById(R.id.vflp_help);
//       vflp_help.startFlipping();
        mBtnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),TrendingFragment.class));
            }
        });
        mBtnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), IatDemo.class));

            }
        });


        return homeLayout;
    }
}

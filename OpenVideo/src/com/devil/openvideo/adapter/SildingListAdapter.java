package com.devil.openvideo.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devil.openvideo.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class SildingListAdapter extends BaseAdapter{

	private Context mContext;
	/**
     * ÿ�������Ӧ��ID
     */
    String[] categoryIds;
    /**
     * 
     * @param ÿ�������Ӧ������
     */
    String[] title;
    /**
     * 
     * @param 
     */
    int[] imgIds;
    
	public SildingListAdapter(Context mContext) {
		this.mContext = mContext;
		getData();
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}
	private void getData(){
		title = mContext.getResources().getStringArray(R.array.category_title);
		TypedArray imgs = mContext.getResources().obtainTypedArray(R.array.category_img);
		Log.d("title", "count = "+imgs.length());
		categoryIds = mContext.getResources().getStringArray(R.array.categorry_value);
		imgIds = new int[imgs.length()];
		for (int i=0 ; i<imgs.length() ; i++ ) {
			imgIds[i] = imgs.getResourceId(i, -1);
		}
		imgs.recycle();
	}
}

package kr.ac.kau.sw.a2016125063.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Arduino on 2017-07-05.
 */

public class AdapterListItem extends ArrayAdapter<BeanItem> {

    public AdapterListItem(Context context, int resource, List<BeanItem> object){
        super(context,resource, object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();

        }
        BeanItem bean = getItem(position);
        holder.txvItem .setText(bean.item);
        holder.txvPrice.setText(" \\ "+Integer.toString(bean.price));
        return convertView;

    }

    private static class ViewHolder{
        public TextView txvItem;
        public TextView txvPrice;

        public ViewHolder(View view){
            txvItem = (TextView) view.findViewById(R.id.litm_texvItem);
            txvPrice = (TextView) view.findViewById(R.id.litm_texvPrice);
        }
    }

}

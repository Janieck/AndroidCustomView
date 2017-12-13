package paxsz.com.androidcustomview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/*
 *  创建者:   tangjian
 *  创建时间:  2017/12/8 15:47
 *  描述：    TODO
 */
public class TitleLayout extends LinearLayout implements View.OnClickListener {

    private Button title_back;
    private Button title_edit;

    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        initView();
    }

    private void initView() {
        title_back = (Button) findViewById(R.id.title_back);
        title_edit = (Button) findViewById(R.id.title_edit);
        title_back.setOnClickListener(this);
        title_edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                ((Activity) getContext()).finish();
                break;
            case R.id.title_edit:
                Toast.makeText(getContext(), "You clicked Edit Button", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.p218_intent2_subsub;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        txtMessage = findViewById(R.id.txtRecvData);
        //
        RatingBar rate = findViewById(R.id.rating);
        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                TextView textView8=findViewById(R.id.textView8);
                textView8.setText(String.valueOf(rating));
            }
        });

        //
        RadioGroup rgroup = findViewById(R.id.rgroup);
        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radio = group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,
                        String.format("「%s」が選択されました。", radio.getText()),
                        Toast.LENGTH_SHORT).show();
                TextView textView8=findViewById(R.id.textsyoku1);
                textView8.setText(String.valueOf(radio));

            }
        });

        //
        SeekBar seek = findViewById(R.id.seekBar);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onProgressChanged(
                    SeekBar seekBar, int progress, boolean fromUser) {
                TextView seekBar=findViewById(R.id.textPrise1);
                seekBar.setText(String.valueOf(progress));


            }

            // -100～100の範囲で10区切りで変化する場合
            /*public void onProgressChanged(
            SeekBar seekBar, int progress, boolean fromUser) {
                int current = (progress - 10) * 10;
                Toast.makeText(MainActivity.this,
                        String.format("現在値：%d", current),
                        Toast.LENGTH_SHORT).show();
            }*/
            public void onStartTrackingTouch(SeekBar seekBar) { }
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });



        public void camera1(View v){
            Intent intent = new Intent();
            //アクションにカメラアプリを指定
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            startActivityForResult(intent,1);
        }

        //カメラアプリ（暗黙的インテント）から戻った時の処理
        protected void onActivityResult(int requestCode2,int resultCode2,@Nullable Intent data2) {
            super.onActivityResult(requestCode2, resultCode2, data2);

            if(resultCode2==Activity.RESULT_OK){
                if(requestCode2==1){
                    //インテントからカメラデータを取得
                    Bitmap bmp=(Bitmap)data2.getExtras().get("data2");
                    ImageView imageView=findViewById(R.id.imageView2);
                    //カメラからの画像をイメージビューに表示
                    imageView.setImageBitmap(bmp);
                }
            }
        }

        public void camera2(View v){
            Intent intent = new Intent();
            //アクションにカメラアプリを指定
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            startActivityForResult(intent,1);
        }

        //カメラアプリ（暗黙的インテント）から戻った時の処理
        protected void onActivityResult(int requestCode4, int resultCode4, @Nullable Intent data4) {
            super.onActivityResult(requestCode4, resultCode4, data4);

            if(resultCode4==Activity.RESULT_OK){
                if(requestCode4==1){
                    //インテントからカメラデータを取得
                    Bitmap bmp=(Bitmap)data4.getExtras().get("data4");
                    ImageView imageView=findViewById(R.id.imageView3);
                    //カメラからの画像をイメージビューに表示
                    imageView.setImageBitmap(bmp);
                }
            }
        }


        //textPrise1
        final CheckBox chk = (CheckBox)findViewById(R.id.checkBox1);
        chk.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk.isChecked()==true){
                            ImageView imageView41=findViewById(R.id.imageView41);
                            imageView41.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView41=findViewById(R.id.imageView41);
                            imageView41.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );

        //textPrise2
        final CheckBox chk2 = (CheckBox)findViewById(R.id.checkBox2);
        chk2.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk2.isChecked()){
                            ImageView imageView42=findViewById(R.id.imageView42);
                            imageView42.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView42=findViewById(R.id.imageView42);
                            imageView42.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
//
        //textPrise3
        final CheckBox chk3 = (CheckBox)findViewById(R.id.checkBox3);
        chk3.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk3.isChecked()==true){
                            ImageView imageView43=findViewById(R.id.imageView43);
                            imageView43.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView43=findViewById(R.id.imageView43);
                            imageView43.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );

        //textPrise4
        final CheckBox chk4 = (CheckBox)findViewById(R.id.checkBox4);
        chk4.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk4.isChecked()==true){
                            ImageView imageView44=findViewById(R.id.imageView44);
                            imageView44.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView44=findViewById(R.id.imageView44);
                            imageView44.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
//
        //textPrise5
        final CheckBox chk5 = (CheckBox)findViewById(R.id.checkBox5);
        chk5.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk5.isChecked()==true){
                            ImageView imageView45=findViewById(R.id.imageView45);
                            imageView45.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView45=findViewById(R.id.imageView45);
                            imageView45.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
        //textPrise6
        final CheckBox chk6 = (CheckBox)findViewById(R.id.checkBox6);
        chk6.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk6.isChecked()==true){
                            ImageView imageView46=findViewById(R.id.imageView46);
                            imageView46.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView46=findViewById(R.id.imageView46);
                            imageView46.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
//
//
        //textPrise5
        final CheckBox chk7 = (CheckBox)findViewById(R.id.checkBox7);
        chk7.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk7.isChecked()==true){
                            ImageView imageView47=findViewById(R.id.imageView47);
                            imageView47.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView47=findViewById(R.id.imageView47);
                            imageView47.setImageResource(R.drawable.ic_1);

                        }
                    }
                })
        )

        //textPrise8
        final CheckBox chk8 = (CheckBox)findViewById(R.id.checkBox8);
        chk8.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk8.isChecked()==true){
                            ImageView imageView48=findViewById(R.id.imageView48);
                            imageView48.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView48=findViewById(R.id.imageView48);
                            imageView48.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
        //
        //textPrise5
        final CheckBox chk9 = (CheckBox)findViewById(R.id.checkBox9);
        chk9.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk9.isChecked()==true){
                            ImageView imageView49=findViewById(R.id.imageView49);
                            imageView49.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView49=findViewById(R.id.imageView49);
                            imageView49.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );
        //textPrise10
        final CheckBox chk10 = (CheckBox)findViewById(R.id.checkBox10);
        chk10.setOnCheckedChangeListener(
                new View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //todo auto
                        if(chk10.isChecked()==true){
                            ImageView imageView50=findViewById(R.id.imageView50);
                            imageView50.setImageResource(R.drawable.ic0);
                        }else{
                            ImageView imageView50=findViewById(R.id.imageView50);
                            imageView50.setImageResource(R.drawable.ic_1);

                        }
                    }
                })

        );



    }











    public void hello(View v){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        //送信するデータのタイプを指定
        intent.setType("text/plain");
        //送信するデータはExtraに追加
        BreakIterator editTextTextPersonName = null;
        intent.putExtra(Intent.EXTRA_TEXT,editTextTextPersonName.getText().toString());
        startActivity(intent);
    }
    public void onClick(View v){
        Intent in = new Intent(this,SubActivity1.class);

        //戻った時に値を受信するメソッド
        //第2引数にはリクエストコード（任意の整数）、受信した時に識別するため
        startActivityForResult(in, 0);
    }
    public void onClick2(View v){
        Intent in = new Intent(this,SubActivity2.class);

        //戻った時に値を受信するメソッド
        //第2引数にはリクエストコード（任意の整数）、受信した時に識別するため
        startActivityForResult(in, 0);
    }

    public void next(View v){
        Intent in;
        in = new Intent(this,SubActivity1.class);
        in.putExtra("name",etName.getText().toString());
        startActivity(in);
    }
}
public class ViewPagerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);

        //ViewPagerのインスタンスを取得
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);

        //ViewPagerにAdapterをセット
        viewPager.setAdapter(new MyFragmentAdapter(getFragmentManager()));

        //リスナーをセット
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {
                // ページのスワイプ中に呼ばれる
                // position : スクロール中のページ。
                // positionOffset : ドラッグ量（0〜1）
                // positionOffsetPixels : ドラッグされたピクセル数
            }

            @Override
            public void onPageSelected(int position) {
                // 移動先のページが確定された後に呼ばれる。
                // position : 移動先のページ
                Toast.makeText(getActivity(), "selected " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {
                // ページのスクロール状態が通知される。
                // state : ページスクロール状態
                // ViewPager.SCROLL_STATE_IDLE 初期状態。ページスクロール完了後に通知
                // ViewPager.SCROLL_STATE_DRAGGING ドラッグ開始時に通知
                // ViewPager.SCROLL_STATE_SETTLING ドラッグ終了時に通知


                //


            }
        });

        return rootView;
    }

    public class MyFragmentAdapter extends FragmentPagerAdapter {

        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
            }

        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return "List";
            } else if (position == 1) {
                return "Grid";
            } else {
                return "Scroll";
            }
        }
    }

    /**
     * PagerAdapterの実装例
     * 本サンプルプログラムでは使用していません。
     */
    public class MyPagerAdapter extends PagerAdapter implements com.example.p218_intent2_subsub.MyPagerAdapter {

        private LayoutInflater mLayoutInflaternflater = null;

        private Object mCurrentObject;

        public MyPagerAdapter(Context c) {
            super();
            mLayoutInflaternflater = (LayoutInflater) c
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public void setPrimaryItem(ViewGroup container, int position, Object object) {
            mCurrentObject = object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View layout = mLayoutInflaternflater.inflate(R.layout.view_pager_item, null);
            switch (position) {
                case 0:
                    layout.setBackgroundColor(Color.RED);
                    break;
                case 1:
                    layout.setBackgroundColor(Color.GREEN);
                    break;
                case 2:
                    layout.setBackgroundColor(Color.BLUE);
                    break;
            }
            container.addView(layout);
            return layout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }

}

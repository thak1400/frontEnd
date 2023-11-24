package com.example.myapplication.EmployerView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.myapplication.R;

public class JobDetailsActivityPreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant_view_job_description);

        RelativeLayout item = (RelativeLayout)findViewById(R.id.applicant_view_job_description_detail_card_relative_layout);
        View child=getLayoutInflater().inflate(R.layout.recent_applicants_list_item,null);
        item.addView(child);

        Button button=findViewById(R.id.applicant_view_job_description_apply_button);
        button.setText("Post");
    }
}
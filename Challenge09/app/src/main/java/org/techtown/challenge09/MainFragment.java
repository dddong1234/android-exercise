package org.techtown.challenge09;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;


public class MainFragment extends Fragment {
     EditText edit_name, edit_age;
     Button btn_save, btn_birth;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);

        edit_age = rootView.findViewById(R.id.edit_age);
        edit_name = rootView.findViewById(R.id.edit_name);

        btn_birth = rootView.findViewById(R.id.btn_birth);
        Calendar cal = Calendar.getInstance();
        btn_birth.setText(cal.get(Calendar.YEAR) +"-"+ (cal.get(Calendar.MONTH)+1) +"-"+ cal.get(Calendar.DATE));
        btn_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        btn_birth.setText(String.format("%d-%d-%d", year, month+1, dayOfMonth));
                    }
                },cal.get(Calendar.YEAR),(cal.get(Calendar.MONTH)+1),cal.get(Calendar.DATE));
                dialog.show();
            }
        });

        btn_save = rootView.findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),
                        "이름 : "+edit_name.getText()+"\n"+
                        "나이 : "+edit_age.getText()+"\n"+
                        "생년월일 : "+btn_birth.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
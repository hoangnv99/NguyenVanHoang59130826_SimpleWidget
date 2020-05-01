package vn.edu.hoangnguyen.nguyenvanhoang59130826_simplewidget;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tten, tday,txtthem;
    RadioGroup rdgsex;
    Button btnxacnhan;
    RadioButton rdbnam, rdbnu;
    CheckBox btnxemphim, btnnghenhac, btncafe, btnalone, btncook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addview();
        addEven();
    }

    private void addview(){
        tten = findViewById(R.id.txtten);
        tday = findViewById(R.id.txtday);
        txtthem = findViewById(R.id.txtthem);
        rdgsex = findViewById(R.id.rdgsex);
        btnxacnhan = findViewById(R.id.bntxacnhan);
        rdbnam = findViewById(R.id.rdbNam);
        rdbnu = findViewById(R.id.rdbNu);
        btnxemphim= findViewById(R.id.bntxempihm);
        btnnghenhac = findViewById(R.id.bntnghenhac);
        btncafe = findViewById(R.id.bntcafe);
        btnalone = findViewById(R.id.bntalone);
        btncook = findViewById(R.id.bntcook);
    }
    private  void addEven(){
    btnxacnhan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            show();
        }
    });
    }
 private void show(){
     int sex = this.rdgsex.getCheckedRadioButtonId();
     String name = tten.getText().toString().trim();
     String date = tday.getText().toString().trim();
     RadioButton rdgsex = this.findViewById(sex);
     String st = "";
     if(btnxemphim.isChecked()){
         if (st.length()>0){
             st+= ",";
         }
         st += "Xem Phim";
     }
     if(btnnghenhac.isChecked()){
         if (st.length()>0){
             st+= ",";
         }
         st += "Nghe Nhạc";
     }
     if(btncafe.isChecked()){
         if (st.length()>0){
             st+= ",";
         }
         st += "Đi cafe với bạn";
     }
     if(btnalone.isChecked()){
         if (st.length()>0){
             st+= ",";
         }
         st += "Ở nhà một mình";
     }
     if(btncook.isChecked()){
         if (st.length()>0){
             st+= ",";
         }
         st += "Vào Bếp Nấu Ăn";
     }
     st +=",";
     st += txtthem.getText().toString().trim();
     String xuat = name + "\nNgaySinh : " + date + "\nGiới Tính : " + rdgsex.getText() + "\nSở Thích : " + st ;
     Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
 }

}

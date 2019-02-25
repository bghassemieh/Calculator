package cejv669.concordia.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_history);

        final TextView tv_history = findViewById(R.id.txt_history);

        Button btnHistoryBack = findViewById(R.id.btn_history_back);

        btnHistoryBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_history = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i_history);
            }
        });

        Intent i_get_value = getIntent();
        String historyMessage = i_get_value.getStringExtra("value1");
        tv_history.setText(historyMessage);
    }

}

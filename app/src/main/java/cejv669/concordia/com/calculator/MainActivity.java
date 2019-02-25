package cejv669.concordia.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int operationCode = 0;
    int countMultiply = 0;
    int countDivide = 0;
    int countAdd = 0;
    int countSubtraction = 0;
    boolean pressOperation = false;
    double valueOfTextView = 0;
    String valueBuilder = "";
    String valueToHistory = "";
    DecimalFormat format = new DecimalFormat("0.##########");
    StringBuilder builder = new StringBuilder();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calculator_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                Intent i_1 = new Intent(getApplicationContext(), show_about.class);
                startActivity(i_1);
                return true;
            case R.id.menu_history:
                valueToHistory = builder.toString();
                Intent i_2 = new Intent(getApplicationContext(), showHistory.class);
                i_2.putExtra("value1", valueToHistory);
                startActivity(i_2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv_display = findViewById(R.id.txt_display);
        final TextView tv_operator = findViewById(R.id.txt_operator);
        Button bZero = findViewById(R.id.btn_0);
        Button b1 = findViewById(R.id.btn_1);
        Button b2 = findViewById(R.id.btn_2);
        Button b3 = findViewById(R.id.btn_3);
        Button b4 = findViewById(R.id.btn_4);
        Button b5 = findViewById(R.id.btn_5);
        Button b6 = findViewById(R.id.btn_6);
        Button b7 = findViewById(R.id.btn_7);
        Button b8 = findViewById(R.id.btn_8);
        Button b9 = findViewById(R.id.btn_9);

        Button bDel = findViewById(R.id.btn_delete);
        Button bDivide = findViewById(R.id.btn_devide);
        Button bMultiply = findViewById(R.id.btn_multiply);
        Button bSubtract = findViewById(R.id.btn_subtraction);
        Button bAdd = findViewById(R.id.btn_add);
        Button bEqual = findViewById(R.id.btn_equal);
        Button bPercent = findViewById(R.id.btn_percent);
        Button bPosNeg = findViewById(R.id.btn_pos_neg);
        Button bClear = findViewById(R.id.btn_clear);
        Button bDecimal = findViewById(R.id.btn_decimal);

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOfTextView = 0;
                tv_display.setText("");
                tv_operator.setText("");
                countMultiply = 0;
                countSubtraction = 0;
            }
        });

        bZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "0");
                builder.append("0");
            }
        });

        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + ".");
                builder.append(".");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "1");
                builder.append("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "2");
                builder.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "3");
                builder.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "4");
                builder.append("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "5");
                builder.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "6");
                builder.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "7");
                builder.append("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "8");
                builder.append("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressOperation == true) {
                    tv_display.setText("");
                    pressOperation = false;
                }
                String valDisplay = tv_display.getText().toString();
                tv_display.setText(valDisplay + "9");
                builder.append("9");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressOperation = true;
                operationCode = 1;
                tv_operator.setText("+");
                builder.append("+");
                if (countAdd == 0) {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString());
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                } else {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString()) + valueOfTextView;
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                }

            }
        });

        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressOperation = true;
                operationCode = 2;
                tv_operator.setText("-");
                builder.append("-");
                if (countSubtraction == 0) {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString());
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                    countSubtraction = countSubtraction + 1;
                } else {
                    valueOfTextView = valueOfTextView - Double.valueOf(tv_display.getText().toString());
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressOperation = true;
                operationCode = 3;
                tv_operator.setText("x");
                builder.append("x");
                if (countMultiply == 0) {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString());
                    tv_display.setText((String.valueOf(format.format(valueOfTextView))));
                    countMultiply = countMultiply + 1;
                } else {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString()) * valueOfTextView;
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressOperation = true;
                operationCode = 4;
                tv_operator.setText("\u00F7");
                builder.append("\u00F7");
                if (countDivide == 0) {
                    valueOfTextView = Double.valueOf(tv_display.getText().toString());
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                    countDivide = countDivide + 1;
                } else {
                    valueOfTextView = valueOfTextView / Double.valueOf(tv_display.getText().toString());
                    tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                }
            }
        });

        bPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOfTextView = Double.valueOf(tv_display.getText().toString());
                tv_display.setText(String.valueOf(format.format(valueOfTextView * -1)));
                builder.append(String.valueOf(format.format(valueOfTextView * -1)));
            }
        });

        bPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOfTextView = Double.valueOf(tv_display.getText().toString());
                tv_display.setText(String.valueOf(format.format(valueOfTextView / 100)));
                builder.append("--->%").append("\n").append(String.valueOf(format.format(valueOfTextView / 100)));
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_display.setText("");
            }
        });


        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operationCode) {
                    case 1:
                        valueOfTextView = Double.valueOf(tv_display.getText().toString()) + valueOfTextView;
                        tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                        valueOfTextView = 0;
                        tv_operator.setText("");
                        pressOperation = true;
                        valueBuilder = tv_display.getText().toString();
                        builder.append("=" + valueBuilder).append("\n");
                        valueBuilder = "";
                        break;

                    case 2:
                        valueOfTextView = valueOfTextView - Double.valueOf(tv_display.getText().toString());
                        tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                        valueOfTextView = 0;
                        tv_operator.setText("");
                        pressOperation = true;
                        countSubtraction = 0;
                        valueBuilder = tv_display.getText().toString();
                        builder.append("=" + valueBuilder).append("\n");
                        valueBuilder = "";
                        break;

                    case 3:
                        valueOfTextView = valueOfTextView * Double.valueOf(tv_display.getText().toString());
                        tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                        valueOfTextView = 0;
                        tv_operator.setText("");
                        pressOperation = true;
                        countMultiply = 0;
                        valueBuilder = tv_display.getText().toString();
                        builder.append("=" + valueBuilder).append("\n");
                        valueBuilder = "";
                        break;

                    case 4:
                        valueOfTextView = valueOfTextView / Double.valueOf(tv_display.getText().toString());
                        tv_display.setText(String.valueOf(format.format(valueOfTextView)));
                        valueOfTextView = 0;
                        tv_operator.setText("");
                        pressOperation = true;
                        countDivide = 0;
                        valueBuilder = tv_display.getText().toString();
                        builder.append("=" + valueBuilder).append("\n");
                        valueBuilder = "";
                        break;
                }
            }
        });
    }
}

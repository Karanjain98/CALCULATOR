package com.code.calculator;

  import android.support.v7.app.AppCompatActivity;
  import android.os.Bundle;
  import android.view.View;
  import android.widget.Button;
  import android.widget.EditText;

public class MainActivity extends AppCompatActivity
    {
    Button   button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
    EditText edt,edt1;
    float b,a;
    char ch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button  =(Button)findViewById(R.id.button)  ;
        button2 =(Button)findViewById(R.id.button2) ;
        button3 =(Button)findViewById(R.id.button3) ;
        button4 =(Button)findViewById(R.id.button4) ;
        button5 =(Button)findViewById(R.id.button5) ;
        button6 =(Button)findViewById(R.id.button6) ;
        button7 =(Button)findViewById(R.id.button7) ;
        button8 =(Button)findViewById(R.id.button8) ;
        button9 =(Button)findViewById(R.id.button9) ;
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);
        button14=(Button)findViewById(R.id.button14);
        button15=(Button)findViewById(R.id.button15);
        button16=(Button)findViewById(R.id.button16);
        edt= (EditText) findViewById(R.id.edt);
        edt1=(EditText)findViewById(R.id.edt1);
        button16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edt.setText(null);
                edt1.setText(null);
            }
        });

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)
            {
                edt1.setText(null);
                edt.setText(edt.getText()+"1");
        }});
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"2");}
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"3");}
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"4");}
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"5");}
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"6");}
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"7");}
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"8");}
        });
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"9");}
        });
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){ edt1.setText(null);
                    edt.setText(edt.getText()+"0");}

        });
        button11.setOnClickListener(new View.OnClickListener()
        {@Override
            public void onClick(View v)
        {ch='/';
            if(!edt.getText().equals(null))
                a=Float.valueOf(edt.getText().toString());
            else
                a=Float.valueOf(edt1.getText().toString());
            edt.setText(null);
        };
        });
        button12.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v)
        {ch='X';
            if(!edt.getText().equals(null))
            a=Float.valueOf(edt.getText().toString());
            else
                a=Float.valueOf(edt1.getText().toString());
            edt.setText(null);
        };
        });
        button13.setOnClickListener(new View.OnClickListener()
        {@Override
        public void onClick(View v)
        {ch='-';
            if(edt.getText().equals(null))
                a=Float.valueOf(edt1.getText().toString());
            else
                a=Float.valueOf(edt.getText().toString());
            edt.setText(null);
        };

        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        button14.setOnClickListener(new View.OnClickListener()
//        {@Override
//        public void onClick(View v)
//        {ch='+';
//            if(!edt.getText().equals(null))
//                a=Float.valueOf(edt.getText().toString());
//            else
//                a=Float.valueOf(edt1.getText().toString());
//            edt.setText(null);
//        };
//        });
        button15.setOnClickListener(new View.OnClickListener()
        {@Override
            public void onClick(View v)
        {  if(!(edt.getText()==null))
            switch(ch)
            {
                case '+': b=a+Float.valueOf(edt.getText().toString());

                          break;
                case '/': b=a/Float.valueOf(edt.getText().toString());

                          break;
                case '-': b=a-Float.valueOf(edt.getText().toString());

                          break;
                case 'X': b=a*Float.valueOf(edt.getText().toString());

                          break;

            }
            edt.setText(null);
            edt1.setText(String.valueOf(b));

        }});
        }
    }














# Ex.No:5 Create Your Own Content Providers to get Contacts details.


## AIM:

    To create your own content providers to get contacts details using Android Studio.

## EQUIPMENTS REQUIRED:

    Android Studio(Latest Version)

## ALGORITHM:

    Step 1: Open Android Stdio and then click on File -> New -> New project.

    Step 2: Then type the Application name as “contentprovider″ and click Next. 

    Step 3: Then select the Minimum SDK as shown below and click Next.

    Step 4: Then select the Empty Activity and click Next. Finally click Finish.

    Step 5: Design layout in activity_main.xml.

    Step 6: Get contacts details and Display details give in MainActivity file.

    Step 7: Save and run the application.

## PROGRAM:
  ## MAIN ACTIVITY.JAVA
    package com.example.exp_09;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity extends AppCompatActivity implements View.OnClickListener 
    {
        private EditText etNumber1, etNumber2;
        private Button btnAdd, btnSubtract, btnMultiply, btnDivide;
        private TextView tvResult;
        @Override
        protected void onCreate(Bundle savedInstanceState) 
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            etNumber1 = findViewById(R.id.etNumber1);
            etNumber2 = findViewById(R.id.etNumber2);
            btnAdd = findViewById(R.id.btnAdd);
            btnSubtract = findViewById(R.id.btnSubtract);
            btnMultiply = findViewById(R.id.btnMultiply);
            btnDivide = findViewById(R.id.btnDivide);
            tvResult = findViewById(R.id.tvResult);
            btnAdd.setOnClickListener(this);
            btnSubtract.setOnClickListener(this);
            btnMultiply.setOnClickListener(this);
            btnDivide.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) 
        {
            double number1 = Double.parseDouble(etNumber1.getText().toString());
            double number2 = Double.parseDouble(etNumber2.getText().toString());
            double result = 0;
            switch (view.getId()) 
            {
                case R.id.btnAdd:
                    result = number1 + number2;
                    break;
                case R.id.btnSubtract:
                    result = number1 - number2;
                    break;
                case R.id.btnMultiply:
                    result = number1 * number2;
                    break;
                case R.id.btnDivide:
                    if (number2 != 0) 
                    {
                        result = number1 / number2;
                    } 
                    else 
                    {
                        tvResult.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }

            tvResult.setText(String.valueOf(result));
        }
    }
  ## ACTIVITY MAIN.XML
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <EditText
        android:id="@+id/etNumber1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="A"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.338"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.223" />


    <EditText
        android:id="@+id/etNumber2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="B"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.338"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.358" />

    <Button
        android:id="@+id/btnAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.21"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.499" />

    <Button
        android:id="@+id/btnSubtract"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Subtract"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.785"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.499" />

    <Button
        android:id="@+id/btnMultiply"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Multiply"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.785"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.633" />

    <Button
        android:id="@+id/btnDivide"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Divide"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.214"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.633" />

    <TextView
        android:id="@+id/tvResult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        android:textSize="25sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.192"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.734" />
    </androidx.constraintlayout.widget.ConstraintLayout>
## OUTPUT




## RESULT
Thus a Simple Android Application create your own content providers to get contacts details using Android Studio is developed and executed successfully.

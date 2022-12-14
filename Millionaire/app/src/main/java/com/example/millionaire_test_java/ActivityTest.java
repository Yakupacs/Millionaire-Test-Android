package com.example.millionaire_test_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;

public class ActivityTest extends AppCompatActivity {

    private TextView textViewSoruDegeri;
    private TextView textViewSoru;
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;

    private Question question1;
    private Question question2;
    private Question question3;
    private Question question4;
    private Question question5;
    private Question question6;
    ArrayList<Question> questionPool= new ArrayList<Question>();
    ArrayList<Button> buttons= new ArrayList<Button>();

    private int whichQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        whichQuestion = 1;
        textViewSoruDegeri = (TextView) findViewById(R.id.textViewSoruDegeri);
        textViewSoru = (TextView) findViewById(R.id.textViewSoru);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttons.add(buttonA);
        buttons.add(buttonB);
        buttons.add(buttonC);
        buttons.add(buttonD);

        questionPool();
        createQuestion();
    }

    private void checkTrueAnswer()
    {
        buttons.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whichQuestion += 1;
                writeEarn();
                if (whichQuestion != 11)
                    createQuestion();
                else{
                    buttonA.setEnabled(false);
                    buttonB.setEnabled(false);
                    buttonC.setEnabled(false);
                    buttonD.setEnabled(false);
                }
            }
        });
        buttons.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Elendiniz! Tekrardan Ba??lay??n.", Toast.LENGTH_LONG).show();
                openActivityStart();
            }
        });
        buttons.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Elendiniz! Tekrardan Ba??lay??n.", Toast.LENGTH_LONG).show();
                openActivityStart();
            }
        });
        buttons.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Elendiniz! Tekrardan Ba??lay??n.", Toast.LENGTH_LONG).show();
                openActivityStart();
            }
        });
    }
    public void openActivityStart()
    {
        Intent intent = new Intent(this, ActivityStart.class);
        startActivity(intent);
    }

    private void createQuestion()
    {
        Collections.shuffle(buttons);
        Collections.shuffle(questionPool);
        textViewSoru.setText(questionPool.get(0).question);
        buttons.get(0).setText(questionPool.get(0).trueAnswer);
        buttons.get(1).setText(questionPool.get(0).failAnswer1);
        buttons.get(2).setText(questionPool.get(0).failAnswer2);
        buttons.get(3).setText(questionPool.get(0).failAnswer3);
        checkTrueAnswer();
    }

    private void writeEarn()
    {
        if (whichQuestion == 2)
            textViewSoruDegeri.setText("2.Soru : 500 TL");
        else if (whichQuestion == 3)
            textViewSoruDegeri.setText("3.Soru : 1.000TL");
        else if (whichQuestion == 4)
            textViewSoruDegeri.setText("4.Soru : 2.500TL");
        else if (whichQuestion == 5)
            textViewSoruDegeri.setText("5.Soru : 5.000TL");
        else if (whichQuestion == 6)
            textViewSoruDegeri.setText("6.Soru : 10.000TL");
        else if (whichQuestion == 7)
            textViewSoruDegeri.setText("7.Soru : 25.000TL");
        else if (whichQuestion == 8)
            textViewSoruDegeri.setText("8.Soru : 50.000TL");
        else if (whichQuestion == 9)
            textViewSoruDegeri.setText("9.Soru : 250.000TL");
        else if (whichQuestion == 10)
            textViewSoruDegeri.setText("10.Soru : 1.000.000TL");
        else
            textViewSoruDegeri.setText("Tebrikler!");
    }

    private void questionPool()
    {
        question1 = new Question("Ara??lar??n bir ana yoldaki trafi??e daha g??venli ??ekilde kat??lmalar?? i??in yap??lm???? ???kat??lma ??eridi??? de denilen ??eritlere ne ad verilir?",
                "H??zlanma ??eridi",
                "Sol ??erit",
                "T??rmanma ??eridi",
                "Emniyet ??eridi");
        question2 = new Question("A????l???? t??renlerine veya d??????nlere kat??lamayan ki??iler genellikle ne g??nderirler?",
                "??elenk",
                "Meyve Taba????",
                "??stek ??ark??",
                "??ek");
        question3 = new Question("?????uraya ne yaz??ld??ysa o olur??? diyen biri parma????yla nereyi i??aret eder?",
                "Aln??n??",
                "Ensesini",
                "Avu?? ????ini",
                "G????s??n??");
        question4 = new Question("K??p??rdamay??n, ??ekiyorum, ??ekiyorum, ??ektim??? diyen ki??i muhtemelen kimdir?",
                "Foto??raf????",
                "Ressam",
                "Di????i",
                "Niyet??i");
        question5 = new Question("El ve y??z temizli??inde kullan??lan, nemlendirilmi??, ho?? kokulu ???kolonyal????? mendilleri i??in kullan??lan di??er ifade hangisidir?",
                "Islak",
                "Sulu",
                "Nemli",
                "Kokulu");
        question6 = new Question("Uzun s??reli bekleyi??in sonunda istedi??ini elde eden ki??iler i??in kullan??lan ???turnay?? g??z??nden vurdu??? ??eklinde biten s??z??n ba????nda hangisi s??ylenir?",
                "Durdu durdu",
                "Bakt?? bakt??",
                "??l??t?? bi??ti",
                "Gezdi tozdu");

        questionPool.add(question1);
        questionPool.add(question2);
        questionPool.add(question3);
        questionPool.add(question4);
        questionPool.add(question5);
        questionPool.add(question6);
    }
}
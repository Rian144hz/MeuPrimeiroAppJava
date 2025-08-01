package com.matheussouza.frasesdodia.ui;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.matheussouza.frasesdodia.R;
import com.matheussouza.frasesdodia.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String[] frases = {
            "A persistência realiza o impossível.",
            "Você é mais forte do que imagina.",
            "Nunca é tarde para recomeçar.",
            "Programar é transformar café em código.",
            "A lógica leva você do ponto A ao ponto B. A imaginação leva você a qualquer lugar — inclusive ao código perfeito.",
            "Programar não é digitar código, é resolver problemas.",
            "Erros são apenas degraus no caminho da solução.",
            "Com grandes linhas de código, vêm grandes responsabilidades.",
            "Quem não aprende a depurar, aprende a sofrer.",
            "Cada bug é uma oportunidade de aprender algo novo.",
            "Programadores não dormem, apenas entram em modo de espera.",
            "Na dúvida, imprime no console.",
            "O computador faz o que você manda, não o que você quer."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.btnGerarFrases.setOnClickListener(v -> gerarFrases());
    }

    public void gerarFrases() {
        String[] frases = {
                "A persistência realiza o impossível.",
                "Você é mais forte do que imagina.",
                "Nunca é tarde para recomeçar.",
                "Programar é transformar café em código.",
                "A lógica leva você do ponto A ao ponto B. A imaginação leva você a qualquer lugar — inclusive ao código perfeito.",
                "Programar não é digitar código, é resolver problemas.",
                "Erros são apenas degraus no caminho da solução.",
                "Com grandes linhas de código, vêm grandes responsabilidades.",
                "Quem não aprende a depurar, aprende a sofrer.",
                "Cada bug é uma oportunidade de aprender algo novo.",
                "Programadores não dormem, apenas entram em modo de espera.",
                "Na dúvida, imprime no console.",
                "O computador faz o que você manda, não o que você quer."
        };
        int random = (int) (Math.random() * frases.length);
        binding.tvresultado.setText(frases[random]);
    }

}



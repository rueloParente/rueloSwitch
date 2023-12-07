package org.example.Bloco3;

public class Exercicio11 {
    //Elabore uma solução em Java que receba as notas inteiras, entre 0 e 20, dos alunos de uma turma, e que
    //devolva as notas qualitativas correspondentes, de acordo com a seguinte tabela de equivalências.
    public static char returnsGradeCharTakingNote (int note){
        char grade = 'X';
            if (note >= 0 && note <= 4) grade = 'E';
            else if (note >= 5 && note <= 9) grade = 'D';
            else if (note >= 10 && note <= 13) grade = 'C';
            else if (note >= 14 && note <= 17) grade = 'B';
            else if (note >= 18 && note <= 20) grade = 'A';
        return grade;
    }
}

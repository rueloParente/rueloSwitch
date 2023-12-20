package org.example.Bloco5;
public class Matrix {
    private Vetor[] matrix;
    //a) Construtor público em que o array encapsulado fica vazio (i.e. sem valores).
    public Matrix(){
        this.matrix = new Vetor[]{};
    }
    //b) Construtor público que permita inicializar o array encapsulado com alguns valores.
    public Matrix(Vetor[] array){
        this.matrix = new Vetor[array.length];
        for (int i=0; i< matrix.length; i++){
            this.matrix[i] = array[i];
        }
    }
    //c) Adicione um novo elemento (valor) ao array encapsulado numa determinada linha, criando assim
    //uma nova coluna nessa linha.
    //Use the method addElement from the class Vetor
    public void addElement(int line, int value){
        matrix[line].addValueToVetor(value);
    }
    //d) Retire o primeiro elemento do array encapsulado com um determinado valor (percorrendo
    //primeiramente as linhas). A linha onde o elemento for retirado, ficará com menos uma coluna.
    public void removeElement (int value){
        for(int i=0; i<matrix.length; i++){
            int length = matrix[i].vetorLength();
            matrix[i].removeFirstOcurrenceOfValue(value);
            if (matrix[i].vetorLength() != length){
                break;
            }
        }
    }
    //e) Retorne True caso a matriz esteja vazia e False em caso contrário.
    public boolean isMatrixEmpty (){
        return (matrix.length==0);
    }
    //f) Retorne o maior elemento do array.
    public int returnBiggestElement (){
        int biggests = matrix[0].returnBiggestElementInVetor();
        for (int i=0; i<matrix.length; i++){
            biggests = Math.max(matrix[i].returnBiggestElementInVetor(), biggests);
        }
        return biggests;
    }
    //g) Retorne o menor elemento do array.
    public int returnSmallestElement (){
        int smallest = matrix[0].returnSmallestElementInVetor();
        for (int i=0; i<matrix.length; i++){
            smallest = Math.min(matrix[i].returnSmallestElementInVetor(), smallest);
        }
        return smallest;
    }
    //h) Retorne a média dos elementos do array.
    public double returnAverage (){
        double sum = 0;
        for (int i=0; i<matrix.length; i++){
            sum += matrix[i].returnAverageOfElements();
        }
        return sum/matrix.length;
    }
    //i) Retorne um vetor em que cada posição corresponde à soma dos elementos da linha homóloga
    //do array encapsulado.
    public Vetor returnSumOfLines (){
        Vetor sumOfLines = new Vetor ();
        for (int i=0; i<matrix.length; i++){
            double average = matrix[i].returnAverageOfElements();
            int sum = (int) average * matrix[i].vetorLength();
            sumOfLines.addValueToVetor(sum);
        }
        return sumOfLines;
    }
    //j) Retorne um vetor em que cada posição corresponde à soma dos elementos da coluna homóloga
    //do array encapsulado.
    public Vetor returnSumOfColumns (){
        Vetor sumOfColumns = new Vetor();
        for (int i=0; i<matrix[0].vetorLength(); i++){
            Vetor temp = getColumnToArray(matrix, i);
            int value = (int)temp.returnAverageOfElements()*temp.vetorLength();
            sumOfColumns.addValueToVetor(value);
        }
        return sumOfColumns;
    }
    //k) Retorne o índice da linha do array com maior soma dos respetivos elementos. Deve ser usado o
    //método da alínea i).
    public int returnIndexLineWithBiggestSumOfElements (){
        Vetor sumOfLines = returnSumOfLines();
        int highest = sumOfLines.returnBiggestElementInVetor();
        int index = 0;
        for (int i=0; i < sumOfLines.vetorLength(); i++){
            if (sumOfLines.returnValueAtPosition(i) == highest){
                index = i;
            }
        }
        return index;
    }
    //l) Retorne True se o array encapsulado corresponde a uma matriz quadrada.
    public boolean isMatrixSquare (){
        for(int i=0; i<matrix.length; i++){
            if (matrix.length != matrix[i].vetorLength()){
                return false;
            }
        }
        return true;
    }
    //m) Retorne True se o array encapsulado corresponde a uma matriz quadrada simétrica.
    public boolean isMatrixSquareSymmetric (){
        if (!isMatrixSquare()){
            return false;
        }
        for (int i=0; i<matrix.length; i++){
            Vetor column = getColumnToArray(matrix, i);
            int[] array = matrix[i].getVetor();
            if (!column.trueIfVetorIsEqualToGivenVetor(array)){
                return false;
            }
            
        }
        return true;
    }
    //n) Retorne a quantidade de elementos não nulos na diagonal principal da matriz (se quadrada) ou -
    //1 (se não for quadrada).

    //o) Retorne True caso a diagonal principal e a secundária sejam iguais, i.e. tenham os mesmos
    //elementos e pela mesma ordem.


    //p) Retorne um vetor com todos os elementos do array encapsulado cujo número de algarismos é
    //superior ao número médio de algarismos de todos os elementos do array.

    //q) Retorne um vetor com todos os elementos do array cuja percentagem de algarismos pares é
    //superior à média da percentagem de algarismos pares de todos os elementos do array.
    //r) Inverta a ordem dos valores de cada linha do array encapsulado.
    //s) Inverta a ordem dos valores de cada coluna do array encapsulado.
    //t) Rode 90º os valores do array encapsulado.
    //u) Rode 180º os valores do array encapsulado.
    //v) Rode -90º os valores do array encapsulado.

    public static Vetor getColumnToArray (Vetor[] matrix, int column){
        Vetor array = new Vetor();
        for (int i=0; i < matrix.length; i++){
            int value = matrix[i].returnValueAtPosition(column);
            array.addValueToVetor(value);
        }
        return array;
    }
    public int[] getMainDiagonalToArray (int[][] matrix){
        int[] array = new int[matrix.length];
        for (int i=0; i < array.length; i++){
            array[i] = matrix[i][i];
        }
        return array;
    }
    public int[] getSecondaryDiagonalToArray (int[][] matrix){
        int[] array = new int[matrix.length];
        int counter = matrix.length - 1;
        for (int i=0; i < array.length; i++){
            array[i] = matrix[i][counter];
            counter--;
        }
        return array;
    }
}

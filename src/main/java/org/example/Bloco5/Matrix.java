package org.example.Bloco5;
public class Matrix {
    private int[][] matrix;
    //a) Construtor público em que o array encapsulado fica vazio (i.e. sem valores).
    public Matrix(){
        this.matrix = new int[0][0];
    }
    //b) Construtor público que permita inicializar o array encapsulado com alguns valores.
    public Matrix(int[][] matrix){
        this.matrix = new int[matrix.length][];
        for (int i=0; i< matrix.length; i++){
            this.matrix[i] = matrix[i];
        }
    }
    //c) Adicione um novo elemento (valor) ao array encapsulado numa determinada linha, criando assim
    //uma nova coluna nessa linha.
    //Use the method addElement from the class Vetor
    public void addElement(int line, int value){
        Vetor newVetor = new Vetor(this.matrix[line]);
        newVetor.addValueToVetor(value);
        this.matrix[line] = newVetor.getVetor();
    }
    //d) Retire o primeiro elemento do array encapsulado com um determinado valor (percorrendo
    //primeiramente as linhas). A linha onde o elemento for retirado, ficará com menos uma coluna.
    public void removeElement (int value){
        for(int i=0; i<matrix.length; i++){
            Vetor tempVetor = new Vetor(matrix[i]);
            tempVetor.removeFirstOcurrenceOfValue(value);
            if (tempVetor.vetorLength() != matrix[i].length){
                matrix[i] = tempVetor.getVetor();
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
        int biggests = matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            Vetor vetorTemp = new Vetor(matrix[i]);
            biggests = Math.max(vetorTemp.returnBiggestElementInVetor(), biggests);
        }
        return biggests;
    }
    //g) Retorne o menor elemento do array.
    public int returnSmallestElement (){
        int smallest = matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            Vetor vetorTemp = new Vetor(matrix[i]);
            smallest = Math.min(vetorTemp.returnSmallestElementInVetor(), smallest);
        }
        return smallest;
    }
    //h) Retorne a média dos elementos do array.
    public double returnAverage (){
        double sum = 0;
        for (int i=0; i<matrix.length; i++){
            Vetor vetorTemp = new Vetor(matrix[i]);
            sum += vetorTemp.returnAverageOfElements();
        }
        return sum/matrix.length;
    }
    //i) Retorne um vetor em que cada posição corresponde à soma dos elementos da linha homóloga
    //do array encapsulado.
    public int[] returnSumOfLines (){
        int[] sumOfLines = new int[matrix.length];
        for (int i=0; i<matrix.length; i++){
            Vetor vetorTemp = new Vetor(matrix[i]);
            double average = vetorTemp.returnAverageOfElements();

            sumOfLines[i] = vetorTemp.vetorLength();
        }
        return sumOfLines;
    }
    //j) Retorne um vetor em que cada posição corresponde à soma dos elementos da coluna homóloga
    //do array encapsulado.
    public int[] returnSumOfColumns (){
        int[] sumOfColumns = new int[matrix[0].length];
        for (int i=0; i<matrix[0].length; i++){
            int sum = 0;
            for (int j=0; j<matrix.length; j++){
                sum += matrix[j][i];
            }
            sumOfColumns[i] = sum;
        }
        return sumOfColumns;
    }
    //k) Retorne o índice da linha do array com maior soma dos respetivos elementos. Deve ser usado o
    //método da alínea i).
    public int returnIndexLineWithBiggestSumOfElements (){
        int[] sumOfLines = returnSumOfLines();
        int biggestSum = sumOfLines[0];
        int index = 0;
        for (int i=0; i<sumOfLines.length; i++){
            if (sumOfLines[i] > biggestSum){
                biggestSum = sumOfLines[i];
                index = i;
            }
        }
        return index;
    }
    //l) Retorne True se o array encapsulado corresponde a uma matriz quadrada.
    public boolean isMatrixSquare (){
        for(int i=0; i<matrix.length; i++){
            if (matrix.length != matrix[i].length){
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
            int[] column = getColumnToArray(matrix, i);
            Vetor lineVector = new Vetor(matrix[i]);
            if (!lineVector.trueIfVetorIsEqualToGivenVetor(column)){
                return false;
            }
        }
        return true;
    }
    //n) Retorne a quantidade de elementos não nulos na diagonal principal da matriz (se quadrada) ou -
    //1 (se não for quadrada).
    public int returnQuantityOfNonZeroElementsInMainDiagonal (){
        if (!isMatrixSquare()){
            return -1;
        }
        int counter = 0;
        for (int i=0; i<matrix.length; i++){
            if (matrix[i][i] != 0){
                counter++;
            }
        }
        return counter;
    }
    //o) Retorne True caso a diagonal principal e a secundária sejam iguais, i.e. tenham os mesmos
    //elementos e pela mesma ordem.
    public boolean trueIfMainAndSecondaryDiagonalAreEqual (){
        if (!isMatrixSquare()){
            return false;
        }
        int[] mainDiagonal = getMainDiagonalToArray(matrix);
        int[] secondaryDiagonal = getSecondaryDiagonalToArray(matrix);
        Vetor mainDiagonalVector = new Vetor(mainDiagonal);
        return mainDiagonalVector.trueIfVetorIsEqualToGivenVetor(secondaryDiagonal);
    }

    //p) Retorne um vetor com todos os elementos do array encapsulado cujo número de algarismos é
    //superior ao número médio de algarismos de todos os elementos do array.

    //q) Retorne um vetor com todos os elementos do array cuja percentagem de algarismos pares é
    //superior à média da percentagem de algarismos pares de todos os elementos do array.
    //r) Inverta a ordem dos valores de cada linha do array encapsulado.
    //s) Inverta a ordem dos valores de cada coluna do array encapsulado.
    //t) Rode 90º os valores do array encapsulado.
    //u) Rode 180º os valores do array encapsulado.
    //v) Rode -90º os valores do array encapsulado.

    public static int[] getColumnToArray (int[][] matrix, int column){
        int[] array = new int[matrix.length];
        for (int i=0; i < array.length; i++){
            array[i] = matrix[i][column];
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

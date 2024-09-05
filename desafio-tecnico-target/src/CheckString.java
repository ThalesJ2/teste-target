import java.util.HashMap;

public class CheckString {

    public static void main(String[] args) {
        String letters = "aaaadnfbsd";

        checkExistingLetterA(letters);
        int k=1;
        int indice=12;
        int soma =0;
        while(k<indice){
            k+=1;
            soma+=k;

        }
        System.out.println(soma);
    }

    public static void checkExistingLetterA(String letters){
        int count=0;
        for(int i=0;i<letters.length();i++){
            if(letters.charAt(i)=='a' || letters.charAt(i)=='A'){
               count++;
            }
        }

        if(count >0){
            System.out.println("Essa string contem a letra A");
            System.out.println("Quantidae: "+count);
        }
        else
            System.out.println("Essa String nao contem a letra A");
    }
}

import java.util.*;


public class TextSegmentationPrint {
Stack<String> ans=new Stack();
public String[] dic;//=new String();
public String bank;//=new String("iloveicecreamandmango");
int n;
List dicc;
TextSegmentationPrint(String[] dict, String bankk){
    dic=dict;
    dicc=Arrays.asList(dic);
    bank=bankk;
    n=bank.length(); 
}

boolean isWord(int i, int j){

if(dicc.contains(bank.substring(i, j+1))){return true;};
return false;

}
    boolean isSplittable(int i){

    if(i>=n){
        return true;
    }
    for(int j=i; j<n; j++){ 
        if(isWord(i, j)){
            ans.push(bank.substring(i, j+1));
                if(isSplittable(j+1)){
                    return true;
                }  
            ans.pop();

        }
    
    }

    return false;
}
Stack<String> printt(){
return ans;
}


public static void main(String[] args) {
    String[] dic={"mobile","samsung","sam","sung", 
    "man","mango", "icecream","and", 
    "go","i","love","ice","cream"};
    String bank=new String("iloveicecreamandmango");
    TextSegmentationPrint test=new TextSegmentationPrint(dic,bank);
    
    if(test.isSplittable(0)){
        System.out.println(test.printt());
    }
    else{
        System.out.println(false);
    }


}
}
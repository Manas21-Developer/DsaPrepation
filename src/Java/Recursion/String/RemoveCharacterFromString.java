package Recursion.String;

public class RemoveCharacterFromString {

    static void helper (String str , int idx,
                        StringBuilder ans , char removeCh ){
        if (idx == str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        if(ch != removeCh) ans.append(ch);
        helper(str,idx+1,ans,removeCh);

    }

    static void main(String[] args) {
        helper("baccadbag",0,new StringBuilder(),'c');
    }
}

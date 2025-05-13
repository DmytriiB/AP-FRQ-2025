public class SignedText{
    private String firstName;
    private String lastName;

    public SignedText(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    public String getSignature(){
        if(firstName.length()==0){
            return lastName;
        }
        else{
            return firstName.substring(0,1)+"-"+lastName;
        }
    }

    public String addSignature(String str){
        String sig = getSignature();
        int sigLen = sig.length();

        if(str.idexOf(sig) == str.length() - sigLen && str.length() >= sigLen){
            return str;
        }
        else if(str.indexOf(sig) == 0){
            return str.substring(sigLen) + sig;
        }
        else{
            return str + sig;
        }
    }
}
  

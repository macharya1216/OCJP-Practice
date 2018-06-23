package advanced.clasz.design.equalscontract.symmetry;

/*Class demonstrates how symmetry is broken
because CaseInsensitiveString tries to
include String in its equals(..) comparision.

While CaseInsensitiveString returns true for a
logically equal String, the String will not
know anything about CaseInsensitiveString
and hence return false when the String equals(..) method
is used to compare a CaseInsensitiveString*/

public class CaseInsensitiveString{
        private final String s;

        public CaseInsensitiveString(String s){
            if(s == null)
                throw new NullPointerException();
            this.s = s;
        }
        public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString)
        return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);

        if(o instanceof String)
        return s.equalsIgnoreCase((String) o);
        return false;
        }


       public static void main (String[] args){
            CaseInsensitiveString cis = new CaseInsensitiveString("OCJP");
            String s = "OCJP";
           assert (cis.equals(s));
           assert (!s.equals(cis));
       }
        }

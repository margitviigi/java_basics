package week8.Ex9;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.country = country;
        this.regCode = regCode;
    }
    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString(){
        return country+ " "+regCode;
    }
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        RegistrationPlate compare = (RegistrationPlate)object;

        if (this.country != compare.getCountry()){
            return false;
        }

        if(this.regCode == null || !this.regCode.equals(compare.getRegCode())){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null){
            return 0;
        }
        return this.regCode.hashCode() +  this.country.hashCode();
    }
}
public class Saude {

    String statusMental = "boa";
    String statusCorporal = "boa";

    public Saude(){}

    public String getSaudeGeral(){
        if (statusCorporal.equals("boa")){

            if (statusMental.equals("boa")) {
                return statusCorporal;
            }

            return statusMental;
        }

        if (statusMental.equals("boa")){
            return "ok";
        }

    }

    public void defineSaudeFisica(String status){
        this.statusCorporal = status;
    }

    public void defineSaudeMental(String status){
        this.statusMental = status;
    }




}

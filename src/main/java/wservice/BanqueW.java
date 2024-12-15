package wservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebService(serviceName = "BanqueWS")
public class BanqueW {



       @WebMethod(operationName = "ConversionEuroToDH")
    public double ConvertEuroToDH(@WebParam(name="montant") double code){

        return code*11;

    }
    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code,7000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> lc=new ArrayList<Compte>();;
        lc.add(new Compte(1,Math.random()*60000,new Date()));
        lc.add(new Compte(2,Math.random()*60000,new Date()));
        lc.add(new Compte(3,Math.random()*60000,new Date()));
        return lc;

    }
}

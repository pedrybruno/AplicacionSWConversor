/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversor;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Bruno
 */
@WebService(serviceName = "SWConversor")
public class SWConversor {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dol_eur")
    public double dol_eur(@WebParam(name = "parametro") double parametro1) {
        //TODO write your implementation code here:
        return parametro1*0.8;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dol_lib")
    public double dol_lib(@WebParam(name = "parametro") double parametro1) {
        //TODO write your implementation code here:
        return parametro1*0.7;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dol_pes")
    public double dol_pes(@WebParam(name = "parametro") double parametro1) {
        //TODO write your implementation code here:
        return parametro1*0.5;
    }
}

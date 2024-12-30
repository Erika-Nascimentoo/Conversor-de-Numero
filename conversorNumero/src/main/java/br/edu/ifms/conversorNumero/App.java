package br.edu.ifms.conversorNumero;

import java.math.BigDecimal;
import java.net.URL;


import javax.xml.namespace.QName;

import br.edu.ifms.conversorNumero.servico.NumberConversionSoapType;
import jakarta.xml.ws.Service;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        URL url = new URL("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL");
   
        QName qname = new QName("http://www.dataaccess.com/webservicesserver/","NumberConversion");
   
       	
    Service service = Service.create(url,qname);
    NumberConversionSoapType c = service.getPort(NumberConversionSoapType.class);
    
    BigDecimal numero = new BigDecimal(20);
   String r =  c.numberToDollars(numero);
    System.out.println(r);
    }
}

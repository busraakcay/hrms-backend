package busra.hrms.adapters.concretes;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Component;

import busra.hrms.adapters.abstracts.MernisCheckService;
import busra.hrms.entities.concretes.Unemployed;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter implements MernisCheckService {
	
	@Override
	public boolean checkIfRealPerson(Unemployed unemployed) {
//		KPSPublicSoapProxy soap = new KPSPublicSoapProxy();
//		boolean check = true;
//		try {
//			check = soap.TCKimlikNoDogrula(
//					Long.parseLong(unemployed.getNationalityId()), 
//					unemployed.getName().toUpperCase(new Locale("tr")), 
//					unemployed.getSurname().toUpperCase(new Locale("tr")), 
//					unemployed.getBirthYear());
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
//		return check;
		return true;
	}
}

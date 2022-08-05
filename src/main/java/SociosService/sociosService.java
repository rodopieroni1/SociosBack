package SociosService;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Socios.socios.SociosRep.sociosRep;


import Json.SociosJson;
import exeption.sociosExceptions;

@Component
@Service
public interface sociosService {
	
    List<sociosRep> findAll();
	public List<SociosJson> getSocios() throws sociosExceptions;

}

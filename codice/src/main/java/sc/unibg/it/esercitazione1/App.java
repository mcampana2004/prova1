package sc.unibg.it.esercitazione1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 */
public class App {
	
	static final Logger logger= LogManager.getRootLogger();
	
	
	
    public static void main(String[] args) {
        logger.debug("Sto entrando nel main");
    	logger.info("La somma di 3+5 è ");
    	logger.debug("calcolo la somma");
     	logger.info(Calcolator.somma(3, 5));
       
    }
}

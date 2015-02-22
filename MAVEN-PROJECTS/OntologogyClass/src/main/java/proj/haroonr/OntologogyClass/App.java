package proj.haroonr.OntologogyClass;

import java.io.IOException;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
     OntModel ont = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
     //ont.read("Ontologies/sports.owl");
     
    }
}

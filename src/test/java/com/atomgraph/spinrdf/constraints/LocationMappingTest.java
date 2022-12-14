/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See the NOTICE file distributed with this work for additional
 *  information regarding copyright ownership.
 */
package com.atomgraph.spinrdf.constraints;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.Ontology;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.sys.JenaSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Martynas Jusevičius {@literal <martynas@atomgraph.com>}
 */
public class LocationMappingTest
{

    private OntModel ontModel;
    private Ontology ontology;

    static
    {
        JenaSystem.init();
    }

    @Before
    public void ontology()
    {
        ontModel = ModelFactory.createOntologyModel();
        
        ontology = ontModel.createOntology("http://ontology/");
        ontology.addImport(FOAF.NAMESPACE);
        ontModel.loadImports();
    }
    
    @Test
    public void validateSystem()
    {
        Assert.assertNotEquals(0, ontModel.size());
    }
    
}

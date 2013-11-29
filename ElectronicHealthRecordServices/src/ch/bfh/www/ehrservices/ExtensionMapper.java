
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package ch.bfh.www.ehrservices;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Person".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Person.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "ConfidentialyLevel".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.ConfidentialyLevel.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "OrganisationHP".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.OrganisationHP.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "SpecialPermissions".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.SpecialPermissions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "healthCareProfessional".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.HealthCareProfessional.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Role".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Role.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Organisation".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Organisation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Patient".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Patient.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Address".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "Attributes".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Attributes.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "DocumentRegisterEntry".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.DocumentRegisterEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "documentLog".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.DocumentLog.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "permissionSchema".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.PermissionSchema.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
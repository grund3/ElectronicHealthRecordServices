
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
                  "OrganisationHPType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.OrganisationHPType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "AddressType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.AddressType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "SpecialPermissionsType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.SpecialPermissionsType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "RoleType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.RoleType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "PersonType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.PersonType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "DocumentRegisterEntryType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.DocumentRegisterEntryType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "PatientType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.PatientType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "AttributesType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.AttributesType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "DocumentLogType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.DocumentLogType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "PermissionSchemaType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.PermissionSchemaType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "HealthCareProfessionalType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.HealthCareProfessionalType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "OrganisationType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.OrganisationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "ConfidentialyLevelType".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.ConfidentialyLevelType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
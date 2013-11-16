
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
                  "Address".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.bfh.ch/ehrServices/".equals(namespaceURI) &&
                  "User".equals(typeName)){
                   
                            return  ch.bfh.www.ehrservices.User.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
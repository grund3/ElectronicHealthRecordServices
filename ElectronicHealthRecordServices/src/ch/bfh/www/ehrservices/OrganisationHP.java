
/**
 * OrganisationHP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package ch.bfh.www.ehrservices;
            

            /**
            *  OrganisationHP bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OrganisationHP
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OrganisationHP
                Namespace URI = http://www.bfh.ch/ehrServices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for HealthcareProfessional
                        */

                        
                                    protected ch.bfh.www.ehrservices.HealthCareProfessional localHealthcareProfessional ;
                                

                           /**
                           * Auto generated getter method
                           * @return ch.bfh.www.ehrservices.HealthCareProfessional
                           */
                           public  ch.bfh.www.ehrservices.HealthCareProfessional getHealthcareProfessional(){
                               return localHealthcareProfessional;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HealthcareProfessional
                               */
                               public void setHealthcareProfessional(ch.bfh.www.ehrservices.HealthCareProfessional param){
                            
                                            this.localHealthcareProfessional=param;
                                    

                               }
                            

                        /**
                        * field for Organisation
                        */

                        
                                    protected ch.bfh.www.ehrservices.Organisation localOrganisation ;
                                

                           /**
                           * Auto generated getter method
                           * @return ch.bfh.www.ehrservices.Organisation
                           */
                           public  ch.bfh.www.ehrservices.Organisation getOrganisation(){
                               return localOrganisation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Organisation
                               */
                               public void setOrganisation(ch.bfh.www.ehrservices.Organisation param){
                            
                                            this.localOrganisation=param;
                                    

                               }
                            

                        /**
                        * field for HpType
                        */

                        
                                    protected java.lang.String localHpType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHpTypeTracker = false ;

                           public boolean isHpTypeSpecified(){
                               return localHpTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHpType(){
                               return localHpType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HpType
                               */
                               public void setHpType(java.lang.String param){
                            localHpTypeTracker = param != null;
                                   
                                            this.localHpType=param;
                                    

                               }
                            

                        /**
                        * field for Zsr
                        */

                        
                                    protected java.lang.String localZsr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localZsrTracker = false ;

                           public boolean isZsrSpecified(){
                               return localZsrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getZsr(){
                               return localZsr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Zsr
                               */
                               public void setZsr(java.lang.String param){
                            localZsrTracker = param != null;
                                   
                                            this.localZsr=param;
                                    

                               }
                            

                        /**
                        * field for Role
                        */

                        
                                    protected java.lang.String localRole ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoleTracker = false ;

                           public boolean isRoleSpecified(){
                               return localRoleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRole(){
                               return localRole;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Role
                               */
                               public void setRole(java.lang.String param){
                            localRoleTracker = param != null;
                                   
                                            this.localRole=param;
                                    

                               }
                            

                        /**
                        * field for RoleID
                        */

                        
                                    protected int localRoleID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoleIDTracker = false ;

                           public boolean isRoleIDSpecified(){
                               return localRoleIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRoleID(){
                               return localRoleID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoleID
                               */
                               public void setRoleID(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localRoleIDTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localRoleID=param;
                                    

                               }
                            

                        /**
                        * field for AccessTill
                        */

                        
                                    protected java.util.Calendar localAccessTill ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccessTillTracker = false ;

                           public boolean isAccessTillSpecified(){
                               return localAccessTillTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getAccessTill(){
                               return localAccessTill;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccessTill
                               */
                               public void setAccessTill(java.util.Calendar param){
                            localAccessTillTracker = param != null;
                                   
                                            this.localAccessTill=param;
                                    

                               }
                            

                        /**
                        * field for OrganisationHPID
                        */

                        
                                    protected int localOrganisationHPID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOrganisationHPID(){
                               return localOrganisationHPID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrganisationHPID
                               */
                               public void setOrganisationHPID(int param){
                            
                                            this.localOrganisationHPID=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.bfh.ch/ehrServices/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OrganisationHP",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OrganisationHP",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localHealthcareProfessional==null){
                                                 throw new org.apache.axis2.databinding.ADBException("healthcareProfessional cannot be null!!");
                                            }
                                           localHealthcareProfessional.serialize(new javax.xml.namespace.QName("","healthcareProfessional"),
                                               xmlWriter);
                                        
                                            if (localOrganisation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("organisation cannot be null!!");
                                            }
                                           localOrganisation.serialize(new javax.xml.namespace.QName("","organisation"),
                                               xmlWriter);
                                         if (localHpTypeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "hpType", xmlWriter);
                             

                                          if (localHpType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("hpType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHpType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localZsrTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "zsr", xmlWriter);
                             

                                          if (localZsr==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("zsr cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localZsr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoleTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "role", xmlWriter);
                             

                                          if (localRole==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("role cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRole);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoleIDTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "roleID", xmlWriter);
                             
                                               if (localRoleID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("roleID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAccessTillTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "accessTill", xmlWriter);
                             

                                          if (localAccessTill==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("accessTill cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessTill));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "";
                                    writeStartElement(null, namespace, "organisationHPID", xmlWriter);
                             
                                               if (localOrganisationHPID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("organisationHPID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrganisationHPID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.bfh.ch/ehrServices/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "healthcareProfessional"));
                            
                            
                                    if (localHealthcareProfessional==null){
                                         throw new org.apache.axis2.databinding.ADBException("healthcareProfessional cannot be null!!");
                                    }
                                    elementList.add(localHealthcareProfessional);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "organisation"));
                            
                            
                                    if (localOrganisation==null){
                                         throw new org.apache.axis2.databinding.ADBException("organisation cannot be null!!");
                                    }
                                    elementList.add(localOrganisation);
                                 if (localHpTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "hpType"));
                                 
                                        if (localHpType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHpType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("hpType cannot be null!!");
                                        }
                                    } if (localZsrTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "zsr"));
                                 
                                        if (localZsr != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localZsr));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("zsr cannot be null!!");
                                        }
                                    } if (localRoleTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "role"));
                                 
                                        if (localRole != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRole));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("role cannot be null!!");
                                        }
                                    } if (localRoleIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "roleID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleID));
                            } if (localAccessTillTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "accessTill"));
                                 
                                        if (localAccessTill != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessTill));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("accessTill cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "organisationHPID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrganisationHPID));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static OrganisationHP parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OrganisationHP object =
                new OrganisationHP();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"OrganisationHP".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OrganisationHP)ch.bfh.www.ehrservices.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","healthcareProfessional").equals(reader.getName())){
                                
                                                object.setHealthcareProfessional(ch.bfh.www.ehrservices.HealthCareProfessional.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","organisation").equals(reader.getName())){
                                
                                                object.setOrganisation(ch.bfh.www.ehrservices.Organisation.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hpType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hpType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHpType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","zsr").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"zsr" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setZsr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","role").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"role" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRole(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","roleID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"roleID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoleID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRoleID(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accessTill").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"accessTill" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccessTill(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","organisationHPID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"organisationHPID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrganisationHPID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
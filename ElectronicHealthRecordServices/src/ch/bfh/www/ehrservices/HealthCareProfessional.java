
/**
 * HealthCareProfessional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package ch.bfh.www.ehrservices;
            

            /**
            *  HealthCareProfessional bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class HealthCareProfessional
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = healthCareProfessional
                Namespace URI = http://www.bfh.ch/ehrServices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for HcpID
                        */

                        
                                    protected int localHcpID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getHcpID(){
                               return localHcpID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HcpID
                               */
                               public void setHcpID(int param){
                            
                                            this.localHcpID=param;
                                    

                               }
                            

                        /**
                        * field for Person
                        */

                        
                                    protected ch.bfh.www.ehrservices.Person localPerson ;
                                

                           /**
                           * Auto generated getter method
                           * @return ch.bfh.www.ehrservices.Person
                           */
                           public  ch.bfh.www.ehrservices.Person getPerson(){
                               return localPerson;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Person
                               */
                               public void setPerson(ch.bfh.www.ehrservices.Person param){
                            
                                            this.localPerson=param;
                                    

                               }
                            

                        /**
                        * field for QualitativeDignity
                        */

                        
                                    protected java.lang.String localQualitativeDignity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQualitativeDignityTracker = false ;

                           public boolean isQualitativeDignitySpecified(){
                               return localQualitativeDignityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualitativeDignity(){
                               return localQualitativeDignity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualitativeDignity
                               */
                               public void setQualitativeDignity(java.lang.String param){
                            localQualitativeDignityTracker = param != null;
                                   
                                            this.localQualitativeDignity=param;
                                    

                               }
                            

                        /**
                        * field for Gln
                        */

                        
                                    protected java.lang.String localGln ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGlnTracker = false ;

                           public boolean isGlnSpecified(){
                               return localGlnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGln(){
                               return localGln;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gln
                               */
                               public void setGln(java.lang.String param){
                            localGlnTracker = param != null;
                                   
                                            this.localGln=param;
                                    

                               }
                            

                        /**
                        * field for Fmh
                        */

                        
                                    protected java.lang.String localFmh ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFmhTracker = false ;

                           public boolean isFmhSpecified(){
                               return localFmhTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFmh(){
                               return localFmh;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fmh
                               */
                               public void setFmh(java.lang.String param){
                            localFmhTracker = param != null;
                                   
                                            this.localFmh=param;
                                    

                               }
                            

                        /**
                        * field for Hpc
                        */

                        
                                    protected java.lang.String localHpc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHpcTracker = false ;

                           public boolean isHpcSpecified(){
                               return localHpcTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHpc(){
                               return localHpc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Hpc
                               */
                               public void setHpc(java.lang.String param){
                            localHpcTracker = param != null;
                                   
                                            this.localHpc=param;
                                    

                               }
                            

                        /**
                        * field for Phone
                        */

                        
                                    protected java.lang.String localPhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneTracker = false ;

                           public boolean isPhoneSpecified(){
                               return localPhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhone(){
                               return localPhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Phone
                               */
                               public void setPhone(java.lang.String param){
                            localPhoneTracker = param != null;
                                   
                                            this.localPhone=param;
                                    

                               }
                            

                        /**
                        * field for Email
                        */

                        
                                    protected java.lang.String localEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;

                           public boolean isEmailSpecified(){
                               return localEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmail(){
                               return localEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Email
                               */
                               public void setEmail(java.lang.String param){
                            localEmailTracker = param != null;
                                   
                                            this.localEmail=param;
                                    

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
                           namespacePrefix+":healthCareProfessional",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "healthCareProfessional",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "";
                                    writeStartElement(null, namespace, "hcpID", xmlWriter);
                             
                                               if (localHcpID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("hcpID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHcpID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localPerson==null){
                                                 throw new org.apache.axis2.databinding.ADBException("person cannot be null!!");
                                            }
                                           localPerson.serialize(new javax.xml.namespace.QName("","person"),
                                               xmlWriter);
                                         if (localQualitativeDignityTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "qualitativeDignity", xmlWriter);
                             

                                          if (localQualitativeDignity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("qualitativeDignity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQualitativeDignity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGlnTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "gln", xmlWriter);
                             

                                          if (localGln==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("gln cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGln);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFmhTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "fmh", xmlWriter);
                             

                                          if (localFmh==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("fmh cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFmh);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHpcTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "hpc", xmlWriter);
                             

                                          if (localHpc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("hpc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHpc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPhoneTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "phone", xmlWriter);
                             

                                          if (localPhone==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("phone cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPhone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "email", xmlWriter);
                             

                                          if (localEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
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
                                                                      "hcpID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHcpID));
                            
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "person"));
                            
                            
                                    if (localPerson==null){
                                         throw new org.apache.axis2.databinding.ADBException("person cannot be null!!");
                                    }
                                    elementList.add(localPerson);
                                 if (localQualitativeDignityTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "qualitativeDignity"));
                                 
                                        if (localQualitativeDignity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualitativeDignity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("qualitativeDignity cannot be null!!");
                                        }
                                    } if (localGlnTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "gln"));
                                 
                                        if (localGln != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGln));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("gln cannot be null!!");
                                        }
                                    } if (localFmhTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "fmh"));
                                 
                                        if (localFmh != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFmh));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("fmh cannot be null!!");
                                        }
                                    } if (localHpcTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "hpc"));
                                 
                                        if (localHpc != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHpc));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("hpc cannot be null!!");
                                        }
                                    } if (localPhoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "phone"));
                                 
                                        if (localPhone != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhone));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("phone cannot be null!!");
                                        }
                                    } if (localEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "email"));
                                 
                                        if (localEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
                                        }
                                    }

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
        public static HealthCareProfessional parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HealthCareProfessional object =
                new HealthCareProfessional();

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
                    
                            if (!"healthCareProfessional".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HealthCareProfessional)ch.bfh.www.ehrservices.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hcpID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hcpID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHcpID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","person").equals(reader.getName())){
                                
                                                object.setPerson(ch.bfh.www.ehrservices.Person.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","qualitativeDignity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"qualitativeDignity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQualitativeDignity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","gln").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"gln" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGln(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fmh").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"fmh" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFmh(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hpc").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hpc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHpc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","phone").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"phone" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","email").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"email" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
    
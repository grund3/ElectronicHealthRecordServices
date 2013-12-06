
/**
 * DocumentRegisterEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package ch.bfh.www.ehrservices;
            

            /**
            *  DocumentRegisterEntry bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DocumentRegisterEntry
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DocumentRegisterEntry
                Namespace URI = http://www.bfh.ch/ehrServices/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DocumentType
                        */

                        
                                    protected java.lang.String localDocumentType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDocumentType(){
                               return localDocumentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentType
                               */
                               public void setDocumentType(java.lang.String param){
                            
                                            this.localDocumentType=param;
                                    

                               }
                            

                        /**
                        * field for DocumentRegisterID
                        */

                        
                                    protected int localDocumentRegisterID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDocumentRegisterID(){
                               return localDocumentRegisterID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentRegisterID
                               */
                               public void setDocumentRegisterID(int param){
                            
                                            this.localDocumentRegisterID=param;
                                    

                               }
                            

                        /**
                        * field for ConfindentialityLevel
                        */

                        
                                    protected java.lang.String localConfindentialityLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfindentialityLevelTracker = false ;

                           public boolean isConfindentialityLevelSpecified(){
                               return localConfindentialityLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConfindentialityLevel(){
                               return localConfindentialityLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfindentialityLevel
                               */
                               public void setConfindentialityLevel(java.lang.String param){
                            localConfindentialityLevelTracker = param != null;
                                   
                                            this.localConfindentialityLevel=param;
                                    

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
                        * field for DocumentUploader
                        */

                        
                                    protected ch.bfh.www.ehrservices.HealthCareProfessional localDocumentUploader ;
                                

                           /**
                           * Auto generated getter method
                           * @return ch.bfh.www.ehrservices.HealthCareProfessional
                           */
                           public  ch.bfh.www.ehrservices.HealthCareProfessional getDocumentUploader(){
                               return localDocumentUploader;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentUploader
                               */
                               public void setDocumentUploader(ch.bfh.www.ehrservices.HealthCareProfessional param){
                            
                                            this.localDocumentUploader=param;
                                    

                               }
                            

                        /**
                        * field for UploadDate
                        */

                        
                                    protected java.util.Calendar localUploadDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getUploadDate(){
                               return localUploadDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UploadDate
                               */
                               public void setUploadDate(java.util.Calendar param){
                            
                                            this.localUploadDate=param;
                                    

                               }
                            

                        /**
                        * field for CreationDate
                        */

                        
                                    protected java.util.Calendar localCreationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreationDateTracker = false ;

                           public boolean isCreationDateSpecified(){
                               return localCreationDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreationDate(){
                               return localCreationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreationDate
                               */
                               public void setCreationDate(java.util.Calendar param){
                            localCreationDateTracker = param != null;
                                   
                                            this.localCreationDate=param;
                                    

                               }
                            

                        /**
                        * field for Title
                        */

                        
                                    protected java.lang.String localTitle ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTitle(){
                               return localTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Title
                               */
                               public void setTitle(java.lang.String param){
                            
                                            this.localTitle=param;
                                    

                               }
                            

                        /**
                        * field for DocumentLog
                        * This was an Array!
                        */

                        
                                    protected ch.bfh.www.ehrservices.DocumentLog[] localDocumentLog ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDocumentLogTracker = false ;

                           public boolean isDocumentLogSpecified(){
                               return localDocumentLogTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return ch.bfh.www.ehrservices.DocumentLog[]
                           */
                           public  ch.bfh.www.ehrservices.DocumentLog[] getDocumentLog(){
                               return localDocumentLog;
                           }

                           
                        


                               
                              /**
                               * validate the array for DocumentLog
                               */
                              protected void validateDocumentLog(ch.bfh.www.ehrservices.DocumentLog[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DocumentLog
                              */
                              public void setDocumentLog(ch.bfh.www.ehrservices.DocumentLog[] param){
                              
                                   validateDocumentLog(param);

                               localDocumentLogTracker = param != null;
                                      
                                      this.localDocumentLog=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param ch.bfh.www.ehrservices.DocumentLog
                             */
                             public void addDocumentLog(ch.bfh.www.ehrservices.DocumentLog param){
                                   if (localDocumentLog == null){
                                   localDocumentLog = new ch.bfh.www.ehrservices.DocumentLog[]{};
                                   }

                            
                                 //update the setting tracker
                                localDocumentLogTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDocumentLog);
                               list.add(param);
                               this.localDocumentLog =
                             (ch.bfh.www.ehrservices.DocumentLog[])list.toArray(
                            new ch.bfh.www.ehrservices.DocumentLog[list.size()]);

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
                           namespacePrefix+":DocumentRegisterEntry",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DocumentRegisterEntry",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "";
                                    writeStartElement(null, namespace, "documentType", xmlWriter);
                             

                                          if (localDocumentType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("documentType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDocumentType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "documentRegisterID", xmlWriter);
                             
                                               if (localDocumentRegisterID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("documentRegisterID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentRegisterID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localConfindentialityLevelTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "confindentialityLevel", xmlWriter);
                             

                                          if (localConfindentialityLevel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("confindentialityLevel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConfindentialityLevel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localOrganisation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("organisation cannot be null!!");
                                            }
                                           localOrganisation.serialize(new javax.xml.namespace.QName("","organisation"),
                                               xmlWriter);
                                        
                                            if (localDocumentUploader==null){
                                                 throw new org.apache.axis2.databinding.ADBException("documentUploader cannot be null!!");
                                            }
                                           localDocumentUploader.serialize(new javax.xml.namespace.QName("","documentUploader"),
                                               xmlWriter);
                                        
                                    namespace = "";
                                    writeStartElement(null, namespace, "uploadDate", xmlWriter);
                             

                                          if (localUploadDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("uploadDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUploadDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCreationDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "creationDate", xmlWriter);
                             

                                          if (localCreationDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("creationDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "";
                                    writeStartElement(null, namespace, "title", xmlWriter);
                             

                                          if (localTitle==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDocumentLogTracker){
                                       if (localDocumentLog!=null){
                                            for (int i = 0;i < localDocumentLog.length;i++){
                                                if (localDocumentLog[i] != null){
                                                 localDocumentLog[i].serialize(new javax.xml.namespace.QName("","documentLog"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("documentLog cannot be null!!");
                                        
                                    }
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
                                                                      "documentType"));
                                 
                                        if (localDocumentType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("documentType cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "documentRegisterID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentRegisterID));
                             if (localConfindentialityLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "confindentialityLevel"));
                                 
                                        if (localConfindentialityLevel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfindentialityLevel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("confindentialityLevel cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "organisation"));
                            
                            
                                    if (localOrganisation==null){
                                         throw new org.apache.axis2.databinding.ADBException("organisation cannot be null!!");
                                    }
                                    elementList.add(localOrganisation);
                                
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "documentUploader"));
                            
                            
                                    if (localDocumentUploader==null){
                                         throw new org.apache.axis2.databinding.ADBException("documentUploader cannot be null!!");
                                    }
                                    elementList.add(localDocumentUploader);
                                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "uploadDate"));
                                 
                                        if (localUploadDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUploadDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("uploadDate cannot be null!!");
                                        }
                                     if (localCreationDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "creationDate"));
                                 
                                        if (localCreationDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreationDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("creationDate cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "title"));
                                 
                                        if (localTitle != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("title cannot be null!!");
                                        }
                                     if (localDocumentLogTracker){
                             if (localDocumentLog!=null) {
                                 for (int i = 0;i < localDocumentLog.length;i++){

                                    if (localDocumentLog[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "documentLog"));
                                         elementList.add(localDocumentLog[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("documentLog cannot be null!!");
                                    
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
        public static DocumentRegisterEntry parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DocumentRegisterEntry object =
                new DocumentRegisterEntry();

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
                    
                            if (!"DocumentRegisterEntry".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DocumentRegisterEntry)ch.bfh.www.ehrservices.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","documentType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"documentType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDocumentType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","documentRegisterID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"documentRegisterID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDocumentRegisterID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","confindentialityLevel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"confindentialityLevel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConfindentialityLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","documentUploader").equals(reader.getName())){
                                
                                                object.setDocumentUploader(ch.bfh.www.ehrservices.HealthCareProfessional.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","uploadDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"uploadDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUploadDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","creationDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"creationDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","documentLog").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(ch.bfh.www.ehrservices.DocumentLog.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","documentLog").equals(reader.getName())){
                                                                    list9.add(ch.bfh.www.ehrservices.DocumentLog.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDocumentLog((ch.bfh.www.ehrservices.DocumentLog[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                ch.bfh.www.ehrservices.DocumentLog.class,
                                                                list9));
                                                            
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
           
    
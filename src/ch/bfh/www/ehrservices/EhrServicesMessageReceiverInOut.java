
/**
 * EhrServicesMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package ch.bfh.www.ehrservices;

        /**
        *  EhrServicesMessageReceiverInOut message receiver
        */

        public class EhrServicesMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        EhrServicesSkeleton skel = (EhrServicesSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getDocumentById".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetDocumentByIdResponse getDocumentByIdResponse1 = null;
	                        ch.bfh.www.ehrservices.GetDocumentById wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetDocumentById)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetDocumentById.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDocumentByIdResponse1 =
                                                   
                                                   
                                                         skel.getDocumentById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDocumentByIdResponse1, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getDocumentById"));
                                    } else 

            if("getLogin".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetLoginResponse getLoginResponse3 = null;
	                        ch.bfh.www.ehrservices.GetLogin wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetLogin)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetLogin.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLoginResponse3 =
                                                   
                                                   
                                                         skel.getLogin(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLoginResponse3, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getLogin"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetDocumentById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetDocumentById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetDocumentByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetDocumentByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetLogin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetLogin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetLoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetLoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetDocumentByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetDocumentByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetDocumentByIdResponse wrapgetDocumentById(){
                                ch.bfh.www.ehrservices.GetDocumentByIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetDocumentByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetLoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetLoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetLoginResponse wrapgetLogin(){
                                ch.bfh.www.ehrservices.GetLoginResponse wrappedElement = new ch.bfh.www.ehrservices.GetLoginResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (ch.bfh.www.ehrservices.GetDocumentById.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetDocumentByIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetLogin.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetLogin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetLoginResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetLoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    
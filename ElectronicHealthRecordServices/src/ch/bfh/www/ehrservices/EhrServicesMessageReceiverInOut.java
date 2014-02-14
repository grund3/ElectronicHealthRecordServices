
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


        

            if("getAuthorisedOrgaHPsForDocument".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse getAuthorisedOrgaHPsForDocumentResponse1 = null;
	                        ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAuthorisedOrgaHPsForDocumentResponse1 =
                                                   
                                                   
                                                         skel.getAuthorisedOrgaHPsForDocument(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAuthorisedOrgaHPsForDocumentResponse1, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getAuthorisedOrgaHPsForDocument"));
                                    } else 

            if("getSpecialPermissionByPatient".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse getSpecialPermissionByPatientResponse3 = null;
	                        ch.bfh.www.ehrservices.GetSpecialPermissionByPatient wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetSpecialPermissionByPatient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetSpecialPermissionByPatient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSpecialPermissionByPatientResponse3 =
                                                   
                                                   
                                                         skel.getSpecialPermissionByPatient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSpecialPermissionByPatientResponse3, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getSpecialPermissionByPatient"));
                                    } else 

            if("getDocumentsByAttributes".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse getDocumentsByAttributesResponse5 = null;
	                        ch.bfh.www.ehrservices.GetDocumentsByAttributes wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetDocumentsByAttributes)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetDocumentsByAttributes.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDocumentsByAttributesResponse5 =
                                                   
                                                   
                                                         skel.getDocumentsByAttributes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDocumentsByAttributesResponse5, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getDocumentsByAttributes"));
                                    } else 

            if("setEmergencyContact".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetEmergencyContactResponse setEmergencyContactResponse7 = null;
	                        ch.bfh.www.ehrservices.SetEmergencyContact wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetEmergencyContact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetEmergencyContact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setEmergencyContactResponse7 =
                                                   
                                                   
                                                         skel.setEmergencyContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setEmergencyContactResponse7, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setEmergencyContact"));
                                    } else 

            if("getDocumentById".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetDocumentByIdResponse getDocumentByIdResponse9 = null;
	                        ch.bfh.www.ehrservices.GetDocumentById wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetDocumentById)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetDocumentById.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDocumentByIdResponse9 =
                                                   
                                                   
                                                         skel.getDocumentById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDocumentByIdResponse9, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getDocumentById"));
                                    } else 

            if("removeEmergencyContact".equals(methodName)){
                
                ch.bfh.www.ehrservices.RemoveEmergencyContactResponse removeEmergencyContactResponse11 = null;
	                        ch.bfh.www.ehrservices.RemoveEmergencyContact wrappedParam =
                                                             (ch.bfh.www.ehrservices.RemoveEmergencyContact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.RemoveEmergencyContact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeEmergencyContactResponse11 =
                                                   
                                                   
                                                         skel.removeEmergencyContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeEmergencyContactResponse11, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "removeEmergencyContact"));
                                    } else 

            if("getEmergencyContactByPatientId".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse getEmergencyContactByPatientIdResponse13 = null;
	                        ch.bfh.www.ehrservices.GetEmergencyContactByPatientId wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetEmergencyContactByPatientId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetEmergencyContactByPatientId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEmergencyContactByPatientIdResponse13 =
                                                   
                                                   
                                                         skel.getEmergencyContactByPatientId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEmergencyContactByPatientIdResponse13, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getEmergencyContactByPatientId"));
                                    } else 

            if("getLogin".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetLoginResponse getLoginResponse15 = null;
	                        ch.bfh.www.ehrservices.GetLogin wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetLogin)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetLogin.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLoginResponse15 =
                                                   
                                                   
                                                         skel.getLogin(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLoginResponse15, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getLogin"));
                                    } else 

            if("getBlacklistByPatientId".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse getBlacklistByPatientIdResponse17 = null;
	                        ch.bfh.www.ehrservices.GetBlacklistByPatientId wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetBlacklistByPatientId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetBlacklistByPatientId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBlacklistByPatientIdResponse17 =
                                                   
                                                   
                                                         skel.getBlacklistByPatientId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBlacklistByPatientIdResponse17, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getBlacklistByPatientId"));
                                    } else 

            if("getRoles".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetRolesResponse getRolesResponse19 = null;
	                        ch.bfh.www.ehrservices.GetRoles wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetRoles)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetRoles.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRolesResponse19 =
                                                   
                                                   
                                                         skel.getRoles(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRolesResponse19, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getRoles"));
                                    } else 

            if("removeOrganisationHPFromPatient".equals(methodName)){
                
                ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse removeOrganisationHPFromPatientResponse21 = null;
	                        ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient wrappedParam =
                                                             (ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeOrganisationHPFromPatientResponse21 =
                                                   
                                                   
                                                         skel.removeOrganisationHPFromPatient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeOrganisationHPFromPatientResponse21, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "removeOrganisationHPFromPatient"));
                                    } else 

            if("setSpecialPermission".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetSpecialPermissionResponse setSpecialPermissionResponse23 = null;
	                        ch.bfh.www.ehrservices.SetSpecialPermission wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetSpecialPermission)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetSpecialPermission.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setSpecialPermissionResponse23 =
                                                   
                                                   
                                                         skel.setSpecialPermission(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setSpecialPermissionResponse23, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setSpecialPermission"));
                                    } else 

            if("setHpOnBlacklist".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetHpOnBlacklistResponse setHpOnBlacklistResponse25 = null;
	                        ch.bfh.www.ehrservices.SetHpOnBlacklist wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetHpOnBlacklist)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetHpOnBlacklist.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setHpOnBlacklistResponse25 =
                                                   
                                                   
                                                         skel.setHpOnBlacklist(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setHpOnBlacklistResponse25, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setHpOnBlacklist"));
                                    } else 

            if("getHPByPatientAndRole".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse getHPByPatientAndRoleResponse27 = null;
	                        ch.bfh.www.ehrservices.GetHPByPatientAndRole wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetHPByPatientAndRole)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetHPByPatientAndRole.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHPByPatientAndRoleResponse27 =
                                                   
                                                   
                                                         skel.getHPByPatientAndRole(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHPByPatientAndRoleResponse27, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getHPByPatientAndRole"));
                                    } else 

            if("removePatientFromWhitelist".equals(methodName)){
                
                ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse removePatientFromWhitelistResponse29 = null;
	                        ch.bfh.www.ehrservices.RemovePatientFromWhitelist wrappedParam =
                                                             (ch.bfh.www.ehrservices.RemovePatientFromWhitelist)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.RemovePatientFromWhitelist.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removePatientFromWhitelistResponse29 =
                                                   
                                                   
                                                         skel.removePatientFromWhitelist(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removePatientFromWhitelistResponse29, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "removePatientFromWhitelist"));
                                    } else 

            if("setPermissionMatrixForPatient".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse setPermissionMatrixForPatientResponse31 = null;
	                        ch.bfh.www.ehrservices.SetPermissionMatrixForPatient wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetPermissionMatrixForPatient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetPermissionMatrixForPatient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setPermissionMatrixForPatientResponse31 =
                                                   
                                                   
                                                         skel.setPermissionMatrixForPatient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setPermissionMatrixForPatientResponse31, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setPermissionMatrixForPatient"));
                                    } else 

            if("setWhitelist".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetWhitelistResponse setWhitelistResponse33 = null;
	                        ch.bfh.www.ehrservices.SetWhitelist wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetWhitelist)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetWhitelist.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setWhitelistResponse33 =
                                                   
                                                   
                                                         skel.setWhitelist(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setWhitelistResponse33, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setWhitelist"));
                                    } else 

            if("setMasterDataForPatient".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetMasterDataForPatientResponse setMasterDataForPatientResponse35 = null;
	                        ch.bfh.www.ehrservices.SetMasterDataForPatient wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetMasterDataForPatient)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetMasterDataForPatient.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setMasterDataForPatientResponse35 =
                                                   
                                                   
                                                         skel.setMasterDataForPatient(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setMasterDataForPatientResponse35, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setMasterDataForPatient"));
                                    } else 

            if("removeHPFromBlacklist".equals(methodName)){
                
                ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse removeHPFromBlacklistResponse37 = null;
	                        ch.bfh.www.ehrservices.RemoveHPFromBlacklist wrappedParam =
                                                             (ch.bfh.www.ehrservices.RemoveHPFromBlacklist)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.RemoveHPFromBlacklist.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeHPFromBlacklistResponse37 =
                                                   
                                                   
                                                         skel.removeHPFromBlacklist(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeHPFromBlacklistResponse37, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "removeHPFromBlacklist"));
                                    } else 

            if("getConfidentialityLevels".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse getConfidentialityLevelsResponse39 = null;
	                        ch.bfh.www.ehrservices.GetConfidentialityLevels wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetConfidentialityLevels)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetConfidentialityLevels.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getConfidentialityLevelsResponse39 =
                                                   
                                                   
                                                         skel.getConfidentialityLevels(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getConfidentialityLevelsResponse39, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getConfidentialityLevels"));
                                    } else 

            if("getWhitelistByPatientId".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse getWhitelistByPatientIdResponse41 = null;
	                        ch.bfh.www.ehrservices.GetWhitelistByPatientId wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetWhitelistByPatientId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetWhitelistByPatientId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getWhitelistByPatientIdResponse41 =
                                                   
                                                   
                                                         skel.getWhitelistByPatientId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getWhitelistByPatientIdResponse41, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getWhitelistByPatientId"));
                                    } else 

            if("getCurrentPermissionMatrixByPatientId".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse getCurrentPermissionMatrixByPatientIdResponse43 = null;
	                        ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCurrentPermissionMatrixByPatientIdResponse43 =
                                                   
                                                   
                                                         skel.getCurrentPermissionMatrixByPatientId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCurrentPermissionMatrixByPatientIdResponse43, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getCurrentPermissionMatrixByPatientId"));
                                    } else 

            if("getVisibleDocumentsForOrgaHP".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse getVisibleDocumentsForOrgaHPResponse45 = null;
	                        ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getVisibleDocumentsForOrgaHPResponse45 =
                                                   
                                                   
                                                         skel.getVisibleDocumentsForOrgaHP(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getVisibleDocumentsForOrgaHPResponse45, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getVisibleDocumentsForOrgaHP"));
                                    } else 

            if("setHPRole".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetHPRoleResponse setHPRoleResponse47 = null;
	                        ch.bfh.www.ehrservices.SetHPRole wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetHPRole)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetHPRole.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setHPRoleResponse47 =
                                                   
                                                   
                                                         skel.setHPRole(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setHPRoleResponse47, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setHPRole"));
                                    } else 

            if("getAllDocumentsByPatientId".equals(methodName)){
                
                ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse getAllDocumentsByPatientIdResponse49 = null;
	                        ch.bfh.www.ehrservices.GetAllDocumentsByPatientId wrappedParam =
                                                             (ch.bfh.www.ehrservices.GetAllDocumentsByPatientId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.GetAllDocumentsByPatientId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllDocumentsByPatientIdResponse49 =
                                                   
                                                   
                                                         skel.getAllDocumentsByPatientId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllDocumentsByPatientIdResponse49, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "getAllDocumentsByPatientId"));
                                    } else 

            if("setConfidentiality".equals(methodName)){
                
                ch.bfh.www.ehrservices.SetConfidentialityResponse setConfidentialityResponse51 = null;
	                        ch.bfh.www.ehrservices.SetConfidentiality wrappedParam =
                                                             (ch.bfh.www.ehrservices.SetConfidentiality)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ch.bfh.www.ehrservices.SetConfidentiality.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setConfidentialityResponse51 =
                                                   
                                                   
                                                         skel.setConfidentiality(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setConfidentialityResponse51, false, new javax.xml.namespace.QName("http://www.bfh.ch/ehrServices/",
                                                    "setConfidentiality"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetSpecialPermissionByPatient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetSpecialPermissionByPatient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetDocumentsByAttributes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetDocumentsByAttributes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetEmergencyContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetEmergencyContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetEmergencyContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetEmergencyContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
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
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveEmergencyContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveEmergencyContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveEmergencyContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveEmergencyContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetEmergencyContactByPatientId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetEmergencyContactByPatientId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetBlacklistByPatientId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetBlacklistByPatientId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetRoles param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetRoles.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetRolesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetRolesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetSpecialPermission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetSpecialPermission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetSpecialPermissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetSpecialPermissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetHpOnBlacklist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetHpOnBlacklist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetHpOnBlacklistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetHpOnBlacklistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetHPByPatientAndRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetHPByPatientAndRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemovePatientFromWhitelist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemovePatientFromWhitelist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetPermissionMatrixForPatient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetPermissionMatrixForPatient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetWhitelist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetWhitelist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetWhitelistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetWhitelistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetMasterDataForPatient param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetMasterDataForPatient.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetMasterDataForPatientResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetMasterDataForPatientResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveHPFromBlacklist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveHPFromBlacklist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetConfidentialityLevels param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetConfidentialityLevels.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetWhitelistByPatientId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetWhitelistByPatientId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetHPRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetHPRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetHPRoleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetHPRoleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetAllDocumentsByPatientId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetAllDocumentsByPatientId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetConfidentiality param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetConfidentiality.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.bfh.www.ehrservices.SetConfidentialityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.bfh.www.ehrservices.SetConfidentialityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse wrapgetAuthorisedOrgaHPsForDocument(){
                                ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse wrappedElement = new ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse wrapgetSpecialPermissionByPatient(){
                                ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse wrappedElement = new ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse wrapgetDocumentsByAttributes(){
                                ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse wrappedElement = new ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetEmergencyContactResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetEmergencyContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetEmergencyContactResponse wrapsetEmergencyContact(){
                                ch.bfh.www.ehrservices.SetEmergencyContactResponse wrappedElement = new ch.bfh.www.ehrservices.SetEmergencyContactResponse();
                                return wrappedElement;
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
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.RemoveEmergencyContactResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.RemoveEmergencyContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.RemoveEmergencyContactResponse wrapremoveEmergencyContact(){
                                ch.bfh.www.ehrservices.RemoveEmergencyContactResponse wrappedElement = new ch.bfh.www.ehrservices.RemoveEmergencyContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse wrapgetEmergencyContactByPatientId(){
                                ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse();
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
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse wrapgetBlacklistByPatientId(){
                                ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetRolesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetRolesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetRolesResponse wrapgetRoles(){
                                ch.bfh.www.ehrservices.GetRolesResponse wrappedElement = new ch.bfh.www.ehrservices.GetRolesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse wrapremoveOrganisationHPFromPatient(){
                                ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse wrappedElement = new ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetSpecialPermissionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetSpecialPermissionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetSpecialPermissionResponse wrapsetSpecialPermission(){
                                ch.bfh.www.ehrservices.SetSpecialPermissionResponse wrappedElement = new ch.bfh.www.ehrservices.SetSpecialPermissionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetHpOnBlacklistResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetHpOnBlacklistResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetHpOnBlacklistResponse wrapsetHpOnBlacklist(){
                                ch.bfh.www.ehrservices.SetHpOnBlacklistResponse wrappedElement = new ch.bfh.www.ehrservices.SetHpOnBlacklistResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse wrapgetHPByPatientAndRole(){
                                ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse wrappedElement = new ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse wrapremovePatientFromWhitelist(){
                                ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse wrappedElement = new ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse wrapsetPermissionMatrixForPatient(){
                                ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse wrappedElement = new ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetWhitelistResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetWhitelistResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetWhitelistResponse wrapsetWhitelist(){
                                ch.bfh.www.ehrservices.SetWhitelistResponse wrappedElement = new ch.bfh.www.ehrservices.SetWhitelistResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetMasterDataForPatientResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetMasterDataForPatientResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetMasterDataForPatientResponse wrapsetMasterDataForPatient(){
                                ch.bfh.www.ehrservices.SetMasterDataForPatientResponse wrappedElement = new ch.bfh.www.ehrservices.SetMasterDataForPatientResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse wrapremoveHPFromBlacklist(){
                                ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse wrappedElement = new ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse wrapgetConfidentialityLevels(){
                                ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse wrappedElement = new ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse wrapgetWhitelistByPatientId(){
                                ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse wrapgetCurrentPermissionMatrixByPatientId(){
                                ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse wrapgetVisibleDocumentsForOrgaHP(){
                                ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse wrappedElement = new ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetHPRoleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetHPRoleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetHPRoleResponse wrapsetHPRole(){
                                ch.bfh.www.ehrservices.SetHPRoleResponse wrappedElement = new ch.bfh.www.ehrservices.SetHPRoleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse wrapgetAllDocumentsByPatientId(){
                                ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse wrappedElement = new ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.bfh.www.ehrservices.SetConfidentialityResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.bfh.www.ehrservices.SetConfidentialityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.bfh.www.ehrservices.SetConfidentialityResponse wrapsetConfidentiality(){
                                ch.bfh.www.ehrservices.SetConfidentialityResponse wrappedElement = new ch.bfh.www.ehrservices.SetConfidentialityResponse();
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
        
                if (ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetSpecialPermissionByPatient.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetSpecialPermissionByPatient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetDocumentsByAttributes.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentsByAttributes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetEmergencyContact.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetEmergencyContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetEmergencyContactResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetEmergencyContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetDocumentById.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetDocumentByIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetDocumentByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveEmergencyContact.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveEmergencyContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveEmergencyContactResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveEmergencyContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetEmergencyContactByPatientId.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetEmergencyContactByPatientId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetLogin.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetLogin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetLoginResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetLoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetBlacklistByPatientId.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetBlacklistByPatientId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetRoles.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetRoles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetRolesResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetRolesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetSpecialPermission.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetSpecialPermission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetSpecialPermissionResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetSpecialPermissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetHpOnBlacklist.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetHpOnBlacklist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetHpOnBlacklistResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetHpOnBlacklistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetHPByPatientAndRole.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetHPByPatientAndRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemovePatientFromWhitelist.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemovePatientFromWhitelist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetPermissionMatrixForPatient.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetPermissionMatrixForPatient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetWhitelist.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetWhitelist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetWhitelistResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetWhitelistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetMasterDataForPatient.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetMasterDataForPatient.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetMasterDataForPatientResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetMasterDataForPatientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveHPFromBlacklist.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveHPFromBlacklist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetConfidentialityLevels.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetConfidentialityLevels.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetWhitelistByPatientId.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetWhitelistByPatientId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetHPRole.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetHPRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetHPRoleResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetHPRoleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetAllDocumentsByPatientId.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetAllDocumentsByPatientId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetConfidentiality.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetConfidentiality.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.bfh.www.ehrservices.SetConfidentialityResponse.class.equals(type)){
                
                           return ch.bfh.www.ehrservices.SetConfidentialityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
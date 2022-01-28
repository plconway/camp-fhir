package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductpackaged.
 * @see .Medicinalproductpackaged
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductpackagedConversion 
{
	public Patient Medicinalproductpackageds(main.templateoutput.Model.Medicinalproductpackaged medicinalproductpackaged) 
	{
			Patient  Medicinalproductpackagedobj = new Patient(); 

						Medicinalproductpackagedobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicinalproductpackaged.getMppckgdDntfrDntfrSe() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcCSstm() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcCCde() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrTpCcTxt() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrPrdPrdNd() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrSsgnr() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrVlue() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medicinalproductpackaged.getMppckgdDntfrDntfrSstm() /** { "tree" :"MedicinalProductPackaged.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicinalproductpackagedobj.addSubject(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppackagedSubjectReference() /** { "tree" :"MedicinalProductPackaged.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Medicinalproductpackagedobj.setDescription(HapiFHIRHelpers.createstring(medicinalproductpackaged.getMppackagedDescriptionString() /** { "tree" :"MedicinalProductPackaged.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Medicinalproductpackagedobj.setLegalStatusOfSupply(HapiFHIRHelpers.createCodeableConcept(medicinalproductpackaged.getMppckgdLglSttsfSpplCcCdngCSstm() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdLglSttsfSpplCcCdngCVrsn() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdLglSttsfSpplCcCdngCCde() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdLglSttsfSpplCcCdngCDsplay() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdLglSttsfSpplCcCdngCSrSlctd() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdLglSttsfSpplCcTxt() /** { "tree" :"MedicinalProductPackaged.legalStatusOfSupply", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLegalStatusOfSupply, setText"} **/
						));
Medicinalproductpackagedobj.addMarketingStatus(HapiFHIRHelpers.createMarketingStatus(medicinalproductpackaged.getMppckgdMrktngSttsMrktngStts() /** { "tree" :"MedicinalProductPackaged.marketingStatus", "datatype" : "MarketingStatus", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMarketingStatus"} **/
						));
Medicinalproductpackagedobj.setMarketingAuthorization(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppckgdMrktngthrztnRfrnce() /** { "tree" :"MedicinalProductPackaged.marketingAuthorization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMarketingAuthorization"} **/
						));
Medicinalproductpackagedobj.addManufacturer(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppackagedManufacturerReference() /** { "tree" :"MedicinalProductPackaged.manufacturer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addManufacturer"} **/
						));
Medicinalproductpackagedobj.setOuterPackaging(HapiFHIRHelpers.createIdentifier(medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrSe() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, code", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setUse"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcCSstm() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcCVrsn() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcCCde() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcCDsplay() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcCSrSlctd() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrTpCcTxt() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setType, setText"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrPrdPrdStrt() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setPeriod, setStart"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrPrdPrdNd() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setPeriod, setEnd"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrSsgnr() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, Reference", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setAssigner"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrVlue() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, string", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setValue"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrTrPckgngDntfrSstm() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.outerPackaging", "datatype" : "Identifier, uri", "cardinality" : "Required", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setOuterPackaging, setSystem"} **/
						));
Medicinalproductpackagedobj.setImmediatePackaging(HapiFHIRHelpers.createIdentifier(medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrSe() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setUse"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcCSstm() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcCVrsn() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcCCde() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcCDsplay() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcCSrSlctd() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrTpCcTxt() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setType, setText"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrPrdPrdStrt() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setPeriod, setStart"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrPrdPrdNd() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setPeriod, setEnd"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrSsgnr() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setAssigner"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrVlue() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setValue"} **/
						, medicinalproductpackaged.getMppckgdBtchdntfrMmdtPckgngDntfrSstm() /** { "tree" :"MedicinalProductPackaged.batchIdentifier.immediatePackaging", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addBatchIdentifier"] , "methodName" : "setImmediatePackaging, setSystem"} **/
						));
Medicinalproductpackagedobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrSe() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setUse"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcCSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcCCde() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrTpCcTxt() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrPrdPrdNd() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrSsgnr() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrVlue() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setValue"} **/
						, medicinalproductpackaged.getMppckgdPckgtmDntfrDntfrSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicinalproductpackagedobj.setType(HapiFHIRHelpers.createCodeableConcept(medicinalproductpackaged.getMppckgdPckgtmTpCcCdngCSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdPckgtmTpCcCdngCVrsn() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdPckgtmTpCcCdngCCde() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmTpCcCdngCDsplay() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdPckgtmTpCcCdngCSrSlctd() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdPckgtmTpCcTxt() /** { "tree" :"MedicinalProductPackaged.packageItem.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setType, setText"} **/
						));
Medicinalproductpackagedobj.setQuantity(HapiFHIRHelpers.createQuantity(medicinalproductpackaged.getMppckgdPckgtmQnttQnttCmprtr() /** { "tree" :"MedicinalProductPackaged.packageItem.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setQuantity, setComparator"} **/
						, medicinalproductpackaged.getMppckgdPckgtmQnttQnttCde() /** { "tree" :"MedicinalProductPackaged.packageItem.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setQuantity, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmQnttQnttVlue() /** { "tree" :"MedicinalProductPackaged.packageItem.quantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setQuantity, setValue"} **/
						, medicinalproductpackaged.getMppckgdPckgtmQnttQnttNt() /** { "tree" :"MedicinalProductPackaged.packageItem.quantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setQuantity, setUnit"} **/
						, medicinalproductpackaged.getMppckgdPckgtmQnttQnttSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.quantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : ["setPackageItem"] , "methodName" : "setQuantity, setSystem"} **/
						));
Medicinalproductpackagedobj.addMaterial(HapiFHIRHelpers.createCodeableConcept(medicinalproductpackaged.getMppckgdPckgtmMtrlCcCdngCSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdPckgtmMtrlCcCdngCVrsn() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdPckgtmMtrlCcCdngCCde() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmMtrlCcCdngCDsplay() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdPckgtmMtrlCcCdngCSrSlctd() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdPckgtmMtrlCcTxt() /** { "tree" :"MedicinalProductPackaged.packageItem.material", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addMaterial, setText"} **/
						));
Medicinalproductpackagedobj.addAlternateMaterial(HapiFHIRHelpers.createCodeableConcept(medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcCdngCSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcCdngCVrsn() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcCdngCCde() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcCdngCDsplay() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcCdngCSrSlctd() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdPckgtmLtrntMtrlCcTxt() /** { "tree" :"MedicinalProductPackaged.packageItem.alternateMaterial", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addAlternateMaterial, setText"} **/
						));
Medicinalproductpackagedobj.addDevice(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppckgdPckgtmDvcRfrnce() /** { "tree" :"MedicinalProductPackaged.packageItem.device", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addDevice"} **/
						));
Medicinalproductpackagedobj.addManufacturedItem(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppckgdPckgtmMnfctrdtmRfrnce() /** { "tree" :"MedicinalProductPackaged.packageItem.manufacturedItem", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addManufacturedItem"} **/
						));
Medicinalproductpackagedobj.addPackageItem(HapiFHIRHelpers.createpackageItem(medicinalproductpackaged.getMppckgdPckgtmPckgtmPckgtm() /** { "tree" :"MedicinalProductPackaged.packageItem.packageItem", "datatype" : "packageItem", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addPackageItem"} **/
						));
Medicinalproductpackagedobj.setPhysicalCharacteristics(HapiFHIRHelpers.createProdCharacteristic(medicinalproductpackaged.getMppckgdPckgtmPhsclchrctrsPrdChrctrstc() /** { "tree" :"MedicinalProductPackaged.packageItem.physicalCharacteristics", "datatype" : "ProdCharacteristic", "cardinality" : "ZeroOne", "elementtree" : ["setPackageItem"] , "methodName" : "setPhysicalCharacteristics"} **/
						));
Medicinalproductpackagedobj.addOtherCharacteristics(HapiFHIRHelpers.createCodeableConcept(medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcCdngCSstm() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, addCoding, setSystem"} **/
						, medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcCdngCVrsn() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, addCoding, setVersion"} **/
						, medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcCdngCCde() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, addCoding, setCode"} **/
						, medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcCdngCDsplay() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, addCoding, setDisplay"} **/
						, medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcCdngCSrSlctd() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, addCoding, setUserSelected"} **/
						, medicinalproductpackaged.getMppckgdPckgtmThrchrctrsCcTxt() /** { "tree" :"MedicinalProductPackaged.packageItem.otherCharacteristics", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addOtherCharacteristics, setText"} **/
						));
Medicinalproductpackagedobj.addShelfLifeStorage(HapiFHIRHelpers.createProductShelfLife(medicinalproductpackaged.getMppckgdPckgtmShlfLfStrgPrdctShlfLfe() /** { "tree" :"MedicinalProductPackaged.packageItem.shelfLifeStorage", "datatype" : "ProductShelfLife", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addShelfLifeStorage"} **/
						));
Medicinalproductpackagedobj.addManufacturer(HapiFHIRHelpers.createReference(medicinalproductpackaged.getMppckgdPckgtmMnfctrrRfrnce() /** { "tree" :"MedicinalProductPackaged.packageItem.manufacturer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setPackageItem"] , "methodName" : "addManufacturer"} **/
		));
	}
}

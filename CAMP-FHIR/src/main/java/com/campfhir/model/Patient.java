package main.java.com.campfhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
@Entity
public class Patient  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;
	String PNT_IDENTIFIER_USE;
	String PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_CODING;
	String PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_TEXT;
	String PNT_IDENTIFIER_SYSTEM;
	String PNT_IDENTIFIER_VALUE;
	String PNT_IDENTIFIER_PERIOD_START;
	String PNT_IDENTIFIER_PERIOD_END; 
	String PNT_IDENTIFIER_ASSIGNER_REFERENCE;
	String PNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE;
	String PNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE;
	String PNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER;
	String PNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY;
	String PNT_ACTIVE;
	String PNT_NAME_HUMANNAME_USE;
	String PNT_NAME_HUMANNAME_TEXT;
	String PNT_NAME_HUMANNAME_FAMILY;
	String PNT_NAME_HUMANNAME_GIVEN;
	String PNT_NAME_HUMANNAME_PREFIX;
	String PNT_NAME_HUMANNAME_SUFFIX;
	String PNT_NAME_HUMANNAME_PERIOD_START;
	String PNT_NAME_HUMANNAME_PERIOD_END;
	String PNT_TELECOM_CONTACTPOINT_SYSTEM;
	String PNT_TELECOM_CONTACTPOINT_VALUE;
	String PNT_TELECOM_CONTACTPOINT_USE;
	String PNT_TELECOM_CONTACTPOINT_RANK;
	String PNT_TELECOM_CONTACTPOINT_PERIOD_START;
	String PNT_TELECOM_CONTACTPOINT_PERIOD_END;
	String PNT_GENDER;
	String PNT_BIRTHDATE;	
	String PNT_DECEASEDBOOLEAN;
	String PNT_DECEASEDDATETIME;
	String PNT_ADDRESS;
	String PNT_ADDRESS_USE;
	String PNT_ADDRESS_TYPE;
	String PNT_ADDRESS_TEXT;
	String PNT_ADDRESS_LINE;
	String PNT_ADDRESS_CITY;
	String PNT_ADDRESS_DISTRICT;
	String PNT_ADDRESS_STATE;
	String PNT_ADDRESS_POSTAL_CODE;
	String PNT_ADDRESS_COUNTRY;
	String PNT_ADDRESS_PERIOD_START;
	String PNT_ADDRESS_PERIOD_END;
	String PNT_MARITAL_STATUS_CODE;	
	String PNT_MULTIPLE_BIRTH_BOOLEAN;
	String PNT_MULTIPLE_BIRTH_INTEGER;
	String PNT_PHOTO_ATTACHMENT_CONTENT_TYPE;
	String PNT_PHOTO_ATTACHMENT_LANGUAGE;
	String PNT_PHOTO_ATTACHMENT_DATA;
	String PNT_PHOTO_ATTACHMENT_URL;
	String PNT_PHOTO_ATTACHMENT_SIZE;
	String PNT_PHOTO_ATTACHMENT_HASH;
	String PNT_PHOTO_ATTACHMENT_TITLE;
	String PNT_PHOTO_ATTACHMENT_CREATION;
	String PNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	String PNT_CONTACT_RELATIONSHIP;
	String PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE;
	String PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY;
	String PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED;
	String PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT;
	String PNT_CONTACT_NAME_HUMANNAME_USE;
	String PNT_CONTACT_NAME_HUMANNAME_TEXT;
	String PNT_CONTACT_NAME_HUMANNAME_FAMILY;
	String PNT_CONTACT_NAME_HUMANNAME_GIVEN;
	String PNT_CONTACT_NAME_HUMANNAME_PREFIX;
	String PNT_CONTACT_NAME_HUMANNAME_SUFFIX;
	String PNT_CONTACT_NAME_HUMANNAME_PERIOD_START;
	String PNT_CONTACT_NAME_HUMANNAME_PERIOD_END;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_VALUE;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_USE;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_RANK;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START;
	String PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END;
	String PNT_CONTACT_ADDRESS_USE;
	String PNT_CONTACT_ADDRESS_TYPE;
	String PNT_CONTACT_ADDRESS_TEXT;
	String PNT_CONTACT_ADDRESS_LINE;
	String PNT_CONTACT_ADDRESS_CITY;
	String PNT_CONTACT_ADDRESS_DISTRICT;
	String PNT_CONTACT_ADDRESS_STATE;
	String PNT_CONTACT_ADDRESS_POSTAL_CODE;
	String PNT_CONTACT_ADDRESS_COUNTRY;
	String PNT_CONTACT_ADDRESS_PERIOD_START;
	String PNT_CONTACT_ADDRESS_PERIOD_END;
	String PNT_CONTACT_GENDER;
	String PNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE;
	String PNT_CONTACT_ORGANIZATION_REFERENCE_TYPE;
	String PNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER;
	String PNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY;
	String PNT_CONTACT_PERIOD;
	String PNT_CONTACT_PERIOD_START;
	String PNT_CONTACT_PERIOD_END;
	String PNT_COMMUNICATION_LANGUAGE;
	String PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE;
	String PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY;
	String PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED;
	String PNT_COMMUNICATION_LANGUAGE_TEXT;
	String PNT_COMMUNICATION_PREFERRED; 
	String PNT_GENERAL_PRACTICTIONER_REFERENCE;
	String PNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE;
	String PNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE;
	String PNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER;
	String PNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY;
	String PNT_MANAGING_ORGANIZATION_REFERENCE;
	String PNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE;
	String PNT_MANAGING_ORGANIZATION_REFERENCE_TYPE;
	String PNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER;
	String PNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY;
	String PNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	String PNT_LINK_OTHER_REFERENCE_REFERENCE;
	String PNT_LINK_OTHER_REFERENCE_TYPE;
	String PNT_LINK_OTHER_REFERENCE_IDENTIFIER;
	String PNT_LINK_OTHER_REFERENCE_DISPLAY;
	String PNT_LINK_TYPE;
	String PNT_RACE;
	String PNT_RACE_DISP;
	String PNT_ETHNICITY;
	String PNT_ETHNICITY_DISP;
	String PNT_ADDRESS_EXT_LAT_VALUE;
	String PNT_ADDRESS_EXT_LONG_VALUE;
	
	List<Encounter> encounterList = new ArrayList<Encounter>();
	
	public String getPNT_IDENTIFIER_USE() 
	{
		return this.PNT_IDENTIFIER_USE;
	}

	public void setPNT_IDENTIFIER_USE(String pNT_IDENTIFIER_USE) 
	{
		this.PNT_IDENTIFIER_USE = pNT_IDENTIFIER_USE;
	}

	public String getPNT_IDENTIFIER_TYPE_CODEABLECONCEPT_CODING() 
	{
		return this.PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_CODING;
	}

	public void setPNT_IDENTIFIER_TYPE_CODEABLECONCEPT_CODING(String pNT_IDENTIFIER_TYPE__CODEABLECONCEPT_CODING) 
	{
		this.PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_CODING = pNT_IDENTIFIER_TYPE__CODEABLECONCEPT_CODING;
	}

	public String getPNT_IDENTIFIER_TYPE_CODEABLECONCEPT_TEXT() 
	{
		return this.PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_TEXT;
	}

	public void setPNT_IDENTIFIER_TYPE_CODEABLECONCEPT_TEXT(String pNT_IDENTIFIER_TYPE__CODEABLECONCEPT_TEXT) 
	{
		this.PNT_IDENTIFIER_TYPE_CODEABLECONCEPT_TEXT = pNT_IDENTIFIER_TYPE__CODEABLECONCEPT_TEXT;
	}

	public String getPNT_IDENTIFIER_SYSTEM() 
	{
		return this.PNT_IDENTIFIER_SYSTEM;
	}

	public void setPNT_IDENTIFIER_SYSTEM(String pNT_IDENTIFIER_SYSTEM) 
	{
		this.PNT_IDENTIFIER_SYSTEM = pNT_IDENTIFIER_SYSTEM;
	}

	public String getPNT_IDENTIFIER_VALUE() 
	{
		return this.PNT_IDENTIFIER_VALUE;
	}

	public void setPNT_IDENTIFIER_VALUE(String pNT_IDENTIFIER_VALUE) 
	{
		this.PNT_IDENTIFIER_VALUE = pNT_IDENTIFIER_VALUE;
	}

	public String getPNT_IDENTIFIER_PERIOD_START() 
	{
		return this.PNT_IDENTIFIER_PERIOD_START;
	}

	public void setPNT_IDENTIFIER_PERIOD_START(String pNT_IDENTIFIER_PERIOD_START) 
	{
		this.PNT_IDENTIFIER_PERIOD_START = pNT_IDENTIFIER_PERIOD_START;
	}

	public String getPNT_IDENTIFIER_PERIOD_END() 
	{
		return this.PNT_IDENTIFIER_PERIOD_END;
	}

	public void setPNT_IDENTIFIER_PERIOD_END(String pNT_IDENTIFIER_PERIOD_END) 
	{
		this.PNT_IDENTIFIER_PERIOD_END = pNT_IDENTIFIER_PERIOD_END;
	}

	public String getPNT_IDENTIFIER_ASSIGNER_REFERENCE() 
	{
		return this.PNT_IDENTIFIER_ASSIGNER_REFERENCE;
	}

	public void setPNT_IDENTIFIER_ASSIGNER_REFERENCE(String pNT_IDENTIFIER_ASSIGNER_REFERENCE) 
	{
		this.PNT_IDENTIFIER_ASSIGNER_REFERENCE = pNT_IDENTIFIER_ASSIGNER_REFERENCE;
	}

	public String getPNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE() 
	{
		return this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE;
	}

	public void setPNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE(String pNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE) 
	{
		this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE = pNT_IDENTIFIER_ASSIGNER_REFERENCE_REFERENCE;
	}

	public String getPNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE() 
	{
		return this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE;
	}

	public void setPNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE(String pNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE) 
	{
		this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE = pNT_IDENTIFIER_ASSIGNER_REFERENCE_TYPE;
	}

	public String getPNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER() 
	{
		return this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER;
	}

	public void setPNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER(String pNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER) 
	{
		this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER = pNT_IDENTIFIER_ASSIGNER_REFERENCE_IDENTIFIER;
	}

	public String getPNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY() 
	{
		return this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY;
	}

	public void setPNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY(String pNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY) 
	{
		this.PNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY = pNT_IDENTIFIER_ASSIGNER_REFERENCE_DISPLAY;
	}
	
	public String getPNT_ACTIVE() 
	{
		return this.PNT_ACTIVE;
	}
	
	public void setPNT_ACTIVE(String pNT_ACTIVE) 
	{
		this.PNT_ACTIVE = pNT_ACTIVE;
	}
	
	public String getPNT_NAME_HUMANNAME_USE() 
	{
		return this.PNT_NAME_HUMANNAME_USE;
	}

	public void setPNT_NAME_HUMANNAME_USE(String pNT_NAME_HUMANNAME_USE) 
	{
		this.PNT_NAME_HUMANNAME_USE = pNT_NAME_HUMANNAME_USE;
	}

	public String getPNT_NAME_HUMANNAME_TEXT() 
	{
		return this.PNT_NAME_HUMANNAME_TEXT;
	}

	public void setPNT_NAME_HUMANNAME_TEXT(String pNT_NAME_HUMANNAME_TEXT) 
	{
		this.PNT_NAME_HUMANNAME_TEXT = pNT_NAME_HUMANNAME_TEXT;
	}

	public String getPNT_NAME_HUMANNAME_FAMILY() 
	{
		return this.PNT_NAME_HUMANNAME_FAMILY;
	}

	public void setPNT_NAME_HUMANNAME_FAMILY(String pNT_NAME_HUMANNAME_FAMILY) 
	{
		this.PNT_NAME_HUMANNAME_FAMILY = pNT_NAME_HUMANNAME_FAMILY;
	}

	public String getPNT_NAME_HUMANNAME_GIVEN() 
	{
		return this.PNT_NAME_HUMANNAME_GIVEN;
	}

	public void setPNT_NAME_HUMANNAME_GIVEN(String pNT_NAME_HUMANNAME_GIVEN) 
	{
		this.PNT_NAME_HUMANNAME_GIVEN = pNT_NAME_HUMANNAME_GIVEN;
	}

	public String getPNT_NAME_HUMANNAME_PREFIX() 
	{
		return this.PNT_NAME_HUMANNAME_PREFIX;
	}

	public void setPNT_NAME_HUMANNAME_PREFIX(String pNT_NAME_HUMANNAME_PREFIX) 
	{
		this.PNT_NAME_HUMANNAME_PREFIX = pNT_NAME_HUMANNAME_PREFIX;
	}

	public String getPNT_NAME_HUMANNAME_SUFFIX() 
	{
		return this.PNT_NAME_HUMANNAME_SUFFIX;
	}

	public void setPNT_NAME_HUMANNAME_SUFFIX(String pNT_NAME_HUMANNAME_SUFFIX) 
	{
		this.PNT_NAME_HUMANNAME_SUFFIX = pNT_NAME_HUMANNAME_SUFFIX;
	}

	public String getPNT_NAME_HUMANNAME_PERIOD_START() 
	{
		return this.PNT_NAME_HUMANNAME_PERIOD_START;
	}

	public void setPNT_NAME_HUMANNAME_PERIOD_START(String pNT_NAME_HUMANNAME_PERIOD_START) 
	{
		this.PNT_NAME_HUMANNAME_PERIOD_START = pNT_NAME_HUMANNAME_PERIOD_START;
	}
	
	public String getPNT_NAME_HUMANNAME_PERIOD_END() 
	{
		return this.PNT_NAME_HUMANNAME_PERIOD_END;
	}

	public void setPNT_NAME_HUMANNAME_PERIOD_END(String pNT_NAME_HUMANNAME_PERIOD_END) 
	{
		this.PNT_NAME_HUMANNAME_PERIOD_END = pNT_NAME_HUMANNAME_PERIOD_END;
	}
	
	public String getPNT_TELECOM_CONTACTPOINT_SYSTEM() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_SYSTEM;
	}

	public void setPNT_TELECOM_CONTACTPOINT_SYSTEM(String pNT_TELECOM_CONTACTPOINT_SYSTEM) 
	{
		this.PNT_TELECOM_CONTACTPOINT_SYSTEM = pNT_TELECOM_CONTACTPOINT_SYSTEM;
	}
	
	public String getPNT_TELECOM_CONTACTPOINT_VALUE() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_VALUE;
	}

	public void setPNT_TELECOM_CONTACTPOINT_VALUE(String pNT_TELECOM_CONTACTPOINT_VALUE) 
	{
		this.PNT_TELECOM_CONTACTPOINT_VALUE = pNT_TELECOM_CONTACTPOINT_VALUE;
	}

	public String getPNT_TELECOM_CONTACTPOINT_USE() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_USE;
	}

	public void setPNT_TELECOM_CONTACTPOINT_USE(String pNT_TELECOM_CONTACTPOINT_USE) 
	{
		this.PNT_TELECOM_CONTACTPOINT_USE = pNT_TELECOM_CONTACTPOINT_USE;
	}

	public String getPNT_TELECOM_CONTACTPOINT_RANK() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_RANK;
	}

	public void setPNT_TELECOM_CONTACTPOINT_RANK(String pNT_TELECOM_CONTACTPOINT_RANK) 
	{
		this.PNT_TELECOM_CONTACTPOINT_RANK = pNT_TELECOM_CONTACTPOINT_RANK;
	}

	public String getPNT_TELECOM_CONTACTPOINT_PERIOD_START() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_PERIOD_START;
	}

	public void setPNT_TELECOM_CONTACTPOINT_PERIOD_START(String pNT_TELECOM_CONTACTPOINT_PERIOD_START) 
	{
		this.PNT_TELECOM_CONTACTPOINT_PERIOD_START = pNT_TELECOM_CONTACTPOINT_PERIOD_START;
	}
	
	public String getPNT_TELECOM_CONTACTPOINT_PERIOD_END() 
	{
		return this.PNT_TELECOM_CONTACTPOINT_PERIOD_END;
	}

	public void setPNT_TELECOM_CONTACTPOINT_PERIOD_END(String pNT_TELECOM_CONTACTPOINT_PERIOD_END) 
	{
		this.PNT_TELECOM_CONTACTPOINT_PERIOD_END = pNT_TELECOM_CONTACTPOINT_PERIOD_END;
	}
	
	public String getPNT_GENDER() 
	{
		return this.PNT_GENDER;
	}

	public void setPNT_GENDER(String pNT_GENDER) 
	{
		this.PNT_GENDER = pNT_GENDER;
	}

	public String getPNT_BIRTHDATE() 
	{
		return this.PNT_BIRTHDATE;
	}

	public void setPNT_BIRTHDATE(String pNT_BIRTHDATE) 
	{
		this.PNT_BIRTHDATE = pNT_BIRTHDATE;
	}
	public String getPNT_DECEASEDBOOLEAN()  
	{
		return this.PNT_DECEASEDBOOLEAN;
	}

	public void setPNT_DECEASEDBOOLEAN(String pNT_DECEASEDBOOLEAN) 
	{
		this.PNT_DECEASEDBOOLEAN = pNT_DECEASEDBOOLEAN;
	}
	
	public String getPNT_DECEASEDDATETIME() 
	{
		return this.PNT_DECEASEDDATETIME;
	}

	public void setPNT_DECEASEDDATETIME(String pNT_DECEASEDDATETIME) 
	{
		this.PNT_DECEASEDDATETIME = pNT_DECEASEDDATETIME;
	}
	
	public String getPNT_ADDRESS_USE() 
	{
		return this.PNT_ADDRESS_USE;
	}

	public void setPNT_ADDRESS_USE(String pNT_ADDRESS_USE) 
	{
		this.PNT_ADDRESS_USE = pNT_ADDRESS_USE;
	}

	public String getPNT_ADDRESS_TYPE() 
	{
		return this.PNT_ADDRESS_TYPE;
	}

	public void setPNT_ADDRESS_TYPE(String pNT_ADDRESS_TYPE) 
	{
		this.PNT_ADDRESS_TYPE = pNT_ADDRESS_TYPE;
	}

	public String getPNT_ADDRESS_TEXT() 
	{
		return this.PNT_ADDRESS_TEXT;
	}

	public void setPNT_ADDRESS_TEXT(String pNT_ADDRESS_TEXT) 
	{
		this.PNT_ADDRESS_TEXT = pNT_ADDRESS_TEXT;
	}

	public String getPNT_ADDRESS_LINE() 
	{
		return this.PNT_ADDRESS_LINE;
	}

	public void setPNT_ADDRESS_LINE(String pNT_ADDRESS_LINE) 
	{
		this.PNT_ADDRESS_LINE = pNT_ADDRESS_LINE;
	}

	public String getPNT_ADDRESS_CITY() 
	{
		return this.PNT_ADDRESS_CITY;
	}

	public void setPNT_ADDRESS_CITY(String pNT_ADDRESS_CITY) 
	{
		this.PNT_ADDRESS_CITY = pNT_ADDRESS_CITY;
	}

	public String getPNT_ADDRESS_DISTRICT() 
	{
		return this.PNT_ADDRESS_DISTRICT;
	}

	public void setPNT_ADDRESS_DISTRICT(String pNT_ADDRESS_DISTRICT) 
	{
		this.PNT_ADDRESS_DISTRICT = pNT_ADDRESS_DISTRICT;
	}

	public String getPNT_ADDRESS_STATE() 
	{
		return this.PNT_ADDRESS_STATE;
	}

	public void setPNT_ADDRESS_STATE(String pNT_ADDRESS_STATE) 
	{
		this.PNT_ADDRESS_STATE = pNT_ADDRESS_STATE;
	}

	public String getPNT_ADDRESS_POSTAL_CODE() 
	{
		return this.PNT_ADDRESS_POSTAL_CODE;
	}

	public void setPNT_ADDRESS_POSTAL_CODE(String pNT_ADDRESS_POSTAL_CODE) 
	{
		this.PNT_ADDRESS_POSTAL_CODE = pNT_ADDRESS_POSTAL_CODE;
	}

	public String getPNT_ADDRESS_COUNTRY() {
		return this.PNT_ADDRESS_COUNTRY;
	}

	public void setPNT_ADDRESS_COUNTRY(String pNT_ADDRESS_COUNTRY) {
		this.PNT_ADDRESS_COUNTRY = pNT_ADDRESS_COUNTRY;
	}

	public String getPNT_ADDRESS_PERIOD_START() {
		return this.PNT_ADDRESS_PERIOD_START;
	}

	public void setPNT_ADDRESS_PERIOD_START(String pNT_ADDRESS_PERIOD_START) {
		this.PNT_ADDRESS_PERIOD_START = pNT_ADDRESS_PERIOD_START;
	}
	
	public String getPNT_ADDRESS_PERIOD_END() {
		return this.PNT_ADDRESS_PERIOD_END;
	}

	public void setPNT_ADDRESS_PERIOD_END(String pNT_ADDRESS_PERIOD_END) {
		this.PNT_ADDRESS_PERIOD_END = pNT_ADDRESS_PERIOD_END;
	}
	
	public String getPNT_MARITAL_STATUS_CODE() 
	{
		return this.PNT_MARITAL_STATUS_CODE;
	}

	public void setPNT_MARITAL_STATUS_CODE(String pNT_MARITAL_STATUS_CODE) 
	{
		this.PNT_MARITAL_STATUS_CODE = pNT_MARITAL_STATUS_CODE;
	}
	
	public String getPNT_MULTIPLE_BIRTH_BOOLEAN() {
		return this.PNT_MULTIPLE_BIRTH_BOOLEAN;
	}

	public void setPNT_MULTIPLE_BIRTH_BOOLEAN(String pNT_MULTIPLE_BIRTH_BOOLEAN) {
		this.PNT_MULTIPLE_BIRTH_BOOLEAN = pNT_MULTIPLE_BIRTH_BOOLEAN;
	}
	
	public String getPNT_MULTIPLE_BIRTH_INTEGER() {
		return this.PNT_MULTIPLE_BIRTH_INTEGER;
	}

	public void setPNT_MULTIPLE_BIRTH_INTEGER(String pNT_MULTIPLE_BIRTH_INTEGER) {
		this.PNT_MULTIPLE_BIRTH_INTEGER = pNT_MULTIPLE_BIRTH_INTEGER;
	}
	
	public String getPNT_PHOTO_ATTACHMENT_CONTENT_TYPE() {
		return this.PNT_PHOTO_ATTACHMENT_CONTENT_TYPE;
	}

	public void setPNT_PHOTO_ATTACHMENT_CONTENT_TYPE(String pNT_PHOTO_ATTACHMENT_CONTENT_TYPE) {
		this.PNT_PHOTO_ATTACHMENT_CONTENT_TYPE = pNT_PHOTO_ATTACHMENT_CONTENT_TYPE;
	}

	public String getPNT_PHOTO_ATTACHMENT_LANGUAGE() {
		return this.PNT_PHOTO_ATTACHMENT_LANGUAGE;
	}

	public void setPNT_PHOTO_ATTACHMENT_LANGUAGE(String pNT_PHOTO_ATTACHMENT_LANGUAGE) {
		this.PNT_PHOTO_ATTACHMENT_LANGUAGE = pNT_PHOTO_ATTACHMENT_LANGUAGE;
	}

	public String getPNT_PHOTO_ATTACHMENT_DATA() {
		return this.PNT_PHOTO_ATTACHMENT_DATA;
	}

	public void setPNT_PHOTO_ATTACHMENT_DATA(String pNT_PHOTO_ATTACHMENT_DATA) {
		this.PNT_PHOTO_ATTACHMENT_DATA = pNT_PHOTO_ATTACHMENT_DATA;
	}

	public String getPNT_PHOTO_ATTACHMENT_URL() {
		return this.PNT_PHOTO_ATTACHMENT_URL;
	}

	public void setPNT_PHOTO_ATTACHMENT_URL(String pNT_PHOTO_ATTACHMENT_URL) {
		this.PNT_PHOTO_ATTACHMENT_URL = pNT_PHOTO_ATTACHMENT_URL;
	}

	public String getPNT_PHOTO_ATTACHMENT_SIZE() {
		return this.PNT_PHOTO_ATTACHMENT_SIZE;
	}

	public void setPNT_PHOTO_ATTACHMENT_SIZE(String pNT_PHOTO_ATTACHMENT_SIZE) {
		this.PNT_PHOTO_ATTACHMENT_SIZE = pNT_PHOTO_ATTACHMENT_SIZE;
	}

	public String getPNT_PHOTO_ATTACHMENT_HASH() {
		return this.PNT_PHOTO_ATTACHMENT_HASH;
	}

	public void setPNT_PHOTO_ATTACHMENT_HASH(String pNT_PHOTO_ATTACHMENT_HASH) {
		this.PNT_PHOTO_ATTACHMENT_HASH = pNT_PHOTO_ATTACHMENT_HASH;
	}

	public String getPNT_PHOTO_ATTACHMENT_TITLE() {
		return this.PNT_PHOTO_ATTACHMENT_TITLE;
	}

	public void setPNT_PHOTO_ATTACHMENT_TITLE(String pNT_PHOTO_ATTACHMENT_TITLE) {
		this.PNT_PHOTO_ATTACHMENT_TITLE = pNT_PHOTO_ATTACHMENT_TITLE;
	}

	public String getPNT_PHOTO_ATTACHMENT_CREATION() {
		return this.PNT_PHOTO_ATTACHMENT_CREATION;
	}

	public void setPNT_PHOTO_ATTACHMENT_CREATION(String pNT_PHOTO_ATTACHMENT_CREATION) {
		this.PNT_PHOTO_ATTACHMENT_CREATION = pNT_PHOTO_ATTACHMENT_CREATION;
	}

	public String getPNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION() {
		return this.PNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	}

	public void setPNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION(String pNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION) {
		this.PNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION = pNT_CONTACT_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	}

	public String getPNT_CONTACT_RELATIONSHIP() {
		return this.PNT_CONTACT_RELATIONSHIP;
	}

	public void setPNT_CONTACT_RELATIONSHIP(String pNT_CONTACT_RELATIONSHIP) {
		this.PNT_CONTACT_RELATIONSHIP = pNT_CONTACT_RELATIONSHIP;
	}
	
	public String getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE() {
		return this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE;
	}

	public void setPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE(String pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE) {
		this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE = pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_CODE;
	}
	
	public String getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY() {
		return this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY;
	}

	public void setPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY(String pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY) {
		this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY = pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_DISPLAY;
	}
	
	
	public String getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED() {
		return this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED;
	}

	public void setPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED(String pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED) {
		this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED = pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_CODING_USERSELECTED;
	}
	
	public String getPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT() {
		return this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT;
	}

	public void setPNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT(String pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT) {
		this.PNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT = pNT_CONTACT_RELATIONSHIP_CODEABLECONCEPT_TEXT;
	}
	
	public String getPNT_CONTACT_NAME_HUMANNAME_USE() {
		return this.PNT_CONTACT_NAME_HUMANNAME_USE;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_USE(String pNT_CONTACT_NAME_HUMANNAME_USE) {
		this.PNT_CONTACT_NAME_HUMANNAME_USE = pNT_CONTACT_NAME_HUMANNAME_USE;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_TEXT() {
		return this.PNT_CONTACT_NAME_HUMANNAME_TEXT;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_TEXT(String pNT_CONTACT_NAME_HUMANNAME_TEXT) {
		this.PNT_CONTACT_NAME_HUMANNAME_TEXT = pNT_CONTACT_NAME_HUMANNAME_TEXT;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_FAMILY() {
		return this.PNT_CONTACT_NAME_HUMANNAME_FAMILY;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_FAMILY(String pNT_CONTACT_NAME_HUMANNAME_FAMILY) {
		this.PNT_CONTACT_NAME_HUMANNAME_FAMILY = pNT_CONTACT_NAME_HUMANNAME_FAMILY;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_GIVEN() {
		return this.PNT_CONTACT_NAME_HUMANNAME_GIVEN;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_GIVEN(String pNT_CONTACT_NAME_HUMANNAME_GIVEN) {
		this.PNT_CONTACT_NAME_HUMANNAME_GIVEN = pNT_CONTACT_NAME_HUMANNAME_GIVEN;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_PREFIX() {
		return this.PNT_CONTACT_NAME_HUMANNAME_PREFIX;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_PREFIX(String pNT_CONTACT_NAME_HUMANNAME_PREFIX) {
		this.PNT_CONTACT_NAME_HUMANNAME_PREFIX = pNT_CONTACT_NAME_HUMANNAME_PREFIX;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_SUFFIX() {
		return this.PNT_CONTACT_NAME_HUMANNAME_SUFFIX;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_SUFFIX(String pNT_CONTACT_NAME_HUMANNAME_SUFFIX) {
		this.PNT_CONTACT_NAME_HUMANNAME_SUFFIX = pNT_CONTACT_NAME_HUMANNAME_SUFFIX;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_PERIOD_START() {
		return this.PNT_CONTACT_NAME_HUMANNAME_PERIOD_START;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_PERIOD_START(String pNT_CONTACT_NAME_HUMANNAME_PERIOD_START) {
		this.PNT_CONTACT_NAME_HUMANNAME_PERIOD_START = pNT_CONTACT_NAME_HUMANNAME_PERIOD_START;
	}

	public String getPNT_CONTACT_NAME_HUMANNAME_PERIOD_END() {
		return this.PNT_CONTACT_NAME_HUMANNAME_PERIOD_END;
	}

	public void setPNT_CONTACT_NAME_HUMANNAME_PERIOD_END(String pNT_CONTACT_NAME_HUMANNAME_PERIOD_END) {
		this.PNT_CONTACT_NAME_HUMANNAME_PERIOD_END = pNT_CONTACT_NAME_HUMANNAME_PERIOD_END;
	}
	
	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM(String pNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM = pNT_CONTACT_TELECOM_CONTACTPOINT_SYSTEM;
	}

	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_VALUE() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_VALUE;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_VALUE(String pNT_CONTACT_TELECOM_CONTACTPOINT_VALUE) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_VALUE = pNT_CONTACT_TELECOM_CONTACTPOINT_VALUE;
	}

	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_USE() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_USE;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_USE(String pNT_CONTACT_TELECOM_CONTACTPOINT_USE) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_USE = pNT_CONTACT_TELECOM_CONTACTPOINT_USE;
	}

	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_RANK() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_RANK;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_RANK(String pNT_CONTACT_TELECOM_CONTACTPOINT_RANK) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_RANK = pNT_CONTACT_TELECOM_CONTACTPOINT_RANK;
	}

	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START(String pNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START = pNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_START;
	}

	public String getPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END() {
		return this.PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END;
	}

	public void setPNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END(String pNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END) {
		this.PNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END = pNT_CONTACT_TELECOM_CONTACTPOINT_PERIOD_END;
	}
	
	public String getPNT_CONTACT_ADDRESS_USE() {
		return this.PNT_CONTACT_ADDRESS_USE;
	}

	public void setPNT_CONTACT_ADDRESS_USE(String pNT_CONTACT_ADDRESS_USE) {
		this.PNT_CONTACT_ADDRESS_USE = pNT_CONTACT_ADDRESS_USE;
	}

	public String getPNT_CONTACT_ADDRESS_TYPE() {
		return this.PNT_CONTACT_ADDRESS_TYPE;
	}

	public void setPNT_CONTACT_ADDRESS_TYPE(String pNT_CONTACT_ADDRESS_TYPE) {
		this.PNT_CONTACT_ADDRESS_TYPE = pNT_CONTACT_ADDRESS_TYPE;
	}

	public String getPNT_CONTACT_ADDRESS_TEXT() {
		return this.PNT_CONTACT_ADDRESS_TEXT;
	}

	public void setPNT_CONTACT_ADDRESS_TEXT(String pNT_CONTACT_ADDRESS_TEXT) {
		this.PNT_CONTACT_ADDRESS_TEXT = pNT_CONTACT_ADDRESS_TEXT;
	}

	public String getPNT_CONTACT_ADDRESS_LINE() {
		return this.PNT_CONTACT_ADDRESS_LINE;
	}

	public void setPNT_CONTACT_ADDRESS_LINE(String pNT_CONTACT_ADDRESS_LINE) {
		this.PNT_CONTACT_ADDRESS_LINE = pNT_CONTACT_ADDRESS_LINE;
	}

	public String getPNT_CONTACT_ADDRESS_CITY() {
		return this.PNT_CONTACT_ADDRESS_CITY;
	}

	public void setPNT_CONTACT_ADDRESS_CITY(String pNT_CONTACT_ADDRESS_CITY) {
		this.PNT_CONTACT_ADDRESS_CITY = pNT_CONTACT_ADDRESS_CITY;
	}

	public String getPNT_CONTACT_ADDRESS_DISTRICT() {
		return this.PNT_CONTACT_ADDRESS_DISTRICT;
	}

	public void setPNT_CONTACT_ADDRESS_DISTRICT(String pNT_CONTACT_ADDRESS_DISTRICT) {
		this.PNT_CONTACT_ADDRESS_DISTRICT = pNT_CONTACT_ADDRESS_DISTRICT;
	}

	public String getPNT_CONTACT_ADDRESS_STATE() {
		return this.PNT_CONTACT_ADDRESS_STATE;
	}

	public void setPNT_CONTACT_ADDRESS_STATE(String pNT_CONTACT_ADDRESS_STATE) {
		this.PNT_CONTACT_ADDRESS_STATE = pNT_CONTACT_ADDRESS_STATE;
	}

	public String getPNT_CONTACT_ADDRESS_POSTAL_CODE() {
		return this.PNT_CONTACT_ADDRESS_POSTAL_CODE;
	}

	public void setPNT_CONTACT_ADDRESS_POSTAL_CODE(String pNT_CONTACT_ADDRESS_POSTAL_CODE) {
		this.PNT_CONTACT_ADDRESS_POSTAL_CODE = pNT_CONTACT_ADDRESS_POSTAL_CODE;
	}

	public String getPNT_CONTACT_ADDRESS_COUNTRY() {
		return this.PNT_CONTACT_ADDRESS_COUNTRY;
	}

	public void setPNT_CONTACT_ADDRESS_COUNTRY(String pNT_CONTACT_ADDRESS_COUNTRY) {
		this.PNT_CONTACT_ADDRESS_COUNTRY = pNT_CONTACT_ADDRESS_COUNTRY;
	}

	public String getPNT_CONTACT_ADDRESS_PERIOD_START() {
		return this.PNT_CONTACT_ADDRESS_PERIOD_START;
	}

	public void setPNT_CONTACT_ADDRESS_PERIOD_START(String pNT_CONTACT_ADDRESS_PERIOD_START) {
		this.PNT_CONTACT_ADDRESS_PERIOD_START = pNT_CONTACT_ADDRESS_PERIOD_START;
	}

	public String getPNT_CONTACT_ADDRESS_PERIOD_END() {
		return this.PNT_CONTACT_ADDRESS_PERIOD_END;
	}

	public void setPNT_CONTACT_ADDRESS_PERIOD_END(String pNT_CONTACT_ADDRESS_PERIOD_END) {
		this.PNT_CONTACT_ADDRESS_PERIOD_END = pNT_CONTACT_ADDRESS_PERIOD_END;
	}

	public String getPNT_CONTACT_GENDER() {
		return this.PNT_CONTACT_GENDER;
	}

	public void setPNT_CONTACT_GENDER(String pNT_CONTACT_GENDER) {
		this.PNT_CONTACT_GENDER = pNT_CONTACT_GENDER;
	}
	
	public String getPNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE() {
		return this.PNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE;
	}

	public void setPNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE(String pNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE) {
		this.PNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE = pNT_CONTACT_ORGANIZATION_REFERENCE_REFERENCE;
	}

	public String getPNT_CONTACT_ORGANIZATION_REFERENCE_TYPE() {
		return this.PNT_CONTACT_ORGANIZATION_REFERENCE_TYPE;
	}

	public void setPNT_CONTACT_ORGANIZATION_REFERENCE_TYPE(String pNT_CONTACT_ORGANIZATION_REFERENCE_TYPE) {
		this.PNT_CONTACT_ORGANIZATION_REFERENCE_TYPE = pNT_CONTACT_ORGANIZATION_REFERENCE_TYPE;
	}

	public String getPNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER() {
		return this.PNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER;
	}

	public void setPNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER(String pNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER) {
		this.PNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER = pNT_CONTACT_ORGANIZATION_REFERENCE_IDENTIFIER;
	}

	public String getPNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY() {
		return this.PNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY;
	}

	public void setPNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY(String pNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY) {
		this.PNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY = pNT_CONTACT_ORGANIZATION_REFERENCE_DISPLAY;
	}
	
	public String getPNT_CONTACT_PERIOD() {
		return this.PNT_CONTACT_PERIOD;
	}

	public void setPNT_CONTACT_PERIOD(String pNT_CONTACT_PERIOD) {
		this.PNT_CONTACT_PERIOD = pNT_CONTACT_PERIOD;
	}

	public String getPNT_CONTACT_PERIOD_START() {
		return this.PNT_CONTACT_PERIOD_START;
	}

	public void setPNT_CONTACT_PERIOD_START(String pNT_CONTACT_PERIOD_START) {
		this.PNT_CONTACT_PERIOD_START = pNT_CONTACT_PERIOD_START;
	}

	public String getPNT_CONTACT_PERIOD_END() {
		return this.PNT_CONTACT_PERIOD_END;
	}

	public void setPNT_CONTACT_PERIOD_END(String pNT_CONTACT_PERIOD_END) {
		this.PNT_CONTACT_PERIOD_END = pNT_CONTACT_PERIOD_END;
	}
	
	public String getPNT_COMMUNICATION_LANGUAGE() {
		return this.PNT_COMMUNICATION_LANGUAGE;
	}

	public void setPNT_COMMUNICATION_LANGUAGE(String pNT_COMMUNICATION_LANGUAGE) {
		this.PNT_COMMUNICATION_LANGUAGE = pNT_COMMUNICATION_LANGUAGE;
	}

	public String getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE() {
		return this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE;
	}

	public void setPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE(
			String pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE) {
		this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE = pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE;
	}
	
	public String getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY() {
		return this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY;
	}

	public void setPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY(
			String pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY) {
		this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY = pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_DISPLAY;
	}
	
	public String getPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED() {
		return this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_CODE;
	}

	public void setPNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED(
			String pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED) {
		this.PNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED = pNT_COMMUNICATION_LANGUAGE_CODEABLECONCEPT_CODING_USERSELECTED;
	}

	public String getPNT_COMMUNICATION_LANGUAGE_TEXT() {
		return this.PNT_COMMUNICATION_LANGUAGE_TEXT;
	}

	public void setPNT_COMMUNICATION_LANGUAGE_TEXT(String pNT_COMMUNICATION_LANGUAGE_TEXT) {
		this.PNT_COMMUNICATION_LANGUAGE_TEXT = pNT_COMMUNICATION_LANGUAGE_TEXT;
	}
	
	public String getPNT_COMMUNICATION_PREFERRED() {
		return this.PNT_COMMUNICATION_PREFERRED; 
	}

	public void setPNT_COMMUNICATION_PREFERRED(String pNT_COMMUNICATION_PREFERRED) {
		this.PNT_COMMUNICATION_PREFERRED = pNT_COMMUNICATION_PREFERRED;
	}

	public String getPNT_GENERAL_PRACTICTIONER_REFERENCE() {
		return this.PNT_GENERAL_PRACTICTIONER_REFERENCE;
	}

	public void setPNT_GENERAL_PRACTICTIONER_REFERENCE(String pNT_GENERAL_PRACTICTIONER_REFERENCE) {
		this.PNT_GENERAL_PRACTICTIONER_REFERENCE = pNT_GENERAL_PRACTICTIONER_REFERENCE;
	}

	public String getPNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE() {
		return this.PNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE;
	}

	public void setPNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE(String pNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE) {
		this.PNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE = pNT_GENERAL_PRACTICTIONER_REFERENCE_REFERENCE;
	}

	public String getPNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE() {
		return this.PNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE;
	}

	public void setPNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE(String pNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE) {
		this.PNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE = pNT_GENERAL_PRACTICTIONER_REFERENCE_TYPE;
	}

	public String getPNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER() {
		return this.PNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER;
	}

	public void setPNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER(String pNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER) {
		this.PNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER = pNT_GENERAL_PRACTICTIONER_REFERENCE_IDENTIFIER;
	}

	public String getPNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY() {
		return this.PNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY;
	}

	public void setPNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY(String pNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY) {
		this.PNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY = pNT_GENERAL_PRACTICTIONER_REFERENCE_DISPLAY;
	}

	public String getPNT_MANAGING_ORGANIZATION_REFERENCE() {
		return this.PNT_MANAGING_ORGANIZATION_REFERENCE;
	}

	public void setPNT_MANAGING_ORGANIZATION_REFERENCE(String pNT_MANAGING_ORGANIZATION_REFERENCE) {
		this.PNT_MANAGING_ORGANIZATION_REFERENCE = pNT_MANAGING_ORGANIZATION_REFERENCE;
	}

	public String getPNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE() {
		return this.PNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE;
	}

	public void setPNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE(String pNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE) {
		this.PNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE = pNT_MANAGING_ORGANIZATION_REFERENCE_REFERENCE;
	}

	public String getPNT_MANAGING_ORGANIZATION_REFERENCE_TYPE() {
		return this.PNT_MANAGING_ORGANIZATION_REFERENCE_TYPE;
	}

	public void setPNT_MANAGING_ORGANIZATION_REFERENCE_TYPE(String pNT_MANAGING_ORGANIZATION_REFERENCE_TYPE) {
		this.PNT_MANAGING_ORGANIZATION_REFERENCE_TYPE = pNT_MANAGING_ORGANIZATION_REFERENCE_TYPE;
	}

	public String getPNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER() {
		return this.PNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER;
	}

	public void setPNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER(String pNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER) {
		this.PNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER = pNT_MANAGING_ORGANIZATION_REFERENCE_IDENTIFIER;
	}

	public String getPNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY() {
		return this.PNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY;
	}

	public void setPNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY(String pNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY) {
		this.PNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY = pNT_MANAGING_ORGANIZATION_REFERENCE_DISPLAY;
	}

	public String getPNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION() {
		return this.PNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	}

	public void setPNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION(String pNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION) {
		this.PNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION = pNT_LINK_BACKBONE_ELEMENT_MODIFIEREXTENSION;
	}

	public String getPNT_LINK_OTHER_REFERENCE_REFERENCE() {
		return this.PNT_LINK_OTHER_REFERENCE_REFERENCE;
	}

	public void setPNT_LINK_OTHER_REFERENCE_REFERENCE(String pNT_LINK_OTHER_REFERENCE_REFERENCE) {
		this.PNT_LINK_OTHER_REFERENCE_REFERENCE = pNT_LINK_OTHER_REFERENCE_REFERENCE;
	}

	public String getPNT_LINK_OTHER_REFERENCE_TYPE() {
		return this.PNT_LINK_OTHER_REFERENCE_TYPE;
	}

	public void setPNT_LINK_OTHER_REFERENCE_TYPE(String pNT_LINK_OTHER_REFERENCE_TYPE) {
		this.PNT_LINK_OTHER_REFERENCE_TYPE = pNT_LINK_OTHER_REFERENCE_TYPE;
	}

	public String getPNT_LINK_OTHER_REFERENCE_IDENTIFIER() {
		return this.PNT_LINK_OTHER_REFERENCE_IDENTIFIER;
	}

	public void setPNT_LINK_OTHER_REFERENCE_IDENTIFIER(String pNT_LINK_OTHER_REFERENCE_IDENTIFIER) {
		this.PNT_LINK_OTHER_REFERENCE_IDENTIFIER = pNT_LINK_OTHER_REFERENCE_IDENTIFIER;
	}

	public String getPNT_LINK_OTHER_REFERENCE_DISPLAY() {
		return this.PNT_LINK_OTHER_REFERENCE_DISPLAY;
	}

	public void setPNT_LINK_OTHER_REFERENCE_DISPLAY(String pNT_LINK_OTHER_REFERENCE_DISPLAY) {
		this.PNT_LINK_OTHER_REFERENCE_DISPLAY = pNT_LINK_OTHER_REFERENCE_DISPLAY;
	}
	
	public String getPNT_LINK_TYPE() {
		return this.PNT_LINK_TYPE;
	}

	public void setPNT_LINK_TYPE(String pNT_LINK_TYPE) {
		this.PNT_LINK_TYPE = pNT_LINK_TYPE;
	}
	
	public String getPNT_RACE() 
	{
		return this.PNT_RACE;
	}

	public void setPNT_RACE(String pNT_RACE) 
	{
		this.PNT_RACE = pNT_RACE;
	}

	public String getPNT_ETHNICITY() 
	{
		return this.PNT_ETHNICITY;
	}

	public void setPNT_ETHNICITY(String pNT_ETHNICITY) 
	{
		this.PNT_ETHNICITY = pNT_ETHNICITY;
	}

	public String getPNT_ADDRESS_EXT_LAT_VALUE() 
	{
		return this.PNT_ADDRESS_EXT_LAT_VALUE;
	}

	public void setPNT_ADDRESS_EXT_LAT_VALUE(String pNT_ADDRESS_EXT_LAT_VALUE) 
	{
		this.PNT_ADDRESS_EXT_LAT_VALUE = pNT_ADDRESS_EXT_LAT_VALUE;
	}

	public String getPNT_ADDRESS_EXT_LONG_VALUE() 
	{
		return this.PNT_ADDRESS_EXT_LONG_VALUE;
	}

	public void setPNT_ADDRESS_EXT_LONG_VALUE(String pNT_ADDRESS_EXT_LONG_VALUE) 
	{
		this.PNT_ADDRESS_EXT_LONG_VALUE = pNT_ADDRESS_EXT_LONG_VALUE;
	}
	
	public List<Encounter> getEncounterList() 
	{
		return encounterList;
	}

	public void setEncounterList(List<Encounter> encounterList) 
	{
		this.encounterList = encounterList;
	}
	
	public String getPNT_RACE_DISP() 
	{
		return PNT_RACE_DISP;
	}

	public void setPNT_RACE_DISP(String pNT_RACE_DISP) 
	{
		PNT_RACE_DISP = pNT_RACE_DISP;
	}

	public String getPNT_ETHNICITY_DISP() 
	{
		return PNT_ETHNICITY_DISP;
	}

	public void setPNT_ETHNICITY_DISP(String pNT_ETHNICITY_DISP) 
	{
		PNT_ETHNICITY_DISP = pNT_ETHNICITY_DISP;
	}

	@Override
	public String toString() 
	{
		return "Patient: ";
	}
}

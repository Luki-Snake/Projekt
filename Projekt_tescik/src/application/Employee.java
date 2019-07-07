package application;

import java.time.LocalDate;

import application.Employee;

import java.sql.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Employee {

	private Integer employeeID;
	private StringProperty firstName;
	private StringProperty lastName;
	private StringProperty selection;
	private StringProperty street;
	private IntegerProperty postalCode;
	private StringProperty city;
	private ObjectProperty<LocalDate> birthday;
	private ObjectProperty<LocalDate> hire_date;

	private Integer idDictionary;

	/**
	 * Default constructor.
	 */
	public Employee() {
		this.employeeID = new Integer(0);

		this.firstName = new SimpleStringProperty();
		this.lastName = new SimpleStringProperty();
		this.selection = new SimpleStringProperty();

		// Some initial dummy data, just for convenient testing.
		this.street = new SimpleStringProperty();
		this.postalCode = new SimpleIntegerProperty();
		this.city = new SimpleStringProperty();
		this.birthday = new SimpleObjectProperty<LocalDate>();
		this.hire_date = new SimpleObjectProperty<LocalDate>();

		this.idDictionary = null;
	}

	public Integer getPersonID() {
		return employeeID;
	}

	public void setPersonID(Integer personID) {
		this.employeeID = personID;
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public StringProperty firstNameProperty() {
		return firstName;
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public StringProperty lastNameProperty() {
		return lastName;
	}

	public String getStreet() {
		return street.get();
	}

	public void setStreet(String street) {
		this.street.set(street);
	}

	public StringProperty streetProperty() {
		return street;
	}

	public int getPostalCode() {
		return postalCode.get();
	}

	public void setPostalCode(int postalCode) {
		this.postalCode.set(postalCode);
	}

	public IntegerProperty postalCodeProperty() {
		return postalCode;
	}

	public String getCity() {
		return city.get();
	}

	public void setCity(String city) {
		this.city.set(city);
	}

	public StringProperty cityProperty() {
		return city;
	}

	public LocalDate getBirthday() {
		return birthday.get();
	}

	public String getBirthdayStr() {
		LocalDate dt = birthday.get();
		if (dt != null) {
			return dt.toString();
		} else {
			return new String("");
		}
	}

	public Date getBirthdaySqlDate() {
		LocalDate dt = birthday.get();
		if (dt != null) {
			return Date.valueOf(dt);
		} else {
			return null;
		}
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday.set(birthday);
	}

	public ObjectProperty<LocalDate> birthdayProperty() {
		return birthday;
	}

	public Integer getIDDictionary() {
		return idDictionary;
	}

	public void setIDDictionary(Integer idDictionary) {
		this.idDictionary = idDictionary;
	}

	public LocalDate getHire_Date() {
		return hire_date.get();
	}

	public String getHire_DateStr() {
		LocalDate dt = hire_date.get();
		if (dt != null) {
			return dt.toString();
		} else {
			return new String("");
		}
	}

	public Date getHire_DateSqlDate() {
		LocalDate dt = hire_date.get();
		if (dt != null) {
			return Date.valueOf(dt);
		} else {
			return null;
		}
	}

	public void setHire_Date(LocalDate hire_date) {
        this.hire_date.set(hire_date);
    }
	public String getSelection() {
		return selection.get();
	}

	public void setSelection(String firstName) {
		this.selection.set(firstName);
	}

	public StringProperty SelectionProperty() {
		return selection;
	}
}


import { Address } from "../address/address";
import { Gender } from "./gender";

export class User {
    public id: number;
    public name: string;
    public surname: string;
    public jmbg: string;
    public dateOfBirth: Date;
    public address: Address;
    public gender: Gender;
    public phoneNumber: string;
    public email: string;
    public password: string;
    
    constructor(id: number, name: string, surname: string, jmbg: string, dateOfBirth: Date, address: Address, gender: Gender, phoneNumber: string, email: string, password: string) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }
}
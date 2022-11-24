import { Address } from "../address/address";
import { BloodBank } from "../bloodbank/bloodbank";
import { Gender } from "./gender";
import { Role } from "./role";

export class BloodBankAdmin {
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
    public role: Role;
    public authorities: number[];
    public bloodBank: BloodBank;

    constructor(id: number, name: string, surname: string, jmbg: string, dateOfBirth: Date, address: Address, gender: Gender, phoneNumber: string, email: string, password: string, role: Role, authorities: number[], bloodBank: BloodBank) {
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
        this.role = role;
        this.authorities = authorities;
        this.bloodBank = bloodBank;
    }
}
import { Address } from "../address/address";
import { Gender } from "./gender";
import { Role } from "./role";

export class Customer {
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
    public proffesion: string;
    public proffesionInfo: string;
    public role: Role;
    public authorities: number[];
    
    constructor(id: number, name: string, surname: string, jmbg: string, dateOfBirth: Date, address: Address, gender: Gender, phoneNumber: string, email: string, password: string, proffesion: string, professionInfo: string, role: Role, authorities: number[]) {
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
        this.proffesion = proffesion;
        this.proffesionInfo = professionInfo;
        this.role = role;
        this.authorities = authorities;
    }
}
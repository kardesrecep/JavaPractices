package enums;

public class User {

    String name;
    int role=0;//role=0=>admin, 1=> customer
    int status=0;//0 -> active 1->login

    Role yetki; //Role enum dan yetkisi adinda bir field create edildi
    Status durum;////Status enum dan durum adinda bir field create edildi
}

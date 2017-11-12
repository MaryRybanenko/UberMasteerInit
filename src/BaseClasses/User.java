package BaseClasses;

import Annotations.AttrTypeId;
import Annotations.ObjectType;

import java.util.List;

@ObjectType(id = 1, type = User.class )
public class User {

    int id;
    @AttrTypeId(id = 1)
    String fullName;
    List<String> locations;
    String phoneNumber;
    @AttrTypeId(id = 3)
    String passWord;
    String picture;
}

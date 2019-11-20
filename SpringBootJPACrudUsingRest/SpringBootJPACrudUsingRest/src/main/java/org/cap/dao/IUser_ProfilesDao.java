package org.cap.dao;

import org.cap.entities.User;
import org.cap.entities.User_Profiles;

public interface IUser_ProfilesDao {

	User_Profiles createUser(User user_p);

    User_Profiles createUser(String username);

	User_Profiles createUser_Profiles(User_Profiles user_p);

}

package inventory.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import inventory.model.User;
@Repository
@Transactional(rollbackFor=Exception.class)

public class UserDAOImpl extends BaseDAOImpl<User> implements UserDAO<User> {

}

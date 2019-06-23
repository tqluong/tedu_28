package inventory.dao;
import java.util.List;
import java.io.Serializable;


public interface BaseDAO<E> {
	public List<E> findAll();
	public E findById(Class<E> e, Serializable id);
	public List<E> findByProperty(String property, Object value);
	public void save(E instance);
	public void update(E instance);
}

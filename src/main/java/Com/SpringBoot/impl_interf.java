package Com.SpringBoot;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class impl_interf {
	
	private HibernateTemplate  ab;

	public HibernateTemplate getAb() {
		return ab;
	}

	public void setAb(HibernateTemplate ab) {
		this.ab = ab;
	}
	
  @Transactional(readOnly=false)
  
  public int insert(basic_info b) {
	    int  i=(Integer)ab.save(b);
	 return i;
  }	 
	//Select by id
	 
	 public basic_info getworkerinfo(int id) {
		 basic_info st=ab.get( basic_info.class, id);
		 return st;
	 }
	//Select all
	 public List<basic_info> getallinfo(){
		 List<basic_info> li=ab.loadAll(basic_info.class);
		 return li;
	 }
	 @Transactional
	 public void update(basic_info b) {
		 ab.update(b);
	 }
	 
	 @Transactional
	 public void delete(int id) {
		 basic_info b0=ab.get(basic_info.class,id); 
		 ab.delete(b0);
	 }
		
}

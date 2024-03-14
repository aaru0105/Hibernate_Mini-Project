package Com.SpringBoot;

import java.util.List;

public interface  interf {
	
	public int insert(basic_info b);
	public basic_info getworkerinfo(int id);
	public List<basic_info> getallinfo();
	public void update(basic_info b);
	public void delete(int id);
	

}

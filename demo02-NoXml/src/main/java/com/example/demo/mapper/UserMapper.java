package com.example.demo.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	    /**
 	     * 查询指定ID的数据
 	     *
 	     * @param id
 	     * @return
 	     */
	    @Select("select * from user where id = #{id}")
	    public User findOne(Long id);
       /**
	     * 查询所有数据
 	     *
 	     * @return
 	     */
       @Select("select * from user")
        public List<User> findAll();
	/**
	 * 插入数据
	 *
	 * @param
	 * @return
	 */

	@Insert("insert into user\n" +
			"\t\t  (id, name, mobile, email)\n" +
			"\t\tvalues\n" +
			"\t\t  (#{id}, #{name}, #{mobile}, #{email})")
	    public int insert(User data);
           /**
     	     * 删除指定ID的数据
     	     *
     	     * @param id
     	     * @return
     	     */
           @Delete("delete from user where id = #{id}")
        public int delete(Long id);

}

package json;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import entity.Employee;

public class TestJSON {
	
	//将Java对象转换为json
	@Test
	public void test1(){
		Employee employee = new Employee(1,"zs",234.2,18);
		String jsonString = JSON.toJSONString(employee);
		System.out.println(jsonString);
	}

	//将数组转换为json
	@Test
	public void test2(){
		String[] a = new String[]{"a","b","c"};
		String jsonString = JSON.toJSONString(a);
		System.out.println(jsonString);
	}
	
	//将集合转换为json
	@Test
	public void test3(){
		Employee employee1 = new Employee(1,"zs",234.2,18);
		Employee employee2 = new Employee(2,"ls",123.1,20);
		Employee employee3 = new Employee(3,"ww",456.9,21);
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(employee1);
		emps.add(employee2);
		emps.add(employee3);
		
		String jsonString = JSON.toJSONString(emps);
		System.out.println(jsonString);

	}
	
}

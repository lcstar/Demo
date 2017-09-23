package com.lc.poi.test;

import java.io.IOException;
import java.util.List;

import com.lc.poi.mapper.DocAppointmentMapper;
import com.lc.poi.mapper.DoctorMapper;
import com.lc.poi.model.Doctor;
import com.lc.poi.model.view.DocAppointmentView;
import com.lc.poi.util.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com.lc.poi/applicationContext.xml")
public class TestLc {

	@Autowired
	private DoctorMapper doctorMapper;
	@Autowired
    private DocAppointmentMapper docAppointmentMapper;

	@Test
	public void testList() throws IllegalArgumentException, IllegalAccessException, IOException {
        List<Doctor> docs = doctorMapper.getDocs();
        ExcelUtil.exportExcel(docs, "Test");
    }

    @Test
    public void testOneToMore(){
        DocAppointmentView doc = docAppointmentMapper.selectOneToMore();
        System.out.println(doc.getMembers().size());
    }

    @Test
    public void testNewOneToMore(){
        DocAppointmentView doc = docAppointmentMapper.newGetOneToMore();
        System.out.println(doc.getMembers().size());
    }

    @Test
    public void testmain(){
        System.out.println("dddddd");
    }

}

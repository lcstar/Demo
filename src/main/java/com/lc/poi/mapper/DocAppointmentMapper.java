package com.lc.poi.mapper;

import com.lc.poi.model.DocAppointment;
import com.lc.poi.model.view.DocAppointmentView;

import java.util.List;

public interface DocAppointmentMapper {
    public DocAppointmentView selectOneToMore();

    public DocAppointmentView newGetOneToMore();
}

package com.lc.poi.model.view;

import com.lc.poi.model.DocAppointment;
import com.lc.poi.model.MemberAppointment;

import java.util.List;

public class DocAppointmentView extends DocAppointment{
    private List<MemberAppointment> members;

    public List<MemberAppointment> getMembers() {
        return members;
    }

    public void setMembers(List<MemberAppointment> members) {
        this.members = members;
    }
}

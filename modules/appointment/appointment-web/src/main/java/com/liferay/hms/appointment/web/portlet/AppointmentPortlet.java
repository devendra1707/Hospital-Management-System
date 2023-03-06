package com.liferay.hms.appointment.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.hms.appointment.model.Appointment;
import com.liferay.hms.appointment.service.AppointmentLocalService;
import com.liferay.hms.appointment.web.constants.AppointmentPortletKeys;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author dell
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hms",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Appointment", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/add-appointment1.jsp", 
		"javax.portlet.name=" + AppointmentPortletKeys.APPOINTMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AppointmentPortlet extends MVCPortlet {

	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	@Reference
	CounterLocalService counterLocalService;

	@Reference
	AppointmentLocalService appointmentLocalService;

	@ProcessAction(name = "addAppointment")
	public void addAppointment(ActionRequest actionRequest, ActionResponse actionResponse) {
		long appointmentId = counterLocalService.increment(AppointmentPortlet.class.getName());
		String name = ParamUtil.getString(actionRequest, "name");
		String mobile = ParamUtil.getString(actionRequest, "mobile");
		String email = ParamUtil.getString(actionRequest, "email");
		String country = ParamUtil.getString(actionRequest, "country");
		String age = ParamUtil.getString(actionRequest, "age");
		String speciality = ParamUtil.getString(actionRequest, "speciality");

		Appointment appointment = appointmentLocalService.createAppointment(appointmentId);
		appointment.setName(name);
		appointment.setMobile(mobile);
		appointment.setEmail(email);
		appointment.setCountry(country);
		appointment.setAge(age);
		appointment.setSpeciality(speciality);

		appointmentLocalService.addAppointment(appointment);
	}

		
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
        List<Appointment> appointmentList = appointmentLocalService.getAppointments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("appointmentList", appointmentList);        
        super.render(renderRequest, renderResponse);
    }

    @ProcessAction(name = "updateAppointment")
	public void updateAppointment(ActionRequest actionRequest, ActionResponse actionResponse) {
		long appointmentId = ParamUtil.getLong(actionRequest, "appointmentId", GetterUtil.DEFAULT_LONG);
		String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
		String mobile = ParamUtil.getString(actionRequest, "mobile", GetterUtil.DEFAULT_STRING);
		String email = ParamUtil.getString(actionRequest, "email", GetterUtil.DEFAULT_STRING);
		String country = ParamUtil.getString(actionRequest, "country", GetterUtil.DEFAULT_STRING);
		String age = ParamUtil.getString(actionRequest, "age", GetterUtil.DEFAULT_STRING);
		String speciality = ParamUtil.getString(actionRequest, "speciality", GetterUtil.DEFAULT_STRING);

		Appointment appointment = null;
		try {
			appointment = appointmentLocalService.getAppointment(appointmentId);
		} catch (Exception e) {
			log.error(e.getCause(), e);
		}
		if (Validator.isNotNull(appointment)) {
			appointment.setName(name);
			appointment.setMobile(mobile);
			appointment.setEmail(email);
			appointment.setCountry(country);
			appointment.setAge(age);
			appointment.setSpeciality(speciality);
			appointmentLocalService.updateAppointment(appointment);
		}
	}
    /*
    @ProcessAction(name = "updateAppointment")
    public void updateAppointment(ActionRequest actionRequest,  ActionResponse actionResponse) {
        long appointmentId = ParamUtil.getLong(actionRequest,"appointmentId", GetterUtil.DEFAULT_LONG);
        String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
        String mobile = ParamUtil.getString(actionRequest, "mobile", GetterUtil.DEFAULT_STRING);
        String email = ParamUtil.getString(actionRequest, "email", GetterUtil.DEFAULT_STRING);
        String country = ParamUtil.getString(actionRequest, "country", GetterUtil.DEFAULT_STRING);
        String age = ParamUtil.getString(actionRequest, "age", GetterUtil.DEFAULT_STRING);
        String speciality = ParamUtil.getString(actionRequest, "speciality", GetterUtil.DEFAULT_STRING);
        
        Appointment appointment = null;
        try {
        	appointment = appointmentLocalService.getAppointment(appointmentId);
        } catch (Exception e) {
            log.error(e.getCause(), e);
        }
 
        if(Validator.isNotNull(appointment)) {
        	appointment.setName(name);
        	appointment.setMobile(mobile);
        	appointment.setEmail(email);
        	appointment.setCountry(country);
            appointment.setAge(age);
            appointment.setSpeciality(speciality);
            appointmentLocalService.updateAppointment(appointment);
        }
    }
    */
    /*
    
	@ProcessAction(name = "updateAppointment")
	public void updateAppointment(ActionRequest actionRequest, ActionResponse actionResponse) {
		long appointmentId = ParamUtil.getLong(actionRequest, "appointmentId", GetterUtil.DEFAULT_LONG);
		String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
		long mobile = ParamUtil.getLong(actionRequest, "mobile", GetterUtil.DEFAULT_LONG);
		String email = ParamUtil.getString(actionRequest, "email", GetterUtil.DEFAULT_STRING);
		String country = ParamUtil.getString(actionRequest, "country", GetterUtil.DEFAULT_STRING);
		int age = ParamUtil.getInteger(actionRequest, "age", GetterUtil.DEFAULT_INTEGER);
		String speciality = ParamUtil.getString(actionRequest, "speciality", GetterUtil.DEFAULT_STRING);

		Appointment appointment = null;
		try {
			appointment = appointmentLocalService.getAppointment(appointmentId);
		} catch (Exception e) {
			log.error(e.getCause(), e);
		}
		if (Validator.isNotNull(appointment)) {
			appointment.setName(name);
			appointment.setMobile(mobile);
			appointment.setEmail(email);
			appointment.setCountry(country);
			appointment.setAge(age);
			appointment.setSpeciality(speciality);
			appointmentLocalService.updateAppointment(appointment);
		}
	}
*/
	@ProcessAction(name = "deleteAppointment")
	public void deleteAppointment(ActionRequest actionRequest, ActionResponse actionResponse) {
		long appointmentId = ParamUtil.getLong(actionRequest, "appointmentId", GetterUtil.DEFAULT_LONG);
		try {
			appointmentLocalService.deleteAppointment(appointmentId);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

}
package com.liferay.hms.enquiry.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.hms.enquiry.service.EnquiryLocalService;
import com.liferay.hms.enquiry.web.constants.EnquiryPortletKeys;
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
 * @author Devendra
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hms",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Enquiry",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/add-enquiry1.jsp",
		"javax.portlet.name=" + EnquiryPortletKeys.ENQUIRY,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EnquiryPortlet extends MVCPortlet {
	
private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	EnquiryLocalService enquiryLocalService;
	
	@ProcessAction(name = "addEnquiry")
	public void addEnquiry(ActionRequest actionRequest, ActionResponse actionResponse) {
		long enquiryId = counterLocalService.increment(EnquiryLocalService.class.getName());
		String name = ParamUtil.getString(actionRequest, "name");
		String mobileNo = ParamUtil.getString(actionRequest, "mobileNo");
		String concern = ParamUtil.getString(actionRequest, "concern");
		
		Enquiry enquiry = enquiryLocalService.createEnquiry(enquiryId);
		enquiry.setEnquiryId(enquiryId);
		enquiry.setName(name);
		enquiry.setMobileNo(mobileNo);
		enquiry.setConcern(concern);
		
		enquiryLocalService.addEnquiry(enquiry);
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		List<Enquiry> enquiryList = enquiryLocalService.getEnquiries(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("enquiryList", enquiryList);
		super.render(renderRequest, renderResponse);
	}
	
	 @ProcessAction(name = "updateEnquiry")
	    public void updateEnquiry(ActionRequest actionRequest,  ActionResponse actionResponse) {
	        long enquiryId = ParamUtil.getLong(actionRequest,"enquiryId", GetterUtil.DEFAULT_LONG);
	        String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
	        String mobileNo = ParamUtil.getString(actionRequest, "mobileNo", GetterUtil.DEFAULT_STRING);
	        String concern = ParamUtil.getString(actionRequest, "concern", GetterUtil.DEFAULT_STRING);
	        
	        Enquiry enquiry = null;
	        try {
	        	enquiry = enquiryLocalService.getEnquiry(enquiryId);
	        } catch (Exception e) {
	            log.error(e.getCause(), e);
	        }
	 
	        if(Validator.isNotNull(enquiry)) {
	        	enquiry.setName(name);
	        	enquiry.setMobileNo(mobileNo);
	        	enquiry.setConcern(concern);
	        	enquiryLocalService.updateEnquiry(enquiry);
	        }
	    }
	 
	    @ProcessAction(name = "deleteEnquiry")
	    public void deleteEnquiry(ActionRequest actionRequest, ActionResponse actionResponse){
	        long enquiryId = ParamUtil.getLong(actionRequest, "enquiryId", GetterUtil.DEFAULT_LONG);
	        try {
	            enquiryLocalService.deleteEnquiry(enquiryId);
	        } catch (Exception e) {
	            log.error(e.getMessage(), e);
	        }
	}
	
}
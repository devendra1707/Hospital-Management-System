package com.liferay.hms.internationalpatients.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.hms.internationalpatients.model.International;
import com.liferay.hms.internationalpatients.service.InternationLocalService;
import com.liferay.hms.internationalpatients.service.InternationalLocalService;
import com.liferay.hms.internationalpatients.web.constants.InternationalPatientsPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Devendra
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hms",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=InternationalPatients", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/add-patient.jsp",
		"javax.portlet.name=" + InternationalPatientsPortletKeys.INTERNATIONALPATIENTS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)

public class InternationalPatientsPortlet extends MVCPortlet {

	@Reference
	CounterLocalService counterLocalService;

	@Reference
	InternationalLocalService internationalEnquiryLocalService;

	@ProcessAction(name = "addInternational")
	public void addInternational(ActionRequest actionRequest, ActionResponse actionResponse) {
		long id = counterLocalService.increment(InternationLocalService.class.getName());
		String name = ParamUtil.getString(actionRequest, "name");
		String mobile = ParamUtil.getString(actionRequest, "mobile");
		String query = ParamUtil.getString(actionRequest, "query");
		String email = ParamUtil.getString(actionRequest, "email");
		String country = ParamUtil.getString(actionRequest, "country");

		International international = internationalEnquiryLocalService.createInternational(id);
		international.setId(id);
		international.setName(name);
		international.setEmail(email);
		international.setCountry(country);
		international.setMobile(mobile);
		international.setQuery(query);

		internationalEnquiryLocalService.addInternational(international);
	}

}
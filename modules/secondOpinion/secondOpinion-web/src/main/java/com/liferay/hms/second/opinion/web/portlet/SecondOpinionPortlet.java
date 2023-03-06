package com.liferay.hms.second.opinion.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.hms.second.opinion.service.SecondOpinionLocalService;
import com.liferay.hms.second.opinion.web.constants.SecondOpinionPortletKeys;
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
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hms",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SecondOpinion",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/add-secondopinion1.jsp",
		"javax.portlet.name=" + SecondOpinionPortletKeys.SECONDOPINION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SecondOpinionPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	SecondOpinionLocalService secondOpinionLocalService;
	
	@ProcessAction(name = "addSecondOpinion")
	public void addSecondOpinion(ActionRequest actionRequest, ActionResponse actionResponse) {
		long id = counterLocalService.increment(SecondOpinion.class.getName());
		String name = ParamUtil.getString(actionRequest, "name");
		String email = ParamUtil.getString(actionRequest, "email");
		String mobile = ParamUtil.getString(actionRequest, "mobile");
		String specialty = ParamUtil.getString(actionRequest, "specialty");
		String remark = ParamUtil.getString(actionRequest, "remark");
		
		SecondOpinion secondOpinion = secondOpinionLocalService.createSecondOpinion(id);
		secondOpinion.setId(id);
		secondOpinion.setName(name);
		secondOpinion.setEmail(email);
		secondOpinion.setMobile(mobile);
		secondOpinion.setSpecialty(specialty);
		secondOpinion.setRemark(remark);
		
		secondOpinionLocalService.addSecondOpinion(secondOpinion);
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException
	{
		List<SecondOpinion> secondOpinionList = secondOpinionLocalService.getSecondOpinions(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("secondOpinionList", secondOpinionList);
		super.render(renderRequest, renderResponse);
	}
	
	@ProcessAction(name = "updateSecondOpinion")
	public void updateSecondOpinion(ActionRequest actionRequest, ActionResponse actionResponse) {
		long id = ParamUtil.getLong(actionRequest, "id", GetterUtil.DEFAULT_LONG);
		String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
		String email = ParamUtil.getString(actionRequest, "email",GetterUtil.DEFAULT_STRING);
		String mobile = ParamUtil.getString(actionRequest, "mobile", GetterUtil.DEFAULT_STRING);
		String specialty = ParamUtil.getString(actionRequest, "specialty", GetterUtil.DEFAULT_STRING);
		String remark = ParamUtil.getString(actionRequest, "remark", GetterUtil.DEFAULT_STRING);
		
		SecondOpinion secondOpinion = null;
		try {
			secondOpinion = secondOpinionLocalService.getSecondOpinion(id);
		}catch(Exception e) {
			log.error(e.getCause(),e);
		}
		if(Validator.isNotNull(secondOpinion)) {
			secondOpinion.setName(name);
			secondOpinion.setEmail(email);
			secondOpinion.setMobile(mobile);
			secondOpinion.setSpecialty(specialty);
			secondOpinion.setRemark(remark);
			secondOpinionLocalService.updateSecondOpinion(secondOpinion);
		}
	}
	
	@ProcessAction(name = "deleteSecondOpinion")
	public void deleteSecondOpinion(ActionRequest actionRequest , ActionResponse actionResponse) {
		long id = ParamUtil.getLong(actionRequest, "id", GetterUtil.DEFAULT_LONG);
		try {
			secondOpinionLocalService.deleteSecondOpinion(id);
		}catch(Exception e) {
			log.error(e.getCause(),e);
		}
	}	
}
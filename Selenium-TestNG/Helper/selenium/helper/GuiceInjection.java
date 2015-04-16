package selenium.helper;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import org.testng.IModuleFactory;
import org.testng.ITestContext;
import org.testng.xml.XmlTest;
import rakuten.*;
import rakuten.common.Common;
import rakuten.common.Constants;
import selenium.helper.variation.IVariation;


public class GuiceInjection implements IModuleFactory {

	@Override
	public Module createModule(ITestContext testContext, Class<?> arg1) {
		try {
			XmlTest xml = testContext.getCurrentXmlTest();
			String variation = xml.getParameter("variation");		
			String device  = xml.getParameter("device").toLowerCase();
			Class<?> cls = ClassHelper.getVariationClass(device);
			Object obj = cls.newInstance();
			String _variation = ((IVariation)obj).getVariation(variation);
			return new InjectionModule(_variation);
		} catch (Exception e) {
			return null;
		}
		
	}
}

class InjectionModule extends AbstractModule {
	String _variation;
	String _device;
	
	InjectionModule(String variation) {
		this._variation = variation;
	}

    @SuppressWarnings("unchecked")
	protected void MapVariation(@SuppressWarnings("rawtypes") Class classObj)
    {
        Class<?> classMap = ClassHelper.getClassToBind(classObj, _variation, "rakuten");
        if (!classMap.getSimpleName().equals(classObj.getSimpleName()))
        {
            bind(classObj).to(classMap);
        }
    }


	@Override
	protected void configure() {

		// Bind common class
		MapVariation(Common.class);
        MapVariation(Constants.class);
        MapVariation(MyAccountAction.class);

		// Bind Interfaces & Actions
        MapVariation(HomePageEntity.class);
        MapVariation(HomePageAction.class);

        MapVariation(LoginPageEntity.class);
        MapVariation(LoginPageAction.class);

        MapVariation(MyRakutenPageAction.class);
        MapVariation(MyRakutenPageEntity.class);
        
        MapVariation(PointClubPageEntity.class);
        MapVariation(PointClubPageAction.class);
        MapVariation(PointClubVerification.class);
        
        MapVariation(TopPageEntity.class);
        MapVariation(TopPageAction.class);
        
        MapVariation(SignOutPageEntity.class);
        MapVariation(SignOutPageAction.class);
        MapVariation(SignOutVerification.class);
        
     // Account Settings
        MapVariation(AccountSettingEntity.class);
        MapVariation(AccountSettingAction.class);
        // Contact Setting
        MapVariation(ContactSettingEntity.class);
        MapVariation(ContactSettingAction.class);
        // Password settings
        MapVariation(PasswordSettingEntity.class);
        MapVariation(PasswordSettingAction.class);
        //Credit Card Information
        MapVariation(CreditCardInformationEntity.class);
        MapVariation(CreditCardInformationSettingAction.class);
        //Add new card
        MapVariation(AddNewCardEntity.class);
        MapVariation(AddNewCardAction.class);
        // Cancel Membership
        MapVariation(CancelMemberShipEntity.class);
        MapVariation(CancelMemberShipAction.class);
	}
}

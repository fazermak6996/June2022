package orange_selDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_Orange.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
		
	@Given("user is entering orngHRM page")
	public void user_is_entering_orng_hrm_page() {
		loadDriver();
		getUrl("https://opensource-demo.orangehrmlive.com/");
		implicitlyWait();
	}
	
	@When("enter your {string} and {string}")
	public void enter_your_and(String string, String string2) {
	    WebElement userName = driver.findElement(By.id("txtUsername"));
	    userName.sendKeys(string);
	    WebElement passWord = driver.findElement(By.id("txtPassword"));
	    passWord.sendKeys(string2);
	}
	
	@When("click the login button")
	public void click_the_login_button() {
	    WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	    loginbutton.click();
	}
	
	@Given("user to view leave page")
	public void user_to_view_leave_page() {
		implicitlyWait();
		WebElement Leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Leave.click();
	}
	
	@Then("Click in Apply tab to view applied leaves")
	public void click_in_apply_tab_to_view_applied_leaves() {
		implicitlyWait();
	   WebElement Apply = driver.findElement(By.id("menu_leave_applyLeave"));
	   Apply.click();
	}
	
	@Given("Click in My Leave tab to view all leaves")
	public void Click_in_My_Leave_tab_to_view_all_leaves() {
	implicitlyWait();
	WebElement MyLeave = driver.findElement(By.id("menu_leave_viewMyLeaveList"));
	MyLeave.click();
}
	
	@Given("User can select the thru date for the date range")
	public void user_can_select_the_thru_date_for_the_date_range() {
	    
	/*WebElement Date = driver.findElement(By.id("calFromDate"));
	Date.click();
		//driver.findElement(By.xpath("//*[@class=\'ui-datepicker-month\']")).click();
		//driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).click();
	*/}
	@Given("User can select the end date for  the date range")
	public void user_can_select_the_end_date_for_the_date_range() {

		
	}
	
	@Given("Select All Checkbox to see all leave status")
	public void select_all_checkbox_to_see_all_leave_status() {
	    
		WebElement All_CheckBox = driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck"));
		All_CheckBox.click();
	}
	@Given("Click only Rejected to see Rejected leaves")
	public void click_only_rejected_to_see_rejected_leaves() {
	   
		WebElement Rejected = driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
		Rejected.click();
		
	}
	@Given("Click only Cancelled to see Cancelled leaves")
	public void click_only_cancelled_to_see_cancelled_leaves() {
	    
		WebElement Cancelled = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
		Cancelled.click();
	}
	@Given("Click only Pending Approval to see Pending Approval leaves")
	public void click_only_pending_approval_to_see_pending_approval_leaves() {
	    
		WebElement Pending = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
		Pending.click();
		
	}
	@Given("Click only Scheduled to see Scheduled leaves")
	public void click_only_scheduled_to_see_scheduled_leaves() {
	    
		WebElement Scheduled = driver.findElement(By.id("leaveList_chkSearchFilter_2"));
		Scheduled.click();
	}
	@Given("Click only Taken to see Taken leaves")
	public void click_only_taken_to_see_taken_leaves() {
	    
		WebElement Taken = driver.findElement(By.id("leaveList_chkSearchFilter_3"));
		Taken.click();
	}
	@Then("UnSelect All Checkbox to see deselect")
	public void un_select_all_checkbox_to_see_deselect() {
	    
		WebElement All_CheckBox = driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck"));
		All_CheckBox.click();
	}
	@Then("Click on search button to view all the leaves status")
	public void click_on_search_button_to_view_all_the_leaves_status() {
	    
		
	}
	@Then("Click on Reset button to reset Date selection and leave type")
	public void click_on_reset_button_to_reset_date_selection_and_leave_type() {
	    
		WebElement Search = driver.findElement(By.id("btnSearch"));
		Search.click();
	}
}
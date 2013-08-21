package com.github.dandelion.datatables.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.dandelion.datatables.entity.Person;
import com.github.dandelion.datatables.service.PersonService;

/**
 * Controllers for the all demo examples.
 * 
 * @author Thibault Duchateau
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class DemoController {

	@Autowired
	private PersonService personService;

	/**
	 * <p>
	 * This model attribute populates all the tables that use client-side
	 * processing, i.e. all DOM examples and also AJAX source.
	 * 
	 * @return the entire set of persons.
	 */
	@ModelAttribute("persons")
	public List<Person> populateTable() {
		return personService.findLimited(200);
//		return new ArrayList<Person>();
//		return null;
	}

	@RequestMapping(value = "/basics/{page}")
	public String goToBasicExample(@PathVariable String page) {
		return "basics." + page;
	}
	
	@RequestMapping(value = "/basics/sorting/{page}")
	public String goToBasicSortingExample(@PathVariable String page) {
		return "basics.sorting." + page;
	}
	
	@RequestMapping(value = "/basics/filtering/{page}")
	public String goToBasicFilteringExample(@PathVariable String page) {
		return "basics.filtering." + page;
	}
	
	@RequestMapping(value = "/basics/feature-enablement/{page}")
	public String goToBasicFeatureEnablementExample(@PathVariable String page) {
		return "basics.featureenablement." + page;
	}

	@RequestMapping(value = "/basics/paging/{page}")
	public String goToBasicPagingExample(@PathVariable String page) {
		return "basics.paging." + page;
	}
	
	@RequestMapping(value = "/basics/scrolling/{page}")
	public String goToBasicScrollingExample(@PathVariable String page) {
		return "basics.scrolling." + page;
	}
	
	@RequestMapping(value = "/advanced/{page}")
	public String goToAdvancedExample(@PathVariable String page) {
		return "advanced." + page;
	}

	@RequestMapping(value = "/ajax/{page}")
	public String goToAjaxExample(@PathVariable String page) {
		return "ajax." + page;
	}

	@RequestMapping(value = "/themes/{page}")
	public String goToThemeExample(@PathVariable String page) {
		return "themes." + page;
	}

	@RequestMapping(value = "/styling/{page}")
	public String goToStylingExample(@PathVariable String page) {
		return "styling." + page;
	}
	
	@RequestMapping(value = "/styling/bootstrap/{page}")
	public String goToStylingBootstrapExample(@PathVariable String page) {
		return "styling.bootstrap." + page;
	}
	
	@RequestMapping(value = "/styling/jqueryui/{page}")
	public String goToStylingJqueyuiExample(@PathVariable String page) {
		return "styling.jqueryui." + page;
	}
	
	@RequestMapping(value = "/plugins/{page}")
	public String goToPluginExample(@PathVariable String page) {
		return "plugins." + page;
	}

	@RequestMapping(value = "/export/{page}")
	public String goToExportExample(@PathVariable String page) {
		return "export." + page;
	}
	
	@RequestMapping(value = "/export/links/{page}")
	public String goToCustomExportLinkExample(@PathVariable String page) {
		return "export.links." + page;
	}
	
	@RequestMapping(value = "/i18n/{page}")
	public String goToI18nExample(@PathVariable String page) {
		return "i18n." + page;
	}
	
	@RequestMapping(value = "/dandelion/{page}")
	public String goToDandelion(@PathVariable String page) {
		return "dandelion." + page;
	}
}
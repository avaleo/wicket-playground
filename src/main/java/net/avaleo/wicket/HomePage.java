package net.avaleo.wicket;

import net.avaleo.wicket.panels.CounterPanel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

	public HomePage() {

		final Label label = new Label("label", "Label on page");
		label.setOutputMarkupId(true);
		add(label);

		final CounterPanel counterPanel = new CounterPanel("panel");
		counterPanel.setOutputMarkupId(true);
		add(counterPanel);

		add(new AjaxLink("replaceLink") {
			private static final long serialVersionUID = 5090538184099477100L;

			@Override
			public void onClick(AjaxRequestTarget ajaxRequestTarget) {
				CounterPanel newPanel = new CounterPanel("label");
				newPanel.setOutputMarkupId(true);
				HomePage.this.replace(newPanel);

				ajaxRequestTarget.addComponent(newPanel);
			}
		});
	}
}

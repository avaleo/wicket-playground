package net.avaleo.wicket.panels;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class CounterPanel extends Panel {
	private static final long serialVersionUID = 7296522376891036733L;

	private int count;

	public CounterPanel(String id) {
		super(id);

		final Label countLabel = new Label("countLabel", new Model<Integer>() {
			private static final long serialVersionUID = -4958574928808184520L;

			@Override
			public Integer getObject() {
				return count;
			}
		});
		countLabel.setOutputMarkupId(true);
		add(countLabel);

		add(new AjaxLink("increase") {
			private static final long serialVersionUID = -1550778666278730519L;

			@Override
			public void onClick(AjaxRequestTarget ajaxRequestTarget) {
				count++;

				ajaxRequestTarget.addComponent(countLabel);
			}
		});

		add(new AjaxLink("decrease") {
			private static final long serialVersionUID = -1550778666278730519L;

			@Override
			public void onClick(AjaxRequestTarget ajaxRequestTarget) {
				count--;

				ajaxRequestTarget.addComponent(countLabel);
			}
		});
	}
}

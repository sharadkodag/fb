package com.fb.module.homepage;

import com.fb.mvputil.BaseView;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@UIScope
@SpringComponent
@Route("home")
public class HomePageView extends BaseView<HomePagePresenter> {

    @Override
    protected void init() {
        setPadding(false);
        setMargin(false);

        add(addHeading());
    }

    public HorizontalLayout addHeading(){
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        Label label = new Label("facebook");

        horizontalLayout.setWidthFull();
        label.getStyle().set("color","white").set("font-weight","bold").set("font-size","300%");
        horizontalLayout.getStyle().set("background-color","blue");

        horizontalLayout.add(label);

        return horizontalLayout;
    }


}

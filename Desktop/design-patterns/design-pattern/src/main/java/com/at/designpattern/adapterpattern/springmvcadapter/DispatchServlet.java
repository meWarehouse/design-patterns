package com.at.designpattern.adapterpattern.springmvcadapter;

import org.omg.PortableServer.AdapterActivator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-18 16:38
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
//        AnnotationController controller = new AnnotationController();
//        SimpleController controller = new SimpleController();
        HttpController controller = new HttpController();

        HandlerAdapter adapter = this.getHandler(controller);
        adapter.handle(controller);

    }


    public HandlerAdapter getHandler(Controller controller) {
        Iterator var3 = handlerAdapters.iterator();

        while (var3.hasNext()) {
            HandlerAdapter adapter = (HandlerAdapter) var3.next();
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//
//        (new DispatchServlet()).doDispatch();
//
//    }

}

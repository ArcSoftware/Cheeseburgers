package com.theironyard.charlotte;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static ArrayList<Cheeseburger> cheeseburgers = new ArrayList<>();

    public static void main(String[] args) {

        Spark.get(
                "/",
                ((request, response) -> {
                    HashMap m = new HashMap();
                    return new ModelAndView(m, "root.html");
                }),
                new MustacheTemplateEngine()
        );

        Spark.get(
                "/new-cheeseburger",
                (request, response) -> {
                    HashMap m = new HashMap();
                    return new ModelAndView(m, "newCheeseburger.html");
                }
        );
        Spark.post(
                "/create-cheeseburger",
                ((request, response) -> {
                    String name = request.queryParams("orderName");
                    String mayo = request.queryParams("mayo");
                    String patty = request.queryParams("patty");
                    String bun = request.queryParams("bun");
                    String bacon = request.queryParams("bacon");
                    String special = request.queryParams("instructions");
                    Cheeseburger cb = new Cheeseburger(name, mayo, patty, bun, bacon, special);
                    cheeseburgers.add(cb);

                    response.redirect("/");
                    return "";
                })
        );
    }
}

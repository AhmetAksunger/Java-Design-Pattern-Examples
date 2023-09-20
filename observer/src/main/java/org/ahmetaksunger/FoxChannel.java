package org.ahmetaksunger;

import java.util.ArrayList;
import java.util.List;

public class FoxChannel implements Channel{
        private List<String> news = new ArrayList<>();

        @Override
        public void printNews() {
            System.out.println("Fox channel news: " + news);
        }

        @Override
        public void update(String news) {
            this.news.add(news);
        }
}

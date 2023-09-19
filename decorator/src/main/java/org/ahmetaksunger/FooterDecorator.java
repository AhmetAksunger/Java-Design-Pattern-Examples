package org.ahmetaksunger;

public class FooterDecorator extends BaseTextDecorator{
        private final String footer;

        public FooterDecorator(Text text, String footer) {
            super(text);
            this.footer = footer;
        }

        @Override
        public String getContent() {
            return super.getContent() + "\n" + footer;
        }
}

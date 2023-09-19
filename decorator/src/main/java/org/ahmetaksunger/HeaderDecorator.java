package org.ahmetaksunger;

public class HeaderDecorator extends BaseTextDecorator{
        private final String header;

        public HeaderDecorator(Text text, String header) {
            super(text);
            this.header = header;
        }

        @Override
        public String getContent() {
            return header + "\n" + super.getContent();
        }
}

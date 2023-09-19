package org.ahmetaksunger;

public class BoldDecorator extends BaseTextDecorator{
        public BoldDecorator(Text text) {
            super(text);
        }

        @Override
        public String getContent() {
            return "<b>" + super.getContent() + "</b>";
        }
}

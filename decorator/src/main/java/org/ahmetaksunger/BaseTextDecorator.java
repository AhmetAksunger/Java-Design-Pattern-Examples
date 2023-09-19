package org.ahmetaksunger;

public abstract class BaseTextDecorator implements Text{
        private final Text base;

        protected BaseTextDecorator(Text text) {
            this.base = text;
        }

        @Override
        public String getContent() {
            return base.getContent();
        }

        @Override
        public String getAuthor() {
            return base.getAuthor();
        }
}

package com.kodilla.stream.beutifier;

public class PoemBeautifier {

        public void beautify(String text, String beautifier, PoemDecorator poemDecorator) {
            String result = poemDecorator.beautify(text, beautifier);
            System.out.println(result);
        }

}

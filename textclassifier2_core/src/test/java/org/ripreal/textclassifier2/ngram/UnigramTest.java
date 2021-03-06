package org.ripreal.textclassifier2.ngram;

public class UnigramTest extends NGramStrategyTest {
    @Override
    protected void initializeIdeal() {
        idealCyrillicText = new String[]{"привет", "хотела", "бы", "сделать", "235", "2", "тест", "метода", "хотел", "сделал"};
        idealLatinText = new String[]{"hello", "this", "is", "method", "23", "test", "methods"};
    }

    @Override
    protected NGramStrategy getNGramStrategy() {
        return NGramStrategy.getNGramStrategy(NGramStrategy.NGRAM_TYPES.UNIGRAM);
    }
}
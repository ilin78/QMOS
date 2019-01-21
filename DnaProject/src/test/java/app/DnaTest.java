package app;

import java.util.ArrayList;

import static org.junit.Assert.*;

/*

Вариант 11 Молекула ДНК состоит из последовательностей нуклеотидов А, Г, Ц и У. Несколько
одинаковых молекул известной длины были нарезаны на фрагменты произвольной длины.
Функция восстанавливает исходную молекулу в том случае, если это возможно сделать
единственным образом

Пример: АГЦЦГГУААЦЦ нарезана на фрагменты АГЦЦ, ЦГГУ , ГГУАА и УААЦЦ.

Пример невосстанавливаемой последовательности: АГЦЦГГУААЦЦ нарезана на фрагменты
АГЦЦ, ГГУАА и УААЦЦ.

*/

public class DnaTest {

    ArrayList<Boolean> bl = new ArrayList<>();
    int fragmentsNumber;

    @org.junit.Before
    public void setUp() throws Exception {
        Graph graph = new Graph(fragmentsNumber, null);
        @SuppressWarnings("unused")
		ArrayList<String> fragmentsArray = new ArrayList<String>();
        Thread.sleep(1000); 
    }

    @org.junit.Test
    public void rightFragments() throws InterruptedException {
        
        Dna dna = new Dna();
        Thread.sleep(1000); 
        ArrayList<String> fragmentsArray = new ArrayList<String>();
        fragmentsArray.add("АГЦЦ");
        Thread.sleep(1000); 
        fragmentsArray.add("ЦГГУ");
        Thread.sleep(1000); 
        fragmentsArray.add("ГГУАА");
        Thread.sleep(1000); 
        fragmentsArray.add("УААЦЦ");
        fragmentsNumber = 4;
        Thread.sleep(1000); 
        int actual = dna.testFunc(fragmentsArray, fragmentsNumber);
        Thread.sleep(1000); 
        int expected = 1;
        Thread.sleep(1000); 
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void falseFragments() throws InterruptedException {

        Dna dna = new Dna();
        Thread.sleep(1000); 
        ArrayList<String> fragmentsArray = new ArrayList<String>();
        fragmentsArray.add("АГЦЦ");
        Thread.sleep(1000); 
        fragmentsArray.add("ГГУАА");
        Thread.sleep(1000); 
        fragmentsArray.add("УААЦЦ");
        Thread.sleep(1000); 
        fragmentsNumber = 3;
        Thread.sleep(1000); 
        int actual = dna.testFunc(fragmentsArray, fragmentsNumber);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void errorFragments() throws InterruptedException {
    	Thread.sleep(1000); 
        Dna dna = new Dna();
        ArrayList<String> fragmentsArray = new ArrayList<String>();
        fragmentsArray.add("ASD$@#");
        fragmentsArray.add("GSA!&");
        fragmentsArray.add("FG1324");
        fragmentsNumber = 3;
        Thread.sleep(1000); 
        int actual = dna.testFunc(fragmentsArray, fragmentsNumber);
        int expected = -1;
        assertEquals(expected, actual);
    }
}
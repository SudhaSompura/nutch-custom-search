package ir.co.bayan.simorq.zal.extractor.process;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Converts each input string to lower case.
 * @author Taha Ghasemi <taha.ghasemi@gmail.com>
 * 
 */
public class Lower implements Processor {

	@Override
	public List<Object> process(List<Object> input) {
		for(int i = 0; i < input.size(); i++)
			input.set(i, StringUtils.lowerCase((String) input.get(i)));
		return input;
	}

}

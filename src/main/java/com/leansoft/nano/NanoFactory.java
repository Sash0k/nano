package com.leansoft.nano;

import com.leansoft.nano.impl.XmlPullWriter;
import com.leansoft.nano.impl.XmlSAXReader;

/**
 * Factory class to get IReader/IWriter instance,
 * main entry of the Nano framework.
 * 
 * @author bulldog
 *
 */
public class NanoFactory {
	
	/**
	 * Get IReader instance with default format(encoding is utf-8),
	 * the IReader instance can be used to read XML into Java POJO.
	 * 
	 * @return an instance of IReader implementation
	 */
	public static IReader getXMLReader() {
		return new XmlSAXReader();
	}
	
	/**
     * Get IReader instance with specific format,
	 * the IReader instance can be used to read XML into Java POJO.
	 * 
	 * @param format info about encoding and indent
	 * @return an instance of IReader implementation
	 */
	public static IReader getXMLReader(Format format) {
		return new XmlSAXReader(format);
	}

	/**
	 * Get IWriter instance with default format(encoding is utf-8, indent is true),
	 * the IWriter instance can be used to write Java POJO into XML.
	 * 
	 * @return an instance of IWriter implementation
	 */
	public static IWriter getXMLWriter() {
		return new XmlPullWriter();
	}
	
	/**
	 * Get IWriter instance with default specific format,
	 * the IWriter instance can be used to write Java POJO into XML.
	 * 
	 * @param format info about encoding and indent
	 * @return an instance of IWriter implementation
	 */
	public static IWriter getXMLWriter(Format format) {
		return new XmlPullWriter(format);
	}
}

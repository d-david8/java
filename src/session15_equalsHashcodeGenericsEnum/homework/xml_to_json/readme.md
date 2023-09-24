XML to JSON Conversion using External Library
Description:

You are tasked with creating a Java application that reads an XML file and converts it to a JSON format. Utilize an
external library such as Jackson or Gson to facilitate the XML to JSON conversion. Your application should be capable of
handling complex XML structures with nested elements.

This processor can be considered a module of your entire project and should be done in a package under sessionX -
homework/challenges packages.

XML
<bookstore>
    <book>
        <isbn>123-456-789</isbn>
        <title>The Great Adventure</title>
        <author>John Doe</author>
        <price>19.99</price>
    </book>
    <book>
        <isbn>789-101-112</isbn>
        <title>Java Essentials</title>
        <author>Jane Doe</author>
        <price>29.99</price>
    </book>
</bookstore>

JSON:
After processing the provided XML file, the pretty-printed JSON output in the console should resemble the 
following structure:
{
    "bookstore": {
    "book": [
        {
            "isbn": "123-456-789",
            "title": "The Great Adventure",
            "author": "John Doe",
            "price": "19.99"
        },
        {
            "isbn": "789-101-112",
            "title": "Java Essentials",
            "author": "Jane Doe",
            "price": "29.99"
        }
      ]
    }
}


## ucpbased: A Java Library for UCP-Based Software Effort Estimation
Currently, we are doing research on Software Effort Estimation and one of the outputs is a Java-Library ([Documentation](https://zhamri.github.io/ucpbased-javadoc/index.html)).
Below is the required information for setting the Maven `pom.xml`, the example on how to implement `ucpbased` and 
the expected output.

### Setting Maven pom.xml:

```xml
  <repositories>
    <repository>
      <id>ucpbased-repo</id>
      <url>https://github.com/zhamri/ucpbased/raw/mvn-repo</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>my.zhamri.ucpbased</groupId>
      <artifactId>ucpbased</artifactId>
      <version>0.1.3</version>
    </dependency>
  </dependencies>
```

### Getting started | How to import and implement `ucpbased`
```java
import ucpbased.UCP;

public class App 
{
    public static void main( String[] args )
    {
        UCP ucp = new UCP();
        ucp.input_UUCW(0,29,0);
        ucp.input_UAW(0, 0, 5);
        ucp.input_TCF(3, 3, 3, 3, 0, 3, 3, 0, 3, 3, 3, 0, 3);
        ucp.input_ECF(3, 3, 3, 3, 3, 3, 0, 0);
        System.out.println(ucp.getUCP());
        System.out.println(ucp.getPF());
    }
}
```

### Expected output:

```java
231.17474999999996
6472.892999999999
```
You may use this link to verify the output: http://ext-ucp.appspot.com

## Related Publications:

1. Ani, Z. C. and Basri, S. (2013a). A case study of effort estimation in agile software development using use case points. Sci.Int.(Lahore), 25(4):1111–1115
2. Ani, Z. C. and Basri, S. (2013b). [A web-based tool support for automating software effort estimation](https://www.semanticscholar.org/paper/A-Web-Based-Tool-Support-for-Automating-Software-Ani-Basri/76f55136374f5bfbcf95dc9115f04cb07251e2bb?p2df). In Information Systems International Conference (ISICO), Bali, Indonesia
3. Ani, Z. C., Basri, S., and Sarlan, A. (2015). Validating reusability of software projects using object-oriented design metrics. In Information Science and Applications, pages 845–850. Springer
4. Ani, Z., Basri, S., and Sarlan, A. (2017). A reusability assessment of ucp-based effort estimation framework using object-oriented approach. Journal of Telecommunication, Electronic and Computer Engineering, 9(3-5):111–114
5. Ani, Z. C., Basri, S., and Sarlan, A. (2018a). A framework for designing ucp-based effort estimation. Advanced Science Letters, 24(2):995–998
6. Ani, Z. C., Basri, S., Sarlan, A., Hashim, N. L., and Harun, H. (2018b). Evaluating the quality of ucp-based framework using ck metrics. International Journal of Advanced Computer Science and Applications, 9(11):624–631

## Verification Form
[Click here to give feedback.](https://bit.ly/ucpbased-survey)


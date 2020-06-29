## ucpbased: A Java Library for UCP-Based Software Effort Estimation

## Maven pom.xml:

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

## Example of Usage:
```java
import ucpbased.UCP;

public class Test 
{
    public static void main( String[] args )
    {
        UCP ucp = new UCP();
        ucp.input_UAW(0, 0, 5);
        ucp.input_UUCW(0,29,0);
        ucp.input_TCF(3, 3, 3, 3, 0, 3, 3, 0, 3, 3, 3, 0, 3);
        ucp.input_ECF(3, 3, 3, 3, 3, 3, 0, 0);
        System.out.println(ucp.getUCP());
        System.out.println(ucp.getPF());
    }
}
```

## Expected output:

```java
231.17474999999996
6472.892999999999
```

## References:
1. [A Web-Based Tool Support for Automating Software Effort Estimation](https://www.semanticscholar.org/paper/A-Web-Based-Tool-Support-for-Automating-Software-Ani-Basri/76f55136374f5bfbcf95dc9115f04cb07251e2bb?p2df)
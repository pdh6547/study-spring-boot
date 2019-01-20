### Keyword

### Chapter 1, 2


#### Annotation
 - 컴파일러가 알아보기 위한 주석
  - 인테페이스를 기반으로 한 어떠한 기능을 주입하는데에 사용
#### REST API
 -  웹설계의 우수성을 제대로 사용하기 위해 생산한 구조
#### JPA
 -  애플리케이션과 JDBC 사이에서 작동하는 것
#### JDBC
 - 자바에서 데이터베이스에 접속 할 수 있도록 하는 인터페이스
#### Json (데이터포맷)
 - 키와 값의 구조를 지키는 데이터 형식
#### JUnit
 - 자바의 대표적인 단위 테스트 프레임워크
#### Gradel
 - Build Tool, 라이브러리 관리 도구
#### Dependence
 - 두 모듈간의 연결
 - 두 클래스간의 관계
#### Dependence Injection
 - 객체의 생성 및 생명주기를 외부로 맡기는 것
 - 프로그래밍에서 구성요소간의 의존 관계가 소스코드 내부가 아닌 외부의 설정파일 등을 통해 정의되게 하는 디자인 패턴 중의 하나이다.
#### Bean Container
 - 스프링에서 의존관계들을 관리하는 컨테이너, 의존성 문제를 해결
#### YAML
 - 문서 마크업이 아닌 데이터 중심에 있다. 사람이 보기에 더욱 쉽게 볼 수 있는 데이터 직렬화에 주로 쓰인다.
#### Binding
 - 이름을 어떤 속성과 연결 짓는 과정을 말함 (초기화, 선언)
#### Camel Case
 - 예를 들어 변수 선언 할 때 공백 대신에 대문자를 쓰는 것
#### MetaData
 - 특정 목적을 위해 만든 데이터이다. 데이터에 관한 구조화된 데이터로, 다른 데이터를 설명해주는 데이터이다.
#### Bean
 - 한마디로 자바 객체이다. 컨테이너에 의해서 관리되고 애플리케이션의 핵심을 이루는 객체를 빈즈라고 한다. 스프링 Ioc 컨테이너에 의해서 객체화되어 조립되거나 관리되는 객체
#### IoC Container
 - Bean의 생성과 관계 설정, 사용, 생명주기 관리 등을 관장하는 컨테이너
#### H2
 - JAVA로 작성된 인메모리 관계형 데이터베이스 관리 시스템 (RDBMS)
#### @Override
#### @Rest Controller
 - 기존의 컨트롤러 처럼 뷰만 처리하는 것이 아닌 데이터를 처리하는 컨트롤러
#### @Get Mapping
 - 컨트롤러 내부에서 uri경로를 설정M
#### @Value
 - 프로퍼티의 키를 사용하여 특정한 값을 호출 할 수 있다. 값이 없을 경우에 대해 예외처리를 해주어야 한다.
#### @ConfigurationProperties
 - List나 배열을 한 번에 들고 올 때
#### @RunWith
 - JUnit 프레임워크의 테스트 실행 방법을 확장할 때 사용하는 어노테이션이다.

### Chapter 3
#### @SpringBootTest
 - 통합 테스트를 제공하는 기본적인 어노테이션
 - 애플리케이션이 실행될 때의 설정을 임의로 바꾸어 테스트를 진행할 수 있다.
 - 여러 단위 테스트를 하나의 통합된 테스트로 수행할 때 적합
#### @WebMvcTest
 - 웹에서 테스트하기 힘든 컨트롤러를 테스트하는 데 적합
 - 웹상에서 요청과 응답에 대해 테스트 할 수 있다.
 - 시큐리티 혹은 필터까지 자동으로 테스트하며 수동으로 추가/삭제 가능
#### @DataJpaTest
 - 데이터소스의 설정이 정상적인지, JPA를 사용하여 테이터를 제대로 생성, 수정, 삭제하는지 등의 테스트가 가능
  - 내장형 데이터베이스를 사용한다.
#### @RestClientTest
 - REST 통신의 데이터형으로 사용되는 JSON 형식이 예상대로 응답을 반환하는지 등을 테스트할 수 있다.
#### @JsonTest
 - JSON의 직렬화와 역직렬화를 수행하는 라이브러리인 Gson과 Jackson API의 테스트를 제공한다.
#### @Autowired
## Chapter 4
#### 1. [MVC 패턴](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword/MVC) (민경환)
#### 2. [타임리프](https://github.com/rhkd4560/Study-SpringBoot/tree/master/Spring%204day/homework) (최광민)
#### 3. [템플릿, 템플릿 엔진](https://github.com/rhkd4560/Study-SpringBoot/tree/master/Spring%204day/homework) (최광민)
#### 4. [의존 라이브러리](https://github.com/dongh9508/Study-SpringBoot2/tree/master/keyword/LINK/dependency%20library) (임동훈)
 - Web
 - 타임리프
 - JPA
 - Devtools
 - Lombok
 - H2

#### 5. [어노테이션](https://github.com/etg6550/2019WinterProject/tree/master/Day4/HomeWork) (엄태균)
 - Selializable
 - @Getter
 - @NoArgsConstructor
 - @Entity
 - @Table
 - @Id
 - @Column
 - @Builder

#### 6. [어노테이션2]() (민경환)
  - @Service
  - Pageable
  - @Controller
  - @RequestMapping
  - @PageableMapping
  - @PageableParam
  - @PageableDefault
  - @Bean

## Chapter 5
#### 1. [스프링 부트 시큐리티](https://github.com/etg6550/2019WinterProject/tree/master/Day6) (엄태균)

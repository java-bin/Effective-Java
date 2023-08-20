# Effective-Java
이펙티브 자바
- Java9 -> Java11로 사용중

Effective Java 3/E (Book)
- Java 7,8,9를 다룬다
- Java 8 -> lambda, stream
- Java 9 -> module

이 책의 핵심적인 기본 원칙
- 명료성(clarity)
- 단순성(simplicity)
- 코드는 재사용 되어야 한다
- 컴포넌트 사이의 의존성은 최소로 유지해야 한다
- API (application programming interface)
- 사용자 (user) <-> 클라이언트(client)


## 자바가 지원하는 타입(type)
- interface
- class
- array
- primitive(기본 타입)

## 정적 팩터리 메소드의 명명 방식
- from : 매개변수 하나를 받아 해당 타입 인스턴스로 반환하는 Method
    - Date d = Date.from(instant);
- of : 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 Method
    - Sec<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
- valueOf : from과 of의 자세한 버전
    - BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
- getInstance : 매개변수로 명시한 인스턴스를 반환하는 Method (같은 인스턴스 보장 x)
    - StackWalker luke = StackWalker.getInstance(options);
- newInstance : instance / getInstance와 같지만 새로운 인스턴스 성 후 반환하는 Method
    - Object newArray = Array.new Instance(classObject, arrayLen);
- getType : getInstance와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드 정의
    - FileStore fs = Files.getFileStore(path)
- newType : newInstance와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드 정의
    - BufferedReader br = Files.newBufferedReader(path);
- type : getType / newType의 간결한 버
    - List<Complaint> litany = Collections.list(legacyLitany);

## Equals 메서드의 동치관계 (equivalence relation)

(가정) null이 아닌 모든 참조 (x, y, z)값에 대하여

- reflexivity(반사성) : x.equals(x) → true
- symmetry(대칭성) : x.equals(y) → true이면, y.equals(x) → true
- transitivity(추이성) : x.equals(y) → true이고, y.equals(z)이면, x.equals(z) → true
- consistency(일관성) : x.equals(y)를 반복해서 호출하여도 결과값은 같아야 한다.
- null-아님 : x.equals(null) → false
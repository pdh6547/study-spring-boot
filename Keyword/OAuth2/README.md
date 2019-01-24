## OAuth2

 - 서비스가 믿을만 한 서버인지 모르기 때문에 사용
 - ex) User(Resource Owner), KSU(Client), SNS(Resource Server)
 - ID, Password를 주는 것은 보안에 좋지 않음으로 OAuth를 이용하여 AccessToken을 발급한다.
 - 모든 기능을 사용할 수 있게 하는 것이 아닌 꼭 필요한 기능만 사용할 수 있게 한다.

#### 역할
 - Resource Owner - 자원의 소유자
 - Resource Server - 데이터를 가지고 있는 서버
 - Authorization Server - 인증과 관련된 처리를 전담하는 서버
 - Client - Resource Server에 접속해서 정보를 가져가는 서버

#### 등록
 - Client가 Resource Server를 이용하기 위해서는 사전에 승인을 받아야한다. (등록)
 - Client ID, Client Secret, Authorized redirect URIs 를 받아야한다.
 - Authorized redirect URIs - Resource Server가 권한을 부여하는 과정에서 Code를 전달하는데 이 주소로 전달하게 한다. 이 주소 외에는 무시한다.

#### Resource Owner의 승인
 - Resource Server의 기능 중 일부 필요할 때 최소한의 인증만 받는 것이 좋다.
 - 승인 과정
    - Resource Owner가 Client에 접속한다.
    - Resource Server의 기능을 사용해야 한다면 clientId, 사용할 기능(scope), redirect_uri를 주소화 해서 링크로 제공한다.
    - Resource Owner가 Resource Server에 접속하면 로그인이 되었는지 확인한다.
    - 로그인이 되었다면 clientId, redirect_uri를 비교한다.
    - 간다면 scope에 해당하는 권한을 Client에게 부여할 것인지 확인하는 메세지를 전송한다.
    - 허용한다면 Resource Server는 Resource Owner의 id(ex) 1)가 scope의 사용을 허용했다 정보를 저장한다.

#### Resource Server의 승인
  - Resource Server가 바로 AccessToken을 바로 발급하지 않는다.
  - Authorization Code(임시 비밀번호)를 Resource Owner에게 전달한다. (주소)
  - Resource Server 가 Resource Owner의 웹 브라우저에게 Authorization Code(주소)로 이동하라고 명령한 것이다.
  - 이동을 하면 Authorization Code를 Client가 가지게 된다.
  - 위의 단계까지가 AccessToken을 발급받기 전까지의 단계이다.
  - Client는 Resource Server에게 Authorization Code, redirect_uri, clientId, clientSecret을 전달한다.
  - Resource Server는 Client가 전송한 Authorization Code에 해당하는 정보를 비교한다.

#### AccessToken 발급
  - Resource Server는 Authorization Code를 지운다 (재인증하지 않기 위해)
  - AccessToken을 Client에게 전달한다.
  - Client는 AccessToken을 저장한다.
  - Client가 AccessToken으로 접근하면 Resource Server가 AccessToken을 보고 clientId에 해당하는 기능을 허용을 한다.

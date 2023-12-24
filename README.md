# Spring Boot를 활용한 뮤직 스트리밍 - 컬러리스
![image](https://github.com/Sorae1118/Music-Streaming/assets/115053276/fb37c47d-40c0-4d85-a7f8-38b65f9c9b43)
<br>

## 프로젝트 소개
* 온라인 원하는 음악을 들을 수 있는 뮤직 스트리밍 사이트입니다.
* ＇컬러리스’는 무색의 의미를 담습니다. 음악이 각자의 감성과 해석에 맡겨져, 취향의 간섭없이 자유롭게 음악을 듣는다는 철학이 담겼습니다. 
<br>

## 🔨 Stacks
- Frontend
<div style="display:flex; flex-direction:row;">
    <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
    <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">
    <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
    <img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white">
</div>

- Backend
<div style="display:flex; flex-direction:row;">
    <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
    <img src="https://img.shields.io/badge/mariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white">
    <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
</div>

- Tools & Environment
<div style="display:flex; flex-direction:row;">
    <img src="https://img.shields.io/badge/eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white">
    <img src="https://img.shields.io/badge/visualstudiocode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white">
</div>
<br>

## 📀 Function
1. 로그인 / 로그아웃, 회원가입
2. 게시글과 게시글 내의 댓글 기능
3. 컴파일러 위젯 [sphere-engine](https://docs.sphere-engine.com/compilers/widget/integration)
<br>

## 📺 화면구성

1. 메인 화면
* 메인 페이지입니다. 헤더부분의 원하는 카테고리로 이동할 수 있습니다.
* 스크롤을 내리면 해당 카테고리의 게시글로 바로가기가 됩니다.   
* 세션 정보에 따라 로그인, 로그아웃 UI가 달라집니다.   <img width="1440" alt="스크린샷 2023-12-23 오후 7 52 48" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/79056a65-759a-446b-9063-232107867754"> <img width="1440" alt="스크린샷 2023-12-23 오후 7 52 59" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/7aee07ac-463a-403f-9cc0-5fd13ccf6a58"><br><br><br>

2. 로그인 화면
* 로그인 페이지입니다.<img width="1440" alt="스크린샷 2023-12-23 오후 7 54 14" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/2c7e5e97-2bca-4d4d-a0df-7c6ad0933ddf"><br><br><br>

3. 회원가입 화면
* 회원가입 페이지입니다.<img width="1440" alt="스크린샷 2023-12-23 오후 7 54 29" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/c661e91e-81fc-409d-8efb-8c336cb2a28b"><br><br><br>

4. 게시글 화면
* 여러 게시글을 확인할 수 있는 페이지입니다.
* 가장 최근 게시물부터 보이도록 DB에서 호출합니다.<img width="1440" alt="스크린샷 2023-12-23 오후 7 53 16" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/e92ab667-5e37-4d04-82e1-f3189a74a57f"><br><br><br>

5. 상세글 화면
* 게시글 상세 페이지입니다.
* 각 페이지는 생성일, 조회수, 좋아요수가 나타납니다.<img width="1440" alt="스크린샷 2023-12-23 오후 7 53 56" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/58ed9659-9460-4393-8694-c6d2d0cb08ec"><br><br><br>

6. 컴파일러 화면
* 사용자가 원하는 언어를 테스트할 수 있는 페이지입니다.
* 스크립트로 sphere-engine API를 호출합니다. 아래 코드를 참고하세요. 
```
<script>SEC_HTTPS = true;
    SEC_BASE = "compilers.widgets.sphere-engine.com";
    (function (d, s, id) {
        SEC = window.SEC || (window.SEC = []);
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return; js = d.createElement(s); js.id = id;
        js.src = (SEC_HTTPS ? "https" : "http") + "://" + SEC_BASE + "/static/sdk/sdk.js";
        fjs.parentNode.insertBefore(js, fjs);
    }(document, "script", "sphere-engine-compilers-jssdk"));
</script>
```
* 원하는 언어를 선택하여 실행할 수 있습니다.<img width="1440" alt="스크린샷 2023-12-23 오후 7 54 08" src="https://github.com/Sorae1118/FinalPjt_JSP/assets/115053276/61a7c6ae-95d4-458b-b843-c949af148dd0">








      




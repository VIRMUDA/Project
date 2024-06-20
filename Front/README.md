### 프로젝트 시작

1. project 경로에서 <code>$ yarn -v</code> 입력 => 버전 확인

   Case 1: yarn 이 설치가 안되어 있을 경우
   <code>$ npm install -g yarn</code>

   Case 2: 버전이 <code>1.22.22</code> 가 아닌 경우

   =><code>$ yarn set version 1.22.22 </code>

2. <code>$ yarn install</code>
3. <code>$ yarn start</code>

<br>
<br>

**왜 npm 이 아닌 yarn ?**

=> npm 보다 가볍고 빠르다고 해서 한 번 써보고 싶었어 ...

<br>
<br>

### 디렉토리 구조

<code>assets/</code> : 멀티미디어 파일 (이미지, 폰트 ,...)

<code>components</code> : 컴포넌트

<code>hooks</code> : 커스텀 훅

<code>routers</code> : 라우터 (페이지)

<code>redux</code> : redux 관련 파일

<code>utils</code> : 재사용 가능한 함수

<br>
<br>

### 절대 경로 설정

- 절대경로 : src
- src까지는 생략가능
- 예시 : <code>import { useSomeHook } from 'hooks/useSomeHook';</code>

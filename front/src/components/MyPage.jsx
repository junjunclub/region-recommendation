import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

const MyPage = () => {
  return (
    <div className="flex flex-col px-4 py-8 border bg-stone-300">
      <div>
        <p>회원 닉네임 자리</p>
        <button><FontAwesomeIcon icon="fa-solid fa-gear" /></button>
      </div>
      <p>현재 지역</p>
      <p>&quot;광주광역시 광산구 장덕동&quot;</p>
      <p>관심 지역</p>
      <ul>
        <li>광주광역시 동구 소태동</li>
        <li>광주광역시 광산구 월계동</li>
        <li>경기도 성남시 분당구 XX동</li>
      </ul>
    </div>
  );
};

export default MyPage;
const WelcomeMessage = ({isLoggedIn}) => {
  return (
    <>
      {!isLoggedIn && (
        <div className="text-4xl">
          <p>여러분이 원하는 조건에 맞는</p>
          <p><span className="text-cyan-500">지역</span>을 추천받아 보세요!</p>
        </div>
      )}
      {isLoggedIn && (
        <div className="text-4xl">
          <p>싸피싸피 회원님, 반갑습니다.</p>
          <p>회원님이 원하는 조건에 맞는</p>
          <p><span>지역</span>을 추천받아 보세요!</p>
        </div>
      )}
    </>
  );
};

export default WelcomeMessage;
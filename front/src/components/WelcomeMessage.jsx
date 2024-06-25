const WelcomeMessage = ({isLoggedIn}) => {
  return (
    <>
      {!isLoggedIn && (
        <div className="min-w-[400px] text-4xl leading-[4rem] font-semibold text-end">
          <p>여러분이 원하는 조건에 맞는</p>
          <p><span className="text-cyan-500">지역</span>을 추천받아 보세요!</p>
        </div>
      )}
      {isLoggedIn && (
        <div className="min-w-[400px] text-4xl leading-[4rem] font-semibold text-end">
          <p><span className="text-cyan-500">싸피싸피</span> 회원님, 반갑습니다.</p>
          <p>회원님이 원하는 조건에 맞는</p>
          <p><span className="text-cyan-500">지역</span>을 추천받아 보세요!</p>
        </div>
      )}
    </>
  );
};

export default WelcomeMessage;
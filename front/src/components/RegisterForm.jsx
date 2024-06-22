import landingImg from "../assets/landing_page.jpg";

const RegisterForm = () => {
  return (
    <main>
      <div className="flex items-center justify-center h-screen">
        <img className="w-[800px]" src={landingImg} alt="landing page image" />
        <div className="flex flex-col items-center">
          <p className="text-4xl font-semibold">회원가입</p>
          <form action="" className="flex flex-col min-w-[30rem] mt-5">
            <div className="mb-4 w-full">
              <label htmlFor="email"></label>
              <input placeholder="이메일" type="email" id="email" className="w-full h-12 block rounded-lg border-none bg-gray-100 dark:border-none dark:bg-neutral-600 py-[9px] px-3 pr-4 text-base focus:border-blue-400 focus:ring-1 focus:ring-blue-400 focus:outline-none" />
            </div>
            <div className="mb-4 w-full">
              <label htmlFor="password1"></label>
              <input placeholder="비밀번호" type="password" id="password1" className="w-full h-12 block rounded-lg border-none bg-gray-100 dark:border-none dark:bg-neutral-600 py-[9px] px-3 pr-4 text-base focus:border-blue-400 focus:ring-1 focus:ring-blue-400 focus:outline-none" />
            </div>
            <div className="mb-4 w-full">
              <label htmlFor="password2"></label>
              <input placeholder="비밀번호 확인" type="password" id="password2" className="w-full h-12 block rounded-lg border-none bg-gray-100 dark:border-none dark:bg-neutral-600 py-[9px] px-3 pr-4 text-base focus:border-blue-400 focus:ring-1 focus:ring-blue-400 focus:outline-none" />
            </div>
            <div className="mb-4 w-full">
              <label htmlFor="name"></label>
              <input placeholder="성명" type="text" id="name" className="w-full h-12 block rounded-lg border-none bg-gray-100 dark:border-none dark:bg-neutral-600 py-[9px] px-3 pr-4 text-base focus:border-blue-400 focus:ring-1 focus:ring-blue-400 focus:outline-none" />
            </div>
            <div className="mb-4 w-full">
              <label htmlFor="nickname"></label>
              <input placeholder="닉네임" type="text" id="nickname" className="w-full h-12 block rounded-lg border-none bg-gray-100 dark:border-none dark:bg-neutral-600 py-[9px] px-3 pr-4 text-base focus:border-blue-400 focus:ring-1 focus:ring-blue-400 focus:outline-none" />
            </div>
            <div className="flex justify-center">
              <button type="submit" className="block mb-4 w-2/3 rounded bg-blue-500 text-neutral-50 shadow-[0_4px_9px_-4px_rgba(51,45,45,0.7)] hover:bg-blue-600 hover:shadow-[0_8px_9px_-4px_rgba(51,45,45,0.2),0_4px_18px_0_rgba(51,45,45,0.1)] focus:bg-blue-800 focus:shadow-[0_8px_9px_-4px_rgba(51,45,45,0.2),0_4px_18px_0_rgba(51,45,45,0.1)] active:bg-blue-700 active:shadow-[0_8px_9px_-4px_rgba(51,45,45,0.2),0_4px_18px_0_rgba(51,45,45,0.1)] px-6 pb-2 pt-2.5 text-base font-medium uppercase leading-normal transition duration-150 ease-in-out focus:outline-none focus:ring-0">
                가입하기!
              </button>
            </div>
          </form>
        </div>
      </div>
    </main>
  );
};

export default RegisterForm;

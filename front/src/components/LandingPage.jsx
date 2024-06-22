import WelcomeMessage from "./WelcomeMessage";
import landingImg from "../assets/landing_page.jpg";
import { Ripple, initTWE } from "tw-elements";
import { TERipple } from "tw-elements-react";

const LandingPage = ({ isLoggedIn }) => {
  initTWE({ Ripple });

  return (
    <main>
      <div className="flex items-center justify-center h-screen">
        <div className="flex flex-col items-center">
          <WelcomeMessage isLoggedIn={isLoggedIn} />
          <TERipple rippleColor="light">
            <a className="inline-block rounded-full bg-cyan-500 mt-10 px-12 pt-3.5 pb-2.5 text-xl font-medium uppercase leading-normal text-white shadow-[0_4px_9px_-4px_#3b71ca] transition duration-150 ease-in-out hover:bg-cyan-600 hover:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:bg-cyan-600 focus:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] focus:outline-none focus:ring-0 active:bg-cyan-700 active:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.3),0_4px_18px_0_rgba(59,113,202,0.2)] dark:shadow-[0_4px_9px_-4px_rgba(59,113,202,0.5)] dark:hover:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.2),0_4px_18px_0_rgba(59,113,202,0.1)] dark:focus:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.2),0_4px_18px_0_rgba(59,113,202,0.1)] dark:active:shadow-[0_8px_9px_-4px_rgba(59,113,202,0.2),0_4px_18px_0_rgba(59,113,202,0.1)]" href="/region">
              추천 받으러 GO!
            </a>
          </TERipple>
        </div>
        <img className="w-[800px]" src={landingImg} alt="landing page image" />
      </div>
    </main>
  );
};

export default LandingPage;

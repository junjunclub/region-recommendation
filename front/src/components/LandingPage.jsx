import { useState } from "react";

import Header from "./Header";
import WelcomeMessage from "./WelcomeMessage"

import landingImg from "../assets/landing_page.jpg";

const LandingPage = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  // const [isRegistering, setIsRegistering] = useState(false);

  const handleLogin = () => setIsLoggedIn((prev) => !prev);
  // const handleRegister = () => setIsRegistering(prev => !prev);

  return (
    <>
      <Header onLoginClick={handleLogin} isLoggedIn={isLoggedIn} />
      <main>
        <div className="flex items-center justify-center h-screen">
          <WelcomeMessage isLoggedIn={isLoggedIn} />
          <img className="w-[800px]" src={landingImg} alt="landing page image" />
        </div>
      </main>
    </>
  );
};

export default LandingPage;

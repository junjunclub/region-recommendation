import WelcomeMessage from "./WelcomeMessage";
import landingImg from "../assets/landing_page.jpg";

const LandingPage = ({ isLoggedIn }) => {
  return (
    <main>
      <div className="flex items-center justify-center h-screen">
        <WelcomeMessage isLoggedIn={isLoggedIn} />
        <img className="w-[800px]" src={landingImg} alt="landing page image" />
      </div>
    </main>
  );
};

export default LandingPage;

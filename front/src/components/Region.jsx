import RegionSidebar from "./RegionSidebar";
import KakaoMap from "./KakaoMap";

const Region = () => {
  return (
    <main className="h-screen flex border-t-2 border-black">
      <RegionSidebar />
      <KakaoMap />
    </main>
  );
};

export default Region;
import logo from "../assets/logo.png";

function classNames(...classes) {
  return classes.filter(Boolean).join(" ");
}

export default function Header({ isLoggedIn }) {
  let navigation;

  if (!isLoggedIn) {
    navigation = [
      { name: "로그인", href: "login", current: false },
      { name: "회원가입", href: "register", current: false },
    ];
  } else {
    navigation = [
      { name: "마이페이지", href: "#", current: false },
      { name: "로그아웃", href: "#", current: false },
    ];
  }

  return (
    <>
      <div className="mx-auto max-w-7xl px-2">
        <div className="relative flex h-20 items-center justify-between">
          <div className="flex items-center">
            <img className="h-10 w-auto" src={logo} alt="logo image" />
          </div>
          <div className="flex space-x-4">
            {navigation.map((item) => (
              <a key={item.name} href={item.href} className={classNames(item.current ? "bg-gray-100 text-black" : "text-gray-700 hover:bg-gray-200 hover:text-black", "rounded-md px-3 py-2 text-sm font-medium")} aria-current={item.current ? "page" : undefined}>
                {item.name}
              </a>
            ))}
          </div>
        </div>
      </div>
    </>
  );
}
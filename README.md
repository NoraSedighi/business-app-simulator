توضیحات کلی:
این برنامه به منظور نمایش استفاده از الگوی استراتژی در مدیریت روش‌های پرداخت مختلف طراحی شده است. هر مشتری می‌تواند از روش‌های پرداخت متفاوتی استفاده کند و تاریخچه پرداخت‌های خود را مشاهده نماید.

کلاس‌ها و اینترفیس‌ها

اینترفیس PaymentStrategy:

شامل دو متد:

pay(double amount): برای انجام پرداخت.

getPaymentDetails(): برای دریافت جزئیات پرداخت.

کلاس‌های پیاده‌سازی PaymentStrategy:

CreditCardPayment: پرداخت با کارت اعتباری.

PayPalPayment: پرداخت با پی‌پال.

BitcoinPayment: پرداخت با بیت‌کوین.

کلاس Customer:

یک کلاس انتزاعی که شامل اطلاعات مشتری و تاریخچه پرداخت‌ها است.

شامل متدهای:

makePayment(PaymentStrategy strategy, double amount): برای انجام پرداخت.

نتیجه‌گیری
این برنامه به خوبی نشان می‌دهد که چگونه می‌توان از الگوی استراتژی برای مدیریت روش‌های پرداخت مختلف استفاده کرد. این الگو باعث افزایش انعطاف‌پذیری و قابلیت نگهداری کد می‌شود.

showPaymentHistory(): برای نمایش تاریخچه پرداخت‌ها.

displayInfo(): برای نمایش اطلاعات مشتری.

کلاس‌های مشتری:

RegularCustomer: مشتری معمولی.

PremiumCustomer: مشتری ویژه.

کلاس Main:

نقطه شروع برنامه که در آن مشتریان ایجاد می‌شوند و پرداخت‌ها انجام می‌گیرن

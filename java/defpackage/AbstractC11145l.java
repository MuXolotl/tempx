package defpackage;

/* JADX INFO: renamed from: lُٚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11145l {
    public static final C3498l yandex = C3498l.purchase("message");
    public static final C3498l loadAd = C3498l.purchase("replaceWith");
    public static final C3498l crashlytics = C3498l.purchase("level");
    public static final C3498l amazon = C3498l.purchase("expression");
    public static final C3498l purchase = C3498l.purchase("imports");

    public static final C16752l yandex(AbstractC16860l abstractC16860l, String str, String str2, String str3) {
        C16752l c16752l = new C16752l(abstractC16860l, AbstractC3333l.metrica, AbstractC8676l.remoteconfig(new C8195l(amazon, new C7391l(str2)), new C8195l(purchase, new C14005l(C2580l.f5619l, new C15116l(abstractC16860l, 0)))));
        C2312l c2312l = AbstractC3333l.remoteconfig;
        C8195l c8195l = new C8195l(yandex, new C7391l(str));
        C8195l c8195l2 = new C8195l(loadAd, new C18438l(c16752l));
        C2312l c2312l2 = AbstractC3333l.vip;
        return new C16752l(abstractC16860l, c2312l, AbstractC8676l.remoteconfig(c8195l, c8195l2, new C8195l(crashlytics, new C17452l(new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub()), C3498l.purchase(str3)))));
    }
}

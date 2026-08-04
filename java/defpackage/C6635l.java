package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٞ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6635l implements InterfaceC9840l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C11911l f13876l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C6635l f13877l = new C6635l();

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C2376l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C2376l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        f13876l = new C11911l("shutdown.url", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    @Override // defpackage.InterfaceC9840l
    public final C11911l getKey() {
        return f13876l;
    }

    @Override // defpackage.InterfaceC9840l
    public final Object purchase(AbstractC10598l abstractC10598l, Function1 function1) {
        C1932l c1932l = new C1932l();
        function1.invoke(c1932l);
        C2376l c2376l = new C2376l(c1932l.yandex, c1932l.loadAd, C7554l.f15552l);
        ((C4297l) abstractC10598l).firebase(C4297l.f8785l, new C7306l(c2376l, false, null, 10));
        return c2376l;
    }
}

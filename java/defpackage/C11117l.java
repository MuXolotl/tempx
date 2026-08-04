package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lُ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11117l {
    public final InterfaceC8086l amazon;
    public final C7017l crashlytics;
    public final String loadAd;
    public final C4225l purchase;
    public final C4330l yandex;

    public C11117l(C4330l c4330l, String str, C7017l c7017l, InterfaceC8086l interfaceC8086l, C4225l c4225l) {
        this.yandex = c4330l;
        this.loadAd = str;
        this.crashlytics = c7017l;
        this.amazon = interfaceC8086l;
        this.purchase = c4225l;
    }

    public final void yandex(C11658l c11658l, InterfaceC5127l interfaceC5127l) {
        InterfaceC8086l interfaceC8086l = this.amazon;
        if (interfaceC8086l == null) {
            C6541l.subs("Null transformer");
            return;
        }
        C4225l c4225l = this.purchase;
        C5379l c5379l = c4225l.crashlytics;
        C4330l c4330lLoadAd = this.yandex.loadAd(c11658l.crashlytics);
        C18289l c18289l = new C18289l(1);
        c18289l.mopub = new HashMap();
        c18289l.purchase = Long.valueOf(c4225l.yandex.admob());
        c18289l.billing = Long.valueOf(c4225l.loadAd.admob());
        c18289l.loadAd = this.loadAd;
        c18289l.amazon = new C3385l(this.crashlytics, (byte[]) interfaceC8086l.apply(c11658l.loadAd));
        c18289l.crashlytics = c11658l.yandex;
        C17360l c17360l = c11658l.amazon;
        if (c17360l != null) {
            c18289l.admob = c17360l.yandex;
        }
        c5379l.loadAd.execute(new RunnableC4063l(c5379l, c4330lLoadAd, interfaceC5127l, c18289l.crashlytics(), 3));
    }
}

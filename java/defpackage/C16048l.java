package defpackage;

import j$.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: lٕۥِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16048l implements InterfaceC16588l {
    public static final C16048l yandex = new C16048l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.datetime.UtcOffset");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C3425l) obj).f7283l.toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C15031l c15031l = C3425l.Companion;
        String strTapsense = interfaceC10726l.tapsense();
        C8688l c8688l = AbstractC11714l.yandex;
        C1761l c1761l = (C1761l) c8688l.getValue();
        c15031l.getClass();
        if (c1761l == ((C1761l) c8688l.getValue())) {
            return AbstractC9394l.yandex(strTapsense, (DateTimeFormatter) AbstractC9394l.yandex.getValue());
        }
        if (c1761l == ((C1761l) AbstractC11714l.loadAd.getValue())) {
            return AbstractC9394l.yandex(strTapsense, (DateTimeFormatter) AbstractC9394l.loadAd.getValue());
        }
        return c1761l == ((C1761l) AbstractC11714l.crashlytics.getValue()) ? AbstractC9394l.yandex(strTapsense, (DateTimeFormatter) AbstractC9394l.crashlytics.getValue()) : (C3425l) c1761l.crashlytics(strTapsense);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}

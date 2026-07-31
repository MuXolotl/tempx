package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lٌُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10920l implements InterfaceC11152l {
    public final int crashlytics;
    public final InterfaceC11509l loadAd;
    public final InterfaceC7623l yandex;

    public C10920l(InterfaceC7623l interfaceC7623l, InterfaceC11509l interfaceC11509l, int i) {
        this.yandex = interfaceC7623l;
        this.loadAd = interfaceC11509l;
        this.crashlytics = i;
        if (i > 0) {
            return;
        }
        C8339l.metrica("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.InterfaceC11152l
    public final void yandex() {
        InterfaceC7623l interfaceC7623l = this.yandex;
        Drawable drawableSignature = interfaceC7623l.Signature();
        InterfaceC11509l interfaceC11509l = this.loadAd;
        InterfaceC1286l interfaceC1286lStartapp = interfaceC11509l.startapp();
        boolean z = interfaceC11509l instanceof C6165l;
        C9881l c9881l = new C9881l(drawableSignature, interfaceC1286lStartapp != null ? AbstractC3230l.loadAd(interfaceC1286lStartapp, interfaceC7623l.vip().getResources()) : null, interfaceC11509l.billing().subscription, this.crashlytics, (z && ((C6165l) interfaceC11509l).mopub) ? false : true);
        if (z) {
            interfaceC7623l.admob(AbstractC3230l.crashlytics(c9881l));
        } else if (interfaceC11509l instanceof C14542l) {
            interfaceC7623l.subs(AbstractC3230l.crashlytics(c9881l));
        } else {
            C18725l.billing();
        }
    }
}

package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؘّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5686l implements InterfaceC3525l {
    public final boolean yandex;

    public C5686l() {
        this.yandex = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.InterfaceC3525l
    public final InterfaceC3773l yandex(C6669l c6669l, C15106l c15106l) {
        InterfaceC9473l interfaceC9473lMo2151l = c6669l.yandex.mo2151l();
        if (!interfaceC9473lMo2151l.mo716l(0L, AbstractC11938l.loadAd) && !interfaceC9473lMo2151l.mo716l(0L, AbstractC11938l.yandex) && (!interfaceC9473lMo2151l.mo716l(0L, AbstractC11938l.crashlytics) || !interfaceC9473lMo2151l.mo716l(8L, AbstractC11938l.amazon) || !interfaceC9473lMo2151l.mo716l(12L, AbstractC11938l.purchase) || !interfaceC9473lMo2151l.request(21L) || ((byte) (interfaceC9473lMo2151l.crashlytics().ads(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !interfaceC9473lMo2151l.mo716l(4L, AbstractC11938l.billing)) {
                return null;
            }
            if (!interfaceC9473lMo2151l.mo716l(8L, AbstractC11938l.mopub) && !interfaceC9473lMo2151l.mo716l(8L, AbstractC11938l.admob) && !interfaceC9473lMo2151l.mo716l(8L, AbstractC11938l.subs)) {
                return null;
            }
        }
        return new C5483l(c6669l.yandex, c15106l, this.yandex);
    }
}

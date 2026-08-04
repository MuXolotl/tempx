package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: lؙؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0068l implements InterfaceC11455l {
    public static final C4421l[] yandex = {C4421l.metrica};
    public static final C0068l loadAd = new C0068l();

    @Override // defpackage.InterfaceC11455l
    public final C1109l loadAd(C4421l c4421l, C16045l c16045l, long j) throws IOException {
        BigInteger bigIntegerCrashlytics = AbstractC3848l.crashlytics(c16045l);
        c16045l.skip(bigIntegerCrashlytics.longValue() - 24);
        return new C1109l(c4421l, j, bigIntegerCrashlytics);
    }

    @Override // defpackage.InterfaceC11455l
    public final C4421l[] yandex() {
        return (C4421l[]) yandex.clone();
    }
}

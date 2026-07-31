package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lًْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7974l {
    public static final C7974l loadAd = new C7974l();
    public final ConcurrentHashMap yandex = new ConcurrentHashMap();

    public final void yandex(C13372l c13372l, Class cls) throws GeneralSecurityException {
        C13372l c13372l2 = (C13372l) this.yandex.putIfAbsent(cls, c13372l);
        if (c13372l2 == null || c13372l2.equals(c13372l)) {
            return;
        }
        C18262l.ads("Different key creator for parameters class already inserted");
    }
}

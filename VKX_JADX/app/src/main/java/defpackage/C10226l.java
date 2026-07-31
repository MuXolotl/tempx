package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lَُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10226l extends AbstractC7188l {
    public final Object yandex;

    public C10226l(Object obj) {
        this.yandex = obj;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        c3631l.mopub();
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        while (c0396l.m504package()) {
            c0396l.m502l();
            c0396l.m501l();
        }
        c0396l.ads();
        return this.yandex;
    }

    public final String toString() {
        return AbstractC15560l.Signature("ObjectJsonAdapter<", this.yandex.getClass().getCanonicalName(), ">");
    }
}

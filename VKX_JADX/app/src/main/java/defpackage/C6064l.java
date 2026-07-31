package defpackage;

import java.io.EOFException;

/* JADX INFO: renamed from: lؘۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6064l extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public C6064l(AbstractC7188l abstractC7188l) {
        this.yandex = abstractC7188l;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            c3631l.signatures();
        } else {
            this.yandex.billing(c3631l, obj);
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        if (c0396l.m510while() != 9) {
            return this.yandex.loadAd(c0396l);
        }
        c0396l.m493default();
        return null;
    }

    public final String toString() {
        return this.yandex + ".nullSafe()";
    }
}

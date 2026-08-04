package defpackage;

/* JADX INFO: renamed from: lُْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11014l extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public C11014l(AbstractC7188l abstractC7188l) {
        this.yandex = abstractC7188l;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj != null) {
            this.yandex.billing(c3631l, obj);
        } else {
            C11467l.subscription("Unexpected null at ".concat(c3631l.ads()));
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) {
        if (c0396l.m510while() != 9) {
            return this.yandex.loadAd(c0396l);
        }
        C11467l.subscription("Unexpected null at ".concat(c0396l.inmobi()));
        return null;
    }

    public final String toString() {
        return this.yandex + ".nonNull()";
    }
}

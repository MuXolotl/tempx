package defpackage;

/* JADX INFO: renamed from: lؔؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2377l extends AbstractC18219l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public AbstractC16446l f5140l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2377l)) {
            return false;
        }
        AbstractC2377l abstractC2377l = (AbstractC2377l) obj;
        return AbstractC7000l.loadAd(((AbstractC0231l) this).f1216l, ((AbstractC0231l) abstractC2377l).f1216l) && AbstractC7000l.loadAd(this.f5140l, abstractC2377l.f5140l);
    }

    public final String toString() {
        return this.f5140l.toString();
    }
}

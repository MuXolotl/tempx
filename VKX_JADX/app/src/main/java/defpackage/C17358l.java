package defpackage;

/* JADX INFO: renamed from: lٗۘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17358l extends AbstractC2883l {
    public final AbstractC3394l amazon;
    public final AbstractC17409l billing;
    public final AbstractC5909l crashlytics;
    public final String loadAd;
    public final AbstractC3802l purchase;
    public final long yandex;

    public C17358l(long j, String str, AbstractC5909l abstractC5909l, AbstractC3394l abstractC3394l, AbstractC3802l abstractC3802l, AbstractC17409l abstractC17409l) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = abstractC5909l;
        this.amazon = abstractC3394l;
        this.purchase = abstractC3802l;
        this.billing = abstractC17409l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2883l) {
            C17358l c17358l = (C17358l) ((AbstractC2883l) obj);
            if (this.yandex == c17358l.yandex && this.loadAd.equals(c17358l.loadAd) && this.crashlytics.equals(c17358l.crashlytics) && this.amazon.equals(c17358l.amazon)) {
                AbstractC3802l abstractC3802l = c17358l.purchase;
                AbstractC3802l abstractC3802l2 = this.purchase;
                if (abstractC3802l2 != null ? abstractC3802l2.equals(abstractC3802l) : abstractC3802l == null) {
                    AbstractC17409l abstractC17409l = c17358l.billing;
                    AbstractC17409l abstractC17409l2 = this.billing;
                    if (abstractC17409l2 != null ? abstractC17409l2.equals(abstractC17409l) : abstractC17409l == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003;
        AbstractC3802l abstractC3802l = this.purchase;
        int iHashCode2 = (iHashCode ^ (abstractC3802l == null ? 0 : abstractC3802l.hashCode())) * 1000003;
        AbstractC17409l abstractC17409l = this.billing;
        return iHashCode2 ^ (abstractC17409l != null ? abstractC17409l.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.yandex + ", type=" + this.loadAd + ", app=" + this.crashlytics + ", device=" + this.amazon + ", log=" + this.purchase + ", rollouts=" + this.billing + "}";
    }

    public final C0495l yandex() {
        C0495l c0495l = new C0495l();
        c0495l.yandex = this.yandex;
        c0495l.loadAd = this.loadAd;
        c0495l.crashlytics = this.crashlytics;
        c0495l.amazon = this.amazon;
        c0495l.purchase = this.purchase;
        c0495l.billing = this.billing;
        c0495l.mopub = (byte) 1;
        return c0495l;
    }
}

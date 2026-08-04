package defpackage;

/* JADX INFO: renamed from: lًؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7733l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f16225l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f16226l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public float f16227l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f16228l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C14115l f16229l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public AbstractC8939l f16230l;

    public C7733l(C14115l c14115l, long j) {
        int i;
        this.f16229l = c14115l;
        this.f16225l = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > c14115l.yandex.getWidth() || i > c14115l.yandex.getHeight()) {
            C8339l.metrica("Failed requirement.");
            throw null;
        }
        this.f16228l = j;
        this.f16227l = 1.0f;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f16227l = f;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7733l)) {
            return false;
        }
        C7733l c7733l = (C7733l) obj;
        return AbstractC8576l.yandex(this.f16229l, c7733l.f16229l) && C5177l.loadAd(0L, 0L) && C4999l.loadAd(this.f16225l, c7733l.f16225l) && this.f16226l == c7733l.f16226l;
    }

    public final int hashCode() {
        int iHashCode = this.f16229l.hashCode() * 961;
        long j = this.f16225l;
        return ((((int) (j ^ (j >>> 32))) + iHashCode) * 31) + this.f16226l;
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
        float f = this.f16227l;
        AbstractC8939l abstractC8939l = this.f16230l;
        int i = this.f16226l;
        AbstractC9361l.subs(interfaceC13349l, this.f16229l, this.f16225l, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, abstractC8939l, i, 328);
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f16230l = abstractC8939l;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return AbstractC14707l.mopub(this.f16228l);
    }

    public final String toString() {
        String str;
        String strPurchase = C5177l.purchase(0L);
        String strCrashlytics = C4999l.crashlytics(this.f16225l);
        int i = this.f16226l;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f16229l);
        sb.append(", srcOffset=");
        sb.append(strPurchase);
        sb.append(", srcSize=");
        return AbstractC9361l.advert(sb, strCrashlytics, ", filterQuality=", str, ")");
    }
}

package defpackage;

/* JADX INFO: renamed from: lٌؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C8485l implements Comparable<C8485l> {
    public static final C9561l Companion = new C9561l();

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final InterfaceC1220l[] f17532l = {null, null, null, AbstractC9968l.crashlytics(2, new C8241l(5)), null, null, AbstractC9968l.crashlytics(2, new C8241l(6)), null, null};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f17533l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final EnumC7557l f17534l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f17535l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f17536l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f17537l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17538l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC14872l f17539l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f17540l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f17541l;

    static {
        AbstractC7973l.loadAd(0L);
    }

    public /* synthetic */ C8485l(int i, int i2, int i3, int i4, EnumC14872l enumC14872l, int i5, int i6, EnumC7557l enumC7557l, int i7, long j) {
        if (511 != (i & 511)) {
            AbstractC11036l.isPro(i, 511, C13212l.yandex.purchase());
            throw null;
        }
        this.f17537l = i2;
        this.f17536l = i3;
        this.f17533l = i4;
        this.f17539l = enumC14872l;
        this.f17538l = i5;
        this.f17541l = i6;
        this.f17534l = enumC7557l;
        this.f17535l = i7;
        this.f17540l = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8485l c8485l) {
        return AbstractC8576l.isPro(this.f17540l, c8485l.f17540l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8485l)) {
            return false;
        }
        C8485l c8485l = (C8485l) obj;
        return this.f17537l == c8485l.f17537l && this.f17536l == c8485l.f17536l && this.f17533l == c8485l.f17533l && this.f17539l == c8485l.f17539l && this.f17538l == c8485l.f17538l && this.f17541l == c8485l.f17541l && this.f17534l == c8485l.f17534l && this.f17535l == c8485l.f17535l && this.f17540l == c8485l.f17540l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17534l.hashCode() + ((((((this.f17539l.hashCode() + (((((this.f17537l * 31) + this.f17536l) * 31) + this.f17533l) * 31)) * 31) + this.f17538l) * 31) + this.f17541l) * 31)) * 31) + this.f17535l) * 31;
        long j = this.f17540l;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.f17537l);
        sb.append(", minutes=");
        sb.append(this.f17536l);
        sb.append(", hours=");
        sb.append(this.f17533l);
        sb.append(", dayOfWeek=");
        sb.append(this.f17539l);
        sb.append(", dayOfMonth=");
        sb.append(this.f17538l);
        sb.append(", dayOfYear=");
        sb.append(this.f17541l);
        sb.append(", month=");
        sb.append(this.f17534l);
        sb.append(", year=");
        sb.append(this.f17535l);
        sb.append(", timestamp=");
        return AbstractC12900l.smaato(sb, this.f17540l, ')');
    }

    public C8485l(int i, int i2, int i3, EnumC14872l enumC14872l, int i4, int i5, EnumC7557l enumC7557l, int i6, long j) {
        this.f17537l = i;
        this.f17536l = i2;
        this.f17533l = i3;
        this.f17539l = enumC14872l;
        this.f17538l = i4;
        this.f17541l = i5;
        this.f17534l = enumC7557l;
        this.f17535l = i6;
        this.f17540l = j;
    }
}

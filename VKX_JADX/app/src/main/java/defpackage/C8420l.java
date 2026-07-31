package defpackage;

/* JADX INFO: renamed from: lًۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8420l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC8917l f17428l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f17429l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f17430l;

    public C8420l(float f, float f2, InterfaceC8917l interfaceC8917l) {
        this.f17430l = f;
        this.f17429l = f2;
        this.f17428l = interfaceC8917l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC7039l.firebase(this.f17428l.yandex(mo867final(f)), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8420l)) {
            return false;
        }
        C8420l c8420l = (C8420l) obj;
        return Float.compare(this.f17430l, c8420l.f17430l) == 0 && Float.compare(this.f17429l, c8420l.f17429l) == 0 && this.f17428l.equals(c8420l.f17428l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    public final int hashCode() {
        return this.f17428l.hashCode() + AbstractC9029l.mopub(Float.floatToIntBits(this.f17430l) * 31, this.f17429l, 31);
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        if (C12735l.yandex(C1794l.loadAd(j), 4294967296L)) {
            return this.f17428l.loadAd(C1794l.crashlytics(j));
        }
        C8339l.smaato("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f17430l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f17429l;
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("DensityWithConverter(density=", this.f17430l, ", fontScale=", this.f17429l, ", converter=");
        sbTapsense.append(this.f17428l);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }
}

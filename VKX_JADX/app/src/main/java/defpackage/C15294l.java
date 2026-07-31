package defpackage;

/* JADX INFO: renamed from: lٔۤۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15294l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f29892l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f29893l;

    public C15294l(float f, float f2) {
        this.f29893l = f;
        this.f29892l = f2;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15294l)) {
            return false;
        }
        C15294l c15294l = (C15294l) obj;
        return Float.compare(this.f29893l, c15294l.f29893l) == 0 && Float.compare(this.f29892l, c15294l.f29892l) == 0;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29892l) + (Float.floatToIntBits(this.f29893l) * 31);
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
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
        return this.f29893l;
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
        return this.f29892l;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f29893l + ", fontScale=" + this.f29892l + ")";
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }
}

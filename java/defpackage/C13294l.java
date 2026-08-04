package defpackage;

/* JADX INFO: renamed from: lُْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13294l implements InterfaceC15930l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f26091l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f26092l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12145l f26093l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f26094l;

    public C13294l(InterfaceC12145l interfaceC12145l, int i, long j) {
        this.f26093l = interfaceC12145l;
        this.f26092l = i;
        this.f26091l = ((long) (interfaceC12145l.inmobi() + interfaceC12145l.signatures())) * 1000000;
        this.f26094l = j * 1000000;
    }

    public final AbstractC2249l crashlytics(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        long j2 = this.f26094l;
        long j3 = j + j2;
        long j4 = this.f26091l;
        return j3 > j4 ? this.f26093l.subscription(j4 - j2, abstractC2249l, abstractC2249l3, abstractC2249l2) : abstractC2249l2;
    }

    public final long loadAd(long j) {
        long j2 = j + this.f26094l;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f26091l;
        long j4 = j2 / j3;
        if (this.f26092l != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: package */
    public final AbstractC2249l mo1830package(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return subscription(Long.MAX_VALUE, abstractC2249l, abstractC2249l2, abstractC2249l3);
    }

    @Override // defpackage.InterfaceC15930l
    public final AbstractC2249l subscription(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return this.f26093l.subscription(loadAd(j), abstractC2249l, abstractC2249l2, crashlytics(j, abstractC2249l, abstractC2249l3, abstractC2249l2));
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: throws */
    public final AbstractC2249l mo1831throws(long j, AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return this.f26093l.mo1831throws(loadAd(j), abstractC2249l, abstractC2249l2, crashlytics(j, abstractC2249l, abstractC2249l3, abstractC2249l2));
    }

    @Override // defpackage.InterfaceC15930l
    /* JADX INFO: renamed from: volatile */
    public final long mo1832volatile(AbstractC2249l abstractC2249l, AbstractC2249l abstractC2249l2, AbstractC2249l abstractC2249l3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.InterfaceC15930l
    public final boolean yandex() {
        return true;
    }
}

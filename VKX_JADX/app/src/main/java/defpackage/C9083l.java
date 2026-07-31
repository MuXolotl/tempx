package defpackage;

/* JADX INFO: renamed from: lٌ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9083l implements InterfaceC18212l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC1668l f18667l;

    public C9083l(AbstractC1668l abstractC1668l) {
        this.f18667l = abstractC1668l;
    }

    @Override // defpackage.InterfaceC18212l
    public final long amazon(long j) {
        return this.f18667l.f4026l.amazon(C1187l.subs(j, yandex()));
    }

    @Override // defpackage.InterfaceC18212l
    public final void isPro(InterfaceC18212l interfaceC18212l, float[] fArr) {
        this.f18667l.f4026l.isPro(interfaceC18212l, fArr);
    }

    @Override // defpackage.InterfaceC18212l
    public final boolean mopub() {
        return this.f18667l.f4026l.mo2643l().f29462l;
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final long mo2589native(InterfaceC18212l interfaceC18212l, long j, boolean z) {
        boolean z2 = interfaceC18212l instanceof C9083l;
        AbstractC1668l abstractC1668l = this.f18667l;
        if (!z2) {
            AbstractC1668l abstractC1668lCrashlytics = AbstractC17716l.crashlytics(abstractC1668l);
            C9083l c9083l = abstractC1668lCrashlytics.f4022l;
            AbstractC18026l abstractC18026l = abstractC1668lCrashlytics.f4026l;
            long jMo2589native = mo2589native(c9083l, j, z);
            long j2 = abstractC1668lCrashlytics.f4024l;
            long jAdmob = C1187l.admob(jMo2589native, (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!abstractC18026l.mo2643l().f29462l) {
                AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC18026l.m4494l();
            AbstractC18026l abstractC18026l2 = abstractC18026l.f35294l;
            if (abstractC18026l2 != null) {
                abstractC18026l = abstractC18026l2;
            }
            return C1187l.subs(jAdmob, abstractC18026l.mo2589native(interfaceC18212l, 0L, z));
        }
        AbstractC1668l abstractC1668l2 = ((C9083l) interfaceC18212l).f18667l;
        AbstractC18026l abstractC18026l3 = abstractC1668l2.f4026l;
        abstractC18026l3.m4494l();
        AbstractC1668l abstractC1668lMo2645l = abstractC1668l.f4026l.m4466l(abstractC18026l3).mo2645l();
        if (abstractC1668lMo2645l != null) {
            boolean z3 = !z;
            long jCrashlytics = C5177l.crashlytics(C5177l.amazon(abstractC1668l2.m993l(abstractC1668lMo2645l, z3), AbstractC3383l.isPro(j)), abstractC1668l.m993l(abstractC1668lMo2645l, z3));
            return (((long) Float.floatToRawIntBits((int) (jCrashlytics >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jCrashlytics & 4294967295L))) & 4294967295L);
        }
        AbstractC1668l abstractC1668lCrashlytics2 = AbstractC17716l.crashlytics(abstractC1668l2);
        boolean z4 = !z;
        long jAmazon = C5177l.amazon(C5177l.amazon(abstractC1668l2.m993l(abstractC1668lCrashlytics2, z4), abstractC1668lCrashlytics2.f4024l), AbstractC3383l.isPro(j));
        AbstractC1668l abstractC1668lCrashlytics3 = AbstractC17716l.crashlytics(abstractC1668l);
        long jCrashlytics2 = C5177l.crashlytics(jAmazon, C5177l.amazon(abstractC1668l.m993l(abstractC1668lCrashlytics3, z4), abstractC1668lCrashlytics3.f4024l));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jCrashlytics2 >> 32));
        return abstractC1668lCrashlytics3.f4026l.f35294l.mo2589native(abstractC1668lCrashlytics2.f4026l.f35294l, (((long) Float.floatToRawIntBits((int) (jCrashlytics2 & 4294967295L))) & 4294967295L) | (jFloatToRawIntBits << 32), z);
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final long mo2590package(long j) {
        return C1187l.subs(this.f18667l.f4026l.mo2590package(j), yandex());
    }

    @Override // defpackage.InterfaceC18212l
    public final InterfaceC18212l pro() {
        AbstractC1668l abstractC1668lMo2645l;
        if (!mopub()) {
            AbstractC0081l.crashlytics("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC18026l abstractC18026l = ((AbstractC18026l) this.f18667l.f4026l.f35281l.f7703l.purchase).f35294l;
        if (abstractC18026l == null || (abstractC1668lMo2645l = abstractC18026l.mo2645l()) == null) {
            return null;
        }
        return abstractC1668lMo2645l.f4022l;
    }

    @Override // defpackage.InterfaceC18212l
    public final long smaato() {
        AbstractC1668l abstractC1668l = this.f18667l;
        return (((long) abstractC1668l.f20592l) << 32) | (((long) abstractC1668l.f20591l) & 4294967295L);
    }

    @Override // defpackage.InterfaceC18212l
    public final long startapp(long j) {
        return this.f18667l.f4026l.startapp(C1187l.subs(j, yandex()));
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final long mo2591strictfp(long j) {
        return this.f18667l.f4026l.mo2591strictfp(C1187l.subs(j, yandex()));
    }

    @Override // defpackage.InterfaceC18212l
    public final void subs(float[] fArr) {
        this.f18667l.f4026l.subs(fArr);
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C8896l mo2592synchronized(InterfaceC18212l interfaceC18212l, boolean z) {
        return this.f18667l.f4026l.mo2592synchronized(interfaceC18212l, z);
    }

    @Override // defpackage.InterfaceC18212l
    public final long tapsense(long j) {
        return C1187l.subs(this.f18667l.f4026l.tapsense(j), yandex());
    }

    @Override // defpackage.InterfaceC18212l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final long mo2593throws(InterfaceC18212l interfaceC18212l, long j) {
        return mo2589native(interfaceC18212l, j, true);
    }

    public final long yandex() {
        AbstractC1668l abstractC1668l = this.f18667l;
        AbstractC1668l abstractC1668lCrashlytics = AbstractC17716l.crashlytics(abstractC1668l);
        return C1187l.admob(mo2589native(abstractC1668lCrashlytics.f4022l, 0L, true), abstractC1668l.f4026l.mo2589native(abstractC1668lCrashlytics.f4026l, 0L, true));
    }
}

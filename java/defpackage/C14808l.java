package defpackage;

/* JADX INFO: renamed from: lَٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14808l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f28960l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC17030l f28961l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final long f28962l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC14165l f28963l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final long f28964l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f28965l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public AbstractC8939l f28966l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C4663l f28967l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC0957l f28968l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC14165l f28969l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C15308l f28970l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public float f28971l;

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    public C14808l(AbstractC14165l abstractC14165l, AbstractC14165l abstractC14165l2, InterfaceC17030l interfaceC17030l, long j, boolean z, boolean z2) {
        C13772l c13772l = C13772l.f26880l;
        this.f28969l = abstractC14165l2;
        this.f28961l = interfaceC17030l;
        this.f28962l = j;
        this.f28968l = c13772l;
        this.f28965l = z;
        this.f28970l = new C15308l(0);
        this.f28971l = 1.0f;
        this.f28963l = abstractC14165l;
        long jSubs = abstractC14165l != null ? abstractC14165l.subs() : 0L;
        long jSubs2 = abstractC14165l2 != null ? abstractC14165l2.subs() : 0L;
        boolean z3 = jSubs != 9205357640488583168L;
        boolean z4 = jSubs2 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                jSubs = jSubs2;
            } else if (!z3) {
                if (z3) {
                    jSubs = 9205357640488583168L;
                } else {
                    jSubs = 9205357640488583168L;
                }
            }
        } else if (z3 || !z4) {
            jSubs = 9205357640488583168L;
        } else {
            jSubs = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jSubs >> 32)), Float.intBitsToFloat((int) (jSubs2 >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jSubs & 4294967295L)), Float.intBitsToFloat((int) (jSubs2 & 4294967295L))))));
        }
        this.f28964l = jSubs;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f28971l = f;
        return true;
    }

    public final void firebase(InterfaceC13349l interfaceC13349l, AbstractC14165l abstractC14165l, float f) {
        if (abstractC14165l == null || f <= 0.0f) {
            return;
        }
        long jAdmob = interfaceC13349l.admob();
        long jSubs = abstractC14165l.subs();
        long jFirebase = (jSubs == 9205357640488583168L || C14174l.mopub(jSubs) || jAdmob == 9205357640488583168L || C14174l.mopub(jAdmob)) ? jAdmob : AbstractC10392l.firebase(jSubs, this.f28961l.billing(jSubs, jAdmob));
        if (jAdmob == 9205357640488583168L || C14174l.mopub(jAdmob)) {
            abstractC14165l.mopub(interfaceC13349l, jFirebase, f, this.f28966l);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jAdmob >> 32)) - Float.intBitsToFloat((int) (jFirebase >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jAdmob & 4294967295L)) - Float.intBitsToFloat((int) (jFirebase & 4294967295L))) / 2.0f;
        ((C16543l) interfaceC13349l.mo2065break().f36010l).subscription(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            abstractC14165l.mopub(interfaceC13349l, jFirebase, f, this.f28966l);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((C16543l) interfaceC13349l.mo2065break().f36010l).subscription(f2, f3, f2, f3);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        boolean z = this.f28960l;
        AbstractC14165l abstractC14165l = this.f28969l;
        if (z) {
            firebase(interfaceC13349l, abstractC14165l, this.f28971l);
            return;
        }
        C4663l c4663lMo765transient = this.f28967l;
        if (c4663lMo765transient == null) {
            c4663lMo765transient = this.f28968l.mo765transient();
            this.f28967l = c4663lMo765transient;
        }
        float fAmazon = C9658l.amazon(C4663l.yandex(c4663lMo765transient.f9498l)) / C9658l.amazon(this.f28962l);
        float fAmazon2 = AbstractC8576l.amazon(fAmazon, 0.0f, 1.0f);
        float f = this.f28971l;
        float f2 = fAmazon2 * f;
        if (this.f28965l) {
            f -= f2;
        }
        this.f28960l = fAmazon >= 1.0f;
        firebase(interfaceC13349l, this.f28963l, f);
        firebase(interfaceC13349l, abstractC14165l, f2);
        if (this.f28960l) {
            this.f28963l = null;
        } else {
            C15308l c15308l = this.f28970l;
            c15308l.subs(c15308l.admob() + 1);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f28966l = abstractC8939l;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return this.f28964l;
    }
}

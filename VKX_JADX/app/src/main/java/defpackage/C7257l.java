package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7257l extends AbstractC3947l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C14053l f15093l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C13551l f15094l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C0274l f15095l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C3000l f15096l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C18656l f15097l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C4938l f15098l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C15738l f15099l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C15738l f15100l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C14053l f15101l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public long f15102l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public InterfaceC13460l f15103l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C15738l f15104l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public Function0 f15105l;

    public C7257l(C18656l c18656l, C15738l c15738l, C15738l c15738l2, C15738l c15738l3, C3000l c3000l, C0274l c0274l, C13551l c13551l, Function0 function0, C4938l c4938l) {
        super(1);
        this.f15097l = c18656l;
        this.f15100l = c15738l;
        this.f15104l = c15738l2;
        this.f15099l = c15738l3;
        this.f15096l = c3000l;
        this.f15095l = c0274l;
        this.f15094l = c13551l;
        this.f15105l = function0;
        this.f15098l = c4938l;
        this.f15102l = -9223372034707292160L;
        AbstractC7563l.loadAd(0, 0, 0, 0, 15);
        this.f15093l = new C14053l(this, 0);
        this.f15101l = new C14053l(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC3947l, defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C17421l c17421lYandex;
        C17421l c17421lYandex2;
        C1723l c1723l;
        C17421l c17421lYandex3;
        C17421l c17421lYandex4;
        long j2;
        long j3;
        C17421l c17421l;
        long j4;
        C17421l c17421lYandex5;
        Float f;
        C11951l c11951l;
        float fFloatValue;
        if (this.f15097l.crashlytics() == this.f15097l.amazon.getValue()) {
            this.f15103l = null;
        } else if (this.f15103l == null) {
            InterfaceC13460l interfaceC13460lM2187l = m2187l();
            if (interfaceC13460lM2187l == null) {
                interfaceC13460lM2187l = C18450l.f36026l;
            }
            this.f15103l = interfaceC13460lM2187l;
        }
        boolean zMo992import = interfaceC7448l.mo992import();
        C14054l c14054l = C14054l.f27396l;
        long j5 = 4294967295L;
        if (zMo992import) {
            AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
            long j6 = (((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L);
            this.f15102l = j6;
            return interfaceC7448l.isVip((int) (j6 >> 32), (int) (j6 & 4294967295L), c14054l, new C16441l(abstractC10113lAdcel, 3));
        }
        if (!((Boolean) this.f15105l.invoke()).booleanValue()) {
            AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l.adcel(j);
            return interfaceC7448l.isVip(abstractC10113lAdcel2.f20592l, abstractC10113lAdcel2.f20591l, c14054l, new C16441l(abstractC10113lAdcel2, 4));
        }
        C4938l c4938l = this.f15098l;
        C15738l c15738l = c4938l.yandex;
        C13551l c13551l = c4938l.loadAd;
        C15738l c15738l2 = c4938l.crashlytics;
        C18656l c18656l = c4938l.amazon;
        C3000l c3000l = c4938l.purchase;
        C3313l c3313l = c3000l.yandex;
        C0274l c0274l = c4938l.billing;
        C15738l c15738l3 = c4938l.mopub;
        if (c15738l != null) {
            c17421lYandex = c15738l.yandex(new C3934l(c3000l, c0274l, 0), c13551l.yandex() ? Float.valueOf(c13551l.billing) : null, null, new C5582l(c3000l, c0274l, c13551l, 0));
        } else {
            j5 = 4294967295L;
            c17421lYandex = null;
        }
        if (c15738l2 != null) {
            C3934l c3934l = new C3934l(c3000l, c0274l, 1);
            Float fValueOf = c13551l.yandex() ? Float.valueOf(c13551l.mopub) : null;
            if (c13551l.yandex()) {
                C13507l c13507l = c13551l.isPro;
                if (c13507l != null) {
                    float fLoadAd = c13507l.loadAd();
                    Float fValueOf2 = Float.valueOf(fLoadAd);
                    if (Float.isNaN(fLoadAd)) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                } else {
                    fFloatValue = 0.0f;
                }
                c11951l = new C11951l(fFloatValue);
            } else {
                c11951l = null;
            }
            c17421lYandex2 = c15738l2.yandex(c3934l, fValueOf, c11951l, new C5582l(c3000l, c0274l, c13551l, 1));
        } else {
            c17421lYandex2 = null;
        }
        if (c18656l.crashlytics() == EnumC18226l.f35694l) {
            C11700l c11700l = c3313l.amazon;
            if (c11700l != null) {
                c1723l = new C1723l(c11700l.loadAd);
            } else {
                C11700l c11700l2 = c0274l.yandex.amazon;
                if (c11700l2 != null) {
                    c1723l = new C1723l(c11700l2.loadAd);
                } else {
                    c1723l = null;
                }
            }
        } else {
            C11700l c11700l3 = c0274l.yandex.amazon;
            if (c11700l3 != null) {
                c1723l = new C1723l(c11700l3.loadAd);
            } else {
                C11700l c11700l4 = c3313l.amazon;
                if (c11700l4 != null) {
                    c1723l = new C1723l(c11700l4.loadAd);
                } else {
                    c1723l = null;
                }
            }
        }
        if (c15738l3 != null) {
            c17421lYandex3 = c15738l3.yandex(C11192l.f22537l, c13551l.yandex() ? new C1723l(c13551l.admob) : null, null, new C15595l(c1723l, c3000l, c0274l, c13551l));
        } else {
            c17421lYandex3 = null;
        }
        C15595l c15595l = new C15595l(c13551l, c17421lYandex, c17421lYandex2, c17421lYandex3);
        AbstractC10113l abstractC10113lAdcel3 = interfaceC6357l.adcel(j);
        long j7 = (((long) abstractC10113lAdcel3.f20592l) << 32) | (((long) abstractC10113lAdcel3.f20591l) & j5);
        long j8 = !C4999l.loadAd(this.f15102l, -9223372034707292160L) ? this.f15102l : j7;
        C15738l c15738l4 = this.f15100l;
        if (c15738l4 != null) {
            c17421lYandex4 = c15738l4.yandex(this.f15093l, null, null, new C5604l(this, j8, 0));
        } else {
            c17421lYandex4 = null;
        }
        long j9 = j8;
        long jAmazon = AbstractC7563l.amazon(j, c17421lYandex4 != null ? ((C4999l) c17421lYandex4.getValue()).yandex : j7);
        C15738l c15738l5 = this.f15104l;
        if (c15738l5 != null) {
            j2 = j9;
            j3 = 0;
            c17421l = null;
            j4 = ((C5177l) c15738l5.yandex(C16274l.f31853l, null, null, new C5604l(this, j2, 2)).getValue()).yandex;
        } else {
            j2 = j9;
            j3 = 0;
            c17421l = null;
            j4 = 0;
        }
        C15738l c15738l6 = this.f15099l;
        if (c15738l6 != null) {
            C13551l c13551l2 = this.f15094l;
            Object c5177l = c13551l2.yandex() ? new C5177l(c13551l2.subs) : c17421l;
            AbstractC2249l c15709l = c17421l;
            if (this.f15094l.yandex()) {
                float fLoadAd2 = C12121l.loadAd(j3);
                Float fValueOf3 = Float.valueOf(fLoadAd2);
                if (Float.isNaN(fLoadAd2)) {
                    f = fValueOf3;
                    f = c17421l;
                }
                float fFloatValue2 = f != 0 ? f.floatValue() : 0.0f;
                float fCrashlytics = C12121l.crashlytics(j3);
                Float fValueOf4 = Float.valueOf(fCrashlytics);
                Float f2 = c17421l;
                if (!Float.isNaN(fCrashlytics)) {
                    f2 = fValueOf4;
                }
                c15709l = new C15709l(fFloatValue2, f2 != 0 ? f2.floatValue() : 0.0f);
            }
            c17421lYandex5 = c15738l6.yandex(this.f15101l, c5177l, c15709l, new C5604l(this, j2, 1));
        } else {
            j7 = j7;
            c17421lYandex5 = c17421l;
        }
        return interfaceC7448l.isVip((int) (jAmazon >> 32), (int) (jAmazon & j5), c14054l, new C0167l(this, c17421lYandex5, j7, j2, jAmazon, abstractC10113lAdcel3, j4, c15595l));
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        this.f15102l = -9223372034707292160L;
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final InterfaceC13460l m2187l() {
        InterfaceC13460l interfaceC13460l;
        InterfaceC13460l interfaceC13460l2;
        if (this.f15097l.billing().crashlytics(EnumC18226l.f35694l, EnumC18226l.f35693l)) {
            C15457l c15457l = this.f15096l.yandex.crashlytics;
            if (c15457l != null && (interfaceC13460l2 = c15457l.yandex) != null) {
                return interfaceC13460l2;
            }
            C15457l c15457l2 = this.f15095l.yandex.crashlytics;
            if (c15457l2 != null) {
                return c15457l2.yandex;
            }
            return null;
        }
        C15457l c15457l3 = this.f15095l.yandex.crashlytics;
        if (c15457l3 != null && (interfaceC13460l = c15457l3.yandex) != null) {
            return interfaceC13460l;
        }
        C15457l c15457l4 = this.f15096l.yandex.crashlytics;
        if (c15457l4 != null) {
            return c15457l4.yandex;
        }
        return null;
    }
}

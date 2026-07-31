package defpackage;

/* JADX INFO: renamed from: lًؘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0136l {
    public static C0554l loadAd;
    public static final C0554l yandex;

    static {
        Object obj = null;
        yandex = new C0554l(obj, obj, obj);
    }

    public static final boolean admob(InterfaceC13012l interfaceC13012l, InterfaceC13012l interfaceC13012l2) {
        if (AbstractC0367l.yandex) {
            return InterfaceC17975l.yandex.loadAd(((C5380l) interfaceC13012l).f11513l, ((C5380l) interfaceC13012l2).f11513l);
        }
        C17334l c17334l = C17334l.f33654l;
        C5425l c5425l = new C5425l(false, false, false, c17334l, C13231l.amazon, C3456l.amazon);
        AbstractC6786l abstractC6786l = (AbstractC6786l) interfaceC13012l;
        AbstractC6786l abstractC6786l2 = (AbstractC6786l) interfaceC13012l2;
        if (abstractC6786l == abstractC6786l2) {
            return true;
        }
        return C6168l.f12998l.firebase(c5425l, c17334l, abstractC6786l, abstractC6786l2);
    }

    public static final float[] amazon(float[] fArr, float[] fArr2, float[] fArr3) {
        isPro(fArr, fArr2);
        isPro(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrMopub = mopub(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return subs(fArrMopub, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final C9761l billing(AbstractC11833l abstractC11833l, AbstractC11833l abstractC11833l2) {
        if (abstractC11833l == abstractC11833l2) {
            return new C15371l(abstractC11833l, abstractC11833l, 1);
        }
        return (AbstractC9843l.mopub(abstractC11833l.loadAd, 12884901888L) && AbstractC9843l.mopub(abstractC11833l2.loadAd, 12884901888L)) ? new C18387l((C0777l) abstractC11833l, (C0777l) abstractC11833l2) : new C9761l(abstractC11833l, abstractC11833l2, 0);
    }

    public static AbstractC11833l crashlytics(AbstractC11833l abstractC11833l) {
        if (AbstractC9843l.mopub(abstractC11833l.loadAd, 12884901888L)) {
            C0777l c0777l = (C0777l) abstractC11833l;
            C18558l c18558l = c0777l.amazon;
            C18558l c18558l2 = AbstractC2238l.loadAd;
            if (!purchase(c18558l, c18558l2)) {
                return new C0777l(c0777l.yandex, c0777l.admob, c18558l2, subs(amazon(C7225l.f15054l.f15055l, c18558l.yandex(), c18558l2.yandex()), c0777l.subs), c0777l.firebase, c0777l.vip, c0777l.purchase, c0777l.billing, c0777l.mopub, -1);
            }
        }
        return abstractC11833l;
    }

    public static final float[] isPro(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[PHI: r7 r8 r9 r10
  0x00a5: PHI (r7v3 lٍؘؒ) = (r7v0 lٍؘؒ), (r7v6 lٍؘؒ) binds: [B:25:0x0081, B:30:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r8v6 ??) = (r8v18 ??), (r8v19 ??) binds: [B:25:0x0081, B:30:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r9v3 lؚؖۖ) = (r9v0 lؚؖۖ), (r9v6 lؚؖۖ) binds: [B:25:0x0081, B:30:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r10v5 lُۚٔ) = (r10v0 lُۚٔ), (r10v9 lُۚٔ) binds: [B:25:0x0081, B:30:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r12 == r6) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [l٘ۗ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.nio.charset.Charset] */
    /* JADX WARN: Type inference failed for: r8v1, types: [lُۚٔ] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.nio.charset.Charset] */
    /* JADX WARN: Type inference failed for: r9v7 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object loadAd(defpackage.InterfaceC9354l r7, java.nio.charset.Charset r8, defpackage.C4312l r9, defpackage.C11310l r10, defpackage.C5254l r11, defpackage.AbstractC0283l r12) throws defpackage.C12789l {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0136l.loadAd(lٍؘؒ, java.nio.charset.Charset, lؚؖۖ, lُۚٔ, lۣؗۨ, lّؑۧ):java.lang.Object");
    }

    public static final float[] mopub(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final boolean purchase(C18558l c18558l, C18558l c18558l2) {
        if (c18558l == c18558l2) {
            return true;
        }
        return Math.abs(c18558l.yandex - c18558l2.yandex) < 0.001f && Math.abs(c18558l.loadAd - c18558l2.loadAd) < 0.001f;
    }

    public static final float[] subs(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final void yandex(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(1206377835);
        if (c6956l.m2127for(i & 1, i != 0)) {
            InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(C4346l.f8873l, 16.0f, 32.0f, 16.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lMetrica);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l2 = c6956l;
            AbstractC4332l.amazon(null, 0L, 0L, 0, 0.0f, c6956l2, 0, 31);
            c6956l2.startapp(true);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17251l(i, 4);
        }
    }
}

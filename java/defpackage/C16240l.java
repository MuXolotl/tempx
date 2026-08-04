package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16240l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12428l f31789l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC8972l f31790l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f31791l;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public C16240l(defpackage.InterfaceC12932l r19, defpackage.InterfaceC9354l r20, java.lang.String r21, java.lang.Long r22, long r23) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16240l.<init>(lّۢٚ, lٍؘؒ, java.lang.String, java.lang.Long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[Catch: lٔ۟ٞ -> 0x0055, PHI: r7
  0x0045: PHI (r7v2 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:20:0x0042, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {lٔ۟ٞ -> 0x0055, blocks: (B:12:0x0027, B:25:0x0050, B:19:0x0038, B:22:0x0045, B:16:0x0031), top: B:29:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r7 == r5) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004d -> B:25:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(defpackage.AbstractC0283l r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C17216l
            if (r0 == 0) goto L13
            r0 = r7
            lٗٙ۟ r0 = (defpackage.C17216l) r0
            int r1 = r0.f33420l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33420l = r1
            goto L18
        L13:
            lٗٙ۟ r0 = new lٗٙ۟
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f33419l
            int r1 = r0.f33420l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: defpackage.C15207l -> L55
            goto L50
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L31:
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: defpackage.C15207l -> L55
            goto L45
        L35:
            defpackage.AbstractC2829l.crashlytics(r7)
        L38:
            lؙؚّ r7 = r6.f31789l     // Catch: defpackage.C15207l -> L55
            r0.f33420l = r3     // Catch: defpackage.C15207l -> L55
            lؚؚۖ r7 = r7.f24537l     // Catch: defpackage.C15207l -> L55
            java.lang.Object r7 = r7.Signature(r0)     // Catch: defpackage.C15207l -> L55
            if (r7 != r5) goto L45
            goto L4f
        L45:
            lًۥۦ r7 = (defpackage.AbstractC8402l) r7     // Catch: defpackage.C15207l -> L55
            r0.f33420l = r2     // Catch: defpackage.C15207l -> L55
            java.lang.Object r7 = r6.yandex(r7, r0)     // Catch: defpackage.C15207l -> L55
            if (r7 != r5) goto L50
        L4f:
            return r5
        L50:
            lٌٟۧ r7 = (defpackage.AbstractC8972l) r7     // Catch: defpackage.C15207l -> L55
            if (r7 == 0) goto L38
            return r7
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16240l.amazon(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r7 == r5) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006e -> B:33:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.AbstractC0283l r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C11810l
            if (r0 == 0) goto L13
            r0 = r7
            lِْٛ r0 = (defpackage.C11810l) r0
            int r1 = r0.f23633l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23633l = r1
            goto L18
        L13:
            lِْٛ r0 = new lِْٛ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f23632l
            int r1 = r0.f23633l
            r2 = 3
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.AbstractC2829l.crashlytics(r7)
            return r7
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L34:
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L71
        L38:
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L4e
        L3c:
            defpackage.AbstractC2829l.crashlytics(r7)
            lٌٟۧ r7 = r6.f31790l
            if (r7 == 0) goto L4e
            kotlin.jvm.functions.Function1 r7 = r7.crashlytics
            r0.f23633l = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r5) goto L4e
            goto L70
        L4e:
            lؙؚّ r7 = r6.f31789l
            lؚؚۖ r7 = r7.f24537l
            java.lang.Object r7 = r7.tapsense()
            java.lang.Object r7 = defpackage.C0381l.yandex(r7)
            lًۥۦ r7 = (defpackage.AbstractC8402l) r7
            if (r7 != 0) goto L68
            r0.f23633l = r2
            java.lang.Object r6 = r6.amazon(r0)
            if (r6 != r5) goto L67
            goto L70
        L67:
            return r6
        L68:
            r0.f23633l = r3
            java.lang.Object r7 = r6.yandex(r7, r0)
            if (r7 != r5) goto L71
        L70:
            return r5
        L71:
            lٌٟۧ r7 = (defpackage.AbstractC8972l) r7
            if (r7 == 0) goto L4e
            r6.f31790l = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16240l.crashlytics(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object loadAd(C11864l c11864l, AbstractC0283l abstractC0283l) throws Throwable {
        C15975l c15975l;
        C3223l c3223lM273l;
        C10428l c10428l;
        C11864l c11864l2;
        InterfaceC14189l interfaceC14189l;
        C11864l c11864l3 = c11864l;
        if (abstractC0283l instanceof C15975l) {
            c15975l = (C15975l) abstractC0283l;
            int i = c15975l.f31353l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15975l.f31353l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15975l = new C15975l(this, abstractC0283l);
            }
        } else {
            c15975l = new C15975l(this, abstractC0283l);
        }
        Object objFirebase = c15975l.f31356l;
        int i2 = c15975l.f31353l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C9426l c9426l = c11864l3.yandex;
            c15975l.f31355l = c11864l3;
            c15975l.f31353l = 1;
            objFirebase = c9426l.firebase(c15975l);
            if (objFirebase != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            c11864l3 = c15975l.f31355l;
            AbstractC2829l.crashlytics(objFirebase);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3223lM273l = c15975l.f31354l;
            C11864l c11864l4 = c15975l.f31355l;
            AbstractC2829l.crashlytics(objFirebase);
            c11864l2 = c11864l4;
        }
        interfaceC14189l = (InterfaceC14189l) objFirebase;
        try {
            C1779l c1779l = new C1779l(AbstractC17291l.mopub(interfaceC14189l), new C2944l(0, c11864l2, C11864l.class, "release", "release()V", 0, 0, 6), c3223lM273l, new C2176l(1, c11864l2, C11864l.class, "releaseSuspend", "releaseSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 18));
            AbstractC1214l.yandex(interfaceC14189l, null);
            return c1779l;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14189l, th);
                throw th2;
            }
        }
        C11864l c11864l5 = c11864l3;
        C14740l c14740l = (C14740l) objFirebase;
        C13863l c13863l = InterfaceC4539l.yandex;
        C0090l c0090l = new C0090l(13);
        C11129l c11129lPurchase = AbstractC6900l.purchase((Function2) c14740l.amazon.loadAd().loadAd);
        while (c11129lPurchase.hasNext()) {
            int iIntValue = ((Number) c11129lPurchase.next()).intValue();
            c0090l.mo214l(c14740l.crashlytics(iIntValue).toString(), c14740l.billing(iIntValue).toString());
        }
        c3223lM273l = c0090l.m273l();
        String strSignatures = c3223lM273l.signatures("Content-Disposition");
        if (strSignatures != null) {
            C5705l c5705l = (C5705l) AbstractC16901l.m4214continue(AbstractC9092l.billing(strSignatures));
            c10428l = new C10428l(c5705l.yandex, c5705l.loadAd, false, 11);
        } else {
            c10428l = null;
        }
        String strM4259l = c10428l != null ? c10428l.m4259l("filename") : null;
        C4993l c4993l = c11864l5.loadAd;
        if (strM4259l != null) {
            int i3 = 0;
            int i4 = 0;
            C13357l c13357l = new C13357l(new C2944l(0, c11864l5, C11864l.class, "release", "release()V", i4, i3, 7), c3223lM273l, new C2176l(1, c11864l5, C11864l.class, "releaseSuspend", "releaseSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i4, i3, 19));
            C10428l c10428l2 = (C10428l) c13357l.amazon.getValue();
            if (c10428l2 != null) {
                c10428l2.m4259l("filename");
            }
            return c13357l;
        }
        c15975l.f31355l = c11864l5;
        c15975l.f31354l = c3223lM273l;
        c15975l.f31353l = 2;
        objFirebase = AbstractC10310l.premium(c4993l, c15975l);
        if (objFirebase != enumC9342l) {
            c11864l2 = c11864l5;
            interfaceC14189l = (InterfaceC14189l) objFirebase;
            C1779l c1779l2 = new C1779l(AbstractC17291l.mopub(interfaceC14189l), new C2944l(0, c11864l2, C11864l.class, "release", "release()V", 0, 0, 6), c3223lM273l, new C2176l(1, c11864l2, C11864l.class, "releaseSuspend", "releaseSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 18));
            AbstractC1214l.yandex(interfaceC14189l, null);
            return c1779l2;
        }
        return enumC9342l;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f31791l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC8402l abstractC8402l, AbstractC0283l abstractC0283l) throws Throwable {
        C4849l c4849l;
        if (abstractC0283l instanceof C4849l) {
            c4849l = (C4849l) abstractC0283l;
            int i = c4849l.f9900l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4849l.f9900l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4849l = new C4849l(this, abstractC0283l);
            }
        } else {
            c4849l = new C4849l(this, abstractC0283l);
        }
        Object objLoadAd = c4849l.f9903l;
        int i2 = c4849l.f9900l;
        Object obj = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objLoadAd);
                if (abstractC8402l instanceof C11864l) {
                    c4849l.f9902l = abstractC8402l;
                    c4849l.f9900l = 1;
                    objLoadAd = loadAd((C11864l) abstractC8402l, c4849l);
                    if (objLoadAd == obj) {
                    }
                } else {
                    c4849l.f9902l = abstractC8402l;
                    c4849l.f9900l = 2;
                    if (abstractC8402l.yandex(c4849l) != obj) {
                        return null;
                    }
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC8402l abstractC8402l2 = c4849l.f9902l;
                    AbstractC2829l.crashlytics(objLoadAd);
                    return null;
                }
                if (i2 != 3) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = c4849l.f9901l;
                AbstractC2829l.crashlytics(objLoadAd);
                throw th;
            }
            AbstractC8402l abstractC8402l3 = c4849l.f9902l;
            AbstractC2829l.crashlytics(objLoadAd);
            return (AbstractC8972l) objLoadAd;
        } catch (Throwable th2) {
            c4849l.f9902l = null;
            c4849l.f9901l = th2;
            c4849l.f9900l = 3;
            if (abstractC8402l.yandex(c4849l) != obj) {
                throw th2;
            }
        }
    }
}

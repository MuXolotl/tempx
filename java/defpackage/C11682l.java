package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؙِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11682l {
    public static final C3429l yandex;

    static {
        C3429l c3429l = new C3429l();
        c3429l.yandex(AbstractC8450l.yandex);
        c3429l.yandex(AbstractC8450l.loadAd);
        c3429l.yandex(AbstractC8450l.crashlytics);
        c3429l.yandex(AbstractC8450l.amazon);
        c3429l.yandex(AbstractC8450l.purchase);
        c3429l.yandex(AbstractC8450l.billing);
        c3429l.yandex(AbstractC8450l.mopub);
        c3429l.yandex(AbstractC8450l.admob);
        c3429l.yandex(AbstractC8450l.subs);
        c3429l.yandex(AbstractC8450l.isPro);
        c3429l.yandex(AbstractC8450l.firebase);
        c3429l.yandex(AbstractC8450l.smaato);
        c3429l.yandex(AbstractC1811l.yandex);
        yandex = c3429l;
    }

    public static C2962l admob(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        return new C2962l((C3186l) C3186l.f6844l.loadAd(byteArrayInputStream, yandex), strArr);
    }

    public static final boolean amazon(C13146l c13146l) {
        C2989l c2989l = AbstractC17405l.yandex;
        return AbstractC17405l.yandex.purchase(((Number) c13146l.firebase(AbstractC8450l.purchase)).intValue()).booleanValue();
    }

    public static final C8195l billing(String[] strArr, String[] strArr2) throws C12383l {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7418l.yandex(strArr));
        C2962l c2962lAdmob = admob(byteArrayInputStream, strArr2);
        C2630l c2630l = C6582l.f13769l;
        c2630l.getClass();
        C1718l c1718l = new C1718l(byteArrayInputStream);
        AbstractC14080l abstractC14080l = (AbstractC14080l) c2630l.crashlytics(c1718l, yandex);
        try {
            c1718l.yandex(0);
            C2630l.yandex(abstractC14080l);
            return new C8195l(c2962lAdmob, (C6582l) abstractC14080l);
        } catch (C12383l e) {
            e.f24472l = abstractC14080l;
            throw e;
        }
    }

    public static C0166l crashlytics(C14036l c14036l, InterfaceC3588l interfaceC3588l, C14965l c14965l) {
        String strConcat;
        C6431l c6431l = (C6431l) AbstractC0714l.loadAd(c14036l, AbstractC8450l.loadAd);
        int i = (c6431l == null || (c6431l.f13453l & 1) != 1) ? c14036l.f27374l : c6431l.f13452l;
        if (c6431l == null || (c6431l.f13453l & 2) != 2) {
            List listVip = AbstractC14055l.vip(AbstractC7310l.mopub(c14036l, c14965l));
            List list = c14036l.f27363l;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC7310l.smaato((C18426l) it.next(), c14965l));
            }
            ArrayList arrayListM4232new = AbstractC16901l.m4232new(listVip, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayListM4232new, 10));
            Iterator it2 = arrayListM4232new.iterator();
            while (it2.hasNext()) {
                String strPurchase = purchase((C18128l) it2.next(), interfaceC3588l);
                if (strPurchase == null) {
                    return null;
                }
                arrayList2.add(strPurchase);
            }
            String strPurchase2 = purchase(AbstractC7310l.subs(c14036l, c14965l), interfaceC3588l);
            if (strPurchase2 == null) {
                return null;
            }
            strConcat = AbstractC16901l.m4210case(arrayList2, "", "(", ")", null, 56).concat(strPurchase2);
        } else {
            strConcat = interfaceC3588l.getString(c6431l.f13456l);
        }
        return new C0166l(interfaceC3588l.getString(i), strConcat);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x003e: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0040 A[HIDDEN] (LINE:63)
          (r4v2 java.lang.String) from 0x0041: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x003e, B:20:0x002f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.C10728l loadAd(defpackage.C13146l r4, defpackage.InterfaceC3588l r5, defpackage.C14965l r6, boolean r7) {
        /*
            lؚۦٚ r0 = defpackage.AbstractC8450l.amazon
            java.lang.Object r0 = defpackage.AbstractC0714l.loadAd(r4, r0)
            lَٞٝ r0 = (defpackage.C10459l) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L40
        Lc:
            int r2 = r0.f21279l
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L15
            lٗٓٔ r0 = r0.f21276l
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L1b
            if (r7 == 0) goto L1b
            goto L40
        L1b:
            if (r0 == 0) goto L25
            int r7 = r0.f33280l
            r7 = r7 & r3
            if (r7 != r3) goto L25
            int r7 = r0.f33279l
            goto L27
        L25:
            int r7 = r4.f25736l
        L27:
            if (r0 == 0) goto L36
            int r2 = r0.f33280l
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L36
            int r4 = r0.f33283l
            java.lang.String r4 = r5.getString(r4)
            goto L41
        L36:
            lۣ٘ۖ r4 = defpackage.AbstractC7310l.isPro(r4, r6)
            java.lang.String r4 = purchase(r4, r5)
            if (r4 != 0) goto L41
        L40:
            return r1
        L41:
            lَۣۧ r6 = new lَۣۧ
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11682l.loadAd(lٌْؗ, lؕۘۢ, lّٔٙ, boolean):lَۣۧ");
    }

    public static final C8195l mopub(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7418l.yandex(strArr));
        C2962l c2962lAdmob = admob(byteArrayInputStream, strArr2);
        C2630l c2630l = C14036l.f27355l;
        c2630l.getClass();
        C1718l c1718l = new C1718l(byteArrayInputStream);
        AbstractC14080l abstractC14080l = (AbstractC14080l) c2630l.crashlytics(c1718l, yandex);
        try {
            c1718l.yandex(0);
            C2630l.yandex(abstractC14080l);
            return new C8195l(c2962lAdmob, (C14036l) abstractC14080l);
        } catch (C12383l e) {
            e.f24472l = abstractC14080l;
            throw e;
        }
    }

    public static String purchase(C18128l c18128l, InterfaceC3588l interfaceC3588l) {
        if (c18128l.startapp()) {
            return AbstractC11214l.loadAd(interfaceC3588l.yandex(c18128l.f35436l));
        }
        return null;
    }

    public static final C8195l subs(String[] strArr, String[] strArr2) throws C12383l {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC7418l.yandex(strArr));
        C2962l c2962lAdmob = admob(byteArrayInputStream, strArr2);
        C2630l c2630l = C5665l.f12044l;
        c2630l.getClass();
        C1718l c1718l = new C1718l(byteArrayInputStream);
        AbstractC14080l abstractC14080l = (AbstractC14080l) c2630l.crashlytics(c1718l, yandex);
        try {
            c1718l.yandex(0);
            C2630l.yandex(abstractC14080l);
            return new C8195l(c2962lAdmob, (C5665l) abstractC14080l);
        } catch (C12383l e) {
            e.f24472l = abstractC14080l;
            throw e;
        }
    }

    public static C0166l yandex(C13347l c13347l, InterfaceC3588l interfaceC3588l, C14965l c14965l) {
        String strM4210case;
        C6431l c6431l = (C6431l) AbstractC0714l.loadAd(c13347l, AbstractC8450l.yandex);
        String string = (c6431l == null || (c6431l.f13453l & 1) != 1) ? "<init>" : interfaceC3588l.getString(c6431l.f13452l);
        if (c6431l == null || (c6431l.f13453l & 2) != 2) {
            List list = c13347l.f26206l;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strPurchase = purchase(AbstractC7310l.smaato((C18426l) it.next(), c14965l), interfaceC3588l);
                if (strPurchase == null) {
                    return null;
                }
                arrayList.add(strPurchase);
            }
            strM4210case = AbstractC16901l.m4210case(arrayList, "", "(", ")V", null, 56);
        } else {
            strM4210case = interfaceC3588l.getString(c6431l.f13456l);
        }
        return new C0166l(string, strM4210case);
    }
}

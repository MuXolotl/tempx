package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lً٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17780l {
    public static final C15578l yandex = new C15578l(674393378, false, new C4606l(29));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object admob(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) throws C10756l {
        C1777l c1777l;
        InterfaceC13012l interfaceC13012lYandex;
        if (abstractC0283l instanceof C1777l) {
            c1777l = (C1777l) abstractC0283l;
            int i = c1777l.f4204l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1777l.f4204l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1777l = new C1777l(abstractC0283l);
            }
        } else {
            c1777l = new C1777l(abstractC0283l);
        }
        Object objYandex = c1777l.f4205l;
        int i2 = c1777l.f4204l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            if (AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5975l)) {
                return abstractC10022l;
            }
            C14249l c14249lLoadAd = abstractC10022l.loadAd();
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C12231l.class);
            try {
                interfaceC13012lYandex = AbstractC18202l.yandex(C12231l.class);
            } catch (Throwable unused) {
                interfaceC13012lYandex = null;
            }
            C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
            c1777l.f4204l = 1;
            objYandex = c14249lLoadAd.yandex(c11310l, c1777l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        }
        if (objYandex == null) {
            C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.SparkError");
            return null;
        }
        C12231l c12231l = (C12231l) objYandex;
        throw new C10756l("Spark API: [" + c12231l.yandex + "] " + c12231l.loadAd, 13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        if (r14 == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object amazon(defpackage.C5374l r9, java.lang.String r10, boolean r11, int r12, int r13, defpackage.AbstractC0283l r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17780l.amazon(lؘؒؔ, java.lang.String, boolean, int, int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r9 == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object crashlytics(defpackage.C5374l r8, defpackage.AbstractC0283l r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C0426l
            if (r0 == 0) goto L13
            r0 = r9
            lؚؑٛ r0 = (defpackage.C0426l) r0
            int r1 = r0.f1555l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1555l = r1
            goto L18
        L13:
            lؚؑٛ r0 = new lؚؑٛ
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1553l
            int r1 = r0.f1555l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L42
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            lَؑۥ r8 = r0.f1554l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L99
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r5
        L36:
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L74
        L3a:
            lَؑۥ r8 = r0.f1554l
            lٗؓ۟ r8 = (defpackage.C16864l) r8
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L67
        L42:
            defpackage.AbstractC2829l.crashlytics(r9)
            lٗؓ۟ r8 = r8.subs
            lؙ۠ۗ r9 = new lؙ۠ۗ
            r9.<init>()
            java.lang.String r1 = "/v1/account/acquireOmniWrench"
            defpackage.AbstractC12323l.yandex(r9, r1)
            lًؘ٘ r1 = defpackage.C17721l.loadAd
            r9.loadAd = r1
            lؕۧٚ r1 = new lؕۧٚ
            r7 = 26
            r1.<init>(r9, r8, r7)
            r0.f1554l = r5
            r0.f1555l = r4
            java.lang.Object r9 = r1.advert(r0)
            if (r9 != r6) goto L67
            goto L98
        L67:
            lَؑۥ r9 = (defpackage.AbstractC10022l) r9
            r0.f1554l = r5
            r0.f1555l = r3
            java.lang.Object r9 = admob(r9, r0)
            if (r9 != r6) goto L74
            goto L98
        L74:
            r8 = r9
            lَؑۥ r8 = (defpackage.AbstractC10022l) r8
            lٓٚۥ r9 = r8.loadAd()
            lٕؔؒ r1 = defpackage.AbstractC18202l.yandex
            java.lang.Class<lؘؘٜ> r3 = defpackage.C5492l.class
            lۣؒ۠ r1 = r1.loadAd(r3)
            lّٟۧ r3 = defpackage.AbstractC18202l.yandex(r3)     // Catch: java.lang.Throwable -> L88
            goto L89
        L88:
            r3 = r5
        L89:
            lُۚٔ r4 = new lُۚٔ
            r4.<init>(r1, r3)
            r0.f1554l = r8
            r0.f1555l = r2
            java.lang.Object r9 = r9.yandex(r4, r0)
            if (r9 != r6) goto L99
        L98:
            return r6
        L99:
            if (r9 == 0) goto Lb1
            lؘؘٜ r9 = (defpackage.C5492l) r9
            lؖۧۙ r8 = r8.yandex()
            java.lang.String r0 = "X-Hash"
            java.lang.String r8 = r8.signatures(r0)
            if (r8 != 0) goto Lab
            java.lang.String r8 = ""
        Lab:
            lۣؑؗ r0 = new lۣؑؗ
            r0.<init>(r9, r8)
            return r0
        Lb1:
            java.lang.String r8 = "null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.account.SparkAccount"
            defpackage.C6541l.subs(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17780l.crashlytics(lؘؒؔ, lّؑۧ):java.lang.Object");
    }

    public static final HashSet loadAd(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setAmazon = ((InterfaceC7637l) it.next()).amazon();
            if (setAmazon == null) {
                return null;
            }
            AbstractC3984l.license(hashSet, setAmazon);
        }
        return hashSet;
    }

    public static final InterfaceC8714l yandex(C2403l c2403l, C6956l c6956l, int i) {
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        int i2 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && c6956l.billing(c2403l)) || (i & 6) == 4;
        Object objM2132native2 = c6956l.m2132native();
        if (z || objM2132native2 == c13863l) {
            objM2132native2 = new C15416l(c2403l, interfaceC8714l, null, i2);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native2);
        return interfaceC8714l;
    }

    public abstract AbstractC8859l billing(int i);

    public abstract AbstractC8859l mopub(int i);

    public abstract int purchase();
}

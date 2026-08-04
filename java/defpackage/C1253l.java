package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1253l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f3278l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C7504l f3279l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C11362l f3280l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C11362l f3281l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f3282l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C11362l f3283l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C1008l f3284l;

    public C1253l() {
        super(0);
        this.f3282l = AbstractC11990l.loadAd();
        this.f3283l = new C11362l();
        this.f3281l = new C11362l();
        this.f3280l = new C11362l();
        this.f3278l = AbstractC8020l.smaato(Boolean.FALSE);
        this.f3284l = AbstractC11190l.yandex("");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r7 == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r7 == r8) goto L24;
     */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m858abstract(defpackage.C1253l r7, defpackage.AbstractC0283l r8) {
        /*
            lّؒٓ r0 = r7.f3284l
            lُٕ۟ r1 = r7.f3283l
            boolean r2 = r8 instanceof defpackage.C0465l
            if (r2 == 0) goto L17
            r2 = r8
            lٍؑٝ r2 = (defpackage.C0465l) r2
            int r3 = r2.f1701l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f1701l = r3
            goto L1c
        L17:
            lٍؑٝ r2 = new lٍؑٝ
            r2.<init>(r7, r8)
        L1c:
            java.lang.Object r7 = r2.f1700l
            int r8 = r2.f1701l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L37
            if (r8 == r5) goto L33
            if (r8 != r4) goto L2d
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L92
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r3
        L33:
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L79
        L37:
            defpackage.AbstractC2829l.crashlytics(r7)
            r1.clear()
            java.lang.Object r7 = r0.getValue()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r7 <= 0) goto L7c
            lؚۥۤ r7 = defpackage.AbstractC16584l.loadAd()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.f1701l = r5
            lٗۡؑ r4 = new lٗۡؑ
            lُٚٗ r5 = defpackage.C11140l.f22377l
            java.lang.String r6 = "audio.searchArtists"
            r4.<init>(r6, r5)
            java.lang.String r5 = "q"
            r4.yandex(r5, r0)
            java.lang.String r0 = "offset"
            r5 = 0
            r4.loadAd(r5, r0)
            java.lang.String r0 = "count"
            r5 = 100
            r4.loadAd(r5, r0)
            java.lang.Object r7 = r7.billing(r4, r2)
            if (r7 != r8) goto L79
            goto L91
        L79:
            lٍٓٚ r7 = (defpackage.AbstractC14237l) r7
            goto L94
        L7c:
            lؚۥۤ r7 = defpackage.AbstractC16584l.loadAd()
            r2.f1701l = r4
            lٗۡؑ r0 = new lٗۡؑ
            lٕٖٖ r4 = defpackage.C15718l.f30866l
            java.lang.String r5 = "audio.recommendationsOnboarding"
            r0.<init>(r5, r4)
            java.lang.Object r7 = r7.billing(r0, r2)
            if (r7 != r8) goto L92
        L91:
            return r8
        L92:
            lٍٓٚ r7 = (defpackage.AbstractC14237l) r7
        L94:
            java.lang.Object r7 = defpackage.AbstractC10802l.isPro(r7)
            lِٜٞ r7 = (defpackage.C11979l) r7
            if (r7 == 0) goto L9e
            java.util.List r3 = r7.loadAd
        L9e:
            if (r3 != 0) goto La2
            lّؔۜ r3 = defpackage.C2580l.f5619l
        La2:
            r1.addAll(r3)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1253l.m858abstract(lُؒۖ, lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m859import(C6388l c6388l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        long j;
        C6388l c6388l2 = c6388l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1266141414);
        int i2 = i | (c6956l2.admob(c6388l2) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? 32 : 16) | (c6956l2.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l2);
            String str = c6388l2.crashlytics;
            boolean zInmobi = AbstractC16901l.inmobi(this.f3281l, str);
            boolean z = (!zInmobi || this.f3279l == null || AbstractC16901l.inmobi(this.f3280l, str)) ? false : true;
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(zInmobi ? 0.5f : 0.0f, null, null, null, c6956l2, 0, 30);
            InterfaceC12244l interfaceC12244lLoadAd2 = AbstractC16245l.loadAd(zInmobi ? 1.0f : 0.0f, null, null, null, c6956l, 0, 30);
            if (z) {
                c6956l.m2123default(1286175563);
                c6956l.startapp(false);
                j = C9735l.loadAd;
            } else {
                c6956l.m2123default(1286176749);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                c6956l.startapp(false);
            }
            InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(j, null, null, null, c6956l, 0, 14);
            boolean zBilling = c6956l.billing(str);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                List list = c6388l2.purchase;
                if (list == null) {
                    list = C2580l.f5619l;
                }
                C3779l c3779l = (C3779l) AbstractC16901l.m4217extends(list);
                objM2132native = c3779l != null ? c3779l.yandex : null;
                c6956l.m2147try(objM2132native);
            }
            String str2 = (String) objM2132native;
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C6839l c6839l = AbstractC7497l.yandex;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC17463l.loadAd(AbstractC0019l.crashlytics(c4346l, c6839l), false);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j3 = c6956l.f14595continue;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC17463l.loadAd(AbstractC0019l.crashlytics(c4346l, c6839l), false);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC7741l.purchase(str2, null, interfaceC17242lLoadAd2, new C18627l(((C14370l) c6956l.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l.isPro(c10707l)).yandex.signatures), null, c6956l, 36912, 0, 32736);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC15788l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), ((Number) interfaceC12244lLoadAd2.getValue()).floatValue()), C9735l.loadAd(((Number) interfaceC12244lLoadAd.getValue()).floatValue(), ((C9735l) interfaceC12244lYandex.getValue()).yandex), AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j4 = c6956l.f14595continue;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                objM2132native2 = new C2221l(iAdmob, 21);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7741l.loadAd(boolValueOf, null, (Function1) objM2132native2, null, null, null, AbstractC15235l.billing, c6956l, 1572864, 58);
            c6956l.startapp(true);
            c6956l.startapp(true);
            c6388l2 = c6388l;
            AbstractC13010l.loadAd(c6388l2.yandex, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 8.0f, 0.0f, 2), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, AbstractC7039l.isPro(14), null, null, null, 0L, new C10258l(3), AbstractC7039l.isPro(18), 2, false, 1, 0, null, c6956l, 24624, 25008, 238568);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) c6388l2, interfaceC17242l, i, 29);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1089695942);
        int i2 = 2;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C11800l(this, null, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1822697986, new C10848l(c13072lYandex, this, 7), c6956l), AbstractC14566l.amazon(-1559000961, new C1674l(this, iAdmob, 12), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(-815274423, new C3091l(this, c13072lYandex, i2), c6956l), c6956l, 905970096, 249);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12856l(this, i);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f3282l.f36440l;
    }
}

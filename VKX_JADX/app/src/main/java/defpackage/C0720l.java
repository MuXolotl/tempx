package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0720l extends C2234l implements InterfaceC11641l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C11911l f2208l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final ArrayList f2210l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C14187l f2211l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C6162l f2206l = new C6162l(9);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C0847l f2209l = new C0847l();

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C0847l f2207l = new C0847l();

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0720l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C0720l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        f2208l = new C11911l("Routing", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public C0720l(C14187l c14187l) {
        super(null, new C13219l(c14187l.f27782l), c14187l.f14098l, c14187l.f14095l);
        this.f2211l = c14187l;
        ArrayList arrayList = new ArrayList();
        this.f2210l = arrayList;
        if (AbstractC5708l.loadAd.admob()) {
            arrayList.add(new C5266l(8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (defpackage.AbstractC15560l.mopub(r0, r1, r5, r8) == r14) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object subscription(defpackage.AbstractC12074l r17, defpackage.C2234l r18, defpackage.InterfaceC14665l r19, defpackage.AbstractC0283l r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0720l.subscription(lِۙ, lؓۥٝ, lٔؕۙ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (subscription(r8, r1, r9, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tapsense(defpackage.AbstractC12074l r8, defpackage.AbstractC0283l r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C11578l
            if (r0 == 0) goto L13
            r0 = r9
            lِؓٔ r0 = (defpackage.C11578l) r0
            int r1 = r0.f23264l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23264l = r1
            goto L18
        L13:
            lِؓٔ r0 = new lِؓٔ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f23265l
            int r1 = r0.f23264l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L67
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L31:
            lِۙ r8 = r0.f23266l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L50
        L37:
            defpackage.AbstractC2829l.crashlytics(r9)
            lؘٗۗ r9 = new lؘٗۗ
            java.lang.Object r1 = r8.f24000l
            lٍۦۖ r1 = (defpackage.InterfaceC9955l) r1
            java.util.ArrayList r6 = r7.f2210l
            r9.<init>(r7, r1, r6)
            r0.f23266l = r8
            r0.f23264l = r3
            java.lang.Object r9 = r9.firebase(r0)
            if (r9 != r5) goto L50
            goto L66
        L50:
            lَؔؕ r9 = (defpackage.AbstractC2520l) r9
            boolean r1 = r9 instanceof defpackage.C11202l
            if (r1 == 0) goto L6a
            lؓۥٝ r1 = r9.yandex
            lًُٞ r9 = (defpackage.C11202l) r9
            lٔؕۙ r9 = r9.loadAd
            r0.f23266l = r4
            r0.f23264l = r2
            java.lang.Object r7 = r7.subscription(r8, r1, r9, r0)
            if (r7 != r5) goto L67
        L66:
            return r5
        L67:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L6a:
            boolean r7 = r9 instanceof defpackage.C17696l
            if (r7 == 0) goto L82
            java.lang.Object r7 = r8.f24000l
            lٍۦۖ r7 = (defpackage.InterfaceC9955l) r7
            lٗۥٓ r7 = r7.getAttributes()
            lَِ٘ r8 = defpackage.AbstractC5708l.yandex
            l٘ؗؒ r9 = (defpackage.C17696l) r9
            lٜؔٔ r9 = r9.crashlytics
            r7.mopub(r8, r9)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L82:
            defpackage.C18725l.billing()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0720l.tapsense(lِۙ, lّؑۧ):java.lang.Object");
    }
}

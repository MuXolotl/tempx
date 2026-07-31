package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؙُٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6562l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11335l f13694l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8639l f13695l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13696l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16588l f13697l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6936l f13698l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Charset f13699l;

    public C6562l(InterfaceC8639l interfaceC8639l, C11335l c11335l, C6936l c6936l, InterfaceC16588l interfaceC16588l, Charset charset) {
        this.f13695l = interfaceC8639l;
        this.f13694l = c11335l;
        this.f13698l = c6936l;
        this.f13697l = interfaceC16588l;
        this.f13699l = charset;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (defpackage.AbstractC7572l.subscription(r2, r12, 0, r12.length, r0) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r2.crashlytics(r0) == r8) goto L31;
     */
    @Override // defpackage.InterfaceC9427l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isPro(java.lang.Object r11, defpackage.InterfaceC14029l r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.C5149l
            if (r0 == 0) goto L13
            r0 = r12
            lؗۚۦ r0 = (defpackage.C5149l) r0
            int r1 = r0.f11193l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11193l = r1
            goto L18
        L13:
            lؗۚۦ r0 = new lؗۚۦ
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f11194l
            int r1 = r0.f11193l
            lٌؚۛ r2 = r10.f13695l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L4c
            if (r1 == r6) goto L40
            if (r1 == r5) goto L38
            if (r1 != r4) goto L32
            defpackage.AbstractC2829l.crashlytics(r12)
            goto La1
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            return r7
        L38:
            int r10 = r0.f11195l
            int r11 = r0.f11192l
            defpackage.AbstractC2829l.crashlytics(r12)
            goto L92
        L40:
            int r11 = r0.f11195l
            int r1 = r0.f11192l
            java.lang.Object r6 = r0.f11191l
            defpackage.AbstractC2829l.crashlytics(r12)
            r12 = r11
            r11 = r6
            goto L6e
        L4c:
            defpackage.AbstractC2829l.crashlytics(r12)
            int r1 = r10.f13696l
            int r12 = r1 + 1
            r10.f13696l = r12
            if (r1 < 0) goto La4
            if (r1 <= 0) goto L6d
            lُۛۡ r12 = r10.f13694l
            byte[] r12 = r12.crashlytics
            r0.f11191l = r11
            r0.f11192l = r1
            r0.f11195l = r3
            r0.f11193l = r6
            int r6 = r12.length
            java.lang.Object r12 = defpackage.AbstractC7572l.subscription(r2, r12, r3, r6, r0)
            if (r12 != r8) goto L6d
            goto La0
        L6d:
            r12 = r3
        L6e:
            lؚؐؗ r6 = r10.f13698l
            lًۙۚ r6 = r6.yandex
            lؘٖۘ r9 = r10.f13697l
            lؘٖۘ r9 = (defpackage.InterfaceC16588l) r9
            java.lang.String r11 = r6.crashlytics(r9, r11)
            java.nio.charset.Charset r10 = r10.f13699l
            byte[] r10 = defpackage.C17423l.smaato(r11, r10)
            r0.f11191l = r7
            r0.f11192l = r1
            r0.f11195l = r12
            r0.f11193l = r5
            int r11 = r10.length
            java.lang.Object r10 = defpackage.AbstractC7572l.subscription(r2, r10, r3, r11, r0)
            if (r10 != r8) goto L90
            goto La0
        L90:
            r10 = r12
            r11 = r1
        L92:
            r0.f11191l = r7
            r0.f11192l = r11
            r0.f11195l = r10
            r0.f11193l = r4
            java.lang.Object r10 = r2.crashlytics(r0)
            if (r10 != r8) goto La1
        La0:
            return r8
        La1:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        La4:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6562l.isPro(java.lang.Object, lٌؚٓ):java.lang.Object");
    }
}

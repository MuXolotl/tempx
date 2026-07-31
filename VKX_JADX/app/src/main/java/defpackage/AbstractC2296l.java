package defpackage;

/* JADX INFO: renamed from: lؓۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2296l {
    public static C5197l crashlytics;
    public static final C15578l yandex = new C15578l(1090591276, false, new C1659l(20));
    public static final C15578l loadAd = new C15578l(-1754417899, false, new C1659l(21));

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.isPro(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object amazon(defpackage.InterfaceC9427l r7, defpackage.InterfaceC14592l r8, boolean r9, defpackage.InterfaceC14029l r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.C8817l
            if (r0 == 0) goto L13
            r0 = r10
            lٌٖٟ r0 = (defpackage.C8817l) r0
            int r1 = r0.f18104l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18104l = r1
            goto L18
        L13:
            lٌٖٟ r0 = new lٌٖٟ
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f18101l
            int r1 = r0.f18104l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.f18100l
            l٘ؓؐ r7 = r0.f18105l
            lِٔؐ r8 = r0.f18102l
            lٌٍۜ r1 = r0.f18103l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L3d:
            boolean r9 = r0.f18100l
            l٘ؓؐ r7 = r0.f18105l
            lِٔؐ r8 = r0.f18102l
            lٌٍۜ r1 = r0.f18103l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.AbstractC2829l.crashlytics(r10)
            boolean r10 = r7 instanceof defpackage.C17993l
            if (r10 != 0) goto L96
            l٘ؓؐ r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.f18103l = r7     // Catch: java.lang.Throwable -> L35
            r0.f18102l = r8     // Catch: java.lang.Throwable -> L35
            r0.f18105l = r10     // Catch: java.lang.Throwable -> L35
            r0.f18100l = r9     // Catch: java.lang.Throwable -> L35
            r0.f18104l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.yandex(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.crashlytics()     // Catch: java.lang.Throwable -> L35
            r0.f18103l = r1     // Catch: java.lang.Throwable -> L35
            r0.f18102l = r8     // Catch: java.lang.Throwable -> L35
            r0.f18105l = r7     // Catch: java.lang.Throwable -> L35
            r0.f18100l = r9     // Catch: java.lang.Throwable -> L35
            r0.f18104l = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.isPro(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.ads(r4)
        L8b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.AbstractC0676l.loadAd(r8, r7)
        L95:
            throw r10
        L96:
            l٘٘۠ r7 = (defpackage.C17993l) r7
            java.lang.Throwable r7 = r7.f35183l
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2296l.amazon(lٌٍۜ, lِٔؐ, boolean, lٌؚٓ):java.lang.Object");
    }

    public static final long billing(long j, long j2, float f) {
        float fFirebase = AbstractC7572l.firebase(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fFirebase2 = AbstractC7572l.firebase(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fFirebase)) << 32) | (((long) Float.floatToRawIntBits(fFirebase2)) & 4294967295L);
    }

    public static final long crashlytics(int i, long j) {
        int i2 = C12814l.crashlytics;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : loadAd(i4, i);
    }

    public static final long loadAd(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC1786l.yandex("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C12814l.crashlytics;
        return j;
    }

    public static final String mopub(long j, CharSequence charSequence) {
        return charSequence.subSequence(C12814l.mopub(j), C12814l.billing(j)).toString();
    }

    public static final C5197l purchase() {
        C5197l c5197l = crashlytics;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(19.0f, 11.0f);
        c15659l.crashlytics(7.83f);
        c15659l.purchase(4.88f, -4.88f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.purchase(-6.59f, 6.59f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.purchase(6.59f, 6.59f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.amazon(7.83f, 13.0f);
        c15659l.crashlytics(19.0f);
        c15659l.loadAd(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c15659l.mopub(-0.45f, -1.0f, -1.0f, -1.0f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        crashlytics = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static final long yandex(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}

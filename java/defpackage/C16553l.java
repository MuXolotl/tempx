package defpackage;

import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lٖۖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16553l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f32499l = 0;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f32500l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final CatalogArtist f32501l;

    public C16553l(CatalogArtist catalogArtist, boolean z) {
        super(false, 3);
        this.f32501l = catalogArtist;
        this.f32500l = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:23:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object pro(defpackage.C16553l r9, java.lang.String r10, defpackage.AbstractC0283l r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C0799l
            if (r0 == 0) goto L13
            r0 = r11
            lؒؓۘ r0 = (defpackage.C0799l) r0
            int r1 = r0.f2419l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2419l = r1
            goto L18
        L13:
            lؒؓۘ r0 = new lؒؓۘ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f2415l
            int r1 = r0.f2419l
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            lٍۨۦ r10 = r0.f2420l
            java.util.List r1 = r0.f2417l
            java.lang.String r3 = r0.f2418l
            defpackage.AbstractC2829l.crashlytics(r11)     // Catch: java.lang.Exception -> L2e
            r4 = r9
            r6 = r10
            r5 = r3
            goto L66
        L2e:
            r0 = move-exception
            r9 = r0
            goto L7f
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            r9 = 0
            return r9
        L38:
            defpackage.AbstractC2829l.crashlytics(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            lٍۨۦ r1 = new lٍۨۦ
            r1.<init>()
            r5 = r10
            r6 = r1
            r1 = r11
        L48:
            lٖۖ r10 = defpackage.AbstractC11463l.yandex     // Catch: java.lang.Exception -> L2e
            lؙۙؑ r10 = defpackage.ExecutorC6708l.f14063l     // Catch: java.lang.Exception -> L2e
            lؚۥۚ r3 = new lؚۥۚ     // Catch: java.lang.Exception -> L2e
            r7 = 0
            r8 = 10
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2e
            r0.f2418l = r5     // Catch: java.lang.Exception -> L2e
            r0.f2417l = r1     // Catch: java.lang.Exception -> L2e
            r0.f2420l = r6     // Catch: java.lang.Exception -> L2e
            r0.f2419l = r2     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = defpackage.AbstractC10999l.firebase(r10, r3, r0)     // Catch: java.lang.Exception -> L2e
            lٍؗؐ r9 = defpackage.EnumC9342l.f19165l
            if (r11 != r9) goto L66
            return r9
        L66:
            ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r11 = (ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems) r11     // Catch: java.lang.Exception -> L2e
            java.lang.Object r9 = r11.yandex     // Catch: java.lang.Exception -> L2e
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2e
            r1.addAll(r9)     // Catch: java.lang.Exception -> L2e
            int r10 = r6.f20387l     // Catch: java.lang.Exception -> L2e
            r11 = 100
            int r10 = r10 + r11
            r6.f20387l = r10     // Catch: java.lang.Exception -> L2e
            int r9 = r9.size()     // Catch: java.lang.Exception -> L2e
            if (r9 >= r11) goto L7d
            return r1
        L7d:
            r9 = r4
            goto L48
        L7f:
            r9.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16553l.pro(lٖۖؑ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-613588687);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-2022598708, new C2188l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2188l(this, i);
        }
    }
}

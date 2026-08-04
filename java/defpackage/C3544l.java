package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3544l {
    public static final C3544l yandex = new C3544l();
    public static final C5993l loadAd = new C5993l();

    public static String loadAd() {
        C5993l c5993l = loadAd;
        if (!c5993l.yandex()) {
            return "";
        }
        return c5993l.crashlytics.loadAd + ' ' + c5993l.crashlytics.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(AbstractC0283l abstractC0283l) throws Exception {
        C10163l c10163l;
        C5993l c5993l;
        if (abstractC0283l instanceof C10163l) {
            c10163l = (C10163l) abstractC0283l;
            int i = c10163l.f20674l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10163l.f20674l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10163l = new C10163l(this, abstractC0283l);
            }
        } else {
            c10163l = new C10163l(this, abstractC0283l);
        }
        Object objLoadAd = c10163l.f20675l;
        int i2 = c10163l.f20674l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            c5993l = loadAd;
            C14717l c14717l = new C14717l(c5993l.yandex() ? c5993l.loadAd.crashlytics : "");
            c10163l.f20676l = c5993l;
            c10163l.f20674l = 1;
            objLoadAd = c14717l.loadAd(c10163l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5993l = c10163l.f20676l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        VkConnectResponse vkConnectResponse = (VkConnectResponse) objLoadAd;
        if (vkConnectResponse == null) {
            throw new Exception("LVM token request error");
        }
        c5993l.crashlytics(vkConnectResponse);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (yandex(r0) == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(defpackage.AbstractC0283l r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C18735l
            if (r0 == 0) goto L13
            r0 = r6
            lُۨ r0 = (defpackage.C18735l) r0
            int r1 = r0.f36521l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36521l = r1
            goto L18
        L13:
            lُۨ r0 = new lُۨ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f36520l
            int r1 = r0.f36521l
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.AbstractC2829l.crashlytics(r6)     // Catch: java.lang.Throwable -> L64
            goto L61
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L31:
            defpackage.AbstractC2829l.crashlytics(r6)     // Catch: java.lang.Throwable -> L35
            goto L43
        L35:
            r6 = move-exception
            goto L46
        L37:
            defpackage.AbstractC2829l.crashlytics(r6)
            r0.f36521l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r5.amazon(r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != r4) goto L43
            goto L60
        L43:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            goto L4c
        L46:
            lٛۤ r1 = new lٛۤ
            r1.<init>(r6)
            r6 = r1
        L4c:
            boolean r6 = r6 instanceof defpackage.C18435l
            if (r6 != 0) goto L53
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L53:
            lؘُ۟ r6 = defpackage.C3544l.loadAd
            r6.loadAd()
            r0.f36521l = r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object r5 = r5.yandex(r0)     // Catch: java.lang.Throwable -> L64
            if (r5 != r4) goto L61
        L60:
            return r4
        L61:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L64
            goto L6b
        L64:
            r5 = move-exception
            lٛۤ r6 = new lٛۤ
            r6.<init>(r5)
            r5 = r6
        L6b:
            boolean r5 = r5 instanceof defpackage.C18435l
            if (r5 != 0) goto L72
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L72:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3544l.crashlytics(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r9 == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(defpackage.AbstractC0283l r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3544l.yandex(lّؑۧ):java.lang.Object");
    }
}

package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕٟٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15854l {
    public static final float loadAd;
    public static final List yandex;

    static {
        char c;
        long j;
        char c2;
        int i;
        char c3;
        C2183l c2183l = AbstractC11052l.yandex;
        C10282l c10282lCrashlytics = c2183l.crashlytics();
        C10282l c10282lLoadAd = AbstractC11052l.smaato;
        if (c10282lLoadAd == null) {
            c10282lLoadAd = AbstractC14760l.billing(9, AbstractC11052l.crashlytics).crashlytics(new C7225l(AbstractC11052l.purchase, 1)).loadAd();
            AbstractC11052l.smaato = c10282lLoadAd;
        }
        C10282l c10282lLoadAd2 = AbstractC11052l.subs;
        if (c10282lLoadAd2 == null) {
            j = 4294967295L;
            c = ' ';
            c10282lLoadAd2 = C2183l.loadAd(c2183l, AbstractC14055l.remoteconfig(new C17180l((((long) Float.floatToRawIntBits(-0.009f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.5f)) << 32), new C2428l(2, 0.172f)), new C17180l((((long) Float.floatToRawIntBits(1.03f)) << 32) | (((long) Float.floatToRawIntBits(0.365f)) & 4294967295L), new C2428l(2, 0.164f)), new C17180l((((long) Float.floatToRawIntBits(0.97f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.828f)) << 32), new C2428l(2, 0.169f))), 1, 4).loadAd();
            AbstractC11052l.subs = c10282lLoadAd2;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        C10282l c10282lLoadAd3 = AbstractC11052l.admob;
        if (c10282lLoadAd3 == null) {
            c2 = 0;
            c10282lLoadAd3 = C2183l.loadAd(c2183l, AbstractC14055l.remoteconfig(new C17180l((((long) Float.floatToRawIntBits(0.961f)) << c) | (((long) Float.floatToRawIntBits(0.039f)) & j), new C2428l(2, 0.426f)), new C17180l((((long) Float.floatToRawIntBits(0.428f)) & j) | (((long) Float.floatToRawIntBits(1.001f)) << c), C2428l.loadAd), new C17180l((((long) Float.floatToRawIntBits(0.609f)) & j) | (((long) Float.floatToRawIntBits(1.0f)) << c), new C2428l(2, 1.0f))), 2, 4).loadAd();
            AbstractC11052l.admob = c10282lLoadAd3;
        } else {
            c2 = 0;
        }
        C10282l c10282lLoadAd4 = AbstractC11052l.isPro;
        if (c10282lLoadAd4 == null) {
            c10282lLoadAd4 = AbstractC14760l.billing(8, AbstractC11052l.loadAd).loadAd();
            AbstractC11052l.isPro = c10282lLoadAd4;
        }
        C10282l c10282lLoadAd5 = AbstractC11052l.firebase;
        if (c10282lLoadAd5 == null) {
            char c4 = c;
            C17180l c17180l = new C17180l((((long) Float.floatToRawIntBits(1.237f)) << c4) | (((long) Float.floatToRawIntBits(1.236f)) & j), new C2428l(2, 0.258f));
            C17180l c17180l2 = new C17180l((((long) Float.floatToRawIntBits(0.5f)) << c4) | (((long) Float.floatToRawIntBits(0.918f)) & j), new C2428l(2, 0.233f));
            C17180l[] c17180lArr = new C17180l[2];
            c17180lArr[c2] = c17180l;
            c17180lArr[1] = c17180l2;
            List listRemoteconfig = AbstractC14055l.remoteconfig(c17180lArr);
            i = 4;
            c10282lLoadAd5 = C2183l.loadAd(c2183l, listRemoteconfig, 4, 12).loadAd();
            AbstractC11052l.firebase = c10282lLoadAd5;
        } else {
            i = 4;
        }
        C10282l c10282lLoadAd6 = AbstractC11052l.mopub;
        if (c10282lLoadAd6 == null) {
            float[] fArrYandex = C10924l.yandex();
            C10924l.admob(fArrYandex, 1.0f, 0.64f, i);
            c3 = 1;
            c10282lLoadAd6 = AbstractC14760l.amazon(15).crashlytics(new C7225l(fArrYandex, 1)).crashlytics(new C7225l(AbstractC11052l.amazon, 1)).loadAd();
            AbstractC11052l.mopub = c10282lLoadAd6;
        } else {
            c3 = 1;
        }
        C10282l[] c10282lArr = new C10282l[7];
        c10282lArr[c2] = c10282lCrashlytics;
        c10282lArr[c3] = c10282lLoadAd;
        c10282lArr[2] = c10282lLoadAd2;
        c10282lArr[3] = c10282lLoadAd3;
        c10282lArr[4] = c10282lLoadAd4;
        c10282lArr[5] = c10282lLoadAd5;
        c10282lArr[6] = c10282lLoadAd6;
        yandex = AbstractC14055l.remoteconfig(c10282lArr);
        C10282l c10282lLoadAd7 = AbstractC11052l.billing;
        if (c10282lLoadAd7 == null) {
            c10282lLoadAd7 = AbstractC14760l.amazon(14).loadAd();
            AbstractC11052l.billing = c10282lLoadAd7;
        }
        float[] fArrYandex2 = C10924l.yandex();
        C10924l.billing(fArrYandex2, 18.0f);
        Unit unit = Unit.INSTANCE;
        C10282l c10282lCrashlytics2 = c10282lLoadAd7.crashlytics(new C7225l(fArrYandex2, 1));
        C10282l c10282lCrashlytics3 = c2183l.crashlytics();
        C10282l[] c10282lArr2 = new C10282l[2];
        c10282lArr2[c2] = c10282lCrashlytics2;
        c10282lArr2[1] = c10282lCrashlytics3;
        AbstractC14055l.remoteconfig(c10282lArr2);
        loadAd = 38.0f / Math.min(48.0f, 48.0f);
    }
}

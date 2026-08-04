package defpackage;

/* JADX INFO: renamed from: lؚؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2666l {
    public final float admob;
    public final long amazon;
    public final float billing;
    public final long crashlytics;
    public final long loadAd;
    public final float mopub;
    public final long purchase;
    public long subs;
    public final long yandex;

    public C2666l(long j, long j2, long j3, C2428l c2428l) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        long jSubs = AbstractC10433l.subs(j, j2);
        long jSubs2 = AbstractC10433l.subs(j3, j2);
        float fBilling = AbstractC10433l.billing(jSubs);
        float fBilling2 = AbstractC10433l.billing(jSubs2);
        if (fBilling <= 0.0f || fBilling2 <= 0.0f) {
            this.amazon = C9699l.yandex(0.0f, 0.0f);
            this.purchase = C9699l.yandex(0.0f, 0.0f);
            this.billing = 0.0f;
            this.mopub = 0.0f;
            this.admob = 0.0f;
        } else {
            long jCrashlytics = AbstractC10433l.crashlytics(fBilling, jSubs);
            this.amazon = jCrashlytics;
            long jCrashlytics2 = AbstractC10433l.crashlytics(fBilling2, jSubs2);
            this.purchase = jCrashlytics2;
            float f = c2428l.yandex;
            this.billing = f;
            this.mopub = 0.0f;
            float fAmazon = AbstractC10433l.amazon(jCrashlytics, jCrashlytics2);
            float f2 = AbstractC12481l.loadAd;
            float fSqrt = (float) Math.sqrt(1.0f - (fAmazon * fAmazon));
            this.admob = ((double) fSqrt) > 0.001d ? ((fAmazon + 1.0f) * f) / fSqrt : 0.0f;
        }
        this.subs = C9699l.yandex(0.0f, 0.0f);
    }

    public static C17841l loadAd(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long jSubs = AbstractC10433l.subs(j2, j);
        float fBilling = AbstractC10433l.billing(jSubs);
        C9699l c9699l = null;
        if (fBilling <= 0.0f) {
            C8339l.metrica("Can't get the direction of a 0-length vector");
            return null;
        }
        long jCrashlytics = AbstractC10433l.crashlytics(fBilling, jSubs);
        long jFirebase = AbstractC10433l.firebase(j, AbstractC10433l.remoteconfig(1.0f + f2, AbstractC10433l.remoteconfig(f, jCrashlytics)));
        long jCrashlytics2 = AbstractC10433l.crashlytics(2.0f, AbstractC10433l.firebase(j3, j4));
        long jYandex = C9699l.yandex(AbstractC12481l.loadAd(AbstractC10433l.mopub(j3), AbstractC10433l.mopub(jCrashlytics2), f2), AbstractC12481l.loadAd(AbstractC10433l.admob(j3), AbstractC10433l.admob(jCrashlytics2), f2));
        long jFirebase2 = AbstractC10433l.firebase(j5, AbstractC10433l.remoteconfig(f3, AbstractC12481l.yandex(AbstractC10433l.mopub(jYandex) - AbstractC10433l.mopub(j5), AbstractC10433l.admob(jYandex) - AbstractC10433l.admob(j5))));
        long jSubs2 = AbstractC10433l.subs(jFirebase2, j5);
        long jYandex2 = C9699l.yandex(-AbstractC10433l.admob(jSubs2), AbstractC10433l.mopub(jSubs2));
        long jYandex3 = C9699l.yandex(-AbstractC10433l.admob(jYandex2), AbstractC10433l.mopub(jYandex2));
        float fAmazon = AbstractC10433l.amazon(jCrashlytics, jYandex3);
        if (Math.abs(fAmazon) >= 1.0E-4f) {
            float fAmazon2 = AbstractC10433l.amazon(AbstractC10433l.subs(jFirebase2, j2), jYandex3);
            if (Math.abs(fAmazon) >= Math.abs(fAmazon2) * 1.0E-4f) {
                c9699l = new C9699l(AbstractC10433l.firebase(j2, AbstractC10433l.remoteconfig(fAmazon2 / fAmazon, jCrashlytics)));
            }
        }
        long j6 = c9699l != null ? c9699l.yandex : j3;
        long jCrashlytics3 = AbstractC10433l.crashlytics(3.0f, AbstractC10433l.firebase(jFirebase, AbstractC10433l.remoteconfig(2.0f, j6)));
        return new C17841l(new float[]{AbstractC10433l.mopub(jFirebase), AbstractC10433l.admob(jFirebase), AbstractC10433l.mopub(jCrashlytics3), AbstractC10433l.admob(jCrashlytics3), AbstractC10433l.mopub(j6), AbstractC10433l.admob(j6), AbstractC10433l.mopub(jFirebase2), AbstractC10433l.admob(jFirebase2)});
    }

    public final float crashlytics() {
        return (1.0f + this.mopub) * this.admob;
    }

    public final float yandex(float f) {
        float fCrashlytics = crashlytics();
        float f2 = this.mopub;
        if (f > fCrashlytics) {
            return f2;
        }
        float f3 = this.admob;
        if (f > f3) {
            return ((f - f3) * f2) / (crashlytics() - f3);
        }
        return 0.0f;
    }
}

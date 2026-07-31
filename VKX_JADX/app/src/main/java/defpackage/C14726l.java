package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: lؙٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14726l {
    public long admob;
    public C2432l amazon;
    public File billing;
    public final int crashlytics;
    public C11255l isPro;
    public final long loadAd;
    public OutputStream mopub;
    public long purchase;
    public long subs;
    public final C12220l yandex;

    public C14726l(C12220l c12220l, long j) {
        AbstractC12442l.ads("fragmentSize must be positive or C.LENGTH_UNSET.", j > 0 || j == -1);
        if (j != -1 && j < 2097152) {
            AbstractC6427l.vip("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        c12220l.getClass();
        this.yandex = c12220l;
        this.loadAd = j == -1 ? Long.MAX_VALUE : j;
        this.crashlytics = 20480;
    }

    public final void loadAd(C2432l c2432l) {
        File fileCrashlytics;
        long j = c2432l.mopub;
        long jMin = j == -1 ? -1L : Math.min(j - this.subs, this.purchase);
        C12220l c12220l = this.yandex;
        String str = c2432l.admob;
        String str2 = AbstractC15323l.yandex;
        long j2 = c2432l.billing + this.subs;
        synchronized (c12220l) {
            try {
                c12220l.amazon();
                C1013l c1013lM958super = c12220l.crashlytics.m958super(str);
                c1013lM958super.getClass();
                AbstractC12442l.subscription(c1013lM958super.yandex(j2, jMin));
                if (!c12220l.yandex.exists()) {
                    C12220l.purchase(c12220l.yandex);
                    c12220l.smaato();
                }
                C6172l c6172l = c12220l.loadAd;
                if (jMin != -1) {
                    c6172l.yandex(c12220l, jMin);
                } else {
                    c6172l.getClass();
                }
                File file = new File(c12220l.yandex, Integer.toString(c12220l.billing.nextInt(10)));
                if (!file.exists()) {
                    C12220l.purchase(file);
                }
                fileCrashlytics = C0812l.crashlytics(file, c1013lM958super.yandex, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.billing = fileCrashlytics;
        FileOutputStream fileOutputStream = new FileOutputStream(this.billing);
        if (this.crashlytics > 0) {
            C11255l c11255l = this.isPro;
            if (c11255l == null) {
                this.isPro = new C11255l(fileOutputStream, this.crashlytics);
            } else {
                c11255l.yandex(fileOutputStream);
            }
            this.mopub = this.isPro;
        } else {
            this.mopub = fileOutputStream;
        }
        this.admob = 0L;
    }

    public final void yandex() {
        OutputStream outputStream = this.mopub;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC15323l.admob(this.mopub);
            this.mopub = null;
            File file = this.billing;
            this.billing = null;
            C12220l c12220l = this.yandex;
            long j = this.admob;
            synchronized (c12220l) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    C0812l c0812lLoadAd = C0812l.loadAd(file, j, -9223372036854775807L, c12220l.crashlytics);
                    c0812lLoadAd.getClass();
                    C1013l c1013lM958super = c12220l.crashlytics.m958super(c0812lLoadAd.f2437l);
                    c1013lM958super.getClass();
                    AbstractC12442l.subscription(c1013lM958super.yandex(c0812lLoadAd.f2436l, c0812lLoadAd.f2435l));
                    long jLoadAd = AbstractC11043l.loadAd(c1013lM958super.purchase);
                    if (jLoadAd != -1) {
                        AbstractC12442l.subscription(c0812lLoadAd.f2436l + c0812lLoadAd.f2435l <= jLoadAd);
                    }
                    if (c12220l.amazon == null) {
                        c12220l.loadAd(c0812lLoadAd);
                        c12220l.crashlytics.m924l();
                        c12220l.notifyAll();
                        return;
                    }
                    try {
                        c12220l.amazon.m2828native(file.getName(), c0812lLoadAd.f2435l, c0812lLoadAd.f2440l);
                        c12220l.loadAd(c0812lLoadAd);
                        try {
                            c12220l.crashlytics.m924l();
                            c12220l.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new C0322l(e);
                        }
                    } catch (IOException e2) {
                        throw new C0322l(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            AbstractC15323l.admob(this.mopub);
            this.mopub = null;
            File file2 = this.billing;
            this.billing = null;
            file2.delete();
            throw th;
        }
    }
}

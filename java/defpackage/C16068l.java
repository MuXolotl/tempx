package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٕۦٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16068l implements InterfaceC13131l {
    public final C9159l amazon;
    public final C18449l crashlytics;
    public InterfaceC8979l firebase;
    public C2432l isPro;
    public final C13384l loadAd;
    public volatile boolean mopub;
    public final C5811l purchase;
    public final /* synthetic */ C9159l remoteconfig;
    public boolean smaato;
    public long subs;
    public final Uri yandex;
    public final C1014l billing = new C1014l(1);
    public boolean admob = true;

    public C16068l(C9159l c9159l, Uri uri, InterfaceC14090l interfaceC14090l, C18449l c18449l, C9159l c9159l2, C5811l c5811l) {
        this.remoteconfig = c9159l;
        this.yandex = uri;
        this.loadAd = new C13384l(interfaceC14090l);
        this.crashlytics = c18449l;
        this.amazon = c9159l2;
        this.purchase = c5811l;
        C13071l.mopub.getAndIncrement();
        this.isPro = crashlytics(0L, null);
    }

    public final C2432l crashlytics(long j, String str) {
        Map mapStartapp = C9159l.f18813l;
        if (str != null && !str.startsWith("W/")) {
            mapStartapp = AbstractC13675l.yandex().mo3667case(mapStartapp).mo3668catch("If-Range", str).startapp();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.remoteconfig.f18850l;
        Uri uri = this.yandex;
        AbstractC12442l.metrica(uri, "The uri must be set.");
        return new C2432l(uri, 0L, 1, null, mapStartapp, j, -1L, str2, 6, null);
    }

    @Override // defpackage.InterfaceC13131l
    public final void loadAd() {
        this.mopub = true;
    }

    @Override // defpackage.InterfaceC13131l
    public final void yandex() {
        InterfaceC14090l c1138l;
        InterfaceC14833l interfaceC14833l;
        int i;
        int iLoadAd = 0;
        String str = null;
        while (iLoadAd == 0 && !this.mopub) {
            try {
                long j = this.billing.f2761l;
                C2432l c2432lCrashlytics = crashlytics(j, str);
                this.isPro = c2432lCrashlytics;
                long jCrashlytics = this.loadAd.crashlytics(c2432lCrashlytics);
                if (this.mopub) {
                    if (iLoadAd != 1 && this.crashlytics.m4553strictfp() != -1) {
                        this.billing.f2761l = this.crashlytics.m4553strictfp();
                    }
                    AbstractC12366l.yandex(this.loadAd);
                    return;
                }
                List list = (List) this.loadAd.f26267l.isPro().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jCrashlytics != -1) {
                    jCrashlytics += j;
                    C9159l c9159l = this.remoteconfig;
                    c9159l.f18856l.post(new RunnableC12464l(c9159l, 0));
                }
                long j2 = jCrashlytics;
                this.remoteconfig.f18823l = C13243l.amazon(this.loadAd.f26267l.isPro());
                C13384l c13384l = this.loadAd;
                C13243l c13243l = this.remoteconfig.f18823l;
                if (c13243l == null || (i = c13243l.billing) == -1) {
                    c1138l = c13384l;
                } else {
                    c1138l = new C1138l(c13384l, i, this);
                    InterfaceC8979l interfaceC8979lAppmetrica = this.remoteconfig.appmetrica(new C13511l(0, true));
                    this.firebase = interfaceC8979lAppmetrica;
                    interfaceC8979lAppmetrica.mopub(C9159l.f18812l);
                }
                this.crashlytics.m4557throw(c1138l, this.yandex, this.loadAd.f26267l.isPro(), j, j2, this.amazon);
                if (this.remoteconfig.f18823l != null && (interfaceC14833l = (InterfaceC14833l) this.crashlytics.f36009l) != null) {
                    InterfaceC14833l interfaceC14833lYandex = interfaceC14833l.yandex();
                    if (interfaceC14833lYandex instanceof C15843l) {
                        ((C15843l) interfaceC14833lYandex).subscription = true;
                    }
                }
                if (this.admob) {
                    C18449l c18449l = this.crashlytics;
                    long j3 = this.subs;
                    InterfaceC14833l interfaceC14833l2 = (InterfaceC14833l) c18449l.f36009l;
                    interfaceC14833l2.getClass();
                    interfaceC14833l2.amazon(j, j3);
                    this.admob = false;
                }
                while (iLoadAd == 0 && !this.mopub) {
                    try {
                        this.purchase.yandex();
                        C18449l c18449l2 = this.crashlytics;
                        C1014l c1014l = this.billing;
                        InterfaceC14833l interfaceC14833l3 = (InterfaceC14833l) c18449l2.f36009l;
                        interfaceC14833l3.getClass();
                        C11826l c11826l = (C11826l) c18449l2.f36012l;
                        c11826l.getClass();
                        iLoadAd = interfaceC14833l3.loadAd(c11826l, c1014l);
                        long jM4553strictfp = this.crashlytics.m4553strictfp();
                        if (jM4553strictfp > this.remoteconfig.f18839l + j) {
                            C5811l c5811l = this.purchase;
                            synchronized (c5811l) {
                                c5811l.loadAd = false;
                            }
                            C9159l c9159l2 = this.remoteconfig;
                            c9159l2.f18856l.post(c9159l2.f18835l);
                            j = jM4553strictfp;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iLoadAd == 1) {
                    iLoadAd = 0;
                } else if (this.crashlytics.m4553strictfp() != -1) {
                    this.billing.f2761l = this.crashlytics.m4553strictfp();
                }
                AbstractC12366l.yandex(this.loadAd);
            } catch (Throwable th) {
                if (iLoadAd != 1 && this.crashlytics.m4553strictfp() != -1) {
                    this.billing.f2761l = this.crashlytics.m4553strictfp();
                }
                AbstractC12366l.yandex(this.loadAd);
                throw th;
            }
        }
    }
}

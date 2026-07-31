package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؙٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0342l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile int f1395l = -1;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18096l f1396l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f1397l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C3142l f1398l;

    public AbstractC0342l(String str, C18096l c18096l) {
        this.f1397l = str;
        this.f1396l = c18096l;
    }

    public abstract Object amazon(Object obj);

    public abstract void billing(Object obj);

    public abstract Object crashlytics(String str);

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        C7447l c7447l;
        if (AbstractC9151l.crashlytics == null) {
            Object obj = C7447l.isPro;
            AbstractC9151l.crashlytics = new C10756l(15);
        }
        Context context = (Context) C7447l.firebase.get();
        if (context == null) {
            AbstractC9151l.firebase();
            C8339l.smaato("Must call PhenotypeContext.setContext() first");
            return null;
        }
        C7447l c7447l2 = C7447l.smaato;
        if (c7447l2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                Class<?> cls = applicationContext.getApplicationContext().getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (C7447l.isPro) {
                    try {
                        if (C7447l.smaato != null) {
                            c7447l = C7447l.smaato;
                        } else {
                            c7447l = (C7447l) new C3090l(applicationContext, 0).get();
                            C7447l.smaato = c7447l;
                            AbstractC3234l.firebase(Level.CONFIG, c7447l.yandex(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        c7447l2 = c7447l;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        Object objLoadAd = loadAd(c7447l2);
        objLoadAd.getClass();
        return objLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    public final Object loadAd(C7447l c7447l) {
        C10316l c10316l;
        Object objYandex;
        C5128l c5128l;
        int i = this.f1395l;
        if (i == -1 || i < this.f1398l.yandex.get()) {
            synchronized (this) {
                try {
                    int i2 = this.f1395l;
                    Object objAmazon = null;
                    if (i2 == -1) {
                        C7447l.loadAd();
                        c7447l.getClass();
                        C18096l c18096l = this.f1396l;
                        C13648l c13648l = (C13648l) c18096l.loadAd;
                        C13648l c13648l2 = C10316l.isPro;
                        if (c13648l != c13648l2) {
                            c18096l.yandex = C10316l.subs.purchase(c7447l, c13648l).yandex;
                            c18096l.loadAd = c13648l2;
                        }
                        c10316l = (C10316l) c18096l.yandex;
                        this.f1398l = c10316l.mopub;
                    } else {
                        c10316l = null;
                    }
                    int i3 = this.f1398l.yandex.get();
                    if (i2 < i3) {
                        C7447l.loadAd();
                        c7447l.getClass();
                        AbstractC17238l abstractC17238lAppmetrica = AbstractC11965l.appmetrica(c7447l.loadAd);
                        if (abstractC17238lAppmetrica.crashlytics()) {
                            C6299l c6299l = (C6299l) abstractC17238lAppmetrica.loadAd();
                            Uri uriYandex = AbstractC8554l.yandex();
                            String str = this.f1397l;
                            if (uriYandex != null) {
                                c5128l = (C5128l) c6299l.yandex.get(uriYandex.toString());
                            } else {
                                c6299l.getClass();
                                c5128l = null;
                            }
                            String str2 = c5128l == null ? null : (String) c5128l.get(str);
                            if (str2 == null) {
                                objYandex = null;
                            } else {
                                try {
                                    objYandex = crashlytics(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f1397l), e);
                                    objYandex = null;
                                }
                            }
                        } else {
                            objYandex = null;
                        }
                        if (c10316l == null) {
                            C18096l c18096l2 = this.f1396l;
                            C13648l c13648l3 = (C13648l) c18096l2.loadAd;
                            C13648l c13648l4 = C10316l.isPro;
                            if (c13648l3 != c13648l4) {
                                c18096l2.yandex = C10316l.subs.purchase(c7447l, c13648l3).yandex;
                                c18096l2.loadAd = c13648l4;
                            }
                            c10316l = (C10316l) c18096l2.yandex;
                        }
                        String str3 = c10316l.crashlytics;
                        int i4 = 1;
                        if (Build.VERSION.SDK_INT >= 26 && !c7447l.loadAd.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureBilling = c7447l.yandex().billing(new RunnableC16301l((Object) c7447l, (Object) str3, false, 23));
                            listenableFutureBilling.yandex(new RunnableC6011l(i4, listenableFutureBilling), EnumC1535l.f3808l);
                        }
                        Object obj = ((C15333l) c10316l.yandex().f36087l).get(this.f1397l);
                        if (obj != null) {
                            try {
                                objAmazon = amazon(obj);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f1397l), e2);
                            }
                        }
                        if (true != abstractC17238lAppmetrica.crashlytics()) {
                            objYandex = objAmazon;
                        }
                        if (objYandex == null) {
                            objYandex = yandex();
                        }
                        if (objYandex != null) {
                            billing(objYandex);
                            this.f1395l = i3;
                        }
                        return objYandex;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return purchase();
    }

    public abstract Object purchase();

    public abstract Object yandex();
}

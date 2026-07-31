package defpackage;

import android.content.Context;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: lؚۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC7505l implements Callable {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC7505l(Object obj, Object obj2, Object obj3, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C10712l c10712l;
        Exception exc;
        Throwable th;
        AutoCloseable autoCloseable;
        C0607l c0607l;
        boolean z;
        C10712l c10712l2;
        Pair pair;
        C0607l c0607lCrashlytics;
        int i = 0;
        switch (this.yandex) {
            case 0:
                return ((ScheduledExecutorServiceC6423l) this.loadAd).f13444l.submit(new RunnableC0336l((Callable) this.crashlytics, (C5138l) this.amazon, 9));
            case 1:
                Context context = (Context) this.loadAd;
                String str = (String) this.crashlytics;
                String str2 = (String) this.amazon;
                C3797l c3797l = AbstractC1788l.yandex;
                if (c3797l == null) {
                    synchronized (C3797l.class) {
                        try {
                            c3797l = AbstractC1788l.yandex;
                            if (c3797l == null) {
                                c3797l = new C3797l(AbstractC1788l.mopub(context), new C7472l(28), i);
                                AbstractC1788l.yandex = c3797l;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                C3797l c3797l2 = c3797l;
                AutoCloseable autoCloseable2 = null;
                InputStream inputStream = null;
                C9804l c9804l = null;
                if (str2 != null) {
                    try {
                        File fileM2249volatile = ((C7972l) c3797l2.f7903l).m2249volatile(str);
                        if (fileM2249volatile == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileM2249volatile);
                            EnumC13563l enumC13563l = fileM2249volatile.getAbsolutePath().endsWith(".zip") ? EnumC13563l.ZIP : fileM2249volatile.getAbsolutePath().endsWith(".gz") ? EnumC13563l.GZIP : EnumC13563l.JSON;
                            fileM2249volatile.getAbsolutePath();
                            AbstractC17968l.yandex();
                            pair = new Pair(enumC13563l, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        c10712l = null;
                    } else {
                        EnumC13563l enumC13563l2 = (EnumC13563l) pair.first;
                        InputStream inputStream2 = (InputStream) pair.second;
                        int iOrdinal = enumC13563l2.ordinal();
                        if (iOrdinal == 1) {
                            c0607lCrashlytics = AbstractC8446l.crashlytics(context, new ZipInputStream(inputStream2), str2);
                        } else if (iOrdinal != 2) {
                            c0607lCrashlytics = AbstractC8446l.yandex(inputStream2, str2);
                        } else {
                            try {
                                c0607lCrashlytics = AbstractC8446l.yandex(new GZIPInputStream(inputStream2), str2);
                            } catch (IOException e) {
                                c0607lCrashlytics = new C0607l(e);
                            }
                        }
                        c10712l = c0607lCrashlytics.yandex;
                        if (c10712l == null) {
                            c10712l = null;
                        }
                    }
                    break;
                } else {
                    c10712l = null;
                }
                if (c10712l == null) {
                    AbstractC17968l.yandex();
                    AbstractC17968l.yandex();
                    try {
                        try {
                            C9804l c9804lSubs = ((C7472l) c3797l2.f7902l).subs(str);
                            try {
                                try {
                                    z = ((HttpURLConnection) c9804lSubs.f19982l).getResponseCode() / 100 == 2;
                                } catch (Exception e2) {
                                    exc = e2;
                                    c9804l = c9804lSubs;
                                    C0607l c0607l2 = new C0607l(exc);
                                    if (c9804l != null) {
                                        try {
                                            c9804l.close();
                                        } catch (IOException e3) {
                                            AbstractC17968l.crashlytics("LottieFetchResult close failed ", e3);
                                        }
                                    }
                                    c0607l = c0607l2;
                                    autoCloseable2 = c9804l;
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    autoCloseable = c9804lSubs;
                                    if (autoCloseable == null) {
                                        throw th;
                                    }
                                    try {
                                        autoCloseable.close();
                                        throw th;
                                    } catch (IOException e4) {
                                        AbstractC17968l.crashlytics("LottieFetchResult close failed ", e4);
                                        throw th;
                                    }
                                }
                            } catch (IOException unused2) {
                            }
                            if (z) {
                                InputStream inputStream3 = ((HttpURLConnection) c9804lSubs.f19982l).getInputStream();
                                c0607l = c3797l2.isVip(context, str, inputStream3, ((HttpURLConnection) c9804lSubs.f19982l).getContentType(), str2);
                                C10712l c10712l3 = c0607l.yandex;
                                AbstractC17968l.yandex();
                                inputStream = inputStream3;
                            } else {
                                c0607l = new C0607l(new IllegalArgumentException(c9804lSubs.yandex()));
                            }
                            try {
                                c9804lSubs.close();
                                autoCloseable2 = inputStream;
                            } catch (IOException e5) {
                                AbstractC17968l.crashlytics("LottieFetchResult close failed ", e5);
                                autoCloseable2 = inputStream;
                            }
                        } catch (Exception e6) {
                            exc = e6;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        autoCloseable = autoCloseable2;
                    }
                    break;
                } else {
                    c0607l = new C0607l(c10712l);
                }
                if (str2 != null && (c10712l2 = c0607l.yandex) != null) {
                    C16032l.loadAd.yandex.crashlytics(str2, c10712l2);
                }
                return c0607l;
            default:
                C5648l c5648l = (C5648l) this.loadAd;
                ArrayList arrayList = (ArrayList) this.crashlytics;
                String str3 = (String) this.amazon;
                WorkDatabase workDatabase = c5648l.purchase;
                arrayList.addAll((List) AbstractC2021l.purchase(workDatabase.license().yandex, true, false, new C6789l(str3, 5)));
                return workDatabase.Signature().amazon(str3);
        }
    }
}

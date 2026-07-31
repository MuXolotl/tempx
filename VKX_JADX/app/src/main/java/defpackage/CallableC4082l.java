package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lْؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4082l implements Callable {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC4082l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        int i2 = -1;
        String str2 = null;
        int i3 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        switch (this.yandex) {
            case 0:
                C2205l c2205l = (C2205l) this.loadAd;
                byte[] bArr = (byte[]) this.crashlytics;
                boolean z2 = c2205l.f4872l;
                Bitmap bitmapPurchase = AbstractC12148l.purchase(bArr.length, c2205l.f4869l, bArr);
                return z2 ? AbstractC12148l.pro(bitmapPurchase) : bitmapPurchase;
            case 1:
                C2205l c2205l2 = (C2205l) this.loadAd;
                Uri uri = (Uri) this.crashlytics;
                InterfaceC14090l interfaceC14090lPro = c2205l2.f4870l.pro();
                int i4 = c2205l2.f4869l;
                boolean z3 = c2205l2.f4872l;
                try {
                    C2432l c2432l = new C2432l(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null);
                    C12160l c12160l = (C12160l) interfaceC14090lPro;
                    c12160l.crashlytics(c2432l);
                    byte[] bArrCopyOf = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i3 = c12160l.read(bArrCopyOf, i5, bArrCopyOf.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i5);
                    Bitmap bitmapPurchase2 = AbstractC12148l.purchase(bArrCopyOf2.length, i4, bArrCopyOf2);
                    if (z3) {
                        bitmapPurchase2 = AbstractC12148l.pro(bitmapPurchase2);
                        break;
                    }
                    return bitmapPurchase2;
                } finally {
                    ((C12160l) interfaceC14090lPro).close();
                }
            case 2:
                Context context = (Context) this.loadAd;
                Intent intent = (Intent) this.crashlytics;
                C12014l c12014lAd = C12014l.ad();
                c12014lAd.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c12014lAd.f23943l).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (c12014lAd) {
                    try {
                        String str3 = (String) c12014lAd.f23941l;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    c12014lAd.f23941l = context.getPackageName() + serviceInfo.name;
                                } else {
                                    c12014lAd.f23941l = serviceInfo.name;
                                }
                                str2 = (String) c12014lAd.f23941l;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (c12014lAd.appmetrica(context)) {
                        componentNameStartService = AbstractC3105l.isPro(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                    i2 = i;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                    i2 = i;
                }
                return Integer.valueOf(i2);
            default:
                AbstractC8727l abstractC8727l = (AbstractC8727l) this.loadAd;
                C11120l c11120l = (C11120l) this.crashlytics;
                String str4 = c11120l.smaato;
                String str5 = c11120l.crashlytics;
                C9280l c9280l = c11120l.subs;
                C7718l c7718l = c11120l.yandex;
                EnumC9176l enumC9176l = EnumC9176l.f18878l;
                if (abstractC8727l instanceof C12075l) {
                    AbstractC17496l c18702l = ((C12075l) abstractC8727l).yandex;
                    EnumC9176l enumC9176lCrashlytics = c9280l.crashlytics(str5);
                    AbstractC15781l abstractC15781l = c9280l.yandex;
                    AbstractC2021l.purchase(c11120l.admob.tapsense().yandex, false, true, new C6908l(str5, 24));
                    if (enumC9176lCrashlytics != null) {
                        if (enumC9176lCrashlytics == EnumC9176l.f18877l) {
                            if (c18702l instanceof C0233l) {
                                String str6 = AbstractC6037l.yandex;
                                C14513l.tapsense().isVip(str6, "Worker result SUCCESS for " + str4);
                                if (c7718l.crashlytics()) {
                                    c11120l.crashlytics();
                                } else {
                                    c9280l.billing(EnumC9176l.f18875l, str5);
                                    AbstractC2021l.purchase(abstractC15781l, false, true, new C15575l(((C0233l) c18702l).yandex, str5, 17));
                                    c11120l.billing.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    C13664l c13664l = c11120l.isPro;
                                    for (String str7 : c13664l.yandex(str5)) {
                                        if (c9280l.crashlytics(str7) == EnumC9176l.f18879l && ((Boolean) AbstractC2021l.purchase(c13664l.yandex, true, false, new C6908l(str7, 10))).booleanValue()) {
                                            C14513l.tapsense().isVip(AbstractC6037l.yandex, "Setting status to enqueued for ".concat(str7));
                                            c9280l.billing(enumC9176l, str7);
                                            AbstractC2021l.purchase(abstractC15781l, false, true, new C16143l(jCurrentTimeMillis, str7, 1));
                                        }
                                    }
                                }
                            } else if (c18702l instanceof C9990l) {
                                String str8 = AbstractC6037l.yandex;
                                C14513l.tapsense().isVip(str8, "Worker result RETRY for " + str4);
                                c11120l.loadAd(-256);
                                z = true;
                            } else {
                                String str9 = AbstractC6037l.yandex;
                                C14513l.tapsense().isVip(str9, "Worker result FAILURE for " + str4);
                                if (c7718l.crashlytics()) {
                                    c11120l.crashlytics();
                                } else {
                                    if (c18702l == null) {
                                        c18702l = new C18702l();
                                    }
                                    c11120l.amazon(c18702l);
                                }
                            }
                        } else if (!enumC9176lCrashlytics.yandex()) {
                            c11120l.loadAd(-512);
                            z = true;
                        }
                    }
                } else if (abstractC8727l instanceof C5512l) {
                    AbstractC17496l abstractC17496l = ((C5512l) abstractC8727l).yandex;
                    String str10 = AbstractC6037l.yandex;
                    C14513l.tapsense().isVip(str10, "Worker result FAILURE for " + str4);
                    if (c7718l.crashlytics()) {
                        c11120l.crashlytics();
                    } else {
                        c11120l.amazon(abstractC17496l);
                    }
                } else {
                    if (!(abstractC8727l instanceof C8557l)) {
                        C18725l.billing();
                        return null;
                    }
                    int i6 = ((C8557l) abstractC8727l).yandex;
                    if (AbstractC8576l.yandex(c7718l.advert, Boolean.TRUE)) {
                        String str11 = AbstractC6037l.yandex;
                        C14513l.tapsense().vip(str11, "Worker " + c7718l.crashlytics + " was interrupted. Backing off.");
                        c11120l.loadAd(i6);
                    } else {
                        EnumC9176l enumC9176lCrashlytics2 = c9280l.crashlytics(str5);
                        if (enumC9176lCrashlytics2 == null || enumC9176lCrashlytics2.yandex()) {
                            String str12 = AbstractC6037l.yandex;
                            C14513l.tapsense().vip(str12, "Status for " + str5 + " is " + enumC9176lCrashlytics2 + " ; not doing any work");
                        } else {
                            String str13 = AbstractC6037l.yandex;
                            C14513l.tapsense().vip(str13, "Status for " + str5 + " is " + enumC9176lCrashlytics2 + "; not doing any work and rescheduling for later execution");
                            c9280l.billing(enumC9176l, str5);
                            c9280l.mopub(i6, str5);
                            c9280l.purchase(-1L, str5);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

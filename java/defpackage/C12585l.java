package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: lّٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12585l {
    public static C12585l crashlytics;
    public volatile String loadAd;
    public final Context yandex;

    public C12585l(Context context) {
        this.yandex = context.getApplicationContext();
    }

    public static AbstractBinderC16643l amazon(PackageInfo packageInfo, AbstractBinderC16643l... abstractBinderC16643lArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC16593l binderC16593l = new BinderC16593l(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC16643lArr.length; i++) {
                if (abstractBinderC16643lArr[i].equals(binderC16593l)) {
                    return abstractBinderC16643lArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean crashlytics(PackageInfo packageInfo, boolean z) {
        C11556l c11556l;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                C11556l c11556l2 = z ? AbstractC3767l.crashlytics : AbstractC3767l.loadAd;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        C4583l c4583l = AbstractC12128l.f24146l;
                        Object[] objArr = {byteArray};
                        AbstractC3979l.license(1, objArr);
                        c11556l = new C11556l(1, objArr);
                    } else {
                        C4583l c4583l2 = AbstractC12128l.f24146l;
                        c11556l = C11556l.f23230l;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        C4583l c4583l3 = AbstractC12128l.f24146l;
                        c11556l = C11556l.f23230l;
                    } else {
                        C4583l c4583l4 = AbstractC12128l.f24146l;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Alert.DURATION_SHOW_INDEFINITELY;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        c11556l = i4 == 0 ? C11556l.f23230l : new C11556l(i4, objArrCopyOf);
                    }
                }
                if (c11556l.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                AbstractC12128l abstractC12128lVip = c11556l.vip();
                int size = abstractC12128lVip.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) abstractC12128lVip.get(i6);
                    C4583l c4583lListIterator = c11556l2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!c4583lListIterator.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) c4583lListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? amazon(packageInfo, AbstractC3767l.yandex) : amazon(packageInfo, AbstractC3767l.yandex[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static C12585l yandex(Context context) {
        AbstractC1051l.subs(context);
        synchronized (C12585l.class) {
            try {
                if (crashlytics == null) {
                    AbstractC17035l.yandex(context);
                    crashlytics = new C12585l(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01f0 A[EDGE_INSN: B:128:0x01f0->B:103:0x01f0 BREAK  A[LOOP:0: B:8:0x0018->B:98:0x01de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:98:0x01de A[LOOP:0: B:8:0x0018->B:98:0x01de, LOOP_END] */
    public final boolean loadAd(int i) {
        C8634l c8634lM2337throws;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.yandex.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            c8634lM2337throws = C8634l.m2337throws("no pkgs");
        } else {
            c8634lM2337throws = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    AbstractC1051l.subs(c8634lM2337throws);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    c8634lM2337throws = C8634l.m2337throws("null pkg");
                } else {
                    if (str.equals(this.loadAd)) {
                        c8634lM2337throws = C8634l.f17791l;
                    } else {
                        BinderC9628l binderC9628l = AbstractC17035l.yandex;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                AbstractC17035l.loadAd();
                                boolean zM1506l = ((C4151l) AbstractC17035l.crashlytics).m1506l();
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                if (zM1506l) {
                                    boolean zYandex = AbstractC4197l.yandex(this.yandex);
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                    try {
                                        AbstractC1051l.subs(AbstractC17035l.purchase);
                                        try {
                                            AbstractC17035l.loadAd();
                                            AbstractC1051l.subs(AbstractC17035l.purchase);
                                            Context context = (Context) BinderC14844l.m3897l(BinderC14844l.m3896l(new BinderC14844l(AbstractC17035l.purchase)));
                                            try {
                                                C4151l c4151l = (C4151l) AbstractC17035l.crashlytics;
                                                Parcel parcelM743l = c4151l.m743l();
                                                int i3 = AbstractC2020l.yandex;
                                                parcelM743l.writeInt(1);
                                                int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
                                                AbstractC9968l.vip(parcelM743l, 1, str);
                                                AbstractC9968l.subscription(parcelM743l, 2, 4);
                                                parcelM743l.writeInt(zYandex ? 1 : 0);
                                                AbstractC9968l.subscription(parcelM743l, 3, 4);
                                                parcelM743l.writeInt(0);
                                                AbstractC9968l.admob(parcelM743l, 4, new BinderC14844l(context));
                                                AbstractC9968l.subscription(parcelM743l, 5, 4);
                                                parcelM743l.writeInt(0);
                                                AbstractC9968l.subscription(parcelM743l, 6, 4);
                                                parcelM743l.writeInt(1);
                                                AbstractC9968l.subscription(parcelM743l, 8, 4);
                                                parcelM743l.writeInt(0);
                                                AbstractC9968l.Signature(parcelM743l, iTapsense);
                                                Parcel parcelM748l = c4151l.m748l(parcelM743l, 6);
                                                C13438l c13438l = (C13438l) AbstractC2020l.yandex(parcelM748l, C13438l.CREATOR);
                                                parcelM748l.recycle();
                                                if (c13438l.f26377l) {
                                                    AbstractC11994l.metrica(c13438l.f26379l);
                                                    Object obj = null;
                                                    c8634lM2337throws = new C8634l(true, obj, obj, 0);
                                                } else {
                                                    String str2 = c13438l.f26376l;
                                                    PackageManager.NameNotFoundException nameNotFoundException = AbstractC8532l.smaato(c13438l.f26375l) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                    if (str2 == null) {
                                                        str2 = "error checking package certificate";
                                                    }
                                                    AbstractC11994l.metrica(c13438l.f26379l);
                                                    AbstractC8532l.smaato(c13438l.f26375l);
                                                    c8634lM2337throws = new C8634l(false, (Object) str2, (Object) nameNotFoundException, (int) (0 == true ? 1 : 0));
                                                }
                                            } catch (RemoteException e) {
                                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                                c8634lM2337throws = C8634l.m2336package("module call", e);
                                            }
                                        } catch (C2315l e2) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                            c8634lM2337throws = C8634l.m2336package("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                        }
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    } catch (Throwable th) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                        throw th;
                                    }
                                } else {
                                    try {
                                        PackageInfo packageInfo = this.yandex.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                        boolean zYandex2 = AbstractC4197l.yandex(this.yandex);
                                        if (packageInfo == null) {
                                            c8634lM2337throws = C8634l.m2337throws("null pkg");
                                        } else {
                                            Signature[] signatureArr = packageInfo.signatures;
                                            if (signatureArr == null || signatureArr.length != 1) {
                                                c8634lM2337throws = C8634l.m2337throws("single cert required");
                                            } else {
                                                BinderC16593l binderC16593l = new BinderC16593l(packageInfo.signatures[0].toByteArray());
                                                String str3 = packageInfo.packageName;
                                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    C8634l c8634lCrashlytics = AbstractC17035l.crashlytics(str3, binderC16593l, zYandex2, false);
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    if (c8634lCrashlytics.f17793l && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                        try {
                                                            C8634l c8634lCrashlytics2 = AbstractC17035l.crashlytics(str3, binderC16593l, false, true);
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            if (c8634lCrashlytics2.f17793l) {
                                                                c8634lM2337throws = C8634l.m2337throws("debuggable release cert app rejected");
                                                            }
                                                        } catch (Throwable th2) {
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            throw th2;
                                                        }
                                                    }
                                                    c8634lM2337throws = c8634lCrashlytics;
                                                } catch (Throwable th3) {
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (c8634lM2337throws.f17793l) {
                                            this.loadAd = str;
                                        }
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        c8634lM2337throws = C8634l.m2336package("no pkg ".concat(str), e3);
                                    }
                                }
                            } catch (RemoteException | C2315l e4) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            }
                            if (c8634lM2337throws.f17793l) {
                                this.loadAd = str;
                            }
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    }
                    if (c8634lM2337throws.f17793l) {
                        break;
                    }
                    i2++;
                }
                if (c8634lM2337throws.f17793l) {
                    break;
                    break;
                }
                i2++;
            }
        }
        if (!c8634lM2337throws.f17793l && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) c8634lM2337throws.f17795l;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", c8634lM2337throws.applovin(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", c8634lM2337throws.applovin());
            }
        }
        return c8634lM2337throws.f17793l;
    }
}

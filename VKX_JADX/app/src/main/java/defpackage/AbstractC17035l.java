package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: lَٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17035l {
    public static final Object amazon;
    public static volatile InterfaceC0173l crashlytics;
    public static final BinderC9628l loadAd;
    public static Context purchase;
    public static final BinderC9628l yandex;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new BinderC9628l("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset), 0);
        new BinderC9628l("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset), 1);
        new BinderC9628l("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset), 2);
        new BinderC9628l("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset), 3);
        yandex = new BinderC9628l("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset), 4);
        loadAd = new BinderC9628l("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset), 5);
        amazon = new Object();
    }

    public static C8634l crashlytics(String str, BinderC16593l binderC16593l, boolean z, boolean z2) {
        try {
            loadAd();
            AbstractC1051l.subs(purchase);
            try {
                InterfaceC0173l interfaceC0173l = crashlytics;
                BinderC14844l binderC14844l = new BinderC14844l(purchase.getPackageManager());
                C4151l c4151l = (C4151l) interfaceC0173l;
                Parcel parcelM743l = c4151l.m743l();
                int i = AbstractC2020l.yandex;
                boolean z3 = true;
                parcelM743l.writeInt(1);
                int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
                AbstractC9968l.vip(parcelM743l, 1, str);
                AbstractC9968l.admob(parcelM743l, 2, binderC16593l);
                AbstractC9968l.subscription(parcelM743l, 3, 4);
                parcelM743l.writeInt(z ? 1 : 0);
                AbstractC9968l.subscription(parcelM743l, 4, 4);
                parcelM743l.writeInt(z2 ? 1 : 0);
                AbstractC9968l.Signature(parcelM743l, iTapsense);
                AbstractC2020l.loadAd(parcelM743l, binderC14844l);
                Parcel parcelM748l = c4151l.m748l(parcelM743l, 5);
                if (parcelM748l.readInt() == 0) {
                    z3 = false;
                }
                parcelM748l.recycle();
                return z3 ? C8634l.f17791l : new C8437l(new CallableC6225l(z, str, binderC16593l));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C8634l.m2336package("module call", e);
            }
        } catch (C2315l e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C8634l.m2336package("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    public static void loadAd() {
        InterfaceC0173l c4151l;
        if (crashlytics != null) {
            return;
        }
        AbstractC1051l.subs(purchase);
        synchronized (amazon) {
            try {
                if (crashlytics == null) {
                    IBinder iBinderLoadAd = C7269l.crashlytics(purchase, C7269l.purchase, "com.google.android.gms.googlecertificates").loadAd("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = AbstractBinderC12229l.billing;
                    if (iBinderLoadAd == null) {
                        c4151l = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderLoadAd.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c4151l = iInterfaceQueryLocalInterface instanceof InterfaceC0173l ? (InterfaceC0173l) iInterfaceQueryLocalInterface : new C4151l(iBinderLoadAd, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    crashlytics = c4151l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void yandex(Context context) {
        if (purchase != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            purchase = context.getApplicationContext();
        }
    }
}

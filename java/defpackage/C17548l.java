package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.car.app.navigation.model.Maneuver;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: lٗۦَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17548l extends ThreadLocal {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17548l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.yandex) {
            case 0:
                try {
                    return (Cipher) C12437l.loadAd.yandex.appmetrica("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    C11983l.ads(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) C12437l.loadAd.yandex.appmetrica("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    C11983l.ads(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) C12437l.loadAd.yandex.appmetrica("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    C11983l.ads(e3);
                    return null;
                }
            case 3:
                try {
                    Cipher cipher = (Cipher) C12437l.loadAd.yandex.appmetrica("AES/GCM-SIV/NoPadding");
                    if (C10578l.crashlytics(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e4) {
                    C11983l.ads(e4);
                    return null;
                }
            case 4:
                try {
                    return (Cipher) C12437l.loadAd.yandex.appmetrica("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e5) {
                    C11983l.ads(e5);
                    return null;
                }
            case 5:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C13896l c13896l = new C13896l(choreographer, AbstractC15300l.billing(looperMyLooper));
                    return AbstractC10586l.billing(c13896l, c13896l.f27169l);
                }
                C8339l.smaato("no Looper on this thread");
                return null;
            case 6:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC11432l.yandex);
                return simpleDateFormat;
            case 7:
                return new Random();
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return AbstractC12272l.admob();
                }
                if (Looper.myLooper() != null) {
                    return new ScheduledExecutorServiceC10335l(new Handler(Looper.myLooper()));
                }
                return null;
            case 9:
                try {
                    return (Cipher) C12437l.loadAd.yandex.appmetrica("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e6) {
                    C11983l.ads(e6);
                    return null;
                }
            case 10:
                Provider providerMopub = AbstractC17764l.mopub();
                if (providerMopub == null) {
                    int i = Conscrypt.yandex;
                    provider = (Provider) Conscrypt.class.getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerMopub);
                    } catch (GeneralSecurityException unused) {
                        try {
                            int i2 = Conscrypt.yandex;
                            provider = (Provider) Conscrypt.class.getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 11:
                return new PathMeasure();
            case 12:
                return new Path();
            case 13:
                return new Path();
            case 14:
                return new float[4];
            case 15:
                return Boolean.FALSE;
            case 16:
                C11321l c11321l = new C11321l();
                c11321l.f22815l = 0;
                return c11321l;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 0L;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC12704l.amazon(Thread.currentThread());
                C9226l c9226l = new C9226l();
                c9226l.yandex = false;
                c9226l.loadAd = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = AbstractC10540l.crashlytics;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, c9226l);
                    break;
                }
                return c9226l;
            default:
                return new Random();
        }
    }
}

package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Typeface;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lّؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1214l {
    public static final C15578l yandex = new C15578l(-1354776900, false, new C6971l(5));
    public static final C15578l loadAd = new C15578l(456385052, false, new C6971l(6));
    public static final C15578l crashlytics = new C15578l(1753377416, false, new C4076l(22));
    public static final C15578l amazon = new C15578l(-813842497, false, new C4076l(23));
    public static final C15578l purchase = new C15578l(12814930, false, new C4076l(24));

    public static final C1735l amazon(C2106l c2106l, C15876l c15876l) {
        try {
            return new C1735l(LocalDateTime.ofInstant(Instant.ofEpochSecond(c2106l.f4736l, c2106l.f4735l), c15876l.yandex));
        } catch (DateTimeException e) {
            throw new C6451l(1, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object crashlytics(int i, Object obj, C3407l c3407l, C6886l c6886l, int i2) {
        byte b;
        byte b2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) == 0 || AbstractC8576l.yandex(c3407l.loadAd, c6886l)) {
            b = false;
        } else {
            C6886l c6886l2 = C6886l.f14423l;
            if (c6886l.compareTo(c6886l2) < 0 || AbstractC8576l.subs(c3407l.loadAd.f14426l, c6886l2.f14426l) >= 0) {
                b = false;
            } else {
                b = true;
            }
        }
        if ((i & 2) != 0) {
            c3407l.getClass();
            if (i2 == 0) {
                b2 = false;
            } else {
                b2 = true;
            }
        } else {
            b2 = false;
        }
        if (b2 != true && b != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = b != false ? c6886l.f14426l : c3407l.loadAd.f14426l;
            if (b2 != true) {
                c3407l.getClass();
            } else if (i2 == 1) {
                z = true;
            }
            return AbstractC13950l.mopub((Typeface) obj, i4, z);
        }
        byte b3 = b2 == true && i2 == 1;
        if (b3 == true && b == true) {
            i3 = 3;
        } else if (b == true) {
            i3 = 1;
        } else if (b3 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean loadAd(AbstractC18643l abstractC18643l) {
        InterfaceC0042l interfaceC0042l = abstractC18643l instanceof InterfaceC0042l ? (InterfaceC0042l) abstractC18643l : null;
        return interfaceC0042l != null && interfaceC0042l.billing();
    }

    public static final void yandex(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    AbstractC12589l.m3425synchronized(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    AbstractC11718l.yandex(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (autoCloseable instanceof ExecutorService) {
                AbstractC14238l.vip((ExecutorService) autoCloseable);
                return;
            }
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            }
            if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else if (autoCloseable instanceof ContentProviderClient) {
                ((ContentProviderClient) autoCloseable).release();
            } else {
                C11983l.crashlytics();
            }
        }
    }
}

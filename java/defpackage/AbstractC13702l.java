package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: lْ۟ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13702l {
    public static boolean loadAd = true;
    public static C5197l yandex;

    public static final C5197l amazon() {
        C5197l c5197l = yandex;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(9.0f, 16.17f);
        c15659l.amazon(5.53f, 12.7f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.purchase(4.18f, 4.18f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.amazon(20.29f, 7.71f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.amazon(9.0f, 16.17f);
        c15659l.yandex();
        C10943l.yandex(c10943l, c15659l.f30611l, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        yandex = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static void billing(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC4178l.loadAd(viewGroup, z);
        } else if (loadAd) {
            try {
                AbstractC4178l.loadAd(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                loadAd = false;
            }
        }
    }

    public static /* synthetic */ InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, C2403l c2403l, int i) {
        if ((i & 2) != 0) {
            c2403l = null;
        }
        return loadAd(interfaceC17242l, true, c2403l);
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, boolean z, C2403l c2403l) {
        return interfaceC17242l.premium(z ? new C16476l(c2403l) : C4346l.f8873l);
    }

    public static final C11033l mopub(List list) {
        int size = list.size();
        if (size == 0) {
            return new C11033l();
        }
        if (size == 1) {
            return AbstractC15684l.purchase(list.get(0));
        }
        C11033l c11033l = new C11033l();
        c11033l.addAll(list);
        return c11033l;
    }

    public static final InterfaceC12973l purchase(C7819l c7819l, C11268l c11268l) {
        InterfaceC3710l interfaceC3710l = c7819l.crashlytics;
        if (!(interfaceC3710l instanceof C2672l)) {
            return new C7026l(15, c11268l);
        }
        ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635lYandex = AbstractC7477l.yandex(((C2672l) interfaceC3710l).f5804l);
        synchronized (viewOnAttachStateChangeListenerC5635lYandex) {
            C8196l c8196l = viewOnAttachStateChangeListenerC5635lYandex.f11992l;
            if (c8196l != null) {
                Bitmap.Config[] configArr = AbstractC4032l.yandex;
                if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper()) && viewOnAttachStateChangeListenerC5635lYandex.f11993l) {
                    viewOnAttachStateChangeListenerC5635lYandex.f11993l = false;
                    c8196l.f17099l = c11268l;
                    return c8196l;
                }
            }
            C7504l c7504l = viewOnAttachStateChangeListenerC5635lYandex.f11991l;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            viewOnAttachStateChangeListenerC5635lYandex.f11991l = null;
            C8196l c8196l2 = new C8196l();
            c8196l2.f17099l = c11268l;
            viewOnAttachStateChangeListenerC5635lYandex.f11992l = c8196l2;
            return c8196l2;
        }
    }

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(C2990l.f6492l);
    }
}

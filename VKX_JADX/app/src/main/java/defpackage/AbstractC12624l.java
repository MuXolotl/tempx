package defpackage;

import android.content.Intent;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12624l {
    public final ServiceConnectionC12617l amazon = new ServiceConnectionC12617l(this);
    public boolean crashlytics;
    public InterfaceC7702l loadAd;
    public final Class yandex;

    public AbstractC12624l(Class cls) {
        this.yandex = cls;
    }

    public final void yandex(InterfaceC7702l interfaceC7702l, boolean z) {
        C8688l c8688l = C2490l.subs;
        if (!AbstractC12832l.crashlytics().loadAd.ads()) {
            C5374l c5374l = VKXApplication.f36626l;
            if (c5374l == null) {
                c5374l = null;
            }
            if (!((Boolean) ((C7549l) c5374l.billing.admob).f15551l.getValue()).booleanValue()) {
                return;
            }
        }
        if (this.crashlytics || !z) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            AbstractC12832l.mopub(interfaceC7702l, vKXApplication != null ? vKXApplication : null);
            return;
        }
        this.loadAd = interfaceC7702l;
        try {
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            Intent intent = new Intent(vKXApplication2, (Class<?>) this.yandex);
            VKXApplication vKXApplication3 = VKXApplication.f36631l;
            if (vKXApplication3 == null) {
                vKXApplication3 = null;
            }
            vKXApplication3.getApplicationContext().startService(intent);
            VKXApplication vKXApplication4 = VKXApplication.f36631l;
            (vKXApplication4 != null ? vKXApplication4 : null).getApplicationContext().bindService(intent, this.amazon, 1);
        } catch (Throwable unused) {
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: lؘؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7075l {
    public final Bundle amazon;
    public final int crashlytics;
    public final C2350l loadAd = new C2350l();
    public final /* synthetic */ int purchase;
    public final int yandex;

    public C7075l(int i, int i2, Bundle bundle, int i3) {
        this.purchase = i3;
        this.yandex = i;
        this.crashlytics = i2;
        this.amazon = bundle;
    }

    public final void crashlytics(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.loadAd.loadAd(bundle);
    }

    public final void loadAd(C10756l c10756l) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c10756l.toString());
        }
        this.loadAd.yandex(c10756l);
    }

    public final String toString() {
        return "Request { what=" + this.crashlytics + " id=" + this.yandex + " oneWay=" + yandex() + "}";
    }

    public final boolean yandex() {
        switch (this.purchase) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}

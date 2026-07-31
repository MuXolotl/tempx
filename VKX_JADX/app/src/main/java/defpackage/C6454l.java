package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Objects;

/* JADX INFO: renamed from: lؙٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6454l implements InterfaceC5259l {
    public static final String admob;
    public static final String billing;
    public static final String firebase;
    public static final String isPro;
    public static final String mopub;
    public static final String subs;
    public final String amazon;
    public final ComponentName crashlytics;
    public final int loadAd;
    public final Bundle purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        billing = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        admob = Integer.toString(2, 36);
        subs = Integer.toString(3, 36);
        isPro = Integer.toString(4, 36);
        firebase = Integer.toString(5, 36);
    }

    public C6454l(ComponentName componentName, int i) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        AbstractC12442l.admob((Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT == 36) || !TextUtils.isEmpty(packageName));
        this.yandex = i;
        this.loadAd = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        this.crashlytics = componentName;
        this.amazon = packageName;
        this.purchase = bundle;
    }

    @Override // defpackage.InterfaceC5259l
    public final Bundle admob() {
        Bundle bundle = new Bundle();
        bundle.putBundle(billing, null);
        bundle.putInt(mopub, this.yandex);
        bundle.putInt(admob, this.loadAd);
        bundle.putParcelable(subs, this.crashlytics);
        bundle.putString(isPro, this.amazon);
        bundle.putBundle(firebase, this.purchase);
        return bundle;
    }

    @Override // defpackage.InterfaceC5259l
    public final Object amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC5259l
    public final int billing() {
        return 0;
    }

    @Override // defpackage.InterfaceC5259l
    public final ComponentName crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6454l)) {
            return false;
        }
        C6454l c6454l = (C6454l) obj;
        int i = c6454l.loadAd;
        int i2 = this.loadAd;
        if (i2 != i) {
            return false;
        }
        if (i2 == 100) {
            return true;
        }
        if (i2 != 101) {
            return false;
        }
        return Objects.equals(this.crashlytics, c6454l.crashlytics);
    }

    @Override // defpackage.InterfaceC5259l
    public final Bundle getExtras() {
        return new Bundle(this.purchase);
    }

    @Override // defpackage.InterfaceC5259l
    public final String getServiceName() {
        ComponentName componentName = this.crashlytics;
        return componentName == null ? "" : componentName.getClassName();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.loadAd), this.crashlytics, null);
    }

    @Override // defpackage.InterfaceC5259l
    public final int loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC5259l
    public final String mopub() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC5259l
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.InterfaceC5259l
    public final MediaSession.Token subs() {
        return null;
    }

    public final String toString() {
        return AbstractC14814l.remoteconfig(this.yandex, "}", new StringBuilder("SessionToken {legacy, uid="));
    }

    @Override // defpackage.InterfaceC5259l
    public final int yandex() {
        return this.loadAd != 101 ? 0 : 2;
    }
}

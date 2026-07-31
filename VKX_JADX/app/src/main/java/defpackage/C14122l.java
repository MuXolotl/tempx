package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: renamed from: lّْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14122l {
    public final int amazon;
    public String billing;
    public final Class crashlytics;
    public final int loadAd;
    public Bundle mopub;
    public boolean purchase;
    public final AbstractServiceC3639l yandex;

    public C14122l(AbstractServiceC3639l abstractServiceC3639l, int i, Class cls) {
        this.yandex = abstractServiceC3639l;
        this.loadAd = i;
        int iAmazon = amazon(i);
        this.amazon = iAmazon;
        AbstractC12442l.admob(crashlytics(iAmazon));
        this.crashlytics = cls;
        this.purchase = false;
        this.billing = null;
        this.mopub = Bundle.EMPTY;
    }

    public static int amazon(int i) {
        if (i == 1) {
            return 85;
        }
        if (i == 3) {
            return 86;
        }
        if (i == 11) {
            return 89;
        }
        if (i == 12) {
            return 90;
        }
        switch (i) {
            case 6:
            case 7:
                return 88;
            case 8:
            case 9:
                return 87;
            default:
                return 0;
        }
    }

    public static boolean crashlytics(int i) {
        return i == 87 || i == 88 || i == 86 || i == 90 || i == 89 || i == 85;
    }

    public static Intent loadAd(Context context, int i, Bundle bundle, String str, Class cls) {
        AbstractC12442l.admob(crashlytics(i));
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(C3726l.purchase(str));
        intent.setComponent(new ComponentName(context, (Class<?>) cls));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public final PendingIntent yandex() {
        int i = Build.VERSION.SDK_INT;
        Class cls = this.crashlytics;
        int i2 = this.amazon;
        AbstractServiceC3639l abstractServiceC3639l = this.yandex;
        return (i >= 26 && this.purchase && this.loadAd == 1) ? PendingIntent.getForegroundService(abstractServiceC3639l, i2, loadAd(abstractServiceC3639l, i2, this.mopub, this.billing, cls), 201326592) : PendingIntent.getService(abstractServiceC3639l, i2, loadAd(abstractServiceC3639l, i2, this.mopub, this.billing, cls), 201326592);
    }
}

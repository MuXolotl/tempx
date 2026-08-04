package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُِؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11757l {
    public String adcel;
    public IconCompat admob;
    public final boolean advert;
    public CharSequence billing;
    public int isPro;
    public final Notification isVip;
    public int metrica;
    public PendingIntent mopub;
    public String pro;
    public CharSequence purchase;
    public Cgoto remoteconfig;
    public final ArrayList signatures;
    public boolean smaato;
    public int startapp;
    public int subs;
    public String subscription;
    public Bundle tapsense;
    public CharSequence vip;
    public final Context yandex;
    public final ArrayList loadAd = new ArrayList();
    public final ArrayList crashlytics = new ArrayList();
    public final ArrayList amazon = new ArrayList();
    public boolean firebase = true;
    public boolean ads = false;
    public int Signature = 0;
    public int license = 0;
    public int ad = 0;

    public C11757l(Context context, String str) {
        Notification notification = new Notification();
        this.isVip = notification;
        this.yandex = context;
        this.pro = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.isPro = 0;
        this.signatures = new ArrayList();
        this.advert = true;
    }

    public static CharSequence crashlytics(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void amazon(CharSequence charSequence) {
        this.billing = crashlytics(charSequence);
    }

    public final void billing(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.yandex.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.firebase;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.loadAd = bitmap;
            iconCompat = iconCompat2;
        }
        this.admob = iconCompat;
    }

    public final Notification loadAd() {
        Notification notificationBuild;
        Bundle bundle;
        String strMo212l;
        C10038l c10038l = new C10038l(this);
        C11757l c11757l = (C11757l) c10038l.f20466l;
        Cgoto cgoto = c11757l.remoteconfig;
        if (cgoto != null) {
            cgoto.mo229l(c10038l);
        }
        Notification.Builder builder = (Notification.Builder) c10038l.f20462l;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            builder.setExtras((Bundle) c10038l.f20465l);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (cgoto != null) {
            c11757l.remoteconfig.getClass();
        }
        if (cgoto != null && (bundle = notificationBuild.extras) != null && (strMo212l = cgoto.mo212l()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo212l);
        }
        return notificationBuild;
    }

    public final void mopub(Cgoto cgoto) {
        if (this.remoteconfig != cgoto) {
            this.remoteconfig = cgoto;
            if (((C11757l) cgoto.f833l) != this) {
                cgoto.f833l = this;
                mopub(cgoto);
            }
        }
    }

    public final void purchase(int i, boolean z) {
        Notification notification = this.isVip;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void yandex(int i, PendingIntent pendingIntent, String str) {
        this.loadAd.add(new C8926l(i != 0 ? IconCompat.crashlytics(null, "", i) : null, str, pendingIntent));
    }
}

package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: lٌٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8926l {
    public final PendingIntent admob;
    public final boolean amazon;
    public final int billing;
    public final AbstractC10278l[] crashlytics;
    public IconCompat loadAd;
    public final CharSequence mopub;
    public final boolean purchase;
    public final Bundle yandex;

    public C8926l(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC10278l[] abstractC10278lArr, boolean z, boolean z2) {
        this.purchase = true;
        this.loadAd = iconCompat;
        if (iconCompat != null && iconCompat.billing() == 2) {
            this.billing = iconCompat.amazon();
        }
        this.mopub = C11757l.crashlytics(charSequence);
        this.admob = pendingIntent;
        this.yandex = bundle == null ? new Bundle() : bundle;
        this.crashlytics = abstractC10278lArr;
        this.amazon = z;
        this.purchase = z2;
    }

    public C8926l(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, true);
    }
}

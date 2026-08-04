package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: lؘؐٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5337l {
    public final int crashlytics;
    public final Configuration loadAd;
    public final ColorStateList yandex;

    public C5337l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.yandex = colorStateList;
        this.loadAd = configuration;
        this.crashlytics = theme == null ? 0 : theme.hashCode();
    }
}

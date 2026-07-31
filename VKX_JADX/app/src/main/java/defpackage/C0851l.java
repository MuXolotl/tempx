package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lٍؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0851l {
    public boolean amazon;
    public boolean crashlytics;
    public final boolean loadAd;
    public final /* synthetic */ C16386l purchase;
    public final String yandex;

    public C0851l(C16386l c16386l, String str, boolean z) {
        this.purchase = c16386l;
        AbstractC1051l.billing(str);
        this.yandex = str;
        this.loadAd = z;
    }

    public final void loadAd(boolean z) {
        SharedPreferences.Editor editorEdit = this.purchase.m4180l().edit();
        editorEdit.putBoolean(this.yandex, z);
        editorEdit.apply();
        this.amazon = z;
    }

    public final boolean yandex() {
        if (!this.crashlytics) {
            this.crashlytics = true;
            this.amazon = this.purchase.m4180l().getBoolean(this.yandex, this.loadAd);
        }
        return this.amazon;
    }
}

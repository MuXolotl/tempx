package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: lٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18434l implements InterfaceC9913l {
    public CharSequence admob;
    public Drawable amazon;
    public Drawable billing;
    public View crashlytics;
    public Window.Callback firebase;
    public CharSequence isPro;
    public int loadAd;
    public Drawable metrica;
    public boolean mopub;
    public Drawable purchase;
    public C0791l remoteconfig;
    public boolean smaato;
    public CharSequence subs;
    public int vip;
    public Toolbar yandex;

    public final void crashlytics() {
        Drawable drawable;
        int i = this.loadAd;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.purchase) == null) {
            drawable = this.amazon;
        }
        this.yandex.setLogo(drawable);
    }

    public final void loadAd() {
        if ((this.loadAd & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.isPro);
            Toolbar toolbar = this.yandex;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.vip);
            } else {
                toolbar.setNavigationContentDescription(this.isPro);
            }
        }
    }

    public final void yandex(int i) {
        View view;
        Toolbar toolbar = this.yandex;
        int i2 = this.loadAd ^ i;
        this.loadAd = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    loadAd();
                }
                if ((this.loadAd & 4) != 0) {
                    Drawable drawable = this.billing;
                    if (drawable == null) {
                        drawable = this.metrica;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                crashlytics();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.admob);
                    toolbar.setSubtitle(this.subs);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.crashlytics) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }
}

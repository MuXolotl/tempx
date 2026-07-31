package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًۜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8288l extends ContextWrapper {
    public static Configuration billing;
    public Configuration amazon;
    public LayoutInflater crashlytics;
    public Resources.Theme loadAd;
    public Resources purchase;
    public int yandex;

    public C8288l(Context context, int i) {
        super(context);
        this.yandex = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.purchase == null) {
            Configuration configuration = this.amazon;
            if (configuration == null) {
                this.purchase = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (billing == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        billing = configuration2;
                    }
                    if (configuration.equals(billing)) {
                        this.purchase = super.getResources();
                    }
                }
                this.purchase = createConfigurationContext(this.amazon).getResources();
            }
        }
        return this.purchase;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.crashlytics == null) {
            this.crashlytics = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.crashlytics;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.loadAd;
        if (theme != null) {
            return theme;
        }
        if (this.yandex == 0) {
            this.yandex = R.style.Theme_AppCompat_Light;
        }
        loadAd();
        return this.loadAd;
    }

    public final void loadAd() {
        if (this.loadAd == null) {
            this.loadAd = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.loadAd.setTo(theme);
            }
        }
        this.loadAd.applyStyle(this.yandex, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.yandex != i) {
            this.yandex = i;
            loadAd();
        }
    }

    public final void yandex(Configuration configuration) {
        if (this.purchase != null) {
            C8339l.smaato("getResources() or getAssets() has already been called");
        } else if (this.amazon == null) {
            this.amazon = new Configuration(configuration);
        } else {
            C8339l.smaato("Override configuration has already been set");
        }
    }
}

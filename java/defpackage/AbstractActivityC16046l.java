package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC16046l extends AbstractActivityC14666l implements InterfaceC17378l {

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f31441l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public LayoutInflaterFactory2C14405l f31443l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f31444l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C14965l f31440l = new C14965l(new C6239l(this));

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C5268l f31439l = new C5268l(this, true);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f31442l = true;

    public AbstractActivityC16046l() {
        final int i = 1;
        ((C18396l) this.f28688l.f26580l).m4528synchronized("android:support:lifecycle", new C8955l(2, this));
        final int i2 = 0;
        admob(new InterfaceC13241l(this) { // from class: l٘ۢٚ
            public final /* synthetic */ AbstractActivityC16046l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractActivityC16046l abstractActivityC16046l = this.loadAd;
                switch (i3) {
                    case 0:
                        abstractActivityC16046l.f31440l.firebase();
                        break;
                    default:
                        abstractActivityC16046l.f31440l.firebase();
                        break;
                }
            }
        });
        this.f28689l.add(new InterfaceC13241l(this) { // from class: l٘ۢٚ
            public final /* synthetic */ AbstractActivityC16046l loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC13241l
            public final void accept(Object obj) {
                int i3 = i;
                AbstractActivityC16046l abstractActivityC16046l = this.loadAd;
                switch (i3) {
                    case 0:
                        abstractActivityC16046l.f31440l.firebase();
                        break;
                    default:
                        abstractActivityC16046l.f31440l.firebase();
                        break;
                }
            }
        });
        subs(new C11717l(this, i));
    }

    public static boolean vip(C13734l c13734l) {
        boolean zVip = false;
        for (AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l : c13734l.crashlytics.m2858public()) {
            if (abstractComponentCallbacksC4411l != null) {
                C6239l c6239l = abstractComponentCallbacksC4411l.f8954l;
                if ((c6239l == null ? null : c6239l.f13180l) != null) {
                    zVip |= vip(abstractComponentCallbacksC4411l.billing());
                }
                if (abstractComponentCallbacksC4411l.f8957l.subs.yandex(EnumC8981l.f18524l)) {
                    C5268l c5268l = abstractComponentCallbacksC4411l.f8957l;
                    c5268l.amazon("setCurrentState");
                    c5268l.billing(EnumC8981l.f18520l);
                    zVip = true;
                }
            }
        }
        return zVip;
    }

    public final boolean adcel(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C6239l) this.f31440l.f29441l).f13178l.isPro();
        }
        return false;
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        isPro();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        layoutInflaterFactory2C14405l.advert();
        ((ViewGroup) layoutInflaterFactory2C14405l.f28201l.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C14405l.f28171l.yandex(layoutInflaterFactory2C14405l.f28203l.getCallback());
    }

    public final void ads() {
        super.onPostResume();
        this.f31439l.purchase(EnumC14812l.ON_RESUME);
        C13734l c13734l = ((C6239l) this.f31440l.f29441l).f13178l;
        c13734l.f26812synchronized = false;
        c13734l.f26811strictfp = false;
        c13734l.f26813throw.mopub = false;
        c13734l.Signature(7);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ac A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:102:0x018e, B:104:0x0192, B:110:0x01aa, B:111:0x01ac, B:113:0x01b0, B:119:0x01c0, B:118:0x01b7, B:109:0x01a3), top: B:129:0x018e, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0154  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0187  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        C8288l c8288l;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        layoutInflaterFactory2C14405l.f28178l = true;
        int i38 = layoutInflaterFactory2C14405l.f28197l;
        if (i38 == -100) {
            i38 = AbstractC10242l.f20860l;
        }
        int iM3853throws = layoutInflaterFactory2C14405l.m3853throws(context, i38);
        if (AbstractC10242l.purchase(context)) {
            AbstractC10242l.metrica(context);
        }
        C2462l c2462lAds = LayoutInflaterFactory2C14405l.ads(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C8288l) {
                    try {
                        ((C8288l) context).yandex(LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C14405l.f28163l) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 24) {
                                        AbstractC9374l.yandex(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i6 = configuration.touchscreen;
                                    i7 = configuration2.touchscreen;
                                    if (i6 != i7) {
                                        configuration3.touchscreen = i7;
                                    }
                                    i8 = configuration.keyboard;
                                    i9 = configuration2.keyboard;
                                    if (i8 != i9) {
                                        configuration3.keyboard = i9;
                                    }
                                    i10 = configuration.keyboardHidden;
                                    i11 = configuration2.keyboardHidden;
                                    if (i10 != i11) {
                                        configuration3.keyboardHidden = i11;
                                    }
                                    i12 = configuration.navigation;
                                    i13 = configuration2.navigation;
                                    if (i12 != i13) {
                                        configuration3.navigation = i13;
                                    }
                                    i14 = configuration.navigationHidden;
                                    i15 = configuration2.navigationHidden;
                                    if (i14 != i15) {
                                        configuration3.navigationHidden = i15;
                                    }
                                    i16 = configuration.orientation;
                                    i17 = configuration2.orientation;
                                    if (i16 != i17) {
                                        configuration3.orientation = i17;
                                    }
                                    i18 = configuration.screenLayout & 15;
                                    i19 = configuration2.screenLayout & 15;
                                    if (i18 != i19) {
                                        configuration3.screenLayout |= i19;
                                    }
                                    i20 = configuration.screenLayout & 192;
                                    i21 = configuration2.screenLayout & 192;
                                    if (i20 != i21) {
                                        configuration3.screenLayout |= i21;
                                    }
                                    i22 = configuration.screenLayout & 48;
                                    i23 = configuration2.screenLayout & 48;
                                    if (i22 != i23) {
                                        configuration3.screenLayout |= i23;
                                    }
                                    i24 = configuration.screenLayout & 768;
                                    i25 = configuration2.screenLayout & 768;
                                    if (i24 != i25) {
                                        configuration3.screenLayout |= i25;
                                    }
                                    if (i5 >= 26) {
                                        AbstractC5941l.ad(configuration, configuration2, configuration3);
                                    }
                                    i26 = configuration.uiMode & 15;
                                    i27 = configuration2.uiMode & 15;
                                    if (i26 != i27) {
                                        configuration3.uiMode |= i27;
                                    }
                                    i28 = configuration.uiMode & 48;
                                    i29 = configuration2.uiMode & 48;
                                    if (i28 != i29) {
                                        configuration3.uiMode |= i29;
                                    }
                                    i30 = configuration.screenWidthDp;
                                    i31 = configuration2.screenWidthDp;
                                    if (i30 != i31) {
                                        configuration3.screenWidthDp = i31;
                                    }
                                    i32 = configuration.screenHeightDp;
                                    i33 = configuration2.screenHeightDp;
                                    if (i32 != i33) {
                                        configuration3.screenHeightDp = i33;
                                    }
                                    i34 = configuration.smallestScreenWidthDp;
                                    i35 = configuration2.smallestScreenWidthDp;
                                    if (i34 != i35) {
                                        configuration3.smallestScreenWidthDp = i35;
                                    }
                                    i36 = configuration.densityDpi;
                                    i37 = configuration2.densityDpi;
                                    if (i36 != i37) {
                                        configuration3.densityDpi = i37;
                                    }
                                }
                            }
                            Configuration configurationLicense = LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, configuration3, true);
                            c8288l = new C8288l(context, ua.itaysonlab.vkx.R.style.Theme_AppCompat_Empty);
                            c8288l.yandex(configurationLicense);
                            try {
                                if (context.getTheme() != null) {
                                    theme = c8288l.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        AbstractC11880l.m3279package(theme);
                                    } else {
                                        synchronized (AbstractC12081l.yandex) {
                                            if (AbstractC12081l.crashlytics) {
                                                method = AbstractC12081l.loadAd;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    AbstractC12081l.loadAd = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                AbstractC12081l.crashlytics = true;
                                                method = AbstractC12081l.loadAd;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        AbstractC12081l.loadAd = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c8288l;
                        }
                    }
                } else if (LayoutInflaterFactory2C14405l.f28163l) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 24) {
                                AbstractC9374l.yandex(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i5 >= 26) {
                                AbstractC5941l.ad(configuration, configuration2, configuration3);
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            i36 = configuration.densityDpi;
                            i37 = configuration2.densityDpi;
                            if (i36 != i37) {
                                configuration3.densityDpi = i37;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationLicense2 = LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, configuration3, true);
                    c8288l = new C8288l(context, ua.itaysonlab.vkx.R.style.Theme_AppCompat_Empty);
                    c8288l.yandex(configurationLicense2);
                    if (context.getTheme() != null) {
                        theme = c8288l.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC11880l.m3279package(theme);
                        } else {
                            synchronized (AbstractC12081l.yandex) {
                                if (AbstractC12081l.crashlytics) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC12081l.loadAd = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    AbstractC12081l.crashlytics = true;
                                    method = AbstractC12081l.loadAd;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = AbstractC12081l.loadAd;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = c8288l;
                }
            }
        } else if (context instanceof C8288l) {
            ((C8288l) context).yandex(LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, null, false));
        } else if (LayoutInflaterFactory2C14405l.f28163l) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 24) {
                        AbstractC9374l.yandex(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i6 = configuration.touchscreen;
                    i7 = configuration2.touchscreen;
                    if (i6 != i7) {
                        configuration3.touchscreen = i7;
                    }
                    i8 = configuration.keyboard;
                    i9 = configuration2.keyboard;
                    if (i8 != i9) {
                        configuration3.keyboard = i9;
                    }
                    i10 = configuration.keyboardHidden;
                    i11 = configuration2.keyboardHidden;
                    if (i10 != i11) {
                        configuration3.keyboardHidden = i11;
                    }
                    i12 = configuration.navigation;
                    i13 = configuration2.navigation;
                    if (i12 != i13) {
                        configuration3.navigation = i13;
                    }
                    i14 = configuration.navigationHidden;
                    i15 = configuration2.navigationHidden;
                    if (i14 != i15) {
                        configuration3.navigationHidden = i15;
                    }
                    i16 = configuration.orientation;
                    i17 = configuration2.orientation;
                    if (i16 != i17) {
                        configuration3.orientation = i17;
                    }
                    i18 = configuration.screenLayout & 15;
                    i19 = configuration2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration3.screenLayout |= i19;
                    }
                    i20 = configuration.screenLayout & 192;
                    i21 = configuration2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 48;
                    i23 = configuration2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 768;
                    i25 = configuration2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    if (i5 >= 26) {
                        AbstractC5941l.ad(configuration, configuration2, configuration3);
                    }
                    i26 = configuration.uiMode & 15;
                    i27 = configuration2.uiMode & 15;
                    if (i26 != i27) {
                        configuration3.uiMode |= i27;
                    }
                    i28 = configuration.uiMode & 48;
                    i29 = configuration2.uiMode & 48;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.screenWidthDp;
                    i31 = configuration2.screenWidthDp;
                    if (i30 != i31) {
                        configuration3.screenWidthDp = i31;
                    }
                    i32 = configuration.screenHeightDp;
                    i33 = configuration2.screenHeightDp;
                    if (i32 != i33) {
                        configuration3.screenHeightDp = i33;
                    }
                    i34 = configuration.smallestScreenWidthDp;
                    i35 = configuration2.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration3.smallestScreenWidthDp = i35;
                    }
                    i36 = configuration.densityDpi;
                    i37 = configuration2.densityDpi;
                    if (i36 != i37) {
                        configuration3.densityDpi = i37;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationLicense3 = LayoutInflaterFactory2C14405l.license(context, iM3853throws, c2462lAds, configuration3, true);
            c8288l = new C8288l(context, ua.itaysonlab.vkx.R.style.Theme_AppCompat_Empty);
            c8288l.yandex(configurationLicense3);
            if (context.getTheme() != null) {
                theme = c8288l.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC11880l.m3279package(theme);
                } else {
                    synchronized (AbstractC12081l.yandex) {
                        if (AbstractC12081l.crashlytics) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            AbstractC12081l.loadAd = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            AbstractC12081l.crashlytics = true;
                            method = AbstractC12081l.loadAd;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = AbstractC12081l.loadAd;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = c8288l;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C14405l) remoteconfig()).appmetrica();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.AbstractActivityC11746l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C14405l) remoteconfig()).appmetrica();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f31444l);
        printWriter.print(" mResumed=");
        printWriter.print(this.f31441l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f31442l);
        if (getApplication() != null) {
            C7502l c7502l = new C7502l(firebase(), C8011l.crashlytics, C12214l.loadAd);
            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C8011l.class);
            String strBilling = interfaceC1388lLoadAd.billing();
            if (strBilling == null) {
                C8339l.metrica("Local and anonymous classes can not be ViewModels");
                return;
            }
            C18152l c18152l = ((C8011l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling))).loadAd;
            if (c18152l.f35537l > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (c18152l.f35537l > 0) {
                    if (c18152l.billing(0) != null) {
                        C18725l.loadAd();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(c18152l.amazon(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C6239l) this.f31440l.f29441l).f13178l.pro(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        layoutInflaterFactory2C14405l.advert();
        return layoutInflaterFactory2C14405l.f28203l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        if (layoutInflaterFactory2C14405l.f28195l == null) {
            layoutInflaterFactory2C14405l.appmetrica();
            C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
            layoutInflaterFactory2C14405l.f28195l = new C10471l(c5184l != null ? c5184l.loadAd() : layoutInflaterFactory2C14405l.f28206l);
        }
        return layoutInflaterFactory2C14405l.f28195l;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = AbstractC1189l.yandex;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        if (layoutInflaterFactory2C14405l.f28209l != null) {
            layoutInflaterFactory2C14405l.appmetrica();
            layoutInflaterFactory2C14405l.f28209l.getClass();
            layoutInflaterFactory2C14405l.inmobi(0);
        }
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f31440l.firebase();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        if (layoutInflaterFactory2C14405l.f28188l && layoutInflaterFactory2C14405l.f28192l) {
            layoutInflaterFactory2C14405l.appmetrica();
            C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
            if (c5184l != null) {
                c5184l.purchase(c5184l.yandex.getResources().getBoolean(ua.itaysonlab.vkx.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C7862l c7862lYandex = C7862l.yandex();
        Context context = layoutInflaterFactory2C14405l.f28206l;
        synchronized (c7862lYandex) {
            c7862lYandex.yandex.smaato(context);
        }
        layoutInflaterFactory2C14405l.f28184l = new Configuration(layoutInflaterFactory2C14405l.f28206l.getResources().getConfiguration());
        layoutInflaterFactory2C14405l.startapp(false, false);
    }

    @Override // defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31439l.purchase(EnumC14812l.ON_CREATE);
        C13734l c13734l = ((C6239l) this.f31440l.f29441l).f13178l;
        c13734l.f26812synchronized = false;
        c13734l.f26811strictfp = false;
        c13734l.f26813throw.mopub = false;
        c13734l.Signature(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C0025l c0025l = (C0025l) ((C6239l) this.f31440l.f29441l).f13178l.billing.onCreateView(null, str, context, attributeSet);
        return c0025l == null ? super.onCreateView(str, context, attributeSet) : c0025l;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        startapp();
        remoteconfig().admob();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentCrashlytics;
        if (!adcel(i, menuItem)) {
            LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
            layoutInflaterFactory2C14405l.appmetrica();
            C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
            if (menuItem.getItemId() != 16908332 || c5184l == null || (((C18434l) c5184l.purchase).loadAd & 4) == 0 || (intentCrashlytics = AbstractC11718l.crashlytics(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentCrashlytics)) {
                navigateUpTo(intentCrashlytics);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentCrashlytics2 = AbstractC11718l.crashlytics(this);
            if (intentCrashlytics2 == null) {
                intentCrashlytics2 = AbstractC11718l.crashlytics(this);
            }
            if (intentCrashlytics2 != null) {
                ComponentName component = intentCrashlytics2.getComponent();
                if (component == null) {
                    component = intentCrashlytics2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentAmazon = AbstractC11718l.amazon(this, component);
                    while (intentAmazon != null) {
                        arrayList.add(size, intentAmazon);
                        intentAmazon = AbstractC11718l.amazon(this, intentAmazon.getComponent());
                    }
                    arrayList.add(intentCrashlytics2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                C8339l.smaato("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f31441l = false;
        ((C6239l) this.f31440l.f29441l).f13178l.Signature(5);
        this.f31439l.purchase(EnumC14812l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C14405l) remoteconfig()).advert();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        ads();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        layoutInflaterFactory2C14405l.appmetrica();
        C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
        if (c5184l != null) {
            c5184l.tapsense = true;
        }
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f31440l.firebase();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C14965l c14965l = this.f31440l;
        c14965l.firebase();
        super.onResume();
        this.f31441l = true;
        ((C6239l) c14965l.f29441l).f13178l.signatures(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException {
        subscription();
        ((LayoutInflaterFactory2C14405l) remoteconfig()).startapp(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f31440l.firebase();
    }

    @Override // android.app.Activity
    public final void onStop() {
        tapsense();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) remoteconfig();
        layoutInflaterFactory2C14405l.appmetrica();
        C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
        if (c5184l != null) {
            c5184l.tapsense = false;
            C14307l c14307l = c5184l.subscription;
            if (c14307l != null) {
                c14307l.yandex();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        remoteconfig().vip(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C14405l) remoteconfig()).appmetrica();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final AbstractC10242l remoteconfig() {
        if (this.f31443l == null) {
            ExecutorC12937l executorC12937l = AbstractC10242l.f20861l;
            this.f31443l = new LayoutInflaterFactory2C14405l(this, null, this, this);
        }
        return this.f31443l;
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public final void setContentView(int i) {
        isPro();
        remoteconfig().firebase(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C14405l) remoteconfig()).f28189l = i;
    }

    public final void startapp() {
        super.onDestroy();
        ((C6239l) this.f31440l.f29441l).f13178l.smaato();
        this.f31439l.purchase(EnumC14812l.ON_DESTROY);
    }

    public final void subscription() {
        C14965l c14965l = this.f31440l;
        c14965l.firebase();
        C6239l c6239l = (C6239l) c14965l.f29441l;
        super.onStart();
        this.f31442l = false;
        if (!this.f31444l) {
            this.f31444l = true;
            C13734l c13734l = c6239l.f13178l;
            c13734l.f26812synchronized = false;
            c13734l.f26811strictfp = false;
            c13734l.f26813throw.mopub = false;
            c13734l.Signature(4);
        }
        c6239l.f13178l.signatures(true);
        this.f31439l.purchase(EnumC14812l.ON_START);
        C13734l c13734l2 = c6239l.f13178l;
        c13734l2.f26812synchronized = false;
        c13734l2.f26811strictfp = false;
        c13734l2.f26813throw.mopub = false;
        c13734l2.Signature(5);
    }

    public final void tapsense() {
        C14965l c14965l;
        super.onStop();
        this.f31442l = true;
        do {
            c14965l = this.f31440l;
        } while (vip(((C6239l) c14965l.f29441l).f13178l));
        C13734l c13734l = ((C6239l) c14965l.f29441l).f13178l;
        c13734l.f26811strictfp = true;
        c13734l.f26813throw.mopub = true;
        c13734l.Signature(4);
        this.f31439l.purchase(EnumC14812l.ON_STOP);
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public void setContentView(View view) {
        isPro();
        remoteconfig().smaato(view);
    }

    @Override // defpackage.AbstractActivityC14666l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        isPro();
        remoteconfig().remoteconfig(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0025l c0025l = (C0025l) ((C6239l) this.f31440l.f29441l).f13178l.billing.onCreateView(view, str, context, attributeSet);
        return c0025l == null ? super.onCreateView(view, str, context, attributeSet) : c0025l;
    }
}

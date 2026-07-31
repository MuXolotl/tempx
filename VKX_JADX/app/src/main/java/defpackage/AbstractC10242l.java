package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lَِ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10242l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final ExecutorC12937l f20861l = new ExecutorC12937l(new ExecutorC10149l(2));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final int f20860l = -100;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static C2462l f20857l = null;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static C2462l f20863l = null;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static Boolean f20862l = null;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static boolean f20865l = false;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C10834l f20858l = new C10834l(0);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Object f20859l = new Object();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Object f20864l = new Object();

    public static Object crashlytics() {
        Context context;
        C10834l c10834l = f20858l;
        c10834l.getClass();
        C11786l c11786l = new C11786l(c10834l);
        while (c11786l.hasNext()) {
            AbstractC10242l abstractC10242l = (AbstractC10242l) ((WeakReference) c11786l.next()).get();
            if (abstractC10242l != null && (context = ((LayoutInflaterFactory2C14405l) abstractC10242l).f28206l) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static void loadAd() throws IllegalAccessException {
        C2462l c2462l;
        C10834l c10834l = f20858l;
        c10834l.getClass();
        C11786l c11786l = new C11786l(c10834l);
        while (c11786l.hasNext()) {
            AbstractC10242l abstractC10242l = (AbstractC10242l) ((WeakReference) c11786l.next()).get();
            if (abstractC10242l != null) {
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) abstractC10242l;
                Context context = layoutInflaterFactory2C14405l.f28206l;
                int i = 1;
                if (purchase(context) && (c2462l = f20857l) != null && !c2462l.equals(f20863l)) {
                    f20861l.execute(new RunnableC10205l(context, i));
                }
                layoutInflaterFactory2C14405l.startapp(true, true);
            }
        }
    }

    public static void metrica(Context context) {
        if (purchase(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f20865l) {
                    return;
                }
                f20861l.execute(new RunnableC10205l(context, 0));
                return;
            }
            synchronized (f20864l) {
                try {
                    C2462l c2462l = f20857l;
                    if (c2462l == null) {
                        if (f20863l == null) {
                            f20863l = C2462l.loadAd(AbstractC5573l.isPro(context));
                        }
                        if (f20863l.yandex.isEmpty()) {
                        } else {
                            f20857l = f20863l;
                        }
                    } else if (!c2462l.equals(f20863l)) {
                        C2462l c2462l2 = f20857l;
                        f20863l = c2462l2;
                        AbstractC5573l.subs(context, c2462l2.yandex.yandex());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean purchase(Context context) {
        if (f20862l == null) {
            try {
                int i = AppLocalesMetadataHolderService.f64l;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? AbstractC2212l.yandex() | 128 : 640).metaData;
                if (bundle != null) {
                    f20862l = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20862l = Boolean.FALSE;
            }
        }
        return f20862l.booleanValue();
    }

    public static void subs(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l) {
        synchronized (f20859l) {
            try {
                C10834l c10834l = f20858l;
                c10834l.getClass();
                C11786l c11786l = new C11786l(c10834l);
                while (c11786l.hasNext()) {
                    AbstractC10242l abstractC10242l = (AbstractC10242l) ((WeakReference) c11786l.next()).get();
                    if (abstractC10242l == layoutInflaterFactory2C14405l || abstractC10242l == null) {
                        c11786l.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void admob();

    public abstract void amazon();

    public abstract void firebase(int i);

    public abstract boolean isPro(int i);

    public abstract void mopub();

    public abstract void remoteconfig(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void smaato(View view);

    public abstract void vip(CharSequence charSequence);
}

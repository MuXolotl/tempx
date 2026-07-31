package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: lّۤۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12962l {
    public static final String crashlytics;
    public static final String loadAd;
    public final InterfaceC5259l yandex;

    static {
        AbstractC17959l.yandex("media3.session");
        String str = AbstractC15323l.yandex;
        loadAd = Integer.toString(0, 36);
        crashlytics = Integer.toString(1, 36);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public C12962l(Context context, ComponentName componentName) {
        int i;
        int i2;
        int i3;
        AbstractC12442l.metrica(context, "context must not be null");
        PackageManager packageManager = context.getPackageManager();
        try {
            i = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        int i4 = i;
        if (!yandex(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            if (yandex(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
                i3 = 1;
            } else {
                if (!yandex(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                    C10754l.startapp(componentName, ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.", "Failed to resolve SessionToken for ");
                    throw null;
                }
                i2 = 101;
            }
            if (i2 != 101) {
                this.yandex = new C17510l(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
            } else {
                this.yandex = new C6454l(componentName, i4);
            }
        }
        i3 = 2;
        i2 = i3;
        if (i2 != 101) {
            this.yandex = new C17510l(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
        } else {
            this.yandex = new C6454l(componentName, i4);
        }
    }

    public static boolean yandex(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12962l) {
            return this.yandex.equals(((C12962l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        InterfaceC5259l interfaceC5259l = this.yandex;
        boolean z = interfaceC5259l instanceof C17510l;
        String str = loadAd;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(crashlytics, interfaceC5259l.admob());
        return bundle;
    }

    public final String toString() {
        return this.yandex.toString();
    }

    public C12962l(int i, int i2, int i3, String str, InterfaceC4725l interfaceC4725l, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = interfaceC4725l.asBinder();
        bundle.getClass();
        this.yandex = new C17510l(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }
}

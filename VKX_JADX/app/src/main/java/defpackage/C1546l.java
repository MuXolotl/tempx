package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

/* JADX INFO: renamed from: lؚؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1546l extends ContentObserver {
    public final /* synthetic */ InterfaceC8714l loadAd;
    public final /* synthetic */ C18574l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546l(C18574l c18574l, InterfaceC8714l interfaceC8714l, Handler handler) {
        super(handler);
        this.yandex = c18574l;
        this.loadAd = interfaceC8714l;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C18574l c18574l = this.yandex;
        c18574l.getClass();
        boolean z2 = true;
        try {
            if (Settings.System.getInt(c18574l.yandex, "show_password") <= 0) {
                z2 = false;
            }
        } catch (Exception e) {
            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
        }
        this.loadAd.setValue(Boolean.valueOf(z2));
    }
}

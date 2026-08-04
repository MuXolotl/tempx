package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: lَٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10443l {
    public final C8137l loadAd;
    public final C14184l yandex;

    public C10443l(C14184l c14184l, C8137l c8137l, InterfaceC12932l interfaceC12932l, C7909l c7909l) {
        this.yandex = c14184l;
        this.loadAd = c8137l;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.4.");
        c14184l.yandex();
        Context applicationContext = c14184l.yandex.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(c7909l);
            AbstractC10999l.mopub(AbstractC11990l.yandex(interfaceC12932l), null, 0, new C18731l(this, c7909l, null, 24), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}

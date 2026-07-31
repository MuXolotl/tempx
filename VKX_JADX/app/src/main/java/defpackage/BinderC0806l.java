package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: renamed from: lؙؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0806l extends Binder {
    public final C5138l purchase;

    public BinderC0806l(C5138l c5138l) {
        this.purchase = c5138l;
    }

    public final void yandex(C5744l c5744l) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c5744l.yandex;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.purchase.f11181l;
        C2350l c2350l = new C2350l();
        firebaseMessagingService.f765l.execute(new RunnableC10613l(firebaseMessagingService, intent, c2350l, 20));
        c2350l.yandex.loadAd(new ExecutorC11374l(2), new C4568l(18, c5744l));
    }
}

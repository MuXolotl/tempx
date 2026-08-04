package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lِِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0991l implements InterfaceC16000l {
    public static final AtomicReference yandex = new AtomicReference();

    @Override // defpackage.InterfaceC16000l
    public final void yandex(boolean z) {
        synchronized (C14184l.firebase) {
            try {
                for (C14184l c14184l : new ArrayList(C14184l.smaato.values())) {
                    if (c14184l.purchase.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c14184l.subs.iterator();
                        while (it.hasNext()) {
                            C14184l c14184l2 = ((C10397l) it.next()).yandex;
                            if (!z) {
                                ((C2762l) c14184l2.admob.get()).crashlytics();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

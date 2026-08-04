package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٍّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9815l extends BroadcastReceiver {
    public static final AtomicReference loadAd = new AtomicReference();
    public final Context yandex;

    public C9815l(Context context) {
        this.yandex = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C14184l.firebase) {
            try {
                Iterator it = ((C10220l) C14184l.smaato.values()).iterator();
                while (it.hasNext()) {
                    ((C14184l) it.next()).purchase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.yandex.unregisterReceiver(this);
    }
}

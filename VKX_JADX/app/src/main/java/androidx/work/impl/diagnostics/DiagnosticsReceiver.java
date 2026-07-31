package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.C10111l;
import defpackage.C13432l;
import defpackage.C14513l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String yandex = C14513l.applovin("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C14513l c14513lTapsense = C14513l.tapsense();
        String str = yandex;
        c14513lTapsense.vip(str, "Requesting diagnostics");
        try {
            C13432l.crashlytics(context).yandex(new C10111l(DiagnosticsWorker.class).firebase());
        } catch (IllegalStateException e) {
            C14513l.tapsense().ads(str, "WorkManager is not initialized", e);
        }
    }
}

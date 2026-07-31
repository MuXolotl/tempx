package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lٓۧؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14563l extends BroadcastReceiver {
    public static volatile C7026l yandex;

    public static void yandex(Context context, C7026l c7026l) {
        if (yandex == null) {
            synchronized (C14563l.class) {
                try {
                    if (yandex == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new C14563l(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new C14563l(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        yandex = c7026l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        C7026l c7026l = yandex;
        if (c7026l == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        C15635l c15635l = (C15635l) ((ConcurrentHashMap) ((C5321l) c7026l.f14720l).f11449l).get(stringExtra);
        if (c15635l != null) {
            c15635l.yandex.loadAd();
        }
    }
}

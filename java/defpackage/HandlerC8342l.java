package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: lًۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC8342l extends HandlerC4052l {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", AbstractC9361l.Signature(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).crashlytics(Status.f581l);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((C3988l) pair.first).yandex((InterfaceC3736l) pair.second);
        } catch (RuntimeException e) {
            int i2 = BasePendingResult.firebase;
            throw e;
        }
    }
}

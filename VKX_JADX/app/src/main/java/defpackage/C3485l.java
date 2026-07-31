package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: lّؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3485l {
    public Message yandex;

    public final void loadAd() {
        Message message = this.yandex;
        message.getClass();
        message.sendToTarget();
        yandex();
    }

    public final void yandex() {
        this.yandex = null;
        ArrayList arrayList = C14500l.loadAd;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

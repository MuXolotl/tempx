package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lؕۙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3602l extends OrientationEventListener {
    public final /* synthetic */ C4816l loadAd;
    public int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3602l(C4816l c4816l, Context context) {
        super(context);
        this.loadAd = c4816l;
        this.yandex = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        ArrayList<C12892l> arrayList;
        if (i == -1) {
            return;
        }
        if (i >= 315 || i < 45) {
            i2 = 0;
        } else if (i >= 225) {
            i2 = 1;
        } else {
            i2 = i >= 135 ? 2 : 3;
        }
        if (this.yandex != i2) {
            this.yandex = i2;
            synchronized (this.loadAd.f9860l) {
                arrayList = new ArrayList(((HashMap) this.loadAd.f9862l).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (C12892l c12892l : arrayList) {
                c12892l.loadAd.execute(new RunnableC9534l(c12892l, i2, 10));
            }
        }
    }
}

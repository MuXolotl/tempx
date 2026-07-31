package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؗۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5216l extends AbstractC17546l {
    public final /* synthetic */ Matrix amazon;
    public final /* synthetic */ ArrayList crashlytics;

    public C5216l(ArrayList arrayList, Matrix matrix) {
        this.crashlytics = arrayList;
        this.amazon = matrix;
    }

    @Override // defpackage.AbstractC17546l
    public final void yandex(Matrix matrix, C17724l c17724l, int i, Canvas canvas) {
        Iterator it = this.crashlytics.iterator();
        while (it.hasNext()) {
            ((AbstractC17546l) it.next()).yandex(this.amazon, c17724l, i, canvas);
        }
    }
}

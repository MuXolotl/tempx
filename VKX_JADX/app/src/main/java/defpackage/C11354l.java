package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: renamed from: lُۜۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11354l extends AbstractC5294l {
    @Override // defpackage.C5022l
    public final void crashlytics(Canvas canvas) {
        if (this.f11408l.adcel.isEmpty()) {
            super.crashlytics(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        C9107l c9107l = this.f11408l;
        if (i >= 26) {
            canvas.clipOutRect(c9107l.adcel);
        } else {
            canvas.clipRect(c9107l.adcel, Region.Op.DIFFERENCE);
        }
        super.crashlytics(canvas);
        canvas.restore();
    }
}

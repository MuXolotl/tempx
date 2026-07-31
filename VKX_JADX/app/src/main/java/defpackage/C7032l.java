package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: renamed from: lؚؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7032l extends AbstractC6686l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7032l(Context context, int i) {
        super(MeasurementManager.get(context));
        switch (i) {
            case 1:
                super((MeasurementManager) context.getSystemService(MeasurementManager.class));
                break;
            default:
                break;
        }
    }
}

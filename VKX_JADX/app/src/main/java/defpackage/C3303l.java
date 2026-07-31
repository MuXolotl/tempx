package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: renamed from: lَؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3303l implements InterfaceC16182l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C3303l f7043l = new C3303l();

    @Override // defpackage.InterfaceC16182l
    public final InterfaceC14104l crashlytics(View view, boolean z, long j, float f, float f2, boolean z2, InterfaceC13490l interfaceC13490l, float f3) {
        if (z) {
            return new C12168l(new Magnifier(view));
        }
        long jMo869l = interfaceC13490l.mo869l(j);
        float fMo868instanceof = interfaceC13490l.mo868instanceof(f);
        float fMo868instanceof2 = interfaceC13490l.mo868instanceof(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo869l != 9205357640488583168L) {
            builder.setSize(AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo869l >> 32))), AbstractC5573l.ads(Float.intBitsToFloat((int) (jMo869l & 4294967295L))));
        }
        if (!Float.isNaN(fMo868instanceof)) {
            builder.setCornerRadius(fMo868instanceof);
        }
        if (!Float.isNaN(fMo868instanceof2)) {
            builder.setElevation(fMo868instanceof2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new C12168l(builder.build());
    }

    @Override // defpackage.InterfaceC16182l
    public final boolean yandex() {
        return true;
    }
}

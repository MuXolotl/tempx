package defpackage;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: renamed from: lٕۤؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16027l implements Comparator {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f31413l;

    public C16027l(boolean z) {
        this.f31413l = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f31413l ? iSignum * (-1) : iSignum;
    }
}

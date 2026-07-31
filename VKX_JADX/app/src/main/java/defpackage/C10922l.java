package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٌُٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10922l extends AbstractC7439l {
    public final List loadAd;

    public C10922l(Class cls) {
        Object[] declaredMethods = cls.getDeclaredMethods();
        C13617l c13617l = new C13617l(28);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c13617l);
            }
        }
        this.loadAd = Arrays.asList(declaredMethods);
    }

    @Override // defpackage.AbstractC7439l
    public final String loadAd() {
        return AbstractC16901l.m4210case(this.loadAd, "", "<init>(", ")V", C2100l.f4724l, 24);
    }
}

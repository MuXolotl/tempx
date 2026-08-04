package defpackage;

/* JADX INFO: renamed from: lُٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10865l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C10865l c10865l = EnumC1177l.f3165l;
        if (i == 0) {
            return EnumC1177l.LINEAR;
        }
        if (i == 1) {
            return EnumC1177l.FAST_OUT_SLOW_IN;
        }
        if (i != 2) {
            return null;
        }
        return EnumC1177l.SLOW_OUT_FAST_IN;
    }
}

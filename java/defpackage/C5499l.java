package defpackage;

/* JADX INFO: renamed from: lؘؙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5499l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C5499l c5499l = EnumC7878l.f16428l;
        if (i == 0) {
            return EnumC7878l.GENERAL;
        }
        if (i == 1) {
            return EnumC7878l.MAJOR_UPDATE;
        }
        if (i == 2) {
            return EnumC7878l.NEWS;
        }
        if (i == 3) {
            return EnumC7878l.IMPORTANT_PSA;
        }
        if (i == 4) {
            return EnumC7878l.SALE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC7878l.MINOR_UPDATE;
    }
}

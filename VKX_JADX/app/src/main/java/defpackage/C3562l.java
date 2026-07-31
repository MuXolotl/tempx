package defpackage;

/* JADX INFO: renamed from: lؕۗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3562l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C3562l c3562l = EnumC11976l.f23864l;
        if (i == 0) {
            return EnumC11976l.IN_PROGRESS;
        }
        if (i == 1) {
            return EnumC11976l.COMPLETED;
        }
        if (i == 2) {
            return EnumC11976l.FAILED;
        }
        if (i != 3) {
            return null;
        }
        return EnumC11976l.REFUNDED;
    }
}

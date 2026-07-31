package defpackage;

/* JADX INFO: renamed from: lؕۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3609l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C3609l c3609l = EnumC15144l.f29701l;
        if (i == 0) {
            return EnumC15144l.NEW;
        }
        if (i == 1) {
            return EnumC15144l.RUNNABLE;
        }
        if (i == 2) {
            return EnumC15144l.BLOCKED;
        }
        if (i == 3) {
            return EnumC15144l.WAITING;
        }
        if (i == 4) {
            return EnumC15144l.TIMED_WAITING;
        }
        if (i != 5) {
            return null;
        }
        return EnumC15144l.TERMINATED;
    }
}

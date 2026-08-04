package defpackage;

/* JADX INFO: renamed from: lؙۙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6721l extends AbstractC2833l {
    @Override // defpackage.AbstractC2833l
    public final InterfaceC16520l smaato(int i) {
        C6721l c6721l = EnumC6418l.f13431l;
        if (i == 0) {
            return EnumC6418l.Verbose;
        }
        if (i == 1) {
            return EnumC6418l.Debug;
        }
        if (i == 2) {
            return EnumC6418l.Info;
        }
        if (i == 3) {
            return EnumC6418l.Warning;
        }
        if (i != 4) {
            return null;
        }
        return EnumC6418l.Error;
    }
}

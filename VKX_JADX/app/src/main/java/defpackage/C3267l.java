package defpackage;

/* JADX INFO: renamed from: lًؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3267l extends C3797l {
    @Override // defpackage.C3797l, defpackage.InterfaceC12184l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C13886l c13886l;
        byte[] bArr;
        if (interfaceC9719l instanceof C6114l) {
            interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
        }
        C17106l c17106l = (C17106l) interfaceC9719l;
        InterfaceC9719l interfaceC9719l2 = c17106l.f33271l;
        byte[] bArr2 = c17106l.f33272l;
        if (interfaceC9719l2 instanceof C2294l) {
            C2294l c2294l = (C2294l) interfaceC9719l2;
            c13886l = (C13886l) c2294l.f4985l;
            bArr = c2294l.f4984l;
        } else {
            c13886l = (C13886l) interfaceC9719l2;
            bArr = null;
        }
        byte[] bArr3 = c13886l.f27156l;
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int iMetrica = AbstractC10000l.metrica(i4 * 4, bArr3);
                if (((1 << i4) & bArr2[i]) != 0) {
                    i2 += iMetrica;
                } else {
                    i3 += iMetrica;
                }
            }
            byte[] bArr4 = new byte[8];
            AbstractC10000l.smaato(i2, 0, bArr4);
            AbstractC10000l.smaato(i3, 4, bArr4);
            C18390l c18390l = new C18390l(new C10358l());
            c18390l.init(true, new C0272l(new C2294l(new C13886l(bArr3), bArr), bArr4, 0, 8));
            c18390l.tapsense(0, 0, bArr3, bArr3);
            c18390l.tapsense(8, 8, bArr3, bArr3);
            c18390l.tapsense(16, 16, bArr3, bArr3);
            c18390l.tapsense(24, 24, bArr3, bArr3);
        }
        C13886l c13886l2 = new C13886l(bArr3);
        if (bArr != null) {
            super.init(z, new C17106l(new C2294l(c13886l2, bArr), bArr2));
        } else {
            super.init(z, new C17106l(c13886l2, bArr2));
        }
    }
}

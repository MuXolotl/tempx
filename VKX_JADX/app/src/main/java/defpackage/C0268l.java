package defpackage;

/* JADX INFO: renamed from: lّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0268l extends AbstractC5554l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C0869l f1266l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f1267l;

    public static C0869l yandex(C0869l c0869l) {
        C0869l c0869l2 = new C0869l();
        C0268l c0268l = new C0268l(c0869l2);
        c0268l.f1267l = false;
        c0268l.f1266l = c0869l2;
        c0869l.mo701catch(c0268l);
        return c0869l2;
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void mo390break(C0869l c0869l, long j) {
        C0869l c0869l2 = this.f1266l;
        for (int i = 0; i < j; i++) {
            byte b = c0869l.readByte();
            if (this.f1267l) {
                c0869l2.m709instanceof(-1);
                this.f1267l = false;
                if (b != 0) {
                    if (-1 != b) {
                        this.f1267l = false;
                        c0869l2.m709instanceof(b);
                    } else {
                        this.f1267l = true;
                    }
                }
            } else if (-1 == b) {
                this.f1267l = true;
            } else {
                c0869l2.m709instanceof(b);
            }
        }
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() {
        C0869l c0869l = this.f1266l;
        if (this.f1267l) {
            c0869l.m709instanceof(255);
            this.f1267l = false;
        }
        c0869l.getClass();
    }
}

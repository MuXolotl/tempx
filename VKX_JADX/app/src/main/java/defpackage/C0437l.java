package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؑٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0437l extends AbstractC15951l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f1608l;

    public C0437l(C17963l c17963l, int i) {
        this.f1608l = i;
        this.f31320l = c17963l;
        this.f31318l = -1;
        this.f31317l = c17963l.f34959l;
        billing();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1608l) {
            case 0:
                crashlytics();
                int i = this.f31319l;
                C17963l c17963l = (C17963l) this.f31320l;
                if (i >= c17963l.f34967l) {
                    C4875l.firebase();
                    return null;
                }
                this.f31319l = i + 1;
                this.f31318l = i;
                C14554l c14554l = new C14554l(c17963l, i);
                billing();
                return c14554l;
            case 1:
                crashlytics();
                int i2 = this.f31319l;
                C17963l c17963l2 = (C17963l) this.f31320l;
                if (i2 >= c17963l2.f34967l) {
                    C4875l.firebase();
                    return null;
                }
                this.f31319l = i2 + 1;
                this.f31318l = i2;
                Object obj = c17963l2.f34961l[i2];
                billing();
                return obj;
            default:
                crashlytics();
                int i3 = this.f31319l;
                C17963l c17963l3 = (C17963l) this.f31320l;
                if (i3 >= c17963l3.f34967l) {
                    C4875l.firebase();
                    return null;
                }
                this.f31319l = i3 + 1;
                this.f31318l = i3;
                Object obj2 = c17963l3.f34960l[i3];
                billing();
                return obj2;
        }
    }
}

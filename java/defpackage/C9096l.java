package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٌَ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9096l extends AbstractC2722l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C1424l f18686l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f18687l;

    public C9096l(C1424l c1424l, int i) {
        this.f18686l = c1424l;
        this.f18687l = i;
    }

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        C1424l c1424l = this.f18686l;
        this.f18686l = null;
        if (c1424l == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) c1424l.f3601l;
        do {
            atomicLong = (AtomicLong) c1424l.f3602l;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                C6730l c6730l = (C6730l) atomicReference.get();
                if (c6730l != null) {
                    if (c6730l.f14089l <= this.f18687l) {
                        c6730l.cancel(true);
                        while (!atomicReference.compareAndSet(c6730l, null)) {
                            if (atomicReference.get() != c6730l) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        InterfaceC9526l interfaceC9526l;
        C1424l c1424l = this.f18686l;
        if (c1424l == null || (interfaceC9526l = (InterfaceC9526l) ((RunnableC16301l) c1424l.f3603l).f31893l) == null) {
            return null;
        }
        String string = interfaceC9526l.toString();
        String strAd = AbstractC9361l.ad(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        C6730l c6730l = (C6730l) ((AtomicReference) this.f18686l.f3601l).get();
        if (c6730l == null) {
            return strAd;
        }
        int length = strAd.length();
        String string2 = c6730l.toString();
        return AbstractC9361l.advert(new StringBuilder(string2.length() + length + 9 + 1), strAd, ", trial=[", string2, "]");
    }
}

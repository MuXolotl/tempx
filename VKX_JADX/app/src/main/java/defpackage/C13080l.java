package defpackage;

/* JADX INFO: renamed from: lْؒۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13080l extends AbstractC15342l {
    public final C8896l amazon;

    public C13080l(C8896l c8896l) {
        this.amazon = c8896l;
    }

    @Override // defpackage.AbstractC15342l
    public final C8896l crashlytics() {
        return this.amazon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13080l) {
            return this.amazon.equals(((C13080l) obj).amazon);
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode();
    }
}

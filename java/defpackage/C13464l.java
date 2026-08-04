package defpackage;

/* JADX INFO: renamed from: lْٟٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13464l extends AbstractC17238l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f26403l;

    public C13464l(Object obj) {
        this.f26403l = obj;
    }

    @Override // defpackage.AbstractC17238l
    public final Object billing() {
        return this.f26403l;
    }

    @Override // defpackage.AbstractC17238l
    public final boolean crashlytics() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13464l) {
            return this.f26403l.equals(((C13464l) obj).f26403l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26403l.hashCode() + 1502476572;
    }

    @Override // defpackage.AbstractC17238l
    public final Object loadAd() {
        return this.f26403l;
    }

    @Override // defpackage.AbstractC17238l
    public final Object purchase(Object obj) {
        return this.f26403l;
    }

    public final String toString() {
        return "Optional.of(" + this.f26403l + ")";
    }
}

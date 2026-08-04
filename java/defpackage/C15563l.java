package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lًٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15563l extends AbstractC13584l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Pair f30404l;

    public C15563l(Pair pair) {
        this.f30404l = pair;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15563l) {
            return this.f30404l.equals(((C15563l) obj).f30404l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30404l.hashCode() + 1502476572;
    }

    @Override // defpackage.AbstractC13584l
    public final boolean loadAd() {
        return true;
    }

    public final String toString() {
        return AbstractC15560l.Signature("Optional.of(", this.f30404l.toString(), ")");
    }

    @Override // defpackage.AbstractC13584l
    public final Object yandex() {
        return this.f30404l;
    }
}

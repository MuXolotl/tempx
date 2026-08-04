package defpackage;

/* JADX INFO: renamed from: lٕؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15433l extends AbstractC13584l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C15433l f30188l = new C15433l();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.AbstractC13584l
    public final boolean loadAd() {
        return false;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.AbstractC13584l
    public final Object yandex() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}

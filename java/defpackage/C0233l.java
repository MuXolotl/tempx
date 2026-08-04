package defpackage;

/* JADX INFO: renamed from: lَؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0233l extends AbstractC17496l {
    public final C4279l yandex;

    public C0233l(C4279l c4279l) {
        this.yandex = c4279l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0233l.class != obj.getClass()) {
            return false;
        }
        return this.yandex.equals(((C0233l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + (C0233l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.yandex + '}';
    }
}

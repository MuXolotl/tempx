package defpackage;

/* JADX INFO: renamed from: lؙٟۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6650l extends AbstractC9738l {
    public final long amazon;

    public C6650l(long j) {
        super("tag", String.valueOf(j), new C12176l(7));
        this.amazon = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6650l) && this.amazon == ((C6650l) obj).amazon;
    }

    public final int hashCode() {
        long j = this.amazon;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("Tag(tagId="), this.amazon, ')');
    }
}

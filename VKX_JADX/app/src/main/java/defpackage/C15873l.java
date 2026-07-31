package defpackage;

/* JADX INFO: renamed from: lٍٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15873l extends AbstractC9738l {
    public final long amazon;

    public C15873l(long j) {
        super("artist", String.valueOf(j), new C12176l(6));
        this.amazon = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15873l) && this.amazon == ((C15873l) obj).amazon;
    }

    public final int hashCode() {
        long j = this.amazon;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("Artist(artistId="), this.amazon, ')');
    }
}

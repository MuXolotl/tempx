package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public c(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            j$.time.d.m("Illegal Capacity: ", i);
            throw null;
        }
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + ((long) this.b);
    }

    public c() {
        this.a = 4;
    }
}

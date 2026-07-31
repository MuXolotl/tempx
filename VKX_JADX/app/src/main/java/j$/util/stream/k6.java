package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class k6 extends y5 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        l5 l5Var = this.a;
        l5Var.h(j);
        if (this.b) {
            while (i < this.d && !l5Var.m()) {
                l5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                l5Var.accept(this.c[i]);
                i++;
            }
        }
        l5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.c = new long[(int) j];
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

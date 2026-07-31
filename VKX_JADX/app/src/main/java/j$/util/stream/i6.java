package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class i6 extends w5 {
    public double[] c;
    public int d;

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
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

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.c = new double[(int) j];
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends w5 {
    public o6 c;

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        l5 l5Var = this.a;
        l5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (l5Var.m()) {
                    break;
                }
                l5Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                l5Var.accept(dArr[i]);
                i++;
            }
        }
        l5Var.end();
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new o6((int) j) : new o6();
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

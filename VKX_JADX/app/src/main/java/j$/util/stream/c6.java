package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class c6 extends y5 {
    public s6 c;

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        l5 l5Var = this.a;
        l5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (l5Var.m()) {
                    break;
                }
                l5Var.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                l5Var.accept(jArr[i]);
                i++;
            }
        }
        l5Var.end();
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new s6((int) j) : new s6();
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class b6 extends x5 {
    public q6 c;

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        l5 l5Var = this.a;
        l5Var.h(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (l5Var.m()) {
                    break;
                }
                l5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                l5Var.accept(iArr[i]);
                i++;
            }
        }
        l5Var.end();
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new q6((int) j) : new q6();
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

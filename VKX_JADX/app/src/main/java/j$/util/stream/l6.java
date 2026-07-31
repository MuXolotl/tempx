package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends z5 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        l5 l5Var = this.a;
        l5Var.h(j);
        if (this.c) {
            while (i < this.e && !l5Var.m()) {
                l5Var.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                l5Var.accept(this.d[i]);
                i++;
            }
        }
        l5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends z5 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void t(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void end() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        l5 l5Var = this.a;
        l5Var.h(size);
        boolean z = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (l5Var.m()) {
                    break;
                } else {
                    l5Var.t(obj);
                }
            }
        } else {
            Objects.requireNonNull(l5Var);
            Collection.EL.a(arrayList, new j$.time.s(8, l5Var));
        }
        l5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void h(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            j$.time.d.c("Stream size exceeds max array size");
        }
    }
}

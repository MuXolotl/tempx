package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u6 extends c implements Iterable, j$.lang.a {
    public Object e;
    public Object[] f;

    public u6(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.d.c("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) jCount);
        c(0, objNewArray);
        return objNewArray;
    }

    public void c(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > l(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, l(obj2));
            i += l(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            k(obj2, 0, l(obj2), obj);
        }
        k(this.e, 0, this.b, obj);
    }

    public abstract void k(Object obj, int i, int i2, Object obj2);

    public abstract int l(Object obj);

    public abstract Object newArray(int i);

    public final int p(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + ((long) l(this.f[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public final void q(long j) {
        long jL;
        int i = this.c;
        if (i == 0) {
            jL = l(this.e);
        } else {
            jL = ((long) l(this.f[i])) + this.d[i];
        }
        if (j > jL) {
            if (this.f == null) {
                Object[] objArrS = s();
                this.f = objArrS;
                this.d = new long[8];
                objArrS[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > jL) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f[i2] = newArray(i3);
                long[] jArr = this.d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) l(this.f[i4]));
                jL += (long) i3;
                i2++;
            }
        }
    }

    public abstract Object[] s();

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void u() {
        long jL;
        if (this.b == l(this.e)) {
            if (this.f == null) {
                Object[] objArrS = s();
                this.f = objArrS;
                this.d = new long[8];
                objArrS[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jL = l(this.e);
                } else {
                    jL = ((long) l(objArr[i])) + this.d[i];
                }
                q(jL + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public u6() {
        this.e = newArray(16);
    }
}

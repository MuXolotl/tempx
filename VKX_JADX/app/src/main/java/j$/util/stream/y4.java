package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends h5 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Object d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(r rVar, l5 l5Var) {
        super(l5Var);
        this.e = rVar;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.d0(l5Var2, 1);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void t(Object obj) throws Exception {
        int i = this.b;
        l5 l5Var = this.a;
        a aVar = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                j$.util.l0 l0Var = (j$.util.l0) obj2;
                m1 m1Var = (m1) ((j$.time.s) ((f1) aVar).m).apply(obj);
                if (m1Var != null) {
                    try {
                        if (this.c) {
                            j$.util.z0 z0VarSpliterator = m1Var.sequential().spliterator();
                            while (!l5Var.m() && z0VarSpliterator.tryAdvance((LongConsumer) l0Var)) {
                            }
                        } else {
                            m1Var.sequential().forEach(l0Var);
                        }
                    } catch (Throwable th) {
                        try {
                            m1Var.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (m1Var != null) {
                    m1Var.close();
                    return;
                }
                return;
            case 1:
                j$.util.h0 h0Var = (j$.util.h0) obj2;
                IntStream intStream = (IntStream) ((j$.time.s) ((u0) aVar).m).apply(obj);
                if (intStream != null) {
                    try {
                        if (this.c) {
                            j$.util.w0 w0VarSpliterator = intStream.sequential().spliterator();
                            while (!l5Var.m() && w0VarSpliterator.tryAdvance((IntConsumer) h0Var)) {
                            }
                        } else {
                            intStream.sequential().forEach(h0Var);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.d0 d0Var = (j$.util.d0) obj2;
                d0 d0Var2 = (d0) ((j$.time.s) ((r) aVar).m).apply(obj);
                if (d0Var2 != null) {
                    try {
                        if (this.c) {
                            j$.util.t0 t0VarSpliterator = d0Var2.sequential().spliterator();
                            while (!l5Var.m() && t0VarSpliterator.tryAdvance((DoubleConsumer) d0Var)) {
                            }
                        } else {
                            d0Var2.sequential().forEach(d0Var);
                        }
                    } catch (Throwable th5) {
                        try {
                            d0Var2.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (d0Var2 != null) {
                    d0Var2.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void h(long j) {
        switch (this.b) {
            case 0:
                this.a.h(-1L);
                break;
            case 1:
                this.a.h(-1L);
                break;
            default:
                this.a.h(-1L);
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean m() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.e = u0Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.h0(l5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(f1 f1Var, l5 l5Var) {
        super(l5Var);
        this.e = f1Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.d = new j$.util.l0(l5Var2, 1);
    }
}

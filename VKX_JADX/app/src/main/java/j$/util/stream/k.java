package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends h5 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h8 h8Var, l5 l5Var) {
        super(l5Var);
        this.d = h8Var;
        this.c = true;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void t(Object obj) throws Exception {
        int i = this.b;
        l5 l5Var = this.a;
        switch (i) {
            case 0:
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    l5Var.t((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    l5Var.t(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.s) ((p) this.d).m).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!l5Var.m() && spliterator.tryAdvance(l5Var)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(l5Var);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((h8) this.d).m.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        l5Var.t(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void h(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
    public boolean m() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.m();
            case 2:
                return !this.c || this.a.m();
            default:
                return super.m();
        }
    }

    public /* synthetic */ k(l5 l5Var) {
        super(l5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, l5 l5Var) {
        super(l5Var);
        this.d = pVar;
    }
}

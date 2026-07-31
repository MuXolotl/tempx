package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public class u3 extends CountedCompleter {
    public final g2 a;
    public final int b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, g2 g2Var, int i) {
        this(u3Var, g2Var, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) u3Var.d;
    }

    public final u3 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new u3(this, ((f2) this.a).a(i), i2);
            default:
                return new u3(this, this.a.a(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.j() != 0) {
            this.setPendingCount(this.a.j() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iJ = this.a.j() - 1;
                i = this.b;
                if (i2 < iJ) {
                    u3 u3VarA = this.a(i2, i + iCount);
                    iCount = (int) (u3VarA.a.count() + ((long) iCount));
                    u3VarA.fork();
                    i2++;
                }
            }
            this = this.a(i2, i + iCount);
        }
        switch (this.c) {
            case 0:
                ((f2) this.a).c(this.b, this.d);
                break;
            default:
                this.a.f((Object[]) this.d, this.b);
                break;
        }
        this.propagateCompletion();
    }

    public u3(u3 u3Var, g2 g2Var, int i, byte b) {
        super(u3Var);
        this.a = g2Var;
        this.b = i;
    }

    public u3(g2 g2Var, Object obj, int i) {
        this.c = i;
        this.a = g2Var;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, f2 f2Var, int i) {
        this(u3Var, f2Var, i, (byte) 0);
        this.c = 0;
        this.d = u3Var.d;
    }
}

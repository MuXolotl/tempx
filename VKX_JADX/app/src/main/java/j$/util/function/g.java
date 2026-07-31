package j$.util.function;

import j$.time.s;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public final Predicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return new s(2, this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.u(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (i) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}

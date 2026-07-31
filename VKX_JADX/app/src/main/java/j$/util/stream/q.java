package j$.util.stream;

import androidx.car.app.navigation.model.Maneuver;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Supplier, ObjDoubleConsumer, BiConsumer, Predicate, IntFunction, IntBinaryOperator, ObjIntConsumer, ToIntFunction, ObjLongConsumer, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j.a(dArr, dArr2[0]);
                j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                dArr[3] = dArr[3] + dArr2[3];
                break;
            case 16:
                ((j$.util.w) obj).a((j$.util.w) obj2);
                break;
            case 21:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            default:
                ((j$.util.y) obj).a((j$.util.y) obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 2:
                break;
            case 16:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 12:
                return new Object[i];
            case 13:
                return new Integer[i];
            case 23:
                return Integer.valueOf(i);
            default:
                return new Long[i];
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 14:
                return Math.min(i, i2);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return new double[4];
            case 5:
                return new f0();
            case 7:
                return new g0();
            case 9:
                return new h0();
            case 11:
                return new i0();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new long[2];
            default:
                return new long[2];
        }
    }

    public Predicate negate() {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return new j$.time.s(2, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 4:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return j$.com.android.tools.r8.a.u(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((j$.util.a0) obj).a;
            case 5:
            case 7:
            default:
                return ((j$.util.z) obj).a != null;
            case 6:
                return ((j$.util.b0) obj).a;
            case 8:
                return ((j$.util.c0) obj).a;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            default:
                ((j$.util.v) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((j$.util.y) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case 15:
                ((j$.util.w) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }
}

package j$.util.stream;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements BiConsumer, LongBinaryOperator, ToLongFunction, Consumer, IntFunction, LongFunction, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ c1(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 8:
                break;
            case 10:
                break;
            case 12:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Object[i];
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return new Double[i];
            case 14:
                return new Object[i];
            case 15:
                return new Integer[i];
            case 16:
                return new Long[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new Double[i];
            case 20:
                return new Integer[i];
            case 21:
                return new Integer[i];
            case 22:
                return new Long[i];
            case 23:
                return new Long[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new Double[i];
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 1:
                return Math.max(j, j2);
            case 2:
                return j + j2;
            default:
                return Math.min(j, j2);
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void t(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.c(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 5:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 7:
                return v3.G(j);
            case 8:
            default:
                return v3.P(j);
            case 9:
                return v3.O(j);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return new n2((a2) obj, (a2) obj2);
            case 9:
            case 11:
            default:
                return new r2((g2) obj, (g2) obj2);
            case 10:
                return new o2((c2) obj, (c2) obj2);
            case 12:
                return new p2((e2) obj, (e2) obj2);
        }
    }

    private final void accept$j$$util$stream$Node$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(Object obj) {
    }
}

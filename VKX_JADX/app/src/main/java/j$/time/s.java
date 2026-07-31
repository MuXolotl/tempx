package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.b0;
import j$.util.stream.c0;
import j$.util.stream.c8;
import j$.util.stream.d0;
import j$.util.stream.j7;
import j$.util.stream.k1;
import j$.util.stream.l1;
import j$.util.stream.l5;
import j$.util.stream.l7;
import j$.util.stream.m1;
import j$.util.stream.n7;
import j$.util.stream.w6;
import j$.util.stream.x6;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements TemporalAccessor, Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ s(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long C(TemporalField temporalField) {
        throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object E(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.a ? (ZoneId) this.b : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((Consumer) this.b).accept(new j$.util.p((Map.Entry) obj));
                break;
            case 8:
                ((l5) this.b).accept(obj);
                break;
            default:
                ((ArrayList) ((List) this.b)).add(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 1:
                break;
            case 8:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return w6.h((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof d0) {
            return c0.h((d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return b0.h((DoubleStream) objApply);
        }
        if (objApply instanceof m1) {
            return l1.h((m1) objApply);
        }
        if (objApply instanceof LongStream) {
            return k1.h((LongStream) objApply);
        }
        j$.util.f.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean e(TemporalField temporalField) {
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 3:
                return ((j$.util.stream.a) this.b).O(0);
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 11:
                j7 j7Var = (j7) obj;
                return j7Var.d.tryAdvance(j7Var.e);
            case 12:
                l7 l7Var = (l7) obj;
                return l7Var.d.tryAdvance(l7Var.e);
            case 13:
                n7 n7Var = (n7) obj;
                return n7Var.d.tryAdvance(n7Var.e);
            default:
                c8 c8Var = (c8) obj;
                return c8Var.d.tryAdvance(c8Var.e);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int j(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    public Predicate negate() {
        return new s(2, this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.u(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    public void u(x6 x6Var) {
        ((EnumMap) ((Map) this.b)).put(x6Var, 1);
    }

    public /* synthetic */ s(int i) {
        this.a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof d0) {
            return c0.h((d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return b0.h((DoubleStream) objApply);
        }
        j$.util.f.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof m1) {
            return l1.h((m1) objApply);
        }
        if (objApply instanceof LongStream) {
            return k1.h((LongStream) objApply);
        }
        j$.util.f.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }
}

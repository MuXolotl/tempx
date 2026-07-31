package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.e8;
import j$.util.stream.h7;
import j$.util.stream.o1;
import j$.util.stream.s1;
import j$.util.stream.t1;
import j$.util.stream.u1;
import j$.util.stream.y6;
import j$.util.stream.z6;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, e8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // j$.util.stream.e8
    public Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        s1 s1Var = (s1) ((Supplier) this.c).get();
        aVar.R(spliterator, s1Var);
        return Boolean.valueOf(s1Var.b);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void t(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 3:
                ((Consumer) obj3).t(obj);
                ((Consumer) obj2).t(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 5:
            case 6:
            default:
                Consumer consumer = (Consumer) obj2;
                if (((h7) obj3).b.putIfAbsent(obj != null ? obj : h7.d, Boolean.TRUE) == null) {
                    consumer.t(obj);
                }
                break;
            case 7:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 3:
                break;
            case 4:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.e8
    public Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new u1(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.e8
    public int c() {
        return y6.u | y6.r;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new o1((t1) this.b, (Predicate) this.c);
    }

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public t(z6 z6Var, t1 t1Var, Supplier supplier) {
        this.a = 6;
        this.b = t1Var;
        this.c = supplier;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }
}

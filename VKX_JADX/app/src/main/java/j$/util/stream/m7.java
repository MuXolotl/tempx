package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m7 implements k5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ m7(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        int i = this.a;
        LongConsumer longConsumer = this.b;
        switch (i) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((s6) longConsumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void h(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Long l) {
        switch (this.a) {
            case 0:
                v3.i(this, l);
                break;
            default:
                v3.i(this, l);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                v3.k();
                throw null;
            default:
                v3.k();
                throw null;
        }
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                v3.d();
                throw null;
            default:
                v3.d();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        switch (this.a) {
            case 0:
                o((Long) obj);
                break;
            default:
                o((Long) obj);
                break;
        }
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }
}

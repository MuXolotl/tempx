package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends v3 {
    public final /* synthetic */ int h;

    public /* synthetic */ c4(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.v3
    public final q4 Y() {
        switch (this.h) {
            case 0:
                return new u4();
            case 1:
                return new s4();
            case 2:
                return new v4();
            default:
                return new t4();
        }
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final Object a(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
            case 1:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
            case 2:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
            default:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final Object b(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
            case 1:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
            case 2:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
            default:
                return y6.SIZED.o(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final int c() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return y6.r;
    }
}

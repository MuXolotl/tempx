package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b2 implements IntConsumer {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    private final void accept$j$$util$stream$Node$OfInt$0(int i) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfInt$0(int i) {
    }
}

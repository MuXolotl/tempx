package j$.util;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements IntConsumer {
    private long count;
    private long sum;
    private int min = Alert.DURATION_SHOW_INDEFINITELY;
    private int max = RecyclerView.UNDEFINED_DURATION;

    public final void a(w wVar) {
        this.count += wVar.count;
        this.sum += wVar.sum;
        this.min = Math.min(this.min, wVar.min);
        this.max = Math.max(this.max, wVar.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final String toString() {
        String simpleName = w.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}

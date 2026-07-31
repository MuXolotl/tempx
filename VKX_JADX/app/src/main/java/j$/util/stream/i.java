package j$.util.stream;

import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i {
    public final /* synthetic */ Collector a;

    public /* synthetic */ i(Collector collector) {
        this.a = collector;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}

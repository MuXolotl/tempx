package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.t;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new t(3, consumer, consumer2);
    }
}

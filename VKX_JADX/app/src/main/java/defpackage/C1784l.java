package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* JADX INFO: renamed from: lُؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1784l extends AbstractC8502l {
    @Override // defpackage.AbstractC4777l
    public final long admob() {
        return ThreadLocalRandom.current().nextLong(1000L);
    }

    @Override // defpackage.AbstractC4777l
    public final long mopub(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.AbstractC4777l
    public final int purchase(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.AbstractC8502l
    public final Random subs() {
        return ThreadLocalRandom.current();
    }
}

package io.realm.kotlin.types;

import defpackage.C15729l;
import defpackage.C8339l;
import defpackage.InterfaceC11616l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/realm/kotlin/types/RealmInstant$Companion", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealmInstant$Companion {
    public static final /* synthetic */ RealmInstant$Companion yandex = new RealmInstant$Companion();
    public static final InterfaceC11616l loadAd = yandex(-999999999, Long.MIN_VALUE);
    public static final InterfaceC11616l crashlytics = yandex(999999999, Long.MAX_VALUE);

    public static InterfaceC11616l yandex(int i, long j) {
        if ((j > 0 && i < 0) || (j < 0 && i > 0)) {
            C8339l.metrica("Arguments must be both positive or negative.");
            return null;
        }
        long j2 = i / 1000000000;
        int i2 = i % 1000000000;
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return j < 0 ? loadAd : crashlytics;
        }
        return new C15729l(j3, i2);
    }
}

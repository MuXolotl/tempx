package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3120l extends AbstractMap implements Map, InterfaceC17350l {
    public abstract /* bridge */ int amazon();

    public abstract /* bridge */ Set crashlytics();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return yandex();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return crashlytics();
    }

    public abstract /* bridge */ Collection purchase();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return amazon();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return purchase();
    }

    public abstract Set yandex();
}

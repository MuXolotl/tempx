package defpackage;

import java.util.List;
import java.util.Map;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lٌُۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11307l extends Catalog2Block {
    public static final C11307l yandex = new C11307l();

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* JADX INFO: renamed from: amazon */
    public final Catalog2Layout getLoadAd() {
        return C7348l.yandex;
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    public final Map crashlytics(C9554l c9554l) {
        throw new IllegalStateException("UnknownBlock can't have data");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C11307l);
    }

    public final int hashCode() {
        return -908423822;
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* JADX INFO: renamed from: loadAd */
    public final String getYandex() {
        return "unknown";
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    public final List purchase() {
        return C2580l.f5619l;
    }

    public final String toString() {
        return "UnknownBlock";
    }

    @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
    /* JADX INFO: renamed from: yandex */
    public final List getCrashlytics() {
        return C2580l.f5619l;
    }
}

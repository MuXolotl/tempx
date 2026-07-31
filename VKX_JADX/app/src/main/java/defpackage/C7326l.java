package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚٙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7326l extends AbstractC10033l {
    public static final C12105l crashlytics;
    public final List loadAd;
    public final List yandex;

    static {
        C11155l c11155l = C12105l.amazon;
        crashlytics = AbstractC0775l.m674strictfp("application/x-www-form-urlencoded");
    }

    public C7326l(ArrayList arrayList, ArrayList arrayList2) {
        this.yandex = AbstractC11432l.isPro(arrayList);
        this.loadAd = AbstractC11432l.isPro(arrayList2);
    }

    public final long firebase(InterfaceC16805l interfaceC16805l, boolean z) {
        C0869l c0869l = z ? new C0869l() : interfaceC16805l.crashlytics();
        List list = this.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c0869l.m709instanceof(38);
            }
            c0869l.m718l((String) list.get(i));
            c0869l.m709instanceof(61);
            c0869l.m718l((String) this.loadAd.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c0869l.f2526l;
        c0869l.yandex();
        return j;
    }

    @Override // defpackage.AbstractC10033l
    public final void isPro(InterfaceC16805l interfaceC16805l) {
        firebase(interfaceC16805l, false);
    }

    @Override // defpackage.AbstractC10033l
    public final C12105l loadAd() {
        return crashlytics;
    }

    @Override // defpackage.AbstractC10033l
    public final long yandex() {
        return firebase(null, true);
    }
}

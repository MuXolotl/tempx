package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6387l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7473l f13368l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13369l;

    public /* synthetic */ C6387l(C7473l c7473l, int i) {
        this.f13369l = i;
        this.f13368l = c7473l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13369l;
        C7473l c7473l = this.f13368l;
        switch (i) {
            case 0:
                return Float.valueOf(c7473l.yandex() / c7473l.mopub.admob() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(c7473l.billing.admob() * 0.5f);
        }
    }
}

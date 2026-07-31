package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15760l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f30933l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30934l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30935l;

    public /* synthetic */ C15760l(int i, int i2, boolean z) {
        this.f30935l = i2;
        this.f30934l = z;
        this.f30933l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30935l;
        int i2 = this.f30933l;
        boolean z = this.f30934l;
        ((Integer) obj).intValue();
        switch (i) {
            case 0:
                if (z) {
                    i2 = -i2;
                }
                return Integer.valueOf(i2);
            case 1:
                if (!z) {
                    i2 = -i2;
                }
                return Integer.valueOf(i2);
            case 2:
                if (!z) {
                    i2 = -i2;
                }
                return Integer.valueOf(i2);
            default:
                if (z) {
                    i2 = -i2;
                }
                return Integer.valueOf(i2);
        }
    }
}

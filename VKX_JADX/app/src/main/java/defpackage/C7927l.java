package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7927l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function0 f16508l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12843l f16509l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ClassLoader f16510l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10700l f16511l;

    public C7927l(ClassLoader classLoader, C12843l c12843l, Function0 function0, C10700l c10700l) {
        this.f16510l = classLoader;
        this.f16509l = c12843l;
        this.f16508l = function0;
        this.f16511l = c10700l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2440l c2440l = (C2440l) obj2;
        int i = 0;
        C13998l c13998l = this.f16508l == null ? null : new C13998l(new C13663l(this.f16511l, 0), ((Number) obj).intValue(), i);
        if (c2440l.equals(C2440l.crashlytics)) {
            return C0861l.crashlytics;
        }
        int i2 = c2440l.yandex;
        if (i2 != 0) {
            int iInmobi = AbstractC5020l.inmobi(i2);
            if (iInmobi == 0) {
                i = 1;
            } else if (iInmobi == 1) {
                i = 2;
            } else {
                if (iInmobi != 2) {
                    C18725l.billing();
                    return null;
                }
                i = 3;
            }
        }
        C4258l c4258l = c2440l.loadAd;
        return new C0861l(i, c4258l != null ? AbstractC10392l.metrica(c4258l, this.f16510l, this.f16509l, c13998l) : null);
    }
}

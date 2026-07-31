package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2821l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Drawable f6144l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6145l;

    public /* synthetic */ C2821l(Drawable drawable, int i) {
        this.f6145l = i;
        this.f6144l = drawable;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6145l;
        Drawable drawable = this.f6144l;
        switch (i) {
            case 0:
                long j = ((C9735l) obj).yandex;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C16278l.f31880l.mopub(drawable, c6956l, 48);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                long j2 = ((C9735l) obj).yandex;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C16278l.f31880l.mopub(drawable, c6956l2, 48);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lُؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2319l {
    public final /* synthetic */ C3702l loadAd;
    public final LinkedHashMap yandex = new LinkedHashMap();

    public C2319l(C3702l c3702l) {
        this.loadAd = c3702l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r0 == r11) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object crashlytics(android.content.Context r25, defpackage.C4043l r26, defpackage.AbstractC0283l r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2319l.crashlytics(android.content.Context, lَُؖ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r13 == r9) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(defpackage.C4043l r12, defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2319l.loadAd(lَُؖ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(Context context, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C1368l c1368l;
        if (abstractC0283l instanceof C1368l) {
            c1368l = (C1368l) abstractC0283l;
            int i = c1368l.f3492l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1368l.f3492l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1368l = new C1368l(this, abstractC0283l);
            }
        } else {
            c1368l = new C1368l(this, abstractC0283l);
        }
        Object objMetrica = c1368l.f3493l;
        int i2 = c1368l.f3492l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMetrica);
            C4269l c4269l = this.loadAd.crashlytics;
            c1368l.f3494l = str;
            c1368l.f3492l = 1;
            objMetrica = c4269l.metrica(context, str, c1368l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMetrica == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c1368l.f3494l;
            AbstractC2829l.crashlytics(objMetrica);
        }
        boolean zBooleanValue = ((Boolean) objMetrica).booleanValue();
        C4043l c4043l = (C4043l) this.yandex.get(str);
        return Boolean.valueOf((c4043l != null ? c4043l.loadAd.get() : false) && zBooleanValue);
    }
}

package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؘۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5495l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18534l f11749l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11750l;

    public /* synthetic */ C5495l(C18534l c18534l, int i) {
        this.f11750l = i;
        this.f11749l = c18534l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11750l;
        C18534l c18534l = this.f11749l;
        switch (i) {
            case 0:
                return ((C11054l) c18534l.f36169l.get(((Integer) obj).intValue())).crashlytics;
            case 1:
                return ((C11054l) c18534l.f36169l.get(((Integer) obj).intValue())).crashlytics;
            default:
                ArrayList arrayList = c18534l.f36169l;
                ((C1336l) obj).firebase(arrayList.size(), null, new C1178l(1, arrayList), new C15578l(2039820996, true, new C11074l(arrayList, c18534l, 5)));
                return Unit.INSTANCE;
        }
    }
}

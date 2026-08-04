package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۤؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16026l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f31410l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4741l f31411l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31412l;

    public /* synthetic */ C16026l(C4741l c4741l, List list, int i) {
        this.f31412l = i;
        this.f31411l = c4741l;
        this.f31410l = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f31412l;
        List list = this.f31410l;
        C4741l c4741l = this.f31411l;
        switch (i) {
            case 0:
                c4741l.invoke(list.get(((Number) obj).intValue()));
                break;
            default:
                c4741l.invoke(list.get(((Number) obj).intValue()));
                break;
        }
        return 1;
    }
}

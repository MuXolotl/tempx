package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3403l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Cgoto f7250l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7251l;

    public /* synthetic */ C3403l(Cgoto cgoto, int i) {
        this.f7251l = i;
        this.f7250l = cgoto;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7251l;
        Cgoto cgoto = this.f7250l;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                cgoto.mo199class(str, list);
                break;
            default:
                cgoto.m202l(str, list);
                break;
        }
        return Unit.INSTANCE;
    }
}
